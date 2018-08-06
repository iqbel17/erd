/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.PemasukanKoperasiController;
import controllers.SimpananController;
import entities.Pemasukankoperasi;
import entities.Simpanan;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author iqbael17
 */
public class PemasukanKoperasiView extends javax.swing.JInternalFrame {

    private Connection connection;
    private PemasukanKoperasiController pemasukanKoperasiController;
    private SimpananController simpananController;
    /**
     * Creates new form SimpananKoperasi
     */
    public PemasukanKoperasiView(Connection connection) {
        this.connection = connection;
        initComponents();
        this.simpananController = new SimpananController(connection);

        this.pemasukanKoperasiController = new PemasukanKoperasiController(connection);
        btnEdit.setEnabled(false);
        bindingTable();
        cekSaldo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbPemasukan = new javax.swing.JComboBox<>();
        txtCariPemasukanKoperasi = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSimpananKoperasi = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtKdPemasukanKoperasi = new javax.swing.JTextField();
        txtNamapemasukan = new javax.swing.JTextField();
        txtNominalmasukKop = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSaldokoperasi = new javax.swing.JTable();

        setClosable(true);
        setTitle("Pemasukan Koperasi");

        cmbPemasukan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "kd_masukkoperasi", "tgl_simpan", "nominal", "nama_pemasukan" }));

        txtCariPemasukanKoperasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariPemasukanKoperasiActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        tblSimpananKoperasi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblSimpananKoperasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSimpananKoperasiMouseClicked(evt);
            }
        });
        tblSimpananKoperasi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblSimpananKoperasiKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblSimpananKoperasi);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Form Pemasukan Koperasi"));

        jLabel1.setText("Kode Pemasukan Koperasi");

        jLabel2.setText("Nama Pemasukan");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel3.setText("Nominal");

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEdit)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtKdPemasukanKoperasi, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                        .addComponent(txtNamapemasukan))
                    .addComponent(txtNominalmasukKop, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKdPemasukanKoperasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNamapemasukan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNominalmasukKop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnEdit)))
        );

        tblSaldokoperasi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblSaldokoperasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSaldokoperasiMouseClicked(evt);
            }
        });
        tblSaldokoperasi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblSaldokoperasiKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblSaldokoperasi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cmbPemasukan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCariPemasukanKoperasi, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCari)
                                .addGap(85, 85, 85))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCariPemasukanKoperasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari)
                    .addComponent(cmbPemasukan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblSimpananKoperasiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblSimpananKoperasiKeyPressed
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_tblSimpananKoperasiKeyPressed

    private void tblSimpananKoperasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSimpananKoperasiMouseClicked
        // TODO add your handling code here:
           int row = tblSimpananKoperasi.getSelectedRow();

        txtKdPemasukanKoperasi.setText(tblSimpananKoperasi.getValueAt(row, 0).toString());
        txtNamapemasukan.setText(tblSimpananKoperasi.getValueAt(row, 1).toString());
        txtNominalmasukKop.setText(tblSimpananKoperasi.getValueAt(row, 3).toString());
        txtNominalmasukKop.setEnabled(false);
        btnEdit.setEnabled(true);
        btnSave.setEnabled(false);
        
    }//GEN-LAST:event_tblSimpananKoperasiMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
                boolean flag = this.pemasukanKoperasiController.save(txtKdPemasukanKoperasi.getText(), txtNamapemasukan.getText(),txtNominalmasukKop.getText());
        String message = "Failed to save data";
        if (flag) {
            message = "succes save";
        }
        JOptionPane.showMessageDialog(this, message, "Allert/Notification", JOptionPane.INFORMATION_MESSAGE);
        cekSaldo();
        bindingTable();
        reset();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        String message="Failed to edit data";
if(pemasukanKoperasiController.edit(txtKdPemasukanKoperasi.getText(), txtNamapemasukan.getText())){
    message ="Succes to edit data";
}
        JOptionPane.showMessageDialog(this, message,"Notification",JOptionPane.ERROR_MESSAGE);
        cekSaldo();
        bindingTable();
        reset();
    }//GEN-LAST:event_btnEditActionPerformed

    private void txtCariPemasukanKoperasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariPemasukanKoperasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariPemasukanKoperasiActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        SearchTable(cmbPemasukan.getSelectedItem().toString(),txtCariPemasukanKoperasi.getText());
        
    }//GEN-LAST:event_btnCariActionPerformed

    private void tblSaldokoperasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSaldokoperasiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSaldokoperasiMouseClicked

    private void tblSaldokoperasiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblSaldokoperasiKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSaldokoperasiKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbPemasukan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblSaldokoperasi;
    private javax.swing.JTable tblSimpananKoperasi;
    private javax.swing.JTextField txtCariPemasukanKoperasi;
    private javax.swing.JTextField txtKdPemasukanKoperasi;
    private javax.swing.JTextField txtNamapemasukan;
    private javax.swing.JTextField txtNominalmasukKop;
    // End of variables declaration//GEN-END:variables
public void bindingTable() {
        String[] header = {"Kode Pemasukan Koperasi", "Nama Pemasukan", "Tanggal Simpan", "Nominal"};
        DefaultTableModel defaultTableModel = new DefaultTableModel(header, 0);
        for (Pemasukankoperasi pemasukankoperasi : pemasukanKoperasiController.binding()) {
            Object[] region1 = {
                pemasukankoperasi.getKdMasukkoperasi(), pemasukankoperasi.getNmPemasukan(), pemasukankoperasi.getTglSimpankoperasi(), pemasukankoperasi.getNominalsimpan()
            };
            defaultTableModel.addRow(region1);
        }
        tblSimpananKoperasi.setModel(defaultTableModel);

    }
private void reset(){
        txtKdPemasukanKoperasi.setText("");
        txtNominalmasukKop.setText("");
        txtNamapemasukan.setText("");
       
      
    }
 private void SearchTable(String category,String data) {

        String[] header = {"kode Pemasukan","tgl Simpan","nama pemasukan","nominal"};
        
       
        DefaultTableModel defaultTableModel = new DefaultTableModel(header, 0);
        for (Pemasukankoperasi pemasukankoperasi :pemasukanKoperasiController.find (category ,data)) {
            Object[] region1 = {
                pemasukankoperasi.getKdMasukkoperasi(), pemasukankoperasi.getTglSimpankoperasi(),pemasukankoperasi.getNmPemasukan(),pemasukankoperasi.getNominalsimpan()
            };
            defaultTableModel.addRow(region1);
        }
        tblSimpananKoperasi.setModel(defaultTableModel);
    }
 public void cekSaldo(){
     String[] header = {"Jumlah Saldo"};
       DefaultTableModel defaultTableModel = new DefaultTableModel(header, 0);
        for (Simpanan simpanan : simpananController.binding()) {
            Object[] region1 = {
                simpanan.getTotalSimpan()
            };
            defaultTableModel.addRow(region1);
        }
        
        tblSaldokoperasi.setModel(defaultTableModel);
}

}
