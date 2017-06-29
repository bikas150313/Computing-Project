/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.softwarica00163111.views;

import edu.softwarica00163111.controller.BookController;
import edu.softwarica00163111.model.Book;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Bikas
 */
public class UploadBookCover extends javax.swing.JInternalFrame {

    /**
     * Creates new form UploadBookCover
     */
    private BookController bookcontroller;
    private String path;

    public UploadBookCover() {
        initComponents();
        bookcontroller = new BookController();
        loadAllBooks();
    }

    public void loadAllBooks() {
        ResultSet rs;
        try {
            rs = bookcontroller.getAllBooks();
            while (rs.next()) {
                comboBook.addItem(rs.getString("BookName"));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label = new javax.swing.JPanel();
        lbl_book = new javax.swing.JLabel();
        lbl_coverImage = new javax.swing.JLabel();
        comboBook = new javax.swing.JComboBox();
        txt_imagePath = new javax.swing.JTextField();
        btn_chooseImage = new javax.swing.JButton();
        btn_upload = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();

        label.setBackground(new java.awt.Color(0, 51, 51));
        label.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Upload Book Cover", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Cooper Black", 1, 24), new java.awt.Color(153, 153, 255))); // NOI18N

        lbl_book.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        lbl_book.setForeground(new java.awt.Color(51, 153, 0));
        lbl_book.setText("Book :");

        lbl_coverImage.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        lbl_coverImage.setForeground(new java.awt.Color(51, 153, 0));
        lbl_coverImage.setText("Choose Cover Image :");

        comboBook.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        comboBook.setForeground(new java.awt.Color(0, 51, 153));

        txt_imagePath.setEditable(false);
        txt_imagePath.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txt_imagePath.setForeground(new java.awt.Color(0, 51, 153));

        btn_chooseImage.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btn_chooseImage.setForeground(new java.awt.Color(0, 0, 102));
        btn_chooseImage.setText("Browse...");
        btn_chooseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chooseImageActionPerformed(evt);
            }
        });

        btn_upload.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        btn_upload.setForeground(new java.awt.Color(0, 0, 102));
        btn_upload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/softwarica00163111/icons/upload.png"))); // NOI18N
        btn_upload.setText("Upload");
        btn_upload.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_uploadActionPerformed(evt);
            }
        });

        btn_cancel.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(0, 0, 102));
        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/softwarica00163111/icons/cancel.png"))); // NOI18N
        btn_cancel.setText("Cancel");
        btn_cancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout labelLayout = new javax.swing.GroupLayout(label);
        label.setLayout(labelLayout);
        labelLayout.setHorizontalGroup(
            labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_upload, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_book)
                        .addComponent(lbl_coverImage)))
                .addGap(53, 53, 53)
                .addGroup(labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBook, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(labelLayout.createSequentialGroup()
                        .addComponent(btn_chooseImage, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_imagePath)
                            .addGroup(labelLayout.createSequentialGroup()
                                .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 135, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        labelLayout.setVerticalGroup(
            labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboBook)
                    .addComponent(lbl_book, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_chooseImage, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_imagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_coverImage, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_upload, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_uploadActionPerformed
        String bookName = (String) comboBook.getSelectedItem();
        String imagePath = txt_imagePath.getText();
        if (!imagePath.isEmpty()) {
            Book book = new Book();
            book.setBookName(bookName);
            bookcontroller = new BookController(this.path);
            try {
                int isUpdated = bookcontroller.updateBookCover(book);
                if (isUpdated == 1) {
                    JOptionPane.showMessageDialog(this, "Book cover image successfully inserted !");
                } else {
                    JOptionPane.showMessageDialog(this, "There was a problem inserting book cover image !");
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(UploadBookCover.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select an image !");
        }
    }//GEN-LAST:event_btn_uploadActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_chooseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chooseImageActionPerformed
        JFileChooser filechooser = new JFileChooser();
        filechooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg", "gif", "png");
        filechooser.addChoosableFileFilter(filter);
        int result = filechooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedfile = filechooser.getSelectedFile();
            String path = selectedfile.getAbsolutePath();
            txt_imagePath.setText(path);
            this.path = path;
        }
    }//GEN-LAST:event_btn_chooseImageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_chooseImage;
    private javax.swing.JButton btn_upload;
    private javax.swing.JComboBox comboBook;
    private javax.swing.JPanel label;
    private javax.swing.JLabel lbl_book;
    private javax.swing.JLabel lbl_coverImage;
    private javax.swing.JTextField txt_imagePath;
    // End of variables declaration//GEN-END:variables
}