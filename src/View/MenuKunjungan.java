package View;

import Config.Koneksi;
import static Config.Koneksi.getConnection;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class MenuKunjungan extends javax.swing.JPanel {
    private String idPasien;
    private String idDokter;
    private String idObat;
    
    ResultSet Rs;
    private final Connection conn;
    public MenuKunjungan() {
        initComponents();
        
        conn = Koneksi.getConnection();
        setTableModel();
        loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new com.raven.datechooser.DateChooser();
        pnlPwtMain = new javax.swing.JPanel();
        pnlView = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKunjungan = new custom.Table_Custom();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAdd = new rojerusan.RSMaterialButtonRectangle();
        btnHapus = new rojerusan.RSMaterialButtonRectangle();
        btnBatal1 = new rojerusan.RSMaterialButtonRectangle();
        txtSearch = new custom.textfield_suggestion.TextFieldSuggestion();
        btnCetak = new rojerusan.RSMaterialButtonRectangle();
        pnlAdd = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSave = new rojerusan.RSMaterialButtonRectangle();
        btnBatal = new rojerusan.RSMaterialButtonRectangle();
        kjId = new custom.textfield.TextField();
        tglKj = new custom.textfield.TextField();
        dgns = new custom.textfield.TextField();
        klhn = new custom.textfield.TextField();
        tndkn = new custom.textfield.TextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbPasien = new custom.combobox.Combobox();
        cbDokter = new custom.combobox.Combobox();
        jLabel12 = new javax.swing.JLabel();
        cbObat = new custom.combobox.Combobox();

        dateChooser1.setTextRefernce(tglKj);

        setLayout(new java.awt.CardLayout());

        pnlPwtMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlPwtMain.setLayout(new java.awt.CardLayout());

        pnlView.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(56, 182, 255));
        jLabel3.setText("Data Kunjungan RS Kramat Jati");

        tblKunjungan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblKunjungan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKunjunganMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKunjungan);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Kunjungan_FIX__1_-removebg-preview.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(56, 182, 255));
        jLabel2.setText("Master Data > Kunjungan");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Monitor-removebg-preview (1).png"))); // NOI18N

        btnAdd.setBackground(new java.awt.Color(51, 102, 255));
        btnAdd.setText("TAMBAH");
        btnAdd.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(255, 0, 0));
        btnHapus.setText("HAPUS");
        btnHapus.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnBatal1.setBackground(new java.awt.Color(255, 153, 0));
        btnBatal1.setText("BATAL");
        btnBatal1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnBatal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatal1ActionPerformed(evt);
            }
        });

        txtSearch.setForeground(new java.awt.Color(204, 204, 204));
        txtSearch.setText("Search");
        txtSearch.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnCetak.setBackground(new java.awt.Color(51, 153, 255));
        btnCetak.setText("CETAK");
        btnCetak.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlViewLayout = new javax.swing.GroupLayout(pnlView);
        pnlView.setLayout(pnlViewLayout);
        pnlViewLayout.setHorizontalGroup(
            pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlViewLayout.createSequentialGroup()
                .addGroup(pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlViewLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlViewLayout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlViewLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))))
                    .addGroup(pnlViewLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlViewLayout.setVerticalGroup(
            pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlViewLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
        );

        pnlPwtMain.add(pnlView, "card2");

        pnlAdd.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(56, 182, 255));
        jLabel5.setText("Tambah Data Kunjungan RS Kramat Jati");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Kunjungan_FIX__1_-removebg-preview.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(56, 182, 255));
        jLabel7.setText("Master Data > Kunjungan");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Monitor-removebg-preview (1).png"))); // NOI18N

        btnSave.setText("SIMPAN");
        btnSave.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBatal.setBackground(new java.awt.Color(255, 204, 0));
        btnBatal.setText("BATAL");
        btnBatal.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        kjId.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        kjId.setLabelText("ID Kunjungan");

        tglKj.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        tglKj.setLabelText("Tgl. Kunjungan");

        dgns.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        dgns.setLabelText("Diagnosis");

        klhn.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        klhn.setLabelText("Keluhan");

        tndkn.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        tndkn.setLabelText("Tindakan");

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Nama Dokter");

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Kode Obat");

        cbPasien.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        cbPasien.setLabeText("");

        cbDokter.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        cbDokter.setLabeText("");

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Nama Pasien");

        cbObat.setAutoscrolls(true);
        cbObat.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        cbObat.setLabeText("");

        javax.swing.GroupLayout pnlAddLayout = new javax.swing.GroupLayout(pnlAdd);
        pnlAdd.setLayout(pnlAddLayout);
        pnlAddLayout.setHorizontalGroup(
            pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddLayout.createSequentialGroup()
                        .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbObat, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addGroup(pnlAddLayout.createSequentialGroup()
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tndkn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(klhn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbDokter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbPasien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kjId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                                .addComponent(tglKj, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dgns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 429, Short.MAX_VALUE))
                    .addGroup(pnlAddLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );
        pnlAddLayout.setVerticalGroup(
            pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(35, 35, 35)
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(kjId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tglKj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(klhn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(dgns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tndkn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(3, 3, 3)
                .addComponent(cbObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(367, Short.MAX_VALUE))
        );

        pnlPwtMain.add(pnlAdd, "card2");

        add(pnlPwtMain, "card4");
    }// </editor-fold>//GEN-END:initComponents

    private void showPanel(){
        pnlPwtMain.removeAll();
        pnlPwtMain.add(new MenuKunjungan());
        pnlPwtMain.repaint();
        pnlPwtMain.revalidate();
    }
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        pnlPwtMain.removeAll();
        pnlPwtMain.add(pnlAdd);
        pnlPwtMain.repaint();
        pnlPwtMain.revalidate();
        
        kjId.setText(setIdKunjungan());

        if (btnAdd.getText().equals("UBAH")) {
            dataTable();
            btnSave.setText("PERBARUI");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (btnSave.getText().equals("TAMBAH")) {
            setIdKunjungan();
            btnSave.setText("SIMPAN");
        } else if(btnSave.getText().equals("SIMPAN")){
            insertData();
        } else if(btnSave.getText().equals("PERBARUI")){
            updateData();
        }
        resetForm();
        showPanel();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        showPanel();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void tblKunjunganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKunjunganMouseClicked
        if (btnAdd.getText().equals("TAMBAH")) {
            btnAdd.setText("UBAH");
            btnHapus.setVisible(true);
            btnBatal1.setVisible(true);
            btnCetak.setVisible(true);
        }
    }//GEN-LAST:event_tblKunjunganMouseClicked

    private void btnBatal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatal1ActionPerformed
        showPanel();
        loadData();
    }//GEN-LAST:event_btnBatal1ActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        delete();
        resetForm();
        loadData();
        showPanel();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        searchData();
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        int row = tblKunjungan.getSelectedRow();
        
        String id = tblKunjungan.getValueAt(row, 0).toString();
        
        try {
            String reportPath = "src/Report/Report_Kunjungan.jasper";
            Connection conn = getConnection();
            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("id", id);
            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error displaying Report : " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCetakActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btnAdd;
    private rojerusan.RSMaterialButtonRectangle btnBatal;
    private rojerusan.RSMaterialButtonRectangle btnBatal1;
    private rojerusan.RSMaterialButtonRectangle btnCetak;
    private rojerusan.RSMaterialButtonRectangle btnHapus;
    private rojerusan.RSMaterialButtonRectangle btnSave;
    private custom.combobox.Combobox cbDokter;
    private custom.combobox.Combobox cbObat;
    private custom.combobox.Combobox cbPasien;
    private com.raven.datechooser.DateChooser dateChooser1;
    private custom.textfield.TextField dgns;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private custom.textfield.TextField kjId;
    private custom.textfield.TextField klhn;
    private javax.swing.JPanel pnlAdd;
    private javax.swing.JPanel pnlPwtMain;
    private javax.swing.JPanel pnlView;
    private custom.Table_Custom tblKunjungan;
    private custom.textfield.TextField tglKj;
    private custom.textfield.TextField tndkn;
    private custom.textfield_suggestion.TextFieldSuggestion txtSearch;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        getPasien();
        getDokter();
        getObat();
        
        getData((DefaultTableModel) tblKunjungan.getModel());
        btnHapus.setVisible(false);
        btnBatal1.setVisible(false);
        btnCetak.setVisible(false);
    }
    
    private void resetForm() {
        kjId.setText("");
        tglKj.setText("");
        dgns.setText("");
        klhn.setText("");
        tndkn.setText("");
    }
    
    private void setTableModel() {
        DefaultTableModel model  = (DefaultTableModel) tblKunjungan.getModel();
        model.addColumn("ID Kunjungan");
        model.addColumn("ID Pasien");
        model.addColumn("Nama Pasien");
        model.addColumn("ID Dokter");
        model.addColumn("Nama Dokter");
        model.addColumn("Tgl. Kunjungan");
        model.addColumn("Keluhan");
        model.addColumn("Diagnosis");
        model.addColumn("Tindakan");
        model.addColumn("ID Obat");
        model.addColumn("Nama Obat");
        model.addColumn("Harga");
    }

    private void getData(DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
            String sql = "SELECT kj.id_kunjungan, psn.id_pasien, psn.nm_pasien, dkt.id_dokter, dkt.nm_dokter, \n" +
                        "kj.tgl_kunjungan, kj.keluhan, kj.diagnosis, kj.tindakan, obt.id_obat, obt.nm_obat, obt.harga\n" +
                        "FROM tbl_kunjungan kj\n" +
                        "INNER JOIN tbl_pasien psn ON psn.id_pasien = kj.id_pasien\n" +
                        "INNER JOIN tbl_dokter dkt ON dkt.id_dokter = kj.id_dokter\n" +
                        "INNER JOIN tbl_obat obt ON obt.id_obat = kj.id_obat";
            try(PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String idKunjungan         = rs.getString("id_kunjungan");
                    String idPasien       = rs.getString("id_pasien");
                    String nmPasien       = rs.getString("nm_pasien");
                    String idDokter     = rs.getString("id_dokter");
                    String nmDokter       = rs.getString("nm_dokter");
                    String tglKunjungan          = rs.getString("tgl_kunjungan");
                    String keluhan        = rs.getString("keluhan");
                    String diagnosis        = rs.getString("diagnosis");
                    String tindakan    = rs.getString("tindakan");
                    String idObat       = rs.getString("id_obat");
                    String nmObat       = rs.getString("nm_obat");
                    String harga       = rs.getString("harga");
                    
                    Object[] rowData = {idKunjungan,idPasien,nmPasien,idDokter,nmDokter,tglKunjungan,keluhan,diagnosis,tindakan,idObat,nmObat,harga};
                    model.addRow(rowData);
                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuKunjungan.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private String setIdKunjungan(){
        String urutan = null;
        
        String sql = "SELECT RIGHT (id_kunjungan, 4) As Nomor " +
                "FROM tbl_kunjungan " +
                "WHERE id_kunjungan LIKE 'KJ%' " +
                "ORDER BY id_kunjungan DESC " +
                "LIMIT 1";
        try(PreparedStatement st = conn.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();
            
            if (rs.next()) {
                int nomor = Integer.parseInt(rs.getString("Nomor")) + 1;
                urutan = "KJ" + String.format("%04d", nomor);
            }else{
                urutan = "KJ0001";
            }
        } catch (Exception e) {
            Logger.getLogger(MenuKunjungan.class.getName()).log(Level.SEVERE, null, e);
        }
        return urutan;
    }
    
    private void getPasien(){
        try {
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            model.addElement("Pilih Pasien");
            String sql = "SELECT id_pasien, nm_pasien FROM tbl_pasien";
            PreparedStatement st = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                String namaPasien = rs.getString("nm_pasien");
                model.addElement(namaPasien);
            }
            cbPasien.setModel(model);
            cbPasien.addActionListener(e -> {
               int selectIndex = cbPasien.getSelectedIndex();
               
               if(selectIndex > 0){
                   try {
                       rs.absolute(selectIndex);
                       idPasien = rs.getString("id_pasien");
                   } catch (Exception ex) {
                       ex.printStackTrace();
                   }
 
               }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void getDokter(){
        try {
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            model.addElement("Pilih Dokter");
            String sql = "SELECT id_dokter, nm_dokter FROM tbl_dokter";
            PreparedStatement st = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery();
            
            
            while (rs.next()) {
                String namaObat = rs.getString("nm_dokter");
                model.addElement(namaObat);
                
            }
            cbDokter.setModel(model);
            cbDokter.addActionListener(e -> {
               int selectIndex = cbDokter.getSelectedIndex();
               
               if(selectIndex > 0){
                   try {
                       rs.absolute(selectIndex);
                       idDokter = rs.getString("id_dokter");
                   } catch (Exception ex) {
                       ex.printStackTrace();
                   }
 
               }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void getObat(){
        try {
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            model.addElement("Pilih Obat");
            String sql = "SELECT id_Obat, nm_obat FROM tbl_obat";
            PreparedStatement st = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery();
            
            
            while (rs.next()) {
                String namaObat = rs.getString("nm_obat");
                model.addElement(namaObat);
                
            }
            cbObat.setModel(model);
            cbObat.addActionListener(e -> {
               int selectIndex = cbObat.getSelectedIndex();
               
               if(selectIndex > 0){
                   try {
                       rs.absolute(selectIndex);
                       idObat = rs.getString("id_obat");
                   } catch (Exception ex) {
                       ex.printStackTrace();
                   }
 
               }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void insertData() {
        String idKunjungan = kjId.getText();
        String tglKunjungan = tglKj.getText();
        String keluhan = dgns.getText();
        String diagnosis = klhn.getText();
        String tindakan = tndkn.getText();
        
        if (idKunjungan.isEmpty() || cbPasien.getSelectedItem().toString().equals("Pilih Pasien") || cbDokter.getSelectedItem().toString().equals("Pilih Dokter")
                || tglKunjungan.isEmpty() || keluhan.isEmpty() || diagnosis.isEmpty() || tindakan.isEmpty() || 
                cbObat.getSelectedItem().toString().equals("Pilih Obat")) {
            JOptionPane.showMessageDialog(this, "Semua Kolom Harus Di Isi !", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            String sql = "INSERT INTO tbl_kunjungan (id_kunjungan, id_pasien, id_dokter, tgl_kunjungan, keluhan, diagnosis, tindakan, id_obat) VALUES (?,?,?,?,?,?,?,?)";
            try(PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, idKunjungan);
                st.setString(2, idPasien);
                st.setString(3, idDokter);
                st.setString(4, tglKunjungan);
                st.setString(5, keluhan);
                st.setString(6, diagnosis);
                st.setString(7, tindakan);
                st.setString(8, idObat);
                
                int rowInserted = st.executeUpdate();
                if (rowInserted > 0) {
                    JOptionPane.showMessageDialog(this, "Data Berhasil Di Tambahkan");
                    resetForm();
                    loadData();
                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuKunjungan.class.getName()).log(Level.SEVERE, null, e);
        }
    }

     private void dataTable() {
        pnlView.setVisible(false);
        pnlAdd.setVisible(false);
        
        int row = tblKunjungan.getSelectedRow();
        jLabel5.setText("Perbarui Data Kunjungan RS Kramat Jati");
        
        kjId.setEnabled(false);
        String id = tblKunjungan.getModel().getValueAt(row, 0).toString();
        
        kjId.setText(tblKunjungan.getValueAt(row, 0).toString());
        idPasien = tblKunjungan.getModel().getValueAt(row, 1).toString();
        idDokter = tblKunjungan.getModel().getValueAt(row, 3).toString();
        tglKj.setText(tblKunjungan.getValueAt(row, 5).toString());
        klhn.setText(tblKunjungan.getValueAt(row, 6).toString());
        dgns.setText(tblKunjungan.getValueAt(row, 7).toString());
        tndkn.setText(tblKunjungan.getValueAt(row, 8).toString());
        idObat = tblKunjungan.getModel().getValueAt(row, 9).toString();
        
        getPasienId(idPasien);
        getDokterId(idDokter);
        getObatId(idObat);
    }
     
    private void getPasienId(String id){
        try {
            String sql = "SELECT id_pasien, nm_pasien FROM tbl_pasien";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                String idPsn = rs.getString("id_pasien");
                String nmPsn = rs.getString("nm_pasien");
                
                if (id.equals(idPsn)) {
                    cbPasien.setSelectedItem(nmPsn);
                }
            }
            
            cbPasien.addItemListener(new ItemListener(){
                @Override
                public void itemStateChanged(ItemEvent ie) {
                    if (ie.getStateChange() == ItemEvent.SELECTED) {
                        String selectedPsn = cbPasien.getSelectedItem().toString();
                        updatePasienId(selectedPsn);
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void updatePasienId(String selectedPsn){
        try {
            String sql = "SELECT id_pasien, nm_pasien FROM tbl_pasien WHERE nm_pasien = ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, selectedPsn);
            ResultSet rs = st.executeQuery();
            
            if (rs.next()) {
                String idPsn = rs.getString("id_pasien");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void getDokterId(String id){
        try {
            String sql = "SELECT id_dokter, nm_dokter FROM tbl_dokter";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                String idDkt = rs.getString("id_dokter");
                String nmDkt = rs.getString("nm_dokter");
                
                if (id.equals(idDkt)) {
                    cbDokter.setSelectedItem(nmDkt);
                }
            }
            
            cbDokter.addItemListener(new ItemListener(){
                @Override
                public void itemStateChanged(ItemEvent ie) {
                    if (ie.getStateChange() == ItemEvent.SELECTED) {
                        String selectedDkt = cbDokter.getSelectedItem().toString();
                        updateDokterId(selectedDkt);
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void updateDokterId(String selectedDkt){
        try {
            String sql = "SELECT id_dokter, nm_dokter FROM tbl_dokter WHERE nm_dokter = ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, selectedDkt);
            ResultSet rs = st.executeQuery();
            
            if (rs.next()) {
                String idDkt = rs.getString("id_dokter");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void getObatId(String id){
        try {
            String sql = "SELECT id_obat, nm_obat FROM tbl_obat";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                String idObt = rs.getString("id_obat");
                String nmObt = rs.getString("nm_obat");
                
                if (id.equals(idObt)) {
                    cbObat.setSelectedItem(nmObt);
                }
            }
            
            cbObat.addItemListener(new ItemListener(){
                @Override
                public void itemStateChanged(ItemEvent ie) {
                    if (ie.getStateChange() == ItemEvent.SELECTED) {
                        String selectedObt = cbObat.getSelectedItem().toString();
                        updateObatId(selectedObt);
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void updateObatId(String selectedObt){
        try {
            String sql = "SELECT id_obat, nm_obat FROM tbl_obat WHERE nm_obat = ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, selectedObt);
            ResultSet rs = st.executeQuery();
            
            if (rs.next()) {
                String idPsn = rs.getString("id_obat");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void updateData() {
        String idKunjungan = kjId.getText();
        String tglKunjungan = tglKj.getText();
        String keluhan = dgns.getText();
        String diagnosis = klhn.getText();
        String tindakan = tndkn.getText();
        
        if (idKunjungan.isEmpty() || cbPasien.getSelectedItem().toString().equals("Pilih Pasien") || cbDokter.getSelectedItem().toString().equals("Pilih Dokter")
                || tglKunjungan.isEmpty() || keluhan.isEmpty() || diagnosis.isEmpty() || tindakan.isEmpty() || 
                cbObat.getSelectedItem().toString().equals("Pilih Obat")) {
            JOptionPane.showMessageDialog(this, "Semua Kolom Harus Di Isi !", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
        String sql = "UPDATE tbl_kunjungan SET id_pasien=?, id_dokter=?, tgl_kunjungan=?, keluhan=?, diagnosis=?, tindakan=?, id_obat=? WHERE id_kunjungan=?";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, idPasien);
                st.setString(2, idDokter);
                st.setString(3, tglKunjungan);
                st.setString(4, keluhan);
                st.setString(5, diagnosis);
                st.setString(6, tindakan);
                st.setString(7, idObat);
                st.setString(8, idKunjungan); // Menambahkan id_kunjungan untuk WHERE clause

                int rowUpdate = st.executeUpdate();
                if (rowUpdate > 0) {
                    JOptionPane.showMessageDialog(this, "Data Berhasil diperbarui");
                    resetForm();
                    loadData();
                    showPanel();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void delete() {
        int selectedRow = tblKunjungan.getSelectedRow();
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Yakin Akan Menghapus Data Ini ?","Konfirmasi Hapus Data", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            String id = tblKunjungan.getValueAt(selectedRow, 0).toString();
            try {
                String sql = "DELETE FROM tbl_kunjungan WHERE id_kunjungan = ?";
                try(PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, id);
                
                int rowDeleted = st.executeUpdate();
                    if (rowDeleted > 0) {
                        JOptionPane.showMessageDialog(this, "Data Berhasil Di Hapus !");
                        resetForm();
                        loadData();
                        showPanel();
                    } else {
                        JOptionPane.showMessageDialog(this, "Data Gagal Di Hapus !");
                    }
            }
            } catch (Exception e) {
                Logger.getLogger(MenuKunjungan.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    private void searchData() {
        String katakunci = txtSearch.getText();
        
        DefaultTableModel model = (DefaultTableModel) tblKunjungan.getModel();
        model.setRowCount(0);
        
        try {
            String sql = "SELECT kj.id_kunjungan, psn.id_pasien, psn.nm_pasien, dkt.id_dokter, dkt.nm_dokter, \n" +
                        "kj.tgl_kunjungan, kj.keluhan, kj.diagnosis, kj.tindakan, obt.id_obat, obt.nm_obat, obt.harga\n" +
                        "FROM tbl_kunjungan kj\n" +
                        "INNER JOIN tbl_pasien psn ON psn.id_pasien = kj.id_pasien\n" +
                        "INNER JOIN tbl_dokter dkt ON dkt.id_dokter = kj.id_dokter\n" +
                        "INNER JOIN tbl_obat obt ON obt.id_obat = kj.id_obat\n" + 
                        "WHERE nm_pasien LIKE ? OR nm_dokter LIKE ?";
            try(PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, "%"+ katakunci +"%");
                st.setString(2, "%"+ katakunci +"%");
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String idKunjungan         = rs.getString("id_kunjungan");
                    String idPasien       = rs.getString("id_pasien");
                    String nmPasien       = rs.getString("nm_pasien");
                    String idDokter     = rs.getString("id_dokter");
                    String nmDokter       = rs.getString("nm_dokter");
                    String tglKunjungan          = rs.getString("tgl_kunjungan");
                    String keluhan        = rs.getString("keluhan");
                    String diagnosis        = rs.getString("diagnosis");
                    String tindakan    = rs.getString("tindakan");
                    String idObat       = rs.getString("id_obat");
                    String nmObat       = rs.getString("nm_obat");
                    String harga       = rs.getString("harga");
                    
                    Object[] rowData = {idKunjungan,idPasien,nmPasien,idDokter,nmDokter,tglKunjungan,keluhan,diagnosis,tindakan,idObat,nmObat,harga};
                    model.addRow(rowData);
                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuKunjungan.class.getName()).log(Level.SEVERE, null, e);
        }
    }


}
