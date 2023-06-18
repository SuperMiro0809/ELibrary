/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package elibrary;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author aneli
 */
public class Admin extends javax.swing.JFrame {

    /* 
    *@param user;
    */
    public Admin(UserState user) {
        if(user != null) {
            initComponents();
            
            AdminName.setText(user.getUsername());
            
            loadBooks();
        }else {
            JOptionPane.showMessageDialog(null, "Please login to visit this page.");
            
            Login object = new Login();
        
            object.setVisible(true);

            dispose();
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        RoleLabel = new javax.swing.JLabel();
        HeaderLabel = new javax.swing.JLabel();
        LogoLabel = new javax.swing.JLabel();
        AdminName = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        IDLabel = new javax.swing.JLabel();
        CategoryLabel = new javax.swing.JLabel();
        BookNameLabel = new javax.swing.JLabel();
        AuthorLabel = new javax.swing.JLabel();
        URLField = new javax.swing.JTextField();
        BookNameField = new javax.swing.JTextField();
        AuthorField = new javax.swing.JTextField();
        CategoryBox = new javax.swing.JComboBox<>();
        AddBookLabel = new javax.swing.JLabel();
        SectionHeader = new javax.swing.JLabel();
        SectionScrollPane = new javax.swing.JScrollPane();
        SectionTable = new javax.swing.JTable();
        ErrorMessage = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(97, 95, 84));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(71, 70, 62), 3, true));

        jPanel2.setBackground(new java.awt.Color(250, 238, 175));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 70, 62)));

        RoleLabel.setFont(new java.awt.Font("Eras Medium ITC", 0, 24)); // NOI18N
        RoleLabel.setForeground(new java.awt.Color(102, 87, 11));
        RoleLabel.setText("Logged as admin: ");

        HeaderLabel.setFont(new java.awt.Font("Vladimir Script", 1, 60)); // NOI18N
        HeaderLabel.setForeground(new java.awt.Color(71, 70, 62));
        HeaderLabel.setText("E-Library");

        AdminName.setFont(new java.awt.Font("Eras Medium ITC", 0, 24)); // NOI18N
        AdminName.setForeground(new java.awt.Color(102, 87, 11));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(LogoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HeaderLabel))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(RoleLabel)
                        .addGap(18, 18, 18)
                        .addComponent(AdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HeaderLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RoleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AdminName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(250, 238, 175));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 70, 62)));

        IDLabel.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        IDLabel.setForeground(new java.awt.Color(97, 95, 84));
        IDLabel.setText("URL");

        CategoryLabel.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        CategoryLabel.setForeground(new java.awt.Color(97, 95, 84));
        CategoryLabel.setText("Category");

        BookNameLabel.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        BookNameLabel.setForeground(new java.awt.Color(97, 95, 84));
        BookNameLabel.setText("Book name");

        AuthorLabel.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        AuthorLabel.setForeground(new java.awt.Color(97, 95, 84));
        AuthorLabel.setText("Author");

        URLField.setBackground(new java.awt.Color(227, 223, 197));
        URLField.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        URLField.setForeground(new java.awt.Color(102, 87, 11));

        BookNameField.setBackground(new java.awt.Color(227, 223, 197));
        BookNameField.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        BookNameField.setForeground(new java.awt.Color(102, 87, 11));
        BookNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookNameFieldActionPerformed(evt);
            }
        });

        AuthorField.setBackground(new java.awt.Color(227, 223, 197));
        AuthorField.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        AuthorField.setForeground(new java.awt.Color(102, 87, 11));

        CategoryBox.setBackground(new java.awt.Color(227, 223, 197));
        CategoryBox.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        CategoryBox.setForeground(new java.awt.Color(97, 95, 84));
        CategoryBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Autobiography", "Biography", "Classics", "Crime/Mistery", "Fairytales", "Fantasy", "Horror", "Humour and satire", "Poetry", "Romance", "Science fiction", "Self-help", " ", " " }));

        AddBookLabel.setFont(new java.awt.Font("Eras Medium ITC", 1, 18)); // NOI18N
        AddBookLabel.setForeground(new java.awt.Color(102, 87, 11));
        AddBookLabel.setText("Add a book:");

        SectionHeader.setFont(new java.awt.Font("Eras Medium ITC", 1, 18)); // NOI18N
        SectionHeader.setForeground(new java.awt.Color(102, 87, 11));
        SectionHeader.setText("Section with available books:");

        SectionTable.setBackground(new java.awt.Color(227, 223, 197));
        SectionTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 87, 11), 1, true));
        SectionTable.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        SectionTable.setForeground(new java.awt.Color(97, 95, 84));
        SectionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Book name", "Category", "Autor", "Operation"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SectionTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SectionTableMouseClicked(evt);
            }
        });
        SectionScrollPane.setViewportView(SectionTable);

        ErrorMessage.setFont(new java.awt.Font("Eras Medium ITC", 1, 18)); // NOI18N
        ErrorMessage.setForeground(new java.awt.Color(255, 0, 0));
        ErrorMessage.setSize(new java.awt.Dimension(327, 22));

        AddButton.setBackground(new java.awt.Color(97, 95, 84));
        AddButton.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        AddButton.setForeground(new java.awt.Color(227, 223, 197));
        AddButton.setText("Add ");
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AddButtonMousePressed(evt);
            }
        });
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(SectionHeader)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddBookLabel)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(CategoryLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CategoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SectionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(ErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AddButton))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(IDLabel)
                                    .addGap(40, 40, 40)
                                    .addComponent(URLField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(97, 97, 97)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BookNameLabel)
                                        .addComponent(AuthorLabel))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(AuthorField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BookNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 26, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(AddBookLabel)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IDLabel)
                            .addComponent(URLField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookNameLabel)
                            .addComponent(BookNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CategoryLabel)
                            .addComponent(CategoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AuthorLabel)
                            .addComponent(AuthorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(ErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddButton)))
                .addGap(18, 18, 18)
                .addComponent(SectionHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SectionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(340, 340, 340))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 373, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddButtonActionPerformed

    private void SectionTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SectionTableMouseClicked
        int index=SectionTable.getSelectedRow();
        TableModel model=SectionTable.getModel();
        
        int id=(int) model.getValueAt(index, 0);
        String bookName=(String) model.getValueAt(index, 1);
        String category=(String) model.getValueAt(index, 2);
        String autor=(String) model.getValueAt(index, 3);
        
        int response = JOptionPane.showConfirmDialog(this,"Are you sure you want to remove the book with parameters: \n ID: " + id + "\n Book name: " + bookName + "\n Category: " + category + "\n Autor: " + autor, "Confirmation of removal", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(response==JOptionPane.YES_OPTION){
            BookService bookService = new BookService();
            
            boolean res = bookService.deleteBook(id);
            
            // load books on success
            if(res) {
                loadBooks();
            }
        }
        else if(response==JOptionPane.NO_OPTION){
            System.out.println("Confirmation denied.");
        }
        else if(response==JOptionPane.CLOSED_OPTION){
            System.out.println("The confirmation form has been closed.");
        }
    }//GEN-LAST:event_SectionTableMouseClicked

    private void BookNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookNameFieldActionPerformed

    private void AddButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMousePressed
        String url = URLField.getText();
        String name = BookNameField.getText();
        String category = CategoryBox.getSelectedItem().toString();
        String author = AuthorField.getText();
        
        if(url.isBlank()) {
            ErrorMessage.setText("URL is required!");
        }else if(name.isBlank()) {
            ErrorMessage.setText("Book name is required!");
        }else if(author.isBlank()) {
            ErrorMessage.setText("Author is required!");
        }else {
            ErrorMessage.setText("");
            
            BookService bookService = new BookService();
            
            boolean res = bookService.createBook(url, name, category, author);
            
            if(res) {
                loadBooks(); //load books on success
                URLField.setText("");
                BookNameField.setText("");
                CategoryBox.setSelectedIndex(0);
                AuthorField.setText("");
            }else {
                ErrorMessage.setText("Error!");
            }
        }
    }//GEN-LAST:event_AddButtonMousePressed
    
    private void loadBooks() {
        BookService bookService = new BookService();
        
        ArrayList<Book> bookArr = bookService.getBooks();
        
        DefaultTableModel tableModel = new DefaultTableModel(new Object[]{"ID", "Book name", "Category", "Author"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Make all cells uneditable
                return false;
            }
        };
        
        tableModel.setRowCount(0);
        
        for(Book book : bookArr) {
            Object[] rowData = {book.getId(), book.getName(), book.getCategory(), book.getAuthor()};
            tableModel.addRow(rowData);
        }
        
        SectionTable.setModel(tableModel);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin(null).setVisible(true);
            }
        });
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddBookLabel;
    private javax.swing.JButton AddButton;
    private javax.swing.JLabel AdminName;
    private javax.swing.JTextField AuthorField;
    private javax.swing.JLabel AuthorLabel;
    private javax.swing.JTextField BookNameField;
    private javax.swing.JLabel BookNameLabel;
    private javax.swing.JComboBox<String> CategoryBox;
    private javax.swing.JLabel CategoryLabel;
    private javax.swing.JLabel ErrorMessage;
    private javax.swing.JLabel HeaderLabel;
    private javax.swing.JLabel IDLabel;
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JLabel RoleLabel;
    private javax.swing.JLabel SectionHeader;
    private javax.swing.JScrollPane SectionScrollPane;
    private javax.swing.JTable SectionTable;
    private javax.swing.JTextField URLField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
