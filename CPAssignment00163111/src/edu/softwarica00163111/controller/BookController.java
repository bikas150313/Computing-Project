package edu.softwarica00163111.controller;

import edu.softwarica00163111.dbconnection.DBConnection;
import edu.softwarica00163111.model.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Bikas
 */
public class BookController {

    private Connection con = null;
    private PreparedStatement ps;
    private ResultSet rs;

    public BookController() {
        if (con == null) {
            con = DBConnection.getConnection();
        }
    }

    public int addBook(Book book) {
        int bookAdded = 0;
        String query = "insert into book(ID,BookName,Author,Genre,Quantity,Rate) values(?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, null);
            ps.setString(2, book.getBookName());
            ps.setString(3, book.getAuthor());
            ps.setString(4, book.getGenre());
            ps.setInt(5, book.getQuantity());
            ps.setFloat(6, book.getRate());
            bookAdded = ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return bookAdded;
    }

    public boolean checkBook(Book book) {
        boolean bookAvailable = false;
        String query = "select * from book where BookName=?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, book.getBookName());
            rs = ps.executeQuery();
            while (rs.next()) {
                bookAvailable = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return bookAvailable;
    }

    public int checkQuantity(Book book) {
        int bookQuantity = 0;
        String query = "select * from book where BookName=?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, book.getBookName());
            rs = ps.executeQuery();
            while (rs.next()) {
                bookQuantity = rs.getInt("Quantity");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return bookQuantity;
    }

    public void updateQuantity(Book book, int updatedQuantity) {
        String query = "update book set Quantity=? where BookName=?";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, updatedQuantity);
            ps.setString(2, book.getBookName());
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
