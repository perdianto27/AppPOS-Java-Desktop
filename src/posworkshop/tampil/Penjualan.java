/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posworkshop.tampil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import posworkshop.koneksi.koneksi;

/**
 *
 * @author PERDIANTO
 */
public class Penjualan extends javax.swing.JInternalFrame {
    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    /**
     * Creates new form Penjualan
     */
    public Penjualan() {
        initComponents();
        datatable();
    }
    
    protected void kosong(){
    txtnojl.setText("");
    txttgljl.setText("");
    txtkd.setText("");
    txtnm.setText("");
    txtjns.setText("");        
    txthrgjl.setText("");
    txtjml.setText("");
    txtstk.setText("");
    }
    
    protected void datatable(){
        Object[] Baris ={"Nomor Penjualan","Tanggal Penjualan","Kode Barang","Nama Barang","Jenis","Harga Jual","Jumlah","Stok"};
        tabmode = new DefaultTableModel(null, Baris);
        tblPenjualan.setModel(tabmode);
        String sql= "select * from penjualan";
    try{
        java.sql.Statement stat=conn.createStatement();
        ResultSet hasil=stat.executeQuery(sql);
        while(hasil.next()){
            String nomor=hasil.getString("no_penjualan");
            String tanggal=hasil.getString("tgl_penjualan");
            String kode=hasil.getString("kd_brg");
            String nama=hasil.getString("nama_brg");
            String jenis=hasil.getString("jenis");
            String hargajual=hasil.getString("harga_jual");
            String jumlah=hasil.getString("jumlah");
            String stok=hasil.getString("stok_brg");
            String[] data={nomor,tanggal,kode,nama,jenis,hargajual,jumlah,stok};
            tabmode.addRow(data);
    }
    } catch (Exception e) {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnojl = new javax.swing.JTextField();
        txttgljl = new javax.swing.JTextField();
        txtkd = new javax.swing.JTextField();
        txtnm = new javax.swing.JTextField();
        txtjns = new javax.swing.JTextField();
        txthrgjl = new javax.swing.JTextField();
        txtjml = new javax.swing.JTextField();
        txtstk = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPenjualan = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(8, 139, 241));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Penjualan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 36))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(8, 139, 241));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel1.setText("Nomor Penjualan");

        jLabel3.setText("Kode Barang");

        jLabel2.setText("Tanggal Penjualan");

        jLabel4.setText("Nama Barang");

        jLabel5.setText("Jenis Barang");

        jLabel6.setText("Harga Jual");

        jLabel7.setText("Jumlah Barang");

        jLabel8.setText("Stok Barang");

        txtkd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtstk, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(txtjml, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(txthrgjl)
                    .addComponent(txtjns)
                    .addComponent(txtnm)
                    .addComponent(txtkd))
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnojl)
                    .addComponent(txttgljl))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtnojl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txttgljl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtkd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtjns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txthrgjl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtjml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtstk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 76, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(8, 139, 241));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tblPenjualan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblPenjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPenjualanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPenjualan);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1127, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(8, 139, 241));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSimpan)
                    .addComponent(btnHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUbah)
                    .addComponent(btnKeluar))
                .addGap(25, 25, 25))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnUbah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHapus)
                    .addComponent(btnKeluar))
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtkdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkdActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        String sql="insert into penjualan values(?,?,?,?,?,?,?,?)";
        try{
        PreparedStatement stat = conn.prepareStatement(sql);
        stat.setString(1, txtnojl.getText());
        stat.setString(2, txttgljl.getText());
        stat.setString(3, txtkd.getText());
        stat.setString(4, txtnm.getText());
        stat.setString(5, txtjns.getText());
        stat.setString(6, txthrgjl.getText());
        stat.setString(7, txtjml.getText());
        stat.setString(8, txtstk.getText());
        stat.executeUpdate();
        JOptionPane.showMessageDialog(null, "Berhasil Simpan");
        kosong();
        txtnojl.requestFocus();
        datatable();
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan"+e);
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void tblPenjualanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPenjualanMouseClicked
        // TODO add your handling code here:
        try{
            int row=tblPenjualan.getSelectedRow();
            String tabel_klik=(tblPenjualan.getModel().getValueAt(row, 0).toString());
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet sql=stm.executeQuery("SELECT * FROM penjualan where no_penjualan='"+tabel_klik+"'");
            if(sql.next()){
                String nomor=sql.getString("no_penjualan");
                    txtnojl.setText(nomor);
                String tanggal=sql.getString("tgl_penjualan");
                    txttgljl.setText(tanggal);
                String kode=sql.getString("kd_brg");
                    txtkd.setText(kode);
                String nama=sql.getString("nama_brg");
                    txtnm.setText(nama);
                String jenis=sql.getString("jenis");
                    txtjns.setText(jenis);
                String hargajual=sql.getString("harga_jual");
                    txthrgjl.setText(hargajual);
                String jumlah=sql.getString("jumlah");
                    txtjml.setText(jumlah);
                String stok=sql.getString("stok_brg");
                    txtstk.setText(stok);                     
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tidak ada yang anda pilih");
        }         
    }//GEN-LAST:event_tblPenjualanMouseClicked

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        String sql="UPDATE penjualan SET tgl_penjualan=?, kd_brg=?, nama_brg=?, jenis=?, harga_jual=?, jumlah=?, stok_brg=? where no_penjualan='"+txtnojl.getText()+"'";
        try{
            PreparedStatement stat=conn.prepareStatement(sql);
            stat.setString(1, txttgljl.getText());
            stat.setString(2, txtkd.getText());
            stat.setString(3, txtnm.getText());
            stat.setString(4, txtjns.getText());
            stat.setString(5, txthrgjl.getText());
            stat.setString(6, txtjml.getText());
            stat.setString(7, txtstk.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            kosong();
            txtnojl.requestFocus();
            datatable();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Simpan"+e);
        }          
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        int ok = JOptionPane.showConfirmDialog(null,"Apakah anda yakin ingin menghapus data", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
        if(ok==0){
            String sql="DELETE FROM penjualan WHERE no_penjualan='"+txtnojl.getText()+"'";
            try{
                PreparedStatement stat=conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                kosong();
                txtkd.requestFocus();
                datatable();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Data Gagal Dihapus" +e);
            }
    }            
    }//GEN-LAST:event_btnHapusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPenjualan;
    private javax.swing.JTextField txthrgjl;
    private javax.swing.JTextField txtjml;
    private javax.swing.JTextField txtjns;
    private javax.swing.JTextField txtkd;
    private javax.swing.JTextField txtnm;
    private javax.swing.JTextField txtnojl;
    private javax.swing.JTextField txtstk;
    private javax.swing.JTextField txttgljl;
    // End of variables declaration//GEN-END:variables
}