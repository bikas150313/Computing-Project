/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.softwarica00163111.views;

import edu.softwarica00163111.controller.BookController;
import edu.softwarica00163111.controller.CustomerController;
import edu.softwarica00163111.controller.VendorController;
import edu.softwarica00163111.model.Book;
import edu.softwarica00163111.model.Customer;
import edu.softwarica00163111.model.Vendor;
import javax.swing.JOptionPane;

/**
 *
 * @author Bikas
 */
public class AddCustomer extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddVendor
     */
    public AddCustomer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollpane = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        lbl_vendorName = new javax.swing.JLabel();
        lbl_address = new javax.swing.JLabel();
        lbl_contact = new javax.swing.JLabel();
        lbl_bookPurchased = new javax.swing.JLabel();
        lbl_purchaseDate = new javax.swing.JLabel();
        lbl_quantity = new javax.swing.JLabel();
        lbl_rate = new javax.swing.JLabel();
        lbl_discount = new javax.swing.JLabel();
        lbl_totalAmount = new javax.swing.JLabel();
        txt_customerName = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        txt_contact = new javax.swing.JTextField();
        txt_bookPurchased = new javax.swing.JTextField();
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
        btn_ok = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();

        scrollpane.setBackground(new java.awt.Color(0, 51, 51));
        scrollpane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollpane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        panel.setBackground(new java.awt.Color(0, 51, 51));
        panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Customer Details", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Cooper Black", 0, 24), new java.awt.Color(153, 153, 255))); // NOI18N

        lbl_vendorName.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        lbl_vendorName.setForeground(new java.awt.Color(51, 153, 0));
        lbl_vendorName.setText("Customer Name :");

        lbl_address.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        lbl_address.setForeground(new java.awt.Color(51, 153, 0));
        lbl_address.setText("Address :");

        lbl_contact.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        lbl_contact.setForeground(new java.awt.Color(51, 153, 0));
        lbl_contact.setText("Contact no. :");

        lbl_bookPurchased.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        lbl_bookPurchased.setForeground(new java.awt.Color(51, 153, 0));
        lbl_bookPurchased.setText("Book Purchased :");

        lbl_purchaseDate.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        lbl_purchaseDate.setForeground(new java.awt.Color(51, 153, 0));
        lbl_purchaseDate.setText("Purchase Date :");

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

        txt_customerName.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txt_customerName.setForeground(new java.awt.Color(0, 51, 153));

        txt_address.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txt_address.setForeground(new java.awt.Color(0, 51, 153));

        txt_contact.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txt_contact.setForeground(new java.awt.Color(0, 51, 153));

        txt_bookPurchased.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txt_bookPurchased.setForeground(new java.awt.Color(0, 51, 153));

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
        txt_rate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rateActionPerformed(evt);
            }
        });

        txt_discount.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txt_discount.setForeground(new java.awt.Color(0, 51, 153));

        txt_tAmount.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txt_tAmount.setForeground(new java.awt.Color(0, 51, 153));
        txt_tAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tAmountActionPerformed(evt);
            }
        });

        combo_date.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        combo_date.setForeground(new java.awt.Color(0, 51, 153));
        combo_date.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32" }));

        combo_month.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        combo_month.setForeground(new java.awt.Color(0, 51, 153));
        combo_month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        combo_year.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        combo_year.setForeground(new java.awt.Color(0, 51, 153));
        combo_year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2016", "2017", "2018", "2019", "2020" }));

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
                    .addComponent(lbl_vendorName)
                    .addComponent(lbl_address)
                    .addComponent(lbl_contact)
                    .addComponent(lbl_bookPurchased)
                    .addComponent(lbl_quantity)
                    .addComponent(lbl_purchaseDate)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbl_rate)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_totalAmount)
                            .addComponent(lbl_discount)
                            .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_customerName)
                            .addComponent(txt_address)
                            .addComponent(txt_contact)
                            .addComponent(txt_bookPurchased)
                            .addComponent(txt_quantity)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(combo_date, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(combo_month, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(combo_year, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(lbl_rs)
                                .addGap(18, 18, 18)
                                .addComponent(txt_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(txt_discount, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lbl_percent))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(lbl_trs)
                            .addGap(18, 18, 18)
                            .addComponent(txt_tAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_customerName)
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
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_bookPurchased, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_bookPurchased, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combo_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combo_month, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combo_year, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_purchaseDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(txt_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_rs, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_rate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(lbl_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_discount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_percent, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_totalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_trs, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(230, Short.MAX_VALUE))
        );

        scrollpane.setViewportView(panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        txt_customerName.setText("");
        txt_address.setText("");
        txt_contact.setText("");
        txt_bookPurchased.setText("");
        txt_quantity.setText("");
        txt_rate.setText("");
        txt_discount.setText("");
        txt_tAmount.setText("");
        txt_customerName.requestFocus();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
        String customerName = txt_customerName.getText();
        String address = txt_address.getText();
        String contact = txt_contact.getText();
        String bookPurchased = txt_bookPurchased.getText();
        String date = (String) combo_date.getSelectedItem();
        String month = (String) combo_month.getSelectedItem();
        String year = (String) combo_year.getSelectedItem();
        String quantity = txt_quantity.getText();
        String rate = txt_rate.getText();
        String discount = txt_discount.getText();
        String totalAmount = txt_tAmount.getText();
        String purchaseDate = date + "-" + month + "-" + year;
        if (!customerName.isEmpty() && !address.isEmpty() && !contact.isEmpty() && !bookPurchased.isEmpty() && !quantity.isEmpty() && !rate.isEmpty() && !discount.isEmpty() && !totalAmount.isEmpty()) {
            Book book = new Book();
            book.setBookName(bookPurchased);
            BookController bookcontroller = new BookController();
            boolean bookAvailable = bookcontroller.checkBook(book);
            if (bookAvailable) {
                int bookQuantity = bookcontroller.checkQuantity(book);
                if (bookQuantity > 0) {
                    int modifiedQuantity = Integer.parseInt(quantity);
                    float modifiedRate = Float.parseFloat(rate);
                    float modifiedDiscount = Float.parseFloat(discount);
                    float modifiedTotalAmount = Float.parseFloat(totalAmount);
                    if (modifiedQuantity <= bookQuantity) {
                        int updatedQuantity = bookQuantity - modifiedQuantity;
                        Customer customer = new Customer();
                        customer.setName(customerName);
                        customer.setAddress(address);
                        customer.setContactNo(contact);
                        customer.setBookPurchased(bookPurchased);
                        customer.setPurchaseDate(purchaseDate);
                        customer.setQuantity(modifiedQuantity);
                        customer.setRate(modifiedRate);
                        customer.setDiscount(modifiedDiscount);
                        customer.setTotalAmount(modifiedTotalAmount);
                        CustomerController customercontroller = new CustomerController();
                        int isCustomerAdded = customercontroller.addCustomer(customer);
                        if (isCustomerAdded == 1) {
                            JOptionPane.showMessageDialog(this, "Customer successfully added !");
                            txt_customerName.setText("");
                            txt_address.setText("");
                            txt_contact.setText("");
                            txt_bookPurchased.setText("");
                            txt_quantity.setText("");
                            txt_rate.setText("");
                            txt_discount.setText("");
                            txt_tAmount.setText("");
                            txt_customerName.requestFocus();
                            bookcontroller.updateQuantity(book, updatedQuantity);
                        } else {
                            JOptionPane.showMessageDialog(this, "There was a problem adding the customer !");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "The requested book exceeds the quantity available in the store !");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "This book is currently out of stock !");
                }
            } else {
                JOptionPane.showMessageDialog(this, "This Book is not available in the store !");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please fill all the fields !");
        }
    }//GEN-LAST:event_btn_okActionPerformed

    private void txt_rateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rateActionPerformed

    private void txt_tAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tAmountActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_ok;
    private javax.swing.JButton btn_reset;
    private javax.swing.JComboBox combo_date;
    private javax.swing.JComboBox combo_month;
    private javax.swing.JComboBox combo_year;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_bookPurchased;
    private javax.swing.JLabel lbl_contact;
    private javax.swing.JLabel lbl_discount;
    private javax.swing.JLabel lbl_percent;
    private javax.swing.JLabel lbl_purchaseDate;
    private javax.swing.JLabel lbl_quantity;
    private javax.swing.JLabel lbl_rate;
    private javax.swing.JLabel lbl_rs;
    private javax.swing.JLabel lbl_totalAmount;
    private javax.swing.JLabel lbl_trs;
    private javax.swing.JLabel lbl_vendorName;
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane scrollpane;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_bookPurchased;
    private javax.swing.JTextField txt_contact;
    private javax.swing.JTextField txt_customerName;
    private javax.swing.JTextField txt_discount;
    private javax.swing.JTextField txt_quantity;
    private javax.swing.JTextField txt_rate;
    private javax.swing.JTextField txt_tAmount;
    // End of variables declaration//GEN-END:variables
}