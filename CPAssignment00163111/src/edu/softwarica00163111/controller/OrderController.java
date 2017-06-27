/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.softwarica00163111.controller;

import edu.softwarica00163111.dbconnection.DBConnection;
import edu.softwarica00163111.model.Customerorder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Bikas
 */
public class OrderController {

    private Connection con = null;
    private PreparedStatement ps;
    private ResultSet rs;

    public OrderController() {
        if (con == null) {
            con = DBConnection.getConnection();
        }
    }

    public int addOrder(Customerorder customerorder) {
        int orderAdded = 0;
        String query = "insert into customerorder(ID,CustomerName,Address,ContactNo,BookOrdered,Author,Quantity,OrderDate) values(?,?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, null);
            ps.setString(2, customerorder.getCustomerName());
            ps.setString(3, customerorder.getAddress());
            ps.setString(4, customerorder.getContactNo());
            ps.setString(5, customerorder.getBookOrdered());
            ps.setString(6, customerorder.getAuthor());
            ps.setInt(7, customerorder.getQuantity());
            ps.setString(8, customerorder.getOrderDate());
            orderAdded = ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return orderAdded;
    }

    public ResultSet viewAllOrder() {
        ResultSet rs = null;
        String query = "select * from customerorder";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return rs;
    }

    public int cancelOrder(String customerName, String bookName) {
        int orderDeleted = 0;
        String query = "delete from customerorder where CustomerName=? and BookOrdered=?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, customerName);
            ps.setString(2, bookName);
            orderDeleted = ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return orderDeleted;
    }

}
