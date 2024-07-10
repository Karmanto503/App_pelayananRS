package View;

import Config.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuPasien extends javax.swing.JPanel {

    ResultSet Rs;
    private final Connection conn;
    public MenuPasien() {
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
        pnlPasienMain = new javax.swing.JPanel();
        pnlView = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPasien = new custom.Table_Custom();
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
        pasienId = new custom.textfield.TextField();
        pasienName = new custom.textfield.TextField();
        jLabel9 = new javax.swing.JLabel();
        pasienTelepon = new custom.textfield.TextField();
        pasienBpjs = new custom.textfield.TextField();
        rbLaki = new javax.swing.JRadioButton();
        rbPerempuan = new javax.swing.JRadioButton();
        pasienAlamat = new custom.textfield.TextField();
        pasienTgl = new custom.textfield.TextField();

        dateChooser1.setTextRefernce(pasienTgl);

        setLayout(new java.awt.CardLayout());

        pnlPasienMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlPasienMain.setLayout(new java.awt.CardLayout());

        pnlView.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(56, 182, 255));
        jLabel3.setText("Data Pasien RS Kramat Jati");

        tblPasien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblPasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPasienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPasien);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Icon_pasien-removebg-preview.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(56, 182, 255));
        jLabel2.setText("Master Data > Data Pasien");

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
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlViewLayout = new javax.swing.GroupLayout(pnlView);
        pnlView.setLayout(pnlViewLayout);
        pnlViewLayout.setHorizontalGroup(
            pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlViewLayout.createSequentialGroup()
                .addGroup(pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlViewLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlViewLayout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 765, Short.MAX_VALUE))
                            .addGroup(pnlViewLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlViewLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(61, 61, 61))
        );
        pnlViewLayout.setVerticalGroup(
            pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlViewLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(37, 37, 37)
                .addGroup(pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );

        pnlPasienMain.add(pnlView, "card2");

        pnlAdd.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(56, 182, 255));
        jLabel5.setText("Tambah Data Pasien RS Kramat Jati");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Icon_pasien-removebg-preview.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(56, 182, 255));
        jLabel7.setText("Master Data > Data Pasien");

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

        pasienId.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        pasienId.setLabelText("ID");

        pasienName.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        pasienName.setLabelText("Nama");

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Jenis Kelamin");

        pasienTelepon.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        pasienTelepon.setLabelText("No. Telepon");

        pasienBpjs.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        pasienBpjs.setLabelText("No. BPJS");
        pasienBpjs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasienBpjsActionPerformed(evt);
            }
        });

        rbJenkel.add(rbLaki);
        rbLaki.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        rbLaki.setText("Laki-Laki");

        rbJenkel.add(rbPerempuan);
        rbPerempuan.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        rbPerempuan.setText("Perempuan");

        pasienAlamat.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        pasienAlamat.setLabelText("Alamat");

        pasienTgl.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        pasienTgl.setLabelText("Tgl. Lahir");

        javax.swing.GroupLayout pnlAddLayout = new javax.swing.GroupLayout(pnlAdd);
        pnlAdd.setLayout(pnlAddLayout);
        pnlAddLayout.setHorizontalGroup(
            pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddLayout.createSequentialGroup()
                        .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAddLayout.createSequentialGroup()
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9)
                            .addGroup(pnlAddLayout.createSequentialGroup()
                                .addComponent(rbLaki)
                                .addGap(18, 18, 18)
                                .addComponent(rbPerempuan)))
                        .addContainerGap(981, Short.MAX_VALUE))
                    .addGroup(pnlAddLayout.createSequentialGroup()
                        .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pasienTelepon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 908, Short.MAX_VALUE)
                            .addComponent(pasienTgl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pasienAlamat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pasienName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pasienBpjs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pasienId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlAddLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );
        pnlAddLayout.setVerticalGroup(
            pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel8))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pasienId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pasienBpjs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pasienName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pasienAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pasienTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbLaki)
                    .addComponent(rbPerempuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pasienTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(400, Short.MAX_VALUE))
        );

        pnlPasienMain.add(pnlAdd, "card2");

        add(pnlPasienMain, "card4");
    }// </editor-fold>//GEN-END:initComponents

    private void showPanel(){
        pnlPasienMain.removeAll();
        pnlPasienMain.add(new MenuPasien());
        pnlPasienMain.repaint();
        pnlPasienMain.revalidate();
    }
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        pnlPasienMain.removeAll();
        pnlPasienMain.add(pnlAdd);
        pnlPasienMain.repaint();
        pnlPasienMain.revalidate();
        
        pasienId.setText(setIdPasien());

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

    private void tblPasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPasienMouseClicked
        if (btnAdd.getText().equals("TAMBAH")) {
            btnAdd.setText("UBAH");
            btnHapus.setVisible(true);
            btnBatal1.setVisible(true);
        }
    }//GEN-LAST:event_tblPasienMouseClicked

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

    private void pasienBpjsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasienBpjsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pasienBpjsActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        searchData();
    }//GEN-LAST:event_txtSearchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btnAdd;
    private rojerusan.RSMaterialButtonRectangle btnBatal;
    private rojerusan.RSMaterialButtonRectangle btnBatal1;
    private rojerusan.RSMaterialButtonRectangle btnHapus;
    private rojerusan.RSMaterialButtonRectangle btnSave;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private custom.textfield.TextField pasienAlamat;
    private custom.textfield.TextField pasienBpjs;
    private custom.textfield.TextField pasienId;
    private custom.textfield.TextField pasienName;
    private custom.textfield.TextField pasienTelepon;
    private custom.textfield.TextField pasienTgl;
    private javax.swing.JPanel pnlAdd;
    private javax.swing.JPanel pnlPasienMain;
    private javax.swing.JPanel pnlView;
    private javax.swing.ButtonGroup rbJenkel;
    private javax.swing.JRadioButton rbLaki;
    private javax.swing.JRadioButton rbPerempuan;
    private custom.Table_Custom tblPasien;
    private custom.textfield_suggestion.TextFieldSuggestion txtSearch;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        getData((DefaultTableModel) tblPasien.getModel());
        btnHapus.setVisible(false);
        btnBatal1.setVisible(false);
    }
    
    private void resetForm() {
        pasienId.setText("");
        pasienBpjs.setText("");
        pasienName.setText("");
        pasienAlamat.setText("");
        pasienTgl.setText("");
        rbJenkel.clearSelection();
        pasienTelepon.setText("");
        pasienBpjs.setText("");
    }
    
    private void setTableModel() {
        DefaultTableModel model  = (DefaultTableModel) tblPasien.getModel();
        model.addColumn("ID");
        model.addColumn("No. BPJS");
        model.addColumn("Nama Pasien");
        model.addColumn("Alamat");
        model.addColumn("Tgl. Lahir ");
        model.addColumn("Jenis Kelamin");
        model.addColumn("No Telepon");
    }

    private void getData(DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
            String sql = "SELECT * FROM tbl_pasien";
            try(PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String idPasien         = rs.getString("id_pasien");
                    String noBPJS           = rs.getString("no_bpjs");
                    String namaPasien       = rs.getString("nm_pasien");
                    String alamat           = rs.getString("alamat");
                    String tglLahir         = rs.getString("tgl_lahir");
                    String jenisKelamin     = rs.getString("jenkel");
                    String telepon          = rs.getString("no_telpon");
                    
                    Object[] rowData = {idPasien,noBPJS,namaPasien,alamat,tglLahir,jenisKelamin,telepon};
                    model.addRow(rowData);
                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuPasien.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private String setIdPasien(){
        String urutan = null;
        
        String sql = "SELECT RIGHT (id_pasien, 4) As Nomor " +
                "FROM tbl_pasien " +
                "WHERE id_pasien LIKE 'PSN%' " +
                "ORDER BY id_pasien DESC " +
                "LIMIT 1";
        try(PreparedStatement st = conn.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();
            
            if (rs.next()) {
                int nomor = Integer.parseInt(rs.getString("Nomor")) + 1;
                urutan = "PSN" + String.format("%04d", nomor);
            }else{
                urutan = "PSN0001";
            }
        } catch (Exception e) {
            Logger.getLogger(MenuKunjungan.class.getName()).log(Level.SEVERE, null, e);
        }
        return urutan;
    }

    private void insertData() {
        String idPasien = pasienId.getText();
        String noBPJS = pasienBpjs.getText();
        String namaDPasien = pasienName.getText();
        String alamat = pasienAlamat.getText();
        String tglLahir = pasienTgl.getText();
        String jenisKelamin;
        if (rbLaki.isSelected()) {
            jenisKelamin = rbLaki.getText();
        } else if(rbPerempuan.isSelected()){
            jenisKelamin = rbPerempuan.getText();
        } else {
            jenisKelamin = "";
        }
        String telepon = pasienTelepon.getText();
        
        if (idPasien.isEmpty() || namaDPasien.isEmpty() || alamat.isEmpty() || tglLahir.isEmpty() || jenisKelamin.isEmpty() || telepon.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua Kolom Harus Di Isi !", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            String sql = "INSERT INTO tbl_pasien (id_pasien, no_bpjs, nm_pasien, alamat, tgl_lahir, jenkel, no_telpon) VALUES (?,?,?,?,?,?,?)";
            try(PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, idPasien);
                st.setString(2, noBPJS);
                st.setString(3, namaDPasien);
                st.setString(4, alamat);
                st.setString(5, tglLahir);
                st.setString(6, jenisKelamin);
                st.setString(7, telepon);
                
                int rowInserted = st.executeUpdate();
                if (rowInserted > 0) {
                    JOptionPane.showMessageDialog(this, "Data Berhasil Di Tambahkan");
                    resetForm();
                    loadData();
                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuPasien.class.getName()).log(Level.SEVERE, null, e);
        }
    }

     private void dataTable() {
        pnlView.setVisible(false);
        pnlAdd.setVisible(false);
        
        int row = tblPasien.getSelectedRow();
        jLabel5.setText("Perbarui Data Pasien RS Kramat Jati");
        
        pasienId.setEnabled(false);
        
        pasienId.setText(tblPasien.getValueAt(row, 0).toString());
        pasienBpjs.setText(tblPasien.getValueAt(row, 1).toString());
        pasienName.setText(tblPasien.getValueAt(row, 2).toString());
        pasienAlamat.setText(tblPasien.getValueAt(row, 3).toString());
        pasienTgl.setText(tblPasien.getValueAt(row, 4).toString());
        String jenisKelamin = tblPasien.getValueAt(row, 5).toString();
            if (jenisKelamin.equals("Laki-Laki")) {
                rbLaki.setSelected(true);
            } else if(jenisKelamin.equals("Perempuan")){
                rbPerempuan.setSelected(true);
            }
        pasienTelepon.setText(tblPasien.getValueAt(row, 6).toString());
    }
    
    private void updateData() {
        String idPasien = pasienId.getText();
        String noBPJS = pasienBpjs.getText();
        String namaPasien = pasienName.getText();
        String alamat = pasienAlamat.getText();
        String tglLahir = pasienTgl.getText();
        String jenisKelamin;
        if (rbLaki.isSelected()) {
            jenisKelamin = rbLaki.getText();
        } else if(rbPerempuan.isSelected()){
            jenisKelamin = rbPerempuan.getText();
        } else {
            jenisKelamin = "";
        }
        String telepon = pasienTelepon.getText();
        
        if (idPasien.isEmpty() || namaPasien.isEmpty() || alamat.isEmpty() || tglLahir.isEmpty() || jenisKelamin.isEmpty() || telepon.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua Kolom Harus Diisi!", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try{
            Statement st  = Koneksi.getConnection().createStatement();
            st.executeUpdate("UPDATE tbl_pasien SET no_bpjs='"+noBPJS
                    +"', nm_pasien='"+namaPasien
                    +"', alamat='"+alamat
                    +"', tgl_lahir='"+tglLahir
                    +"', jenkel='"+jenisKelamin
                    +"', no_telpon='"+telepon
                    +"' WHERE id_pasien='"+idPasien+"';");
            JOptionPane.showMessageDialog(this, "Data Berhasil DiPerbarui !");
            resetForm();
            st.close();
        }
        catch(Exception e){
            Logger.getLogger(MenuPasien.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void delete() {
        int selectedRow = tblPasien.getSelectedRow();
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Yakin Akan Menghapus Data Ini ?","Konfirmasi Hapus Data", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            String id = tblPasien.getValueAt(selectedRow, 0).toString();
            try {
                String sql = "DELETE FROM tbl_pasien WHERE id_pasien = ?";
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
                Logger.getLogger(MenuPasien.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    private void searchData() {
        String katakunci = txtSearch.getText();
        
        DefaultTableModel model = (DefaultTableModel) tblPasien.getModel();
        model.setRowCount(0);
        
        try {
            String sql = "SELECT * FROM tbl_pasien WHERE nm_pasien LIKE ? OR no_bpjs LIKE ?";
            try(PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, "%"+ katakunci +"%");
                st.setString(2, "%"+ katakunci +"%");
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String idPasien         = rs.getString("id_pasien");
                    String noBPJS           = rs.getString("no_bpjs");
                    String namaPasien       = rs.getString("nm_pasien");
                    String alamat           = rs.getString("alamat");
                    String tglLahir         = rs.getString("tgl_lahir");
                    String jenisKelamin     = rs.getString("jenkel");
                    String telepon          = rs.getString("no_telpon");
                    
                    Object[] rowData = {idPasien,noBPJS,namaPasien,alamat,tglLahir,jenisKelamin,telepon};
                    model.addRow(rowData);
                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuPasien.class.getName()).log(Level.SEVERE, null, e);
        }
    }


}
