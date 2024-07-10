package View;

import Config.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuPerawat extends javax.swing.JPanel {

    ResultSet Rs;
    private final Connection conn;
    public MenuPerawat() {
        initComponents();
        
        conn = Koneksi.getConnection();
        setTableModel();
        loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbJenkel = new javax.swing.ButtonGroup();
        dateChooser1 = new com.raven.datechooser.DateChooser();
        pnlPwtMain = new javax.swing.JPanel();
        pnlView = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPerawat = new custom.Table_Custom();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAdd = new rojerusan.RSMaterialButtonRectangle();
        btnHapus = new rojerusan.RSMaterialButtonRectangle();
        btnBatal1 = new rojerusan.RSMaterialButtonRectangle();
        txtSearch = new custom.textfield_suggestion.TextFieldSuggestion();
        pnlAdd = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSave = new rojerusan.RSMaterialButtonRectangle();
        btnBatal = new rojerusan.RSMaterialButtonRectangle();
        pwtId = new custom.textfield.TextField();
        pwtNama = new custom.textfield.TextField();
        jLabel9 = new javax.swing.JLabel();
        pwtTelepon = new custom.textfield.TextField();
        pwtTgl = new custom.textfield.TextField();
        pwtJam = new custom.textfield.TextField();
        rbLaki = new javax.swing.JRadioButton();
        rbPerempuan = new javax.swing.JRadioButton();
        cbJadwal = new custom.combo_suggestion.ComboBoxSuggestion();
        jLabel10 = new javax.swing.JLabel();
        pwtAlamat = new custom.textfield.TextField();

        dateChooser1.setTextRefernce(pwtTgl);

        setLayout(new java.awt.CardLayout());

        pnlPwtMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlPwtMain.setLayout(new java.awt.CardLayout());

        pnlView.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(56, 182, 255));
        jLabel3.setText("Data Perawat RS Kramat Jati");

        tblPerawat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblPerawat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPerawatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPerawat);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/4__1_-removebg-preview.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(56, 182, 255));
        jLabel2.setText("Master Data > Data Perawat");

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

        javax.swing.GroupLayout pnlViewLayout = new javax.swing.GroupLayout(pnlView);
        pnlView.setLayout(pnlViewLayout);
        pnlViewLayout.setHorizontalGroup(
            pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlViewLayout.createSequentialGroup()
                .addGroup(pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlViewLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlViewLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(pnlViewLayout.createSequentialGroup()
                                .addGap(853, 853, 853)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlViewLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlViewLayout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(60, Short.MAX_VALUE))
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
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );

        pnlPwtMain.add(pnlView, "card2");

        pnlAdd.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(56, 182, 255));
        jLabel5.setText("Tambah Data Perawat RS Kramat Jati");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/4__1_-removebg-preview.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(56, 182, 255));
        jLabel7.setText("Master Data > Data Perawat");

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

        pwtId.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        pwtId.setLabelText("ID");

        pwtNama.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        pwtNama.setLabelText("Nama");

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Jenis Kelamin");

        pwtTelepon.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        pwtTelepon.setLabelText("No. Telepon");

        pwtTgl.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        pwtTgl.setLabelText("Tgl. Lahir");

        pwtJam.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        pwtJam.setLabelText("Jam");

        rbJenkel.add(rbLaki);
        rbLaki.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        rbLaki.setText("Laki-Laki");

        rbJenkel.add(rbPerempuan);
        rbPerempuan.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        rbPerempuan.setText("Perempuan");

        cbJadwal.setForeground(new java.awt.Color(153, 153, 153));
        cbJadwal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Hari", "Senin", "Selasa", "Rabu", "Kamis", "Jumat" }));
        cbJadwal.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Jadwal Praktik");

        pwtAlamat.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        pwtAlamat.setLabelText("Alamat");

        javax.swing.GroupLayout pnlAddLayout = new javax.swing.GroupLayout(pnlAdd);
        pnlAdd.setLayout(pnlAddLayout);
        pnlAddLayout.setHorizontalGroup(
            pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10)
                    .addGroup(pnlAddLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(9, 9, 9))
                    .addGroup(pnlAddLayout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9)
                    .addGroup(pnlAddLayout.createSequentialGroup()
                        .addComponent(rbLaki)
                        .addGap(18, 18, 18)
                        .addComponent(rbPerempuan))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddLayout.createSequentialGroup()
                        .addComponent(cbJadwal, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pwtJam, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pwtAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pwtTgl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pwtTelepon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pwtNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pwtId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        pnlAddLayout.setVerticalGroup(
            pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddLayout.createSequentialGroup()
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)))
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbLaki)
                    .addComponent(rbPerempuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwtTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwtTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwtJam, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(360, Short.MAX_VALUE))
        );

        pnlPwtMain.add(pnlAdd, "card2");

        add(pnlPwtMain, "card4");
    }// </editor-fold>//GEN-END:initComponents

    private void showPanel(){
        pnlPwtMain.removeAll();
        pnlPwtMain.add(new MenuPerawat());
        pnlPwtMain.repaint();
        pnlPwtMain.revalidate();
    }
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        pnlPwtMain.removeAll();
        pnlPwtMain.add(pnlAdd);
        pnlPwtMain.repaint();
        pnlPwtMain.revalidate();
        
        pwtId.setText(setIdPerawat());

        if (btnAdd.getText().equals("UBAH")) {
            dataTable();
            btnSave.setText("PERBARUI");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (btnSave.getText().equals("TAMBAH")) {
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

    private void tblPerawatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPerawatMouseClicked
        if (btnAdd.getText().equals("TAMBAH")) {
            btnAdd.setText("UBAH");
            btnHapus.setVisible(true);
            btnBatal1.setVisible(true);
        }
    }//GEN-LAST:event_tblPerawatMouseClicked

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btnAdd;
    private rojerusan.RSMaterialButtonRectangle btnBatal;
    private rojerusan.RSMaterialButtonRectangle btnBatal1;
    private rojerusan.RSMaterialButtonRectangle btnHapus;
    private rojerusan.RSMaterialButtonRectangle btnSave;
    private custom.combo_suggestion.ComboBoxSuggestion cbJadwal;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlAdd;
    private javax.swing.JPanel pnlPwtMain;
    private javax.swing.JPanel pnlView;
    private custom.textfield.TextField pwtAlamat;
    private custom.textfield.TextField pwtId;
    private custom.textfield.TextField pwtJam;
    private custom.textfield.TextField pwtNama;
    private custom.textfield.TextField pwtTelepon;
    private custom.textfield.TextField pwtTgl;
    private javax.swing.ButtonGroup rbJenkel;
    private javax.swing.JRadioButton rbLaki;
    private javax.swing.JRadioButton rbPerempuan;
    private custom.Table_Custom tblPerawat;
    private custom.textfield_suggestion.TextFieldSuggestion txtSearch;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        getData((DefaultTableModel) tblPerawat.getModel());
        btnHapus.setVisible(false);
        btnBatal1.setVisible(false);
    }
    
    private void resetForm() {
        pwtId.setText("");
        pwtNama.setText("");
        rbJenkel.clearSelection();
        pwtTelepon.setText("");
        pwtTgl.setText("");
        cbJadwal.setSelectedItem("");
        pwtJam.setText("");
    }
    
    private void setTableModel() {
        DefaultTableModel model  = (DefaultTableModel) tblPerawat.getModel();
        model.addColumn("ID");
        model.addColumn("Nama Perawat");
        model.addColumn("Jenis Kelamin");
        model.addColumn("No Telepon");
        model.addColumn("Tgl. Lahir");
        model.addColumn("Alamat");
        model.addColumn("Jadwal Praktik");
        model.addColumn("Jam Praktik");
    }

    private void getData(DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
            String sql = "SELECT * FROM tbl_perawat";
            try(PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String idPerawat         = rs.getString("id_perawat");
                    String namaPerawat       = rs.getString("nm_perawat");
                    String jenisKelamin     = rs.getString("jenkel");
                    String telepon          = rs.getString("no_telepon");
                    String tglLahir        = rs.getString("tgl_lahir");
                    String alamat        = rs.getString("alamat");
                    String jadwalPraktik    = rs.getString("jadwal");
                    String jamPraktik       = rs.getString("jam");
                    
                    Object[] rowData = {idPerawat,namaPerawat,jenisKelamin,telepon,tglLahir,alamat,jadwalPraktik,jamPraktik};
                    model.addRow(rowData);
                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuPerawat.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private String setIdPerawat(){
        String urutan = null;
        
        String sql = "SELECT RIGHT (id_perawat, 4) As Nomor " +
                "FROM tbl_perawat " +
                "WHERE id_perawat LIKE 'PWT%' " +
                "ORDER BY id_perawat DESC " +
                "LIMIT 1";
        try(PreparedStatement st = conn.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();
            
            if (rs.next()) {
                int nomor = Integer.parseInt(rs.getString("Nomor")) + 1;
                urutan = "PWT" + String.format("%04d", nomor);
            }else{
                urutan = "PWT0001";
            }
        } catch (Exception e) {
            Logger.getLogger(MenuKunjungan.class.getName()).log(Level.SEVERE, null, e);
        }
        return urutan;
    }

    private void insertData() {
        String idPerawat = pwtId.getText();
        String namaPerawat = pwtNama.getText();
        String jenisKelamin;
        if (rbLaki.isSelected()) {
            jenisKelamin = rbLaki.getText();
        } else if(rbPerempuan.isSelected()){
            jenisKelamin = rbPerempuan.getText();
        } else {
            jenisKelamin = "";
        }
        String telepon = pwtTelepon.getText();
        String tglLahir = pwtTgl.getText();
        String alamat = pwtAlamat.getText();
        String jadwal = (String) cbJadwal.getSelectedItem();
        String jam = pwtJam.getText();
        
        if (idPerawat.isEmpty() || namaPerawat.isEmpty() || jenisKelamin.isEmpty() || telepon.isEmpty() || tglLahir.isEmpty() || alamat.isEmpty() || jadwal.isEmpty() || jam.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua Kolom Harus Di Isi !", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            String sql = "INSERT INTO tbl_perawat (id_perawat, nm_perawat, jenkel, no_telepon, tgl_lahir, alamat, jadwal, jam) VALUES (?,?,?,?,?,?,?,?)";
            try(PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, idPerawat);
                st.setString(2, namaPerawat);
                st.setString(3, jenisKelamin);
                st.setString(4, telepon);
                st.setString(5, tglLahir);
                st.setString(6, alamat);
                st.setString(7, jadwal);
                st.setString(8, jam);
                
                int rowInserted = st.executeUpdate();
                if (rowInserted > 0) {
                    JOptionPane.showMessageDialog(this, "Data Berhasil Di Tambahkan");
                    resetForm();
                    loadData();
                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuPerawat.class.getName()).log(Level.SEVERE, null, e);
        }
    }

     private void dataTable() {
        pnlView.setVisible(false);
        pnlAdd.setVisible(false);
        
        int row = tblPerawat.getSelectedRow();
        jLabel5.setText("Perbarui Data Perawat RS Kramat Jati");
        
        pwtId.setEnabled(false);
        pwtTgl.setEnabled(false);
        
        pwtId.setText(tblPerawat.getValueAt(row, 0).toString());
        pwtNama.setText(tblPerawat.getValueAt(row, 1).toString());
        String jenisKelamin = tblPerawat.getValueAt(row, 2).toString();
            if (jenisKelamin.equals("Laki-Laki")) {
                rbLaki.setSelected(true);
            } else if(jenisKelamin.equals("Perempuan")){
                rbPerempuan.setSelected(true);
            }
        pwtTelepon.setText(tblPerawat.getValueAt(row, 3).toString());
        pwtTgl.setText(tblPerawat.getValueAt(row, 4).toString());
        pwtAlamat.setText(tblPerawat.getValueAt(row, 5).toString());
        String jadwal = String.valueOf(cbJadwal.getSelectedItem());
        pwtJam.setText(tblPerawat.getValueAt(row, 7).toString());
    }
    
    private void updateData() {
        String idPerawat = pwtId.getText();
        String namaPerawat = pwtNama.getText();
        String jenisKelamin;
        if (rbLaki.isSelected()) {
            jenisKelamin = rbLaki.getText();
        } else if(rbPerempuan.isSelected()){
            jenisKelamin = rbPerempuan.getText();
        } else {
            jenisKelamin = "";
        }
        String telepon = pwtTelepon.getText();
        String tglLahir = pwtTgl.getText();
        String alamat = pwtAlamat.getText();
        String jadwal = (String) cbJadwal.getSelectedItem();
        String jam = pwtJam.getText();
        
        if (idPerawat.isEmpty() || namaPerawat.isEmpty() || jenisKelamin.isEmpty() || telepon.isEmpty() || tglLahir.isEmpty() || alamat.isEmpty() || jadwal.isEmpty() || jam.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua Kolom Harus Diisi!", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try{
            Statement st  = Koneksi.getConnection().createStatement();
            st.executeUpdate("UPDATE tbl_perawat SET nm_perawat='"+namaPerawat
                    +"', jenkel='"+jenisKelamin
                    +"', no_telepon='"+telepon
                    +"', tgl_lahir='"+tglLahir
                    +"', alamat='"+alamat
                    +"', jadwal='"+jadwal
                    +"', jam='"+jam
                    +"' WHERE id_perawat='"+idPerawat+"';");
            JOptionPane.showMessageDialog(this, "Data Berhasil DiPerbarui !");
            resetForm();
            st.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Data Gagal DiPerbarui !");
        }
    }

    private void delete() {
        int selectedRow = tblPerawat.getSelectedRow();
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Yakin Akan Menghapus Data Ini ?","Konfirmasi Hapus Data", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            String id = tblPerawat.getValueAt(selectedRow, 0).toString();
            try {
                String sql = "DELETE FROM tbl_perawat WHERE id_perawat = ?";
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
                Logger.getLogger(MenuPerawat.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    private void searchData() {
        String katakunci = txtSearch.getText();
        
        DefaultTableModel model = (DefaultTableModel) tblPerawat.getModel();
        model.setRowCount(0);
        
        try {
            String sql = "SELECT * FROM tbl_perawat WHERE nm_perawat LIKE ? OR jadwal LIKE ?";
            try(PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, "%"+ katakunci +"%");
                st.setString(2, "%"+ katakunci +"%");
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String idPerawat         = rs.getString("id_perawat");
                    String namaPerawat       = rs.getString("nm_perawat");
                    String jenisKelamin     = rs.getString("jenkel");
                    String telepon          = rs.getString("no_telepon");
                    String tglLahir        = rs.getString("tgl_lahir");
                    String alamat        = rs.getString("alamat");
                    String jadwalPraktik    = rs.getString("jadwal");
                    String jamPraktik       = rs.getString("jam");
                    
                    Object[] rowData = {idPerawat,namaPerawat,jenisKelamin,telepon,tglLahir,alamat,jadwalPraktik,jamPraktik};
                    model.addRow(rowData);
                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuPerawat.class.getName()).log(Level.SEVERE, null, e);
        }
    }


}
