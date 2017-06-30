/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.softwarica00163111.views;

import edu.softwarica00163111.controller.VendorController;
import edu.softwarica00163111.model.Vendor;
import java.sql.ResultSet;

/**
 *
 * @author Bikas
 */
public class EditVendor extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddVendor
     */
    //private Vendor vendor;
    private VendorController vendorcontroller;
    /*private String vendorName;
     private String bookPurchased;*/

    public EditVendor() {
        vendorcontroller = new VendorController();
        initComponents();
        Vendor vendor = new Vendor();
        txt_vendorName.setText(vendor.getName());
        txt_address.setText(vendor.getAddress());
        txt_contact.setText(vendor.getContactNo());
        txt_email.setText(vendor.getEmail());
        txt_bookPurchased.setText(vendor.getBookPurchased());
        txt_author.setText(vendor.getAuthor());
        txt_quantity.setText(Integer.toString(vendor.getQuantity()));
        txt_rate.setText(Float.toString(vendor.getRate()));
        txt_discount.setText(Float.toString(vendor.getDiscount()));
        txt_tAmount.setText(Float.toString(vendor.getTotalAmount()));
        //setValue();
    }

    public EditVendor(ResultSet rs) {
    }

    /*public EditVendor(String vendor, String book) {
     this.vendorName = vendor;
     this.bookPurchased = book;
     }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        lbl_vendorName = new javax.swing.JLabel();
        lbl_address = new javax.swing.JLabel();
        lbl_contact = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        lbl_bookPurchased = new javax.swing.JLabel();
        lbl_purchaseDate = new javax.swing.JLabel();
        lbl_author = new javax.swing.JLabel();
        lbl_genre = new javax.swing.JLabel();
        lbl_quantity = new javax.swing.JLabel();
        lbl_rate = new javax.swing.JLabel();
        lbl_discount = new javax.swing.JLabel();
        lbl_totalAmount = new javax.swing.JLabel();
        txt_vendorName = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        txt_contact = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_bookPurchased = new javax.swing.JTextField();
        txt_author = new javax.swing.JTextField();
        txt_quantity = new javax.swing.JTextField();
        lbl_rs = new javax.swing.JLabel();
        lbl_percent = new javax.swing.JLabel();
        lbl_trs = new javax.swing.JLabel();
        txt_rate = new javax.swing.JTextField();
        txt_discount = new javax.swing.JTextField();
        txt_tAmount = new javax.swing.JTextField();
        combo_date = new javax.swing.JComboBox();
        combo_month = new javax.swing.JComboBox();
        combo_year = new javax.swing.JComboBox();
        combo_genre = new javax.swing.JComboBox();
        btn_ok = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();

        jScrollPane1.setBackground(new java.awt.Color(0, 51, 51));

        panel.setBackground(new java.awt.Color(0, 51, 51));
        panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edit Vendor Details", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Cooper Black", 0, 24), new java.awt.Color(153, 153, 255))); // NOI18N

        lbl_vendorName.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        lbl_vendorName.setForeground(new java.awt.Color(51, 153, 0));
        lbl_vendorName.setText("Vendor Name :");

        lbl_address.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        lbl_address.setForeground(new java.awt.Color(51, 153, 0));
        lbl_address.setText("Address :");

        lbl_contact.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        lbl_contact.setForeground(new java.awt.Color(51, 153, 0));
        lbl_contact.setText("Contact no. :");

        lbl_email.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        lbl_email.setForeground(new java.awt.Color(51, 153, 0));
        lbl_email.setText("Email :");

        lbl_bookPurchased.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        lbl_bookPurchased.setForeground(new java.awt.Color(51, 153, 0));
        lbl_bookPurchased.setText("Book Purchased :");

        lbl_purchaseDate.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        lbl_purchaseDate.setForeground(new java.awt.Color(51, 153, 0));
        lbl_purchaseDate.setText("Purchase Date :");

        lbl_author.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        lbl_author.setForeground(new java.awt.Color(51, 153, 0));
        lbl_author.setText("Author :");

        lbl_genre.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        lbl_genre.setForeground(new java.awt.Color(51, 153, 0));
        lbl_genre.setText("Genre :");

        lbl_quantity.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        lbl_quantity.setForeground(new java.awt.Color(51, 153, 0));
        lbl_quantity.setText("Quantity :");

        lbl_rate.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        lbl_rate.setForeground(new java.awt.Color(51, 153, 0));
        lbl_rate.setText("Rate per Book :");

        lbl_discount.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        lbl_discount.setForeground(new java.awt.Color(51, 153, 0));
        lbl_discount.setText("Discount Rate :");

        lbl_totalAmount.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        lbl_totalAmount.setForeground(new java.awt.Color(51, 153, 0));
        lbl_totalAmount.setText("Total Amount :");

        txt_vendorName.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txt_vendorName.setForeground(new java.awt.Color(0, 51, 153));

        txt_address.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txt_address.setForeground(new java.awt.Color(0, 51, 153));

        txt_contact.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txt_contact.setForeground(new java.awt.Color(0, 51, 153));

        txt_email.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txt_email.setForeground(new java.awt.Color(0, 51, 153));

        txt_bookPurchased.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txt_bookPurchased.setForeground(new java.awt.Color(0, 51, 153));

        txt_author.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txt_author.setForeground(new java.awt.Color(0, 51, 153));

        txt_quantity.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txt_quantity.setForeground(new java.awt.Color(0, 51, 153));

        lbl_rs.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        lbl_rs.setForeground(new java.awt.Color(51, 153, 0));
        lbl_rs.setText("Rs.");

        lbl_percent.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        lbl_percent.setForeground(new java.awt.Color(51, 153, 0));
        lbl_percent.setText("%");

        lbl_trs.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        lbl_trs.setForeground(new java.awt.Color(51, 153, 0));
        lbl_trs.setText("Rs.");

        txt_rate.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txt_rate.setForeground(new java.awt.Color(0, 51, 153));

        txt_discount.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txt_discount.setForeground(new java.awt.Color(0, 51, 153));

        txt_tAmount.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txt_tAmount.setForeground(new java.awt.Color(0, 51, 153));

        combo_date.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        combo_date.setForeground(new java.awt.Color(0, 51, 153));
        combo_date.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32" }));

        combo_month.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        combo_month.setForeground(new java.awt.Color(0, 51, 153));
        combo_month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        combo_year.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        combo_year.setForeground(new java.awt.Color(0, 51, 153));
        combo_year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2016", "2017", "2018", "2019", "2020" }));

        combo_genre.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        combo_genre.setForeground(new java.awt.Color(0, 51, 153));
        combo_genre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Adventure", "Biography", "Fantasy", "Fiction", "History", "Horror", "Non-Fiction", "Sci-Fi", "Thriller" }));

        btn_ok.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        btn_ok.setForeground(new java.awt.Color(0, 0, 102));
        btn_ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/softwarica00163111/icons/ok.png"))); // NOI18N
        btn_ok.setText("OK");
        btn_ok.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_ok.setPreferredSize(new java.awt.Dimension(83, 29));
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });

        btn_reset.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        btn_reset.setForeground(new java.awt.Color(0, 0, 102));
        btn_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/softwarica00163111/icons/reset.png"))); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_reset.setPreferredSize(new java.awt.Dimension(83, 29));
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_cancel.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(0, 0, 102));
        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/softwarica00163111/icons/cancel.png"))); // NOI18N
        btn_cancel.setText("Cancel");
        btn_cancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_cancel.setPreferredSize(new java.awt.Dimension(83, 29));
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_discount)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_vendorName)
                            .addComponent(lbl_address)
                            .addComponent(lbl_contact)
                            .addComponent(lbl_email)
                            .addComponent(lbl_bookPurchased)
                            .addComponent(lbl_author)
                            .addComponent(lbl_quantity)
                            .addComponent(lbl_rate)
                            .addComponent(lbl_totalAmount)
                            .addComponent(lbl_purchaseDate)
                            .addComponent(lbl_genre)
                            .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(lbl_rs)
                                .addGap(18, 18, 18)
                                .addComponent(txt_rate))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addComponent(txt_discount)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_percent))
                            .addComponent(txt_vendorName)
                            .addComponent(txt_address)
                            .addComponent(txt_contact)
                            .addComponent(txt_email)
                            .addComponent(txt_bookPurchased)
                            .addComponent(txt_author)
                            .addComponent(txt_quantity)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(combo_date, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(combo_month, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(combo_year, 0, 101, Short.MAX_VALUE))
                            .addComponent(combo_genre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(lbl_trs)
                                .addGap(18, 18, 18)
                                .addComponent(txt_tAmount))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144)
                                .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_vendorName)
                    .addComponent(lbl_vendorName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_address)
                    .addComponent(lbl_address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_contact)
                    .addComponent(lbl_contact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_email)
                    .addComponent(lbl_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_bookPurchased)
                    .addComponent(lbl_bookPurchased, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_purchaseDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combo_date)
                        .addComponent(combo_month, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combo_year, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_author)
                    .addComponent(lbl_author, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_genre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combo_genre))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_quantity)
                    .addComponent(lbl_quantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_rate)
                    .addComponent(lbl_rate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_rs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_discount)
                    .addComponent(lbl_discount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_percent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_tAmount)
                    .addComponent(lbl_totalAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_trs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        jScrollPane1.setViewportView(panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void setValue() {

    }

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        DashboardInternalFrame dif = new DashboardInternalFrame();
        dif.setVisible(true);
        getParent().add(dif);
        dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        txt_vendorName.setText("");
        txt_address.setText("");
        txt_contact.setText("");
        txt_email.setText("");
        txt_bookPurchased.setText("");
        txt_author.setText("");
        txt_quantity.setText("");
        txt_rate.setText("");
        txt_discount.setText("");
        txt_tAmount.setText("");
        txt_vendorName.requestFocus();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
        /*String vendorName = txt_vendorName.getText();
         String address = txt_address.getText();
         String contact = txt_contact.getText();
         String email = txt_email.getText();
         String bookPurchased = txt_bookPurchased.getText();
         String date = (String) combo_date.getSelectedItem();
         String month = (String) combo_month.getSelectedItem();
         String year = (String) combo_year.getSelectedItem();
         String author = txt_author.getText();
         String genre = (String) combo_genre.getSelectedItem();
         String quantity = txt_quantity.getText();
         String rate = txt_rate.getText();
         String discount = txt_discount.getText();
         String totalAmount = txt_tAmount.getText();
         String purchaseDate = date + "-" + month + "-" + year;
         if (!vendorName.isEmpty() && !address.isEmpty() && !contact.isEmpty() && !email.isEmpty() && !bookPurchased.isEmpty() && !author.isEmpty() && !quantity.isEmpty() && !rate.isEmpty() && !discount.isEmpty() && !totalAmount.isEmpty()) {
         Vendor vendor = new Vendor();
         vendor.setBookPurchased(bookPurchased);
         boolean bookAlreadyExists = vendorcontroller.checkBook(vendor);
         if (!bookAlreadyExists) {
         int modifiedQuantity = Integer.parseInt(quantity);
         float modifiedRate = Float.parseFloat(rate);
         float modifiedDiscount = Float.parseFloat(discount);
         float modifiedTotalAmount = Float.parseFloat(totalAmount);
         vendor.setName(vendorName);
         vendor.setAddress(address);
         vendor.setContactNo(contact);
         vendor.setEmail(email);
         vendor.setBookPurchased(bookPurchased);
         vendor.setPurchaseDate(purchaseDate);
         vendor.setAuthor(author);
         vendor.setGenre(genre);
         vendor.setQuantity(modifiedQuantity);
         vendor.setRate(modifiedRate);
         vendor.setDiscount(modifiedDiscount);
         vendor.setTotalAmount(modifiedTotalAmount);
         Book book = new Book();
         book.setBookName(bookPurchased);
         book.setAuthor(author);
         book.setGenre(genre);
         book.setQuantity(modifiedQuantity);
         book.setRate(modifiedRate);
         BookController bookcontroller = new BookController();
         int isVendorAdded = vendorcontroller.addVendor(vendor);
         int isBookAdded = bookcontroller.addBook(book);
         if (isVendorAdded == 1 && isBookAdded == 1) {
         JOptionPane.showMessageDialog(this, "Vendor and Book successfully added !");
         txt_vendorName.setText("");
         txt_address.setText("");
         txt_contact.setText("");
         txt_email.setText("");
         txt_bookPurchased.setText("");
         txt_author.setText("");
         txt_quantity.setText("");
         txt_rate.setText("");
         txt_discount.setText("");
         txt_tAmount.setText("");
         txt_vendorName.requestFocus();
         } else {
         JOptionPane.showMessageDialog(this, "There was a problem adding Vendor and Book !");
         }
         } else {
         JOptionPane.showMessageDialog(this, "This Book is already available in the store. Please modify previous details !");
         }
         } else {
         JOptionPane.showMessageDialog(this, "Please fill all the fields !");
         }*/
    }//GEN-LAST:event_btn_okActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_ok;
    private javax.swing.JButton btn_reset;
    private javax.swing.JComboBox combo_date;
    private javax.swing.JComboBox combo_genre;
    private javax.swing.JComboBox combo_month;
    private javax.swing.JComboBox combo_year;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_author;
    private javax.swing.JLabel lbl_bookPurchased;
    private javax.swing.JLabel lbl_contact;
    private javax.swing.JLabel lbl_discount;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_genre;
    private javax.swing.JLabel lbl_percent;
    private javax.swing.JLabel lbl_purchaseDate;
    private javax.swing.JLabel lbl_quantity;
    private javax.swing.JLabel lbl_rate;
    private javax.swing.JLabel lbl_rs;
    private javax.swing.JLabel lbl_totalAmount;
    private javax.swing.JLabel lbl_trs;
    private javax.swing.JLabel lbl_vendorName;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_author;
    private javax.swing.JTextField txt_bookPurchased;
    private javax.swing.JTextField txt_contact;
    private javax.swing.JTextField txt_discount;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_quantity;
    private javax.swing.JTextField txt_rate;
    private javax.swing.JTextField txt_tAmount;
    private javax.swing.JTextField txt_vendorName;
    // End of variables declaration//GEN-END:variables
}
