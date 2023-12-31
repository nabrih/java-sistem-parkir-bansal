/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemparkir;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author J-EXPRESS
 */
public class DataUser extends javax.swing.JFrame {

    Connection conn;
    DefaultTableModel model;

    /**
     * Creates new form DataUser
     */
    public DataUser() {
        initComponents();
        Database db = new Database();
        try {
            conn = db.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DataUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        model = (DefaultTableModel) jTable1.getModel();
        getDataUser();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inputKode = new javax.swing.JTextField();
        inputNama = new javax.swing.JTextField();
        inputPassword = new javax.swing.JPasswordField();
        jButtonCari = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        inputPilihJenisUser = new javax.swing.JComboBox<>();
        jButtonSimpan = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();
        jButtonBersih = new javax.swing.JButton();
        jButtonKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Data User");

        jLabel1.setText("Kode User");

        jLabel2.setText("Password");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode User", "Nama", "Jenis User"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setText("Nama");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Data User");

        jButtonCari.setText("Cari");
        jButtonCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCariActionPerformed(evt);
            }
        });

        jLabel6.setText("Jenis User");

        inputPilihJenisUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih --", "Operator", "Admin" }));

        jButtonSimpan.setText("Simpan");
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });

        jButtonEdit.setText("Edit");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonHapus.setText("Hapus");
        jButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusActionPerformed(evt);
            }
        });

        jButtonBersih.setText("Bersih");
        jButtonBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBersihActionPerformed(evt);
            }
        });

        jButtonKeluar.setText("Keluar");
        jButtonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(159, 159, 159))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(inputKode, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCari))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inputPilihJenisUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBersih)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonKeluar)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCari))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(inputPilihJenisUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSimpan)
                    .addComponent(jButtonEdit)
                    .addComponent(jButtonHapus)
                    .addComponent(jButtonBersih)
                    .addComponent(jButtonKeluar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCariActionPerformed
        try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from user where kode='" + inputKode.getText() + "'");
            rs.beforeFirst();
            
            if (rs.next()) {
                inputNama.setText(rs.getString("nama"));
                inputPilihJenisUser.setSelectedItem(rs.getString("jenis_user"));
                inputPassword.setText(rs.getString("password"));

                JOptionPane.showMessageDialog(this, "Kode yang dicari ada", "Informasi",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                bersihkanInput(true);
                JOptionPane.showMessageDialog(this, "Maaf kode yang dicari tidak ada", "Informasi",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButtonCariActionPerformed

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
        try{
            Statement st = conn.createStatement();
            int val = st.executeUpdate("INSERT INTO user"
                    + " VALUES('" + inputKode.getText() + "','" + inputNama.getText() + "','"
                    + inputPilihJenisUser.getSelectedItem() + "','" + inputPassword.getText()+ "')"
            );
            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Informasi",
                    JOptionPane.INFORMATION_MESSAGE);
            System.out.println("data berhasil ditambahkan");
            model.setRowCount(0);
            bersihkanInput();
            getDataUser();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButtonSimpanActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        try{
            Statement st = conn.createStatement();
            int ubah = st.executeUpdate("update user set nama='" + inputNama.getText()
                    + "', jenis_user='" + inputPilihJenisUser.getSelectedItem() 
                    + "', password='" + inputPassword.getText()+ "'"
                    + " where kode='" + inputKode.getText() + "'");

            if (ubah == 1) {
                bersihkanInput();
                getDataUser();
                JOptionPane.showMessageDialog(this, "Data berhasil diupdate", "Informasi",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                bersihkanInput(true);
                JOptionPane.showMessageDialog(this, "Data gagal diupdate", "Informasi",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed
        try{
            Statement st = conn.createStatement();
            int ubah = st.executeUpdate("delete from user where kode='" + inputKode.getText() + "'");

            if (ubah == 1) {
                bersihkanInput();
                getDataUser();
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Informasi",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                bersihkanInput(true);
                JOptionPane.showMessageDialog(this, "Data gagal dihapus", "Informasi",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButtonHapusActionPerformed

    private void jButtonBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBersihActionPerformed
        bersihkanInput();
    }//GEN-LAST:event_jButtonBersihActionPerformed

    private void jButtonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKeluarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonKeluarActionPerformed

    private void bersihkanInput(){
        bersihkanInput(false);
    }
    private void bersihkanInput(boolean exceptKode) {
        if (!exceptKode) {
            inputKode.setText("");
        }

        inputNama.setText("");
        inputPilihJenisUser.setSelectedIndex(0);
        inputPassword.setText("");
        inputPassword.setText("");
    }
    
    private void getDataUser() {
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from user");

            while (rs.next()) {
                Object[] data = new Object[]{
                    rs.getString("kode"),
                    rs.getString("nama"),
                    rs.getString("jenis_user")
                };
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataUser.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(DataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputKode;
    private javax.swing.JTextField inputNama;
    private javax.swing.JPasswordField inputPassword;
    private javax.swing.JComboBox<String> inputPilihJenisUser;
    private javax.swing.JButton jButtonBersih;
    private javax.swing.JButton jButtonCari;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonKeluar;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
