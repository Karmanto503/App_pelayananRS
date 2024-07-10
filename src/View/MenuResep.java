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

public class MenuResep extends javax.swing.JPanel {
    private String idKunjungan;
    private String idObat;
    
    ResultSet Rs;
    private final Connection conn;
    public MenuResep() {
        initComponents();
        
        conn = Koneksi.getConnection();
        setTableModel();
        loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPwtMain = new javax.swing.JPanel();
        pnlView = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResep = new custom.Table_Custom();
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
        rspId = new custom.textfield.TextField();
        jumlahTxt = new custom.textfield.TextField();
        totalTxt = new custom.textfield.TextField();
        jLabel10 = new javax.swing.JLabel();
        cbKunjungan = new custom.combobox.Combobox();
        cbObat = new custom.combobox.Combobox();
        jLabel12 = new javax.swing.JLabel();
        btnHitung = new rojerusan.RSMaterialButtonRectangle();
        hargaObt = new custom.textfield.TextField();

        setLayout(new java.awt.CardLayout());

        pnlPwtMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlPwtMain.setLayout(new java.awt.CardLayout());

        pnlView.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(56, 182, 255));
        jLabel3.setText("Data Resep Obat RS Kramat Jati");

        tblResep.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblResep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblResepMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblResep);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/5-removebg-preview.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(56, 182, 255));
        jLabel2.setText("Transaksi > Resep Obat");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Monitor-removebg-preview (1).png"))); // NOI18N

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlViewLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnlViewLayout.createSequentialGroup()
                        .addGroup(pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlViewLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(pnlViewLayout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                        .addGroup(pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlViewLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(67, 67, 67))
        );
        pnlViewLayout.setVerticalGroup(
            pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlViewLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlViewLayout.createSequentialGroup()
                        .addGroup(pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(63, 63, 63)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlViewLayout.createSequentialGroup()
                        .addGroup(pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );

        pnlPwtMain.add(pnlView, "card2");

        pnlAdd.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(56, 182, 255));
        jLabel5.setText("Tambah Data Resep Obat RS Kramat Jati");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/5-removebg-preview.png"))); // NOI18N

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

        rspId.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        rspId.setLabelText("ID Resep");

        jumlahTxt.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jumlahTxt.setLabelText("Jumlah");

        totalTxt.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        totalTxt.setLabelText("Total Harga");

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Nama Obat");

        cbKunjungan.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        cbKunjungan.setLabeText("");

        cbObat.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        cbObat.setLabeText("");

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Tgl. Kunjungan");

        btnHitung.setBackground(new java.awt.Color(204, 204, 204));
        btnHitung.setForeground(new java.awt.Color(0, 0, 0));
        btnHitung.setText("HITUNG");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        hargaObt.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        hargaObt.setLabelText("Harga Obat");

        javax.swing.GroupLayout pnlAddLayout = new javax.swing.GroupLayout(pnlAdd);
        pnlAdd.setLayout(pnlAddLayout);
        pnlAddLayout.setHorizontalGroup(
            pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddLayout.createSequentialGroup()
                        .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addGroup(pnlAddLayout.createSequentialGroup()
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(pnlAddLayout.createSequentialGroup()
                                    .addComponent(totalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(cbObat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbKunjungan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rspId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                                .addComponent(jumlahTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hargaObt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 449, Short.MAX_VALUE))
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
                .addGap(62, 62, 62)
                .addComponent(rspId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbKunjungan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hargaObt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jumlahTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(396, Short.MAX_VALUE))
        );

        pnlPwtMain.add(pnlAdd, "card2");

        add(pnlPwtMain, "card4");
    }// </editor-fold>//GEN-END:initComponents

    private void showPanel(){
        pnlPwtMain.removeAll();
        pnlPwtMain.add(new MenuResep());
        pnlPwtMain.repaint();
        pnlPwtMain.revalidate();
    }
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        pnlPwtMain.removeAll();
        pnlPwtMain.add(pnlAdd);
        pnlPwtMain.repaint();
        pnlPwtMain.revalidate();
        
        rspId.setText(setIdResep());

        if (btnAdd.getText().equals("UBAH")) {
            dataTable();
            btnSave.setText("PERBARUI");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (btnSave.getText().equals("TAMBAH")) {
            setIdResep();
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

    private void tblResepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResepMouseClicked
        if (btnAdd.getText().equals("TAMBAH")) {
            btnAdd.setText("UBAH");
            btnHapus.setVisible(true);
            btnBatal1.setVisible(true);
            btnCetak.setVisible(true);
        }
    }//GEN-LAST:event_tblResepMouseClicked

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

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        
        try {
            String idResep = rspId.getText();
            String jumlah = jumlahTxt.getText();
            String totalHrg = totalTxt.getText();

            if (idResep.isEmpty() || cbKunjungan.getSelectedItem().toString().equals("Pilih Tgl Kunjungan") || cbObat.getSelectedItem().toString().equals("Pilih Obat")
                    || jumlah.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Semua Kolom Harus Di Isi !", "Validasi", JOptionPane.ERROR_MESSAGE);
                return;
            }else{
                String a = jumlahTxt.getText();
                int aa = Integer.parseInt(a);



                    if(jumlahTxt.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "ISI JUMLAH BELI !");
                    }else{
                        int jmlh, harga, total;

                        jmlh = Integer.parseInt(jumlahTxt.getText().toString());
                        harga = Integer.parseInt(hargaObt.getText().toString());
                        total = jmlh * harga;

                        totalTxt.setText(Integer.toString(total));

                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuResep.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        int row = tblResep.getSelectedRow();
        
        String id = tblResep.getValueAt(row, 0).toString();
        
        try {
            String reportPath = "src/Report/Report_ResepObat.jasper";
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
    private rojerusan.RSMaterialButtonRectangle btnHitung;
    private rojerusan.RSMaterialButtonRectangle btnSave;
    private custom.combobox.Combobox cbKunjungan;
    private custom.combobox.Combobox cbObat;
    private custom.textfield.TextField hargaObt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private custom.textfield.TextField jumlahTxt;
    private javax.swing.JPanel pnlAdd;
    private javax.swing.JPanel pnlPwtMain;
    private javax.swing.JPanel pnlView;
    private custom.textfield.TextField rspId;
    private custom.Table_Custom tblResep;
    private custom.textfield.TextField totalTxt;
    private custom.textfield_suggestion.TextFieldSuggestion txtSearch;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        getKunjungan();
        getObat();
        
        getData((DefaultTableModel) tblResep.getModel());
        btnHapus.setVisible(false);
        btnBatal1.setVisible(false);
        btnCetak.setVisible(false);
    }
    
    private void resetForm() {
        rspId.setText("");
        hargaObt.setText("");
        jumlahTxt.setText("");
        totalTxt.setText("");
    }
    
    private void setTableModel() {
        DefaultTableModel model  = (DefaultTableModel) tblResep.getModel();
        model.addColumn("ID Resep");
        model.addColumn("ID Kunjungan");
        model.addColumn("Tgl. Kunjungan");
        model.addColumn("ID Obat");
        model.addColumn("Nama Obat");
        model.addColumn("Harga Obat");
        model.addColumn("Jumlah Obat");
        model.addColumn("Total Harga");
    }

    private void getData(DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
            String sql = "SELECT rsp.id_resep, kj.id_kunjungan, kj.tgl_kunjungan, obt.id_obat, obt.nm_obat, obt.harga, rsp.jumlah, rsp.total_harga\n" +
                            "FROM tbl_resep rsp\n" +
                            "INNER JOIN tbl_kunjungan kj ON kj.id_kunjungan = rsp.id_kunjungan\n" +
                            "INNER JOIN tbl_obat obt ON obt.id_obat = rsp.id_obat";
            try(PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String idResep         = rs.getString("id_resep");
                    String idKunjungan       = rs.getString("id_kunjungan");
                    String tglKunjungan       = rs.getString("tgl_kunjungan");
                    String idObat       = rs.getString("id_obat");
                    String nmObat       = rs.getString("nm_obat");
                    String hrg       = rs.getString("harga");
                    String jmlh        = rs.getString("jumlah");
                    String totalHrg        = rs.getString("total_harga");
                    
                    Object[] rowData = {idResep,idKunjungan,tglKunjungan,idObat,nmObat,hrg,jmlh,totalHrg};
                    model.addRow(rowData);
                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuResep.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private String setIdResep(){
        String urutan = null;
        
        String sql = "SELECT RIGHT (id_resep, 4) As Nomor " +
                "FROM tbl_resep " +
                "WHERE id_resep LIKE 'RSP%' " +
                "ORDER BY id_resep DESC " +
                "LIMIT 1";
        try(PreparedStatement st = conn.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();
            
            if (rs.next()) {
                int nomor = Integer.parseInt(rs.getString("Nomor")) + 1;
                urutan = "RSP" + String.format("%04d", nomor);
            }else{
                urutan = "RSP0001";
            }
        } catch (Exception e) {
            Logger.getLogger(MenuResep.class.getName()).log(Level.SEVERE, null, e);
        }
        return urutan;
    }
    
    private void getKunjungan(){
        try {
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            model.addElement("Pilih Tgl Kunjungan");
            String sql = "SELECT id_kunjungan, tgl_kunjungan FROM tbl_kunjungan";
            PreparedStatement st = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                String tglKj = rs.getString("tgl_kunjungan");
                model.addElement(tglKj);
            }
            cbKunjungan.setModel(model);
            cbKunjungan.addActionListener(e -> {
               int selectIndex = cbKunjungan.getSelectedIndex();
               
               if(selectIndex > 0){
                   try {
                       rs.absolute(selectIndex);
                       idKunjungan = rs.getString("id_kunjungan");
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
            String sql = "SELECT id_Obat, nm_obat, harga FROM tbl_obat";
            PreparedStatement st = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                String namaObat = rs.getString("nm_obat");
                model.addElement(namaObat);
            }

            cbObat.setModel(model);
//            JTextField hargaObatField = new JTextField(); // JTextField untuk menampilkan harga obat
            // Menambahkan JTextField hargaObatField ke frame atau panel Anda

            cbObat.addActionListener(e -> {
                int selectIndex = cbObat.getSelectedIndex();

                if (selectIndex > 0) {
                    try {
                        rs.absolute(selectIndex);
                        String hargaObat = rs.getString("harga");
                        hargaObt.setText(hargaObat);
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
        String idResep = rspId.getText();
        String jumlah = jumlahTxt.getText();
        String totalHrg = totalTxt.getText();
        
        if (idResep.isEmpty() || cbKunjungan.getSelectedItem().toString().equals("Pilih Tgl Kunjungan") || cbObat.getSelectedItem().toString().equals("Pilih Obat")
                || jumlah.isEmpty() || totalHrg.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua Kolom Harus Di Isi !", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            String sql = "INSERT INTO tbl_resep (id_resep, id_kunjungan, id_obat, jumlah, total_harga) VALUES (?,?,?,?,?)";
            try(PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, idResep);
                st.setString(2, idKunjungan);
                st.setString(3, idObat);
                st.setString(4, jumlah);
                st.setString(5, totalHrg);
                
                int rowInserted = st.executeUpdate();
                if (rowInserted > 0) {
                    JOptionPane.showMessageDialog(this, "Data Berhasil Di Tambahkan");
                    resetForm();
                    loadData();
                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuResep.class.getName()).log(Level.SEVERE, null, e);
        }
    }

     private void dataTable() {
        pnlView.setVisible(false);
        pnlAdd.setVisible(false);
        
        int row = tblResep.getSelectedRow();
        jLabel5.setText("Perbarui Data Resep Obat RS Kramat Jati");
        
        rspId.setEnabled(false);
        String id = tblResep.getModel().getValueAt(row, 0).toString();
        
        rspId.setText(tblResep.getValueAt(row, 0).toString());
        idKunjungan = tblResep.getModel().getValueAt(row, 1).toString();
        idObat = tblResep.getModel().getValueAt(row, 3).toString();
        jumlahTxt.setText(tblResep.getValueAt(row, 6).toString());
        totalTxt.setText(tblResep.getValueAt(row, 7).toString());
        
        getKunjunganId(idKunjungan);
        getObatId(idObat);
    }
     
    private void getKunjunganId(String id){
        try {
            String sql = "SELECT id_kunjungan, tgl_kunjungan FROM tbl_kunjungan";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                String idKj = rs.getString("id_kunjungan");
                String tglKj = rs.getString("tgl_kunjungan");
                
                if (id.equals(idKj)) {
                    cbKunjungan.setSelectedItem(tglKj);
                }
            }
            
            cbKunjungan.addItemListener(new ItemListener(){
                @Override
                public void itemStateChanged(ItemEvent ie) {
                    if (ie.getStateChange() == ItemEvent.SELECTED) {
                        String selectedKj = cbKunjungan.getSelectedItem().toString();
                        updatePasienId(selectedKj);
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void updatePasienId(String selectedKj){
        try {
            String sql = "SELECT id_kunjungan, tgl_kunjungan FROM tbl_kunjungan WHERE tgl_kunjungan = ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, selectedKj);
            ResultSet rs = st.executeQuery();
            
            if (rs.next()) {
                String idKj = rs.getString("id_kunjungan");
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
        String idResep = rspId.getText();
        String jumlah = jumlahTxt.getText();
        String totalHrg = totalTxt.getText();
        
        if (idResep.isEmpty() || cbKunjungan.getSelectedItem().toString().equals("Pilih Tgl Kunjungan") || cbObat.getSelectedItem().toString().equals("Pilih Obat")
                || jumlah.isEmpty() || totalHrg.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua Kolom Harus Di Isi !", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
        String sql = "UPDATE tbl_resep SET id_kunjungan=?, id_obat=?, jumlah=?, total_harga=? WHERE id_resep=?";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, idKunjungan);
                st.setString(2, idObat);
                st.setString(3, jumlah);
                st.setString(4, totalHrg);
                st.setString(5, idResep);

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
        int selectedRow = tblResep.getSelectedRow();
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Yakin Akan Menghapus Data Ini ?","Konfirmasi Hapus Data", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            String id = tblResep.getValueAt(selectedRow, 0).toString();
            try {
                String sql = "DELETE FROM tbl_resep WHERE id_resep = ?";
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
                Logger.getLogger(MenuResep.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    private void searchData() {
        String katakunci = txtSearch.getText();
        
        DefaultTableModel model = (DefaultTableModel) tblResep.getModel();
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
            Logger.getLogger(MenuResep.class.getName()).log(Level.SEVERE, null, e);
        }
    }


}
