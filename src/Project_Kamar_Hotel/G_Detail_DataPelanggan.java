/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Project_Kamar_Hotel;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import javax.swing.JTable;
import java.sql.Connection;
import java.sql.PreparedStatement;
        
/**
 *
 * @author Ginanjar Putra
 */
public class G_Detail_DataPelanggan extends javax.swing.JFrame {

    /**
     * Creates new form G_Detail_DataPelanggan
     */
    public G_Detail_DataPelanggan() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        tabel3();
    }
    
    void hapus(){
        txt_cari.setText("");
    }
    
    
    void cari(){
         DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Nama");
        tbl.addColumn("Telepon");
        tbl.addColumn("Alamat");
        tbl.addColumn("Jenis Kelamin");
        tbl.addColumn("E-Mail");
        tbl.addColumn("No Id");
        tbl.addColumn("Check In");
        tbl.addColumn("Check Out");
        tbl.addColumn("Tipe Kamar");
        tbl.addColumn("No Kamar");
        tbl.addColumn("Harga/Hari");
        tbl.addColumn("Lama Tinggal");
        tbl.addColumn("Tagihan");
        
        try {
            String sql = "SELECT * FROM tb_data WHERE nama like '%" + txt_cari.getText() + "%'";
            Connection con = (Connection) Koneksi.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
             while (rs.next()){
             tbl.addRow(new Object[]{
                rs.getString("nama"),
                rs.getString("telepon"),
                rs.getString("alamat"),
                rs.getString("jeniskelamin"),
                rs.getString("email"),
                rs.getString("noid"),
                rs.getString("checkin"),
                rs.getString("checkout"),
                rs.getString("tipekamar"),
                rs.getString("nomorkamar"),
                rs.getString("harga"),
                rs.getString("lamatinggal"),
                rs.getString("tagihan")
         
            });
             tabel3.setModel(tbl); 
        }
            
        } catch (Exception e) {
        }
        
    }

    
    public void  tabel3() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Nama");
        tbl.addColumn("Telepon");
        tbl.addColumn("Alamat");
        tbl.addColumn("Jenis Kelamin");
        tbl.addColumn("E-Mail");
        tbl.addColumn("No Id");
        tbl.addColumn("Check In");
        tbl.addColumn("Check Out");
        tbl.addColumn("Tipe Kamar");
        tbl.addColumn("No Kamar");
        tbl.addColumn("Harga/Hari");
        tbl.addColumn("Lama Tinggal");
        tbl.addColumn("Tagihan");
        
        try {
            Statement st = (Statement)  Koneksi.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tb_data");
            
             while (rs.next()){
             tbl.addRow(new Object[]{
                rs.getString("nama"),
                rs.getString("telepon"),
                rs.getString("alamat"),
                rs.getString("jeniskelamin"),
                rs.getString("email"),
                rs.getString("noid"),
                rs.getString("checkin"),
                rs.getString("checkout"),
                rs.getString("tipekamar"),
                rs.getString("nomorkamar"),
                rs.getString("harga"),
                rs.getString("lamatinggal"),
                rs.getString("tagihan")
         
            });
             tabel3.setModel(tbl); 
        }
//            JOptionPane.showMessageDialog(null, "Koneksi Database  Berhasil");
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Koneksi Database Gagal" + e.getMessage());
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

        jButton3 = new javax.swing.JButton();
        jButton_DetailPembayaran = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel3 = new javax.swing.JTable();
        jLabel_nama3 = new javax.swing.JLabel();
        txt_cari = new javax.swing.JTextField();
        btn_cari = new javax.swing.JButton();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        jButton3.setText("  Kembali");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1110, 30, 140, 40);

        jButton_DetailPembayaran.setBackground(new java.awt.Color(255, 204, 0));
        jButton_DetailPembayaran.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_DetailPembayaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/006-booking.png"))); // NOI18N
        jButton_DetailPembayaran.setText("  Data Riwayat Pelanggan");
        jButton_DetailPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DetailPembayaranActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_DetailPembayaran);
        jButton_DetailPembayaran.setBounds(30, 100, 300, 50);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabel3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "No. Telepon", "Alamat", "Jenis Kelamin", "E-mail", "No. ID", "Check In", "Check Out", "Tipe Kamar", "No. Kamar", "Lama Tinggal", "Harga Per Hari", "Tagihan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, true, true, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel3MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel3);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 260, 1220, 350);

        jLabel_nama3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nama3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nama3.setText("Cari Nama");
        getContentPane().add(jLabel_nama3);
        jLabel_nama3.setBounds(400, 210, 80, 28);

        txt_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cariActionPerformed(evt);
            }
        });
        getContentPane().add(txt_cari);
        txt_cari.setBounds(480, 210, 260, 28);

        btn_cari.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_cari.setText("Cari");
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cari);
        btn_cari.setBounds(750, 210, 72, 28);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ISI.png"))); // NOI18N
        getContentPane().add(BG);
        BG.setBounds(0, 0, 1284, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        C_Menu menu = new C_Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton_DetailPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DetailPembayaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_DetailPembayaranActionPerformed

    private void tabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel3MouseClicked
        // TODO add your handling code here:

       
    }//GEN-LAST:event_tabel3MouseClicked

    private void txt_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cariActionPerformed

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        // TODO add your handling code here:
        cari();
        hapus();

    }//GEN-LAST:event_btn_cariActionPerformed

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
            java.util.logging.Logger.getLogger(G_Detail_DataPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(G_Detail_DataPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(G_Detail_DataPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(G_Detail_DataPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new G_Detail_DataPelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton_DetailPembayaran;
    private javax.swing.JLabel jLabel_nama3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabel3;
    private javax.swing.JTextField txt_cari;
    // End of variables declaration//GEN-END:variables
}