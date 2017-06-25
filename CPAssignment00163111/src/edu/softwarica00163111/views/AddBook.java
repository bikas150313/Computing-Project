/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.softwarica00163111.views;

/**
 *
 * @author Bikas
 */
public class AddBook extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddBook
     */
    public AddBook() {
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

        pan_addBook = new javax.swing.JPanel();
        lbl_bookName = new javax.swing.JLabel();
        txt_bookName = new javax.swing.JTextField();
        lbl_author = new javax.swing.JLabel();
        txt_author = new javax.swing.JTextField();
        lbl_edition = new javax.swing.JLabel();
        txt_edition = new javax.swing.JTextField();
        lbl_genre = new javax.swing.JLabel();

        pan_addBook.setBackground(new java.awt.Color(0, 51, 51));
        pan_addBook.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Book Details", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Cooper Black", 0, 24), new java.awt.Color(153, 153, 255))); // NOI18N

        lbl_bookName.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        lbl_bookName.setForeground(new java.awt.Color(51, 153, 0));
        lbl_bookName.setText("Book Name :");

        txt_bookName.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txt_bookName.setForeground(new java.awt.Color(0, 51, 153));

        lbl_author.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        lbl_author.setForeground(new java.awt.Color(51, 153, 0));
        lbl_author.setText("Author :");

        txt_author.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txt_author.setForeground(new java.awt.Color(0, 51, 153));

        lbl_edition.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        lbl_edition.setForeground(new java.awt.Color(51, 153, 0));
        lbl_edition.setText("Edition :");

        txt_edition.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txt_edition.setForeground(new java.awt.Color(0, 51, 153));

        lbl_genre.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        lbl_genre.setForeground(new java.awt.Color(51, 153, 0));
        lbl_genre.setText("Genre :");

        javax.swing.GroupLayout pan_addBookLayout = new javax.swing.GroupLayout(pan_addBook);
        pan_addBook.setLayout(pan_addBookLayout);
        pan_addBookLayout.setHorizontalGroup(
            pan_addBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_addBookLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(pan_addBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_genre)
                    .addGroup(pan_addBookLayout.createSequentialGroup()
                        .addGroup(pan_addBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_bookName)
                            .addComponent(lbl_author)
                            .addComponent(lbl_edition))
                        .addGap(135, 135, 135)
                        .addGroup(pan_addBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_bookName)
                            .addComponent(txt_author, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                            .addComponent(txt_edition))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        pan_addBookLayout.setVerticalGroup(
            pan_addBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_addBookLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan_addBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_bookName)
                    .addComponent(lbl_bookName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pan_addBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_author, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_author))
                .addGap(18, 18, 18)
                .addGroup(pan_addBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_edition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_edition))
                .addGap(18, 18, 18)
                .addComponent(lbl_genre)
                .addContainerGap(343, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pan_addBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pan_addBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_author;
    private javax.swing.JLabel lbl_bookName;
    private javax.swing.JLabel lbl_edition;
    private javax.swing.JLabel lbl_genre;
    private javax.swing.JPanel pan_addBook;
    private javax.swing.JTextField txt_author;
    private javax.swing.JTextField txt_bookName;
    private javax.swing.JTextField txt_edition;
    // End of variables declaration//GEN-END:variables
}
