/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.softwarica00163111.views;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Bikas
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    private boolean clicked;
    private boolean closed;

    public Dashboard(boolean click) {
        this.clicked = click;
        initComponents();
        callInternalFrame();
    }

    public Dashboard() {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        desktoppane = new javax.swing.JDesktopPane();
        menubar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        systemEdit = new javax.swing.JMenuItem();
        logout = new javax.swing.JMenuItem();
        vendorMenu = new javax.swing.JMenu();
        addVendor = new javax.swing.JMenuItem();
        viewAllVendors = new javax.swing.JMenuItem();
        bookMenu = new javax.swing.JMenu();
        uploadBookCover = new javax.swing.JMenuItem();
        customerMenu = new javax.swing.JMenu();
        addCustomer = new javax.swing.JMenuItem();
        viewAllCustomers = new javax.swing.JMenuItem();
        orderMenu = new javax.swing.JMenu();
        addOrder = new javax.swing.JMenuItem();
        viewAllOrders = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktoppaneLayout = new javax.swing.GroupLayout(desktoppane);
        desktoppane.setLayout(desktoppaneLayout);
        desktoppaneLayout.setHorizontalGroup(
            desktoppaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1446, Short.MAX_VALUE)
        );
        desktoppaneLayout.setVerticalGroup(
            desktoppaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
        );

        fileMenu.setBorder(null);
        fileMenu.setForeground(new java.awt.Color(0, 51, 51));
        fileMenu.setText("File");
        fileMenu.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        systemEdit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        systemEdit.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        systemEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/softwarica00163111/icons/edit.png"))); // NOI18N
        systemEdit.setText("Edit System Profile");
        systemEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                systemEditActionPerformed(evt);
            }
        });
        fileMenu.add(systemEdit);

        logout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        logout.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/softwarica00163111/icons/logout.png"))); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        fileMenu.add(logout);

        menubar.add(fileMenu);

        vendorMenu.setText("Vendor");
        vendorMenu.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        addVendor.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        addVendor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/softwarica00163111/icons/add1.png"))); // NOI18N
        addVendor.setText("Add Vendor");
        addVendor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVendorActionPerformed(evt);
            }
        });
        vendorMenu.add(addVendor);

        viewAllVendors.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        viewAllVendors.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/softwarica00163111/icons/view.png"))); // NOI18N
        viewAllVendors.setText("View all Vendors");
        viewAllVendors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllVendorsActionPerformed(evt);
            }
        });
        vendorMenu.add(viewAllVendors);

        menubar.add(vendorMenu);

        bookMenu.setText("Book");
        bookMenu.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        uploadBookCover.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        uploadBookCover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/softwarica00163111/icons/upload.png"))); // NOI18N
        uploadBookCover.setText("Upload Book Cover");
        uploadBookCover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadBookCoverActionPerformed(evt);
            }
        });
        bookMenu.add(uploadBookCover);

        menubar.add(bookMenu);

        customerMenu.setText("Customer");
        customerMenu.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        addCustomer.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        addCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/softwarica00163111/icons/add1.png"))); // NOI18N
        addCustomer.setText("Add Customer");
        addCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerActionPerformed(evt);
            }
        });
        customerMenu.add(addCustomer);

        viewAllCustomers.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        viewAllCustomers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/softwarica00163111/icons/view.png"))); // NOI18N
        viewAllCustomers.setText("View all Customers");
        viewAllCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllCustomersActionPerformed(evt);
            }
        });
        customerMenu.add(viewAllCustomers);

        menubar.add(customerMenu);

        orderMenu.setText("Order");
        orderMenu.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        addOrder.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        addOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/softwarica00163111/icons/add.png"))); // NOI18N
        addOrder.setText("Add Order");
        addOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrderActionPerformed(evt);
            }
        });
        orderMenu.add(addOrder);

        viewAllOrders.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        viewAllOrders.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/softwarica00163111/icons/view.png"))); // NOI18N
        viewAllOrders.setText("View all Orders");
        viewAllOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllOrdersActionPerformed(evt);
            }
        });
        orderMenu.add(viewAllOrders);

        menubar.add(orderMenu);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktoppane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktoppane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void getAction(boolean click) {
        this.closed = click;
    }

    public void callInternalFrame() {
        if (clicked || closed) {
            DashboardInternalFrame dif = new DashboardInternalFrame();
            desktoppane.add(dif);
            dif.setVisible(true);
        }
    }

    private void systemEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_systemEditActionPerformed
        desktoppane.removeAll();
        desktoppane.repaint();
        EditSystemProfile esp = new EditSystemProfile();
        desktoppane.add(esp);
        esp.setVisible(true);
        esp.setLocation(400, 100);
    }//GEN-LAST:event_systemEditActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        this.dispose();
        Login li = new Login();
        li.setVisible(true);
        li.setLocationRelativeTo(null);
        li.setResizable(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void addVendorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVendorActionPerformed
        desktoppane.removeAll();
        desktoppane.repaint();
        AddVendor av = new AddVendor();
        desktoppane.add(av);
        av.setVisible(true);
        av.setLocation(270, 5);
        av.setSize(820, 625);
    }//GEN-LAST:event_addVendorActionPerformed

    private void viewAllVendorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllVendorsActionPerformed
        desktoppane.removeAll();
        desktoppane.repaint();
        ViewAllVendors vav = new ViewAllVendors();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screensize = toolkit.getScreenSize();
        vav.setSize(screensize);
        vav.setVisible(true);
        desktoppane.add(vav);
    }//GEN-LAST:event_viewAllVendorsActionPerformed

    private void addCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerActionPerformed
        desktoppane.removeAll();
        desktoppane.repaint();
        AddCustomer ac = new AddCustomer();
        desktoppane.add(ac);
        ac.setVisible(true);
        ac.setLocation(300, 5);
        ac.setSize(750, 625);
    }//GEN-LAST:event_addCustomerActionPerformed

    private void addOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrderActionPerformed
        desktoppane.removeAll();
        desktoppane.repaint();
        AddOrder ao = new AddOrder();
        desktoppane.add(ao);
        ao.setVisible(true);
        ao.setLocation(300, 5);
        ao.setSize(750, 625);
    }//GEN-LAST:event_addOrderActionPerformed

    private void viewAllCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllCustomersActionPerformed
        desktoppane.removeAll();
        desktoppane.repaint();
        ViewAllCustomers vac = new ViewAllCustomers();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screensize = toolkit.getScreenSize();
        vac.setSize(screensize);
        vac.setVisible(true);
        desktoppane.add(vac);
    }//GEN-LAST:event_viewAllCustomersActionPerformed

    private void viewAllOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllOrdersActionPerformed
        desktoppane.removeAll();
        desktoppane.repaint();
        ViewAllOrders vao = new ViewAllOrders();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screensize = toolkit.getScreenSize();
        vao.setSize(screensize);
        vao.setVisible(true);
        desktoppane.add(vao);
    }//GEN-LAST:event_viewAllOrdersActionPerformed

    private void uploadBookCoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadBookCoverActionPerformed
        desktoppane.removeAll();
        desktoppane.repaint();
        UploadBookCover ubc = new UploadBookCover();
        ubc.setVisible(true);
        ubc.setLocation(290, 150);
        ubc.setSize(725, 250);
        desktoppane.add(ubc);
    }//GEN-LAST:event_uploadBookCoverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addCustomer;
    private javax.swing.JMenuItem addOrder;
    private javax.swing.JMenuItem addVendor;
    private javax.swing.JMenu bookMenu;
    private javax.swing.JMenu customerMenu;
    private javax.swing.JDesktopPane desktoppane;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem logout;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JMenu orderMenu;
    private javax.swing.JMenuItem systemEdit;
    private javax.swing.JMenuItem uploadBookCover;
    private javax.swing.JMenu vendorMenu;
    private javax.swing.JMenuItem viewAllCustomers;
    private javax.swing.JMenuItem viewAllOrders;
    private javax.swing.JMenuItem viewAllVendors;
    // End of variables declaration//GEN-END:variables
}
