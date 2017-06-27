/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.softwarica00163111.views;

import edu.softwarica00163111.controller.OrderController;
import edu.softwarica00163111.model.Customerorder;
import javax.swing.JOptionPane;

/**
 *
 * @author Bikas
 */
public class AddOrder extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddVendor
     */
    public AddOrder() {
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
        lbl_bookOrdered = new javax.swing.JLabel();
        lbl_orderDate = new javax.swing.JLabel();
        lbl_quantity = new javax.swing.JLabel();
        txt_customerName = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        txt_contact = new javax.swing.JTextField();
        txt_bookOrdered = new javax.swing.JTextField();
        txt_quantity = new javax.swing.JTextField();
        combo_date = new javax.swing.JComboBox();
        combo_month = new javax.swing.JComboBox();
        combo_year = new javax.swing.JComboBox();
        btn_ok = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        lbl_author = new javax.swing.JLabel();
        txt_author = new javax.swing.JTextField();

        scrollpane.setBackground(new java.awt.Color(0, 51, 51));
        scrollpane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollpane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        panel.setBackground(new java.awt.Color(0, 51, 51));
        panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Order Details", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Cooper Black", 0, 24), new java.awt.Color(153, 153, 255))); // NOI18N

        lbl_vendorName.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        lbl_vendorName.setForeground(new java.awt.Color(51, 153, 0));
        lbl_vendorName.setText("Customer Name :");

        lbl_address.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        lbl_address.setForeground(new java.awt.Color(51, 153, 0));
        lbl_address.setText("Address :");

        lbl_contact.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        lbl_contact.setForeground(new java.awt.Color(51, 153, 0));
        lbl_contact.setText("Contact no. :");

        lbl_bookOrdered.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        lbl_bookOrdered.setForeground(new java.awt.Color(51, 153, 0));
        lbl_bookOrdered.setText("Book Ordered :");

        lbl_orderDate.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        lbl_orderDate.setForeground(new java.awt.Color(51, 153, 0));
        lbl_orderDate.setText("Order Date :");

        lbl_quantity.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        lbl_quantity.setForeground(new java.awt.Color(51, 153, 0));
        lbl_quantity.setText("Quantity :");

        txt_customerName.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txt_customerName.setForeground(new java.awt.Color(0, 51, 153));

        txt_address.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txt_address.setForeground(new java.awt.Color(0, 51, 153));

        txt_contact.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txt_contact.setForeground(new java.awt.Color(0, 51, 153));

        txt_bookOrdered.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txt_bookOrdered.setForeground(new java.awt.Color(0, 51, 153));

        txt_quantity.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txt_quantity.setForeground(new java.awt.Color(0, 51, 153));

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

        lbl_author.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        lbl_author.setForeground(new java.awt.Color(51, 153, 0));
        lbl_author.setText("Author :");

        txt_author.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txt_author.setForeground(new java.awt.Color(0, 51, 153));

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
                    .addComponent(lbl_bookOrdered)
                    .addComponent(lbl_quantity)
                    .addComponent(lbl_orderDate)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_author))
                .addGap(51, 51, 51)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_customerName)
                            .addComponent(txt_address)
                            .addComponent(txt_contact)
                            .addComponent(txt_bookOrdered)
                            .addComponent(txt_quantity)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(combo_date, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(combo_month, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(combo_year, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(139, 139, 139)
                            .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txt_author, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(lbl_bookOrdered, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_bookOrdered, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_author, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_author))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(txt_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combo_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_month, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_year, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(lbl_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_orderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)))
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
        txt_bookOrdered.setText("");
        txt_author.setText("");
        txt_quantity.setText("");
        txt_customerName.requestFocus();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
        String customerName = txt_customerName.getText();
        String address = txt_address.getText();
        String contact = txt_contact.getText();
        String bookOrdered = txt_bookOrdered.getText();
        String author = txt_author.getText();
        String quantity = txt_quantity.getText();
        String date = (String) combo_date.getSelectedItem();
        String month = (String) combo_month.getSelectedItem();
        String year = (String) combo_year.getSelectedItem();
        String orderDate = date + "-" + month + "-" + year;
        if (!customerName.isEmpty() && !address.isEmpty() && !contact.isEmpty() && !bookOrdered.isEmpty() && !author.isEmpty() && !quantity.isEmpty()) {
            //JOptionPane.showMessageDialog(this, "Book Ordered : " + bookOrdered);
            int modifiedQuantity = Integer.parseInt(quantity);
            Customerorder customerorder = new Customerorder();
            customerorder.setCustomerName(customerName);
            customerorder.setAddress(address);
            customerorder.setContactNo(contact);
            customerorder.setBookOrdered(bookOrdered);
            customerorder.setAuthor(author);
            customerorder.setQuantity(modifiedQuantity);
            customerorder.setOrderDate(orderDate);
            OrderController ordercontroller = new OrderController();
            int isOrderAdded = ordercontroller.addOrder(customerorder);
            if (isOrderAdded == 1) {
                JOptionPane.showMessageDialog(this, "Order successfully added !");
                txt_customerName.setText("");
                txt_address.setText("");
                txt_contact.setText("");
                txt_bookOrdered.setText("");
                txt_author.setText("");
                txt_quantity.setText("");
                txt_customerName.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "There was a problem adding the order !");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please fill all the fields !");
        }
    }//GEN-LAST:event_btn_okActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_ok;
    private javax.swing.JButton btn_reset;
    private javax.swing.JComboBox combo_date;
    private javax.swing.JComboBox combo_month;
    private javax.swing.JComboBox combo_year;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_author;
    private javax.swing.JLabel lbl_bookOrdered;
    private javax.swing.JLabel lbl_contact;
    private javax.swing.JLabel lbl_orderDate;
    private javax.swing.JLabel lbl_quantity;
    private javax.swing.JLabel lbl_vendorName;
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane scrollpane;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_author;
    private javax.swing.JTextField txt_bookOrdered;
    private javax.swing.JTextField txt_contact;
    private javax.swing.JTextField txt_customerName;
    private javax.swing.JTextField txt_quantity;
    // End of variables declaration//GEN-END:variables
}