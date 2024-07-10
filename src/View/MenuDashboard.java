package View;

import Config.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class MenuDashboard extends javax.swing.JPanel {

    private final Connection conn;
    public MenuDashboard() {
        initComponents();
        
        conn = Koneksi.getConnection();
        setTableModelDokter();
        setTableModelPerawat();
        loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDashboardDokter = new custom.Table_Custom();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnsenin = new rojerusan.RSMaterialButtonRectangle();
        btnselasa = new rojerusan.RSMaterialButtonRectangle();
        btnrabu = new rojerusan.RSMaterialButtonRectangle();
        btnkamis = new rojerusan.RSMaterialButtonRectangle();
        btnjumat = new rojerusan.RSMaterialButtonRectangle();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDashboardPerawat = new custom.Table_Custom();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(56, 182, 255));
        jLabel3.setText("Dashboard");

        tblDashboardDokter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblDashboardDokter);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1-removebg-preview.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(56, 182, 255));
        jLabel2.setText("Dashboard");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Monitor-removebg-preview (1).png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(56, 182, 255));
        jLabel5.setText("Jadwal Praktik Dokter & Perawat");

        btnsenin.setBackground(new java.awt.Color(51, 102, 255));
        btnsenin.setText("SENIN");
        btnsenin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnseninActionPerformed(evt);
            }
        });

        btnselasa.setBackground(new java.awt.Color(51, 102, 255));
        btnselasa.setText("SELASA");
        btnselasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselasaActionPerformed(evt);
            }
        });

        btnrabu.setBackground(new java.awt.Color(51, 102, 255));
        btnrabu.setText("RABU");
        btnrabu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrabuActionPerformed(evt);
            }
        });

        btnkamis.setBackground(new java.awt.Color(51, 102, 255));
        btnkamis.setText("KAMIS");
        btnkamis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkamisActionPerformed(evt);
            }
        });

        btnjumat.setBackground(new java.awt.Color(51, 102, 255));
        btnjumat.setText("JUMAT");
        btnjumat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjumatActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel6.setText("Jadwal Dokter");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel7.setText("Jadwal Perawat");

        tblDashboardPerawat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblDashboardPerawat);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)))
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnsenin, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnselasa, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnrabu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnkamis, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnjumat, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1175, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsenin, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnselasa, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnrabu, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnkamis, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnjumat, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnseninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnseninActionPerformed
        loadDataSenin();
    }//GEN-LAST:event_btnseninActionPerformed

    private void btnselasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselasaActionPerformed
        loadDataSelasa();
    }//GEN-LAST:event_btnselasaActionPerformed

    private void btnrabuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrabuActionPerformed
        loadDataRabu();
    }//GEN-LAST:event_btnrabuActionPerformed

    private void btnkamisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkamisActionPerformed
        loadDataKamis();
    }//GEN-LAST:event_btnkamisActionPerformed

    private void btnjumatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjumatActionPerformed
        loadDataJumat();
    }//GEN-LAST:event_btnjumatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btnjumat;
    private rojerusan.RSMaterialButtonRectangle btnkamis;
    private rojerusan.RSMaterialButtonRectangle btnrabu;
    private rojerusan.RSMaterialButtonRectangle btnselasa;
    private rojerusan.RSMaterialButtonRectangle btnsenin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private custom.Table_Custom tblDashboardDokter;
    private custom.Table_Custom tblDashboardPerawat;
    // End of variables declaration//GEN-END:variables

    private void setTableModelDokter() {
        DefaultTableModel model  = (DefaultTableModel) tblDashboardDokter.getModel();
        model.addColumn("Nama Dokter");
        model.addColumn("Spesialis");
        model.addColumn("Jadwal Praktik");
        model.addColumn("Jam Praktik");
    }
    
    private void setTableModelPerawat() {
        DefaultTableModel model  = (DefaultTableModel) tblDashboardPerawat.getModel();
        model.addColumn("Nama Perawat");
        model.addColumn("Jadwal Praktik");
        model.addColumn("Jam Praktik");
    }

    private void loadData() {
        getDataDokter((DefaultTableModel) tblDashboardDokter.getModel());
        getDataPerawat((DefaultTableModel) tblDashboardPerawat.getModel());
    }

    private void getDataDokter(DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
            String sql = "SELECT nm_dokter, spesialis, jadwal_praktik, jam_praktik FROM tbl_dokter;";
            try(PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String namaDokter       = rs.getString("nm_dokter");
                    String spesialis        = rs.getString("spesialis");
                    String jadwalPraktik    = rs.getString("jadwal_praktik");
                    String jamPraktik       = rs.getString("jam_praktik");
                    
                    Object[] rowData = {namaDokter,spesialis,jadwalPraktik,jamPraktik};
                    model.addRow(rowData);
                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuDashboard.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void getDataPerawat(DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
            String sql = "SELECT nm_perawat, jadwal, jam FROM tbl_perawat;";
            try(PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String namaPerawat       = rs.getString("nm_perawat");
                    String jadwalPraktik    = rs.getString("jadwal");
                    String jamPraktik       = rs.getString("jam");
                    
                    Object[] rowData = {namaPerawat,jadwalPraktik,jamPraktik};
                    model.addRow(rowData);
                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuDashboard.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void loadDataSenin() {
        getDataDokterSenin((DefaultTableModel) tblDashboardDokter.getModel());
        getDataPerawatSenin((DefaultTableModel) tblDashboardPerawat.getModel());
    }

    private void getDataDokterSenin(DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
            String sql = "SELECT nm_dokter, spesialis, jadwal_praktik, jam_praktik\n" +
                            "FROM tbl_dokter\n" +
                            "WHERE jadwal_praktik = 'Senin';";
            try(PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String namaDokter       = rs.getString("nm_dokter");
                    String spesialis        = rs.getString("spesialis");
                    String jadwalPraktik    = rs.getString("jadwal_praktik");
                    String jamPraktik       = rs.getString("jam_praktik");
                    
                    Object[] rowData = {namaDokter,spesialis,jadwalPraktik,jamPraktik};
                    model.addRow(rowData);
                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuDashboard.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void getDataPerawatSenin(DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
            String sql = "SELECT nm_perawat, jadwal, jam\n" +
                            "FROM tbl_perawat\n" +
                            "WHERE jadwal = 'Senin';";
            try(PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String namaPerawat       = rs.getString("nm_perawat");
                    String jadwalPraktik    = rs.getString("jadwal");
                    String jamPraktik       = rs.getString("jam");
                    
                    Object[] rowData = {namaPerawat,jadwalPraktik,jamPraktik};
                    model.addRow(rowData);
                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuDashboard.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void loadDataSelasa() {
        getDataDokterSelasa((DefaultTableModel) tblDashboardDokter.getModel());
        getDataPerawatSelasa((DefaultTableModel) tblDashboardPerawat.getModel());
    }

    private void getDataDokterSelasa(DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
            String sql = "SELECT nm_dokter, spesialis, jadwal_praktik, jam_praktik\n" +
                            "FROM tbl_dokter\n" +
                            "WHERE jadwal_praktik = 'Selasa';";
            try(PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String namaDokter       = rs.getString("nm_dokter");
                    String spesialis        = rs.getString("spesialis");
                    String jadwalPraktik    = rs.getString("jadwal_praktik");
                    String jamPraktik       = rs.getString("jam_praktik");
                    
                    Object[] rowData = {namaDokter,spesialis,jadwalPraktik,jamPraktik};
                    model.addRow(rowData);
                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuDashboard.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void getDataPerawatSelasa(DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
            String sql = "SELECT nm_perawat, jadwal, jam\n" +
                            "FROM tbl_perawat\n" +
                            "WHERE jadwal = 'Selasa';";
            try(PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String namaPerawat       = rs.getString("nm_perawat");
                    String jadwalPraktik    = rs.getString("jadwal");
                    String jamPraktik       = rs.getString("jam");
                    
                    Object[] rowData = {namaPerawat,jadwalPraktik,jamPraktik};
                    model.addRow(rowData);
                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuDashboard.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void loadDataRabu() {
        getDataDokterRabu((DefaultTableModel) tblDashboardDokter.getModel());
        getDataPerawatRabu((DefaultTableModel) tblDashboardPerawat.getModel());
    }

    private void getDataDokterRabu(DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
            String sql = "SELECT nm_dokter, spesialis, jadwal_praktik, jam_praktik\n" +
                            "FROM tbl_dokter\n" +
                            "WHERE jadwal_praktik = 'Rabu';";
            try(PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String namaDokter       = rs.getString("nm_dokter");
                    String spesialis        = rs.getString("spesialis");
                    String jadwalPraktik    = rs.getString("jadwal_praktik");
                    String jamPraktik       = rs.getString("jam_praktik");
                    
                    Object[] rowData = {namaDokter,spesialis,jadwalPraktik,jamPraktik};
                    model.addRow(rowData);
                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuDashboard.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void getDataPerawatRabu(DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
            String sql = "SELECT nm_perawat, jadwal, jam\n" +
                            "FROM tbl_perawat\n" +
                            "WHERE jadwal = 'Rabu';";
            try(PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String namaPerawat       = rs.getString("nm_perawat");
                    String jadwalPraktik    = rs.getString("jadwal");
                    String jamPraktik       = rs.getString("jam");
                    
                    Object[] rowData = {namaPerawat,jadwalPraktik,jamPraktik};
                    model.addRow(rowData);
                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuDashboard.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void loadDataKamis() {
        getDataDokterKamis((DefaultTableModel) tblDashboardDokter.getModel());
        getDataPerawatKamis((DefaultTableModel) tblDashboardPerawat.getModel());
    }

    private void getDataDokterKamis(DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
            String sql = "SELECT nm_dokter, spesialis, jadwal_praktik, jam_praktik\n" +
                            "FROM tbl_dokter\n" +
                            "WHERE jadwal_praktik = 'Kamis';";
            try(PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String namaDokter       = rs.getString("nm_dokter");
                    String spesialis        = rs.getString("spesialis");
                    String jadwalPraktik    = rs.getString("jadwal_praktik");
                    String jamPraktik       = rs.getString("jam_praktik");
                    
                    Object[] rowData = {namaDokter,spesialis,jadwalPraktik,jamPraktik};
                    model.addRow(rowData);
                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuDashboard.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void getDataPerawatKamis(DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
            String sql = "SELECT nm_perawat, jadwal, jam\n" +
                            "FROM tbl_perawat\n" +
                            "WHERE jadwal = 'Kamis';";
            try(PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String namaPerawat       = rs.getString("nm_perawat");
                    String jadwalPraktik    = rs.getString("jadwal");
                    String jamPraktik       = rs.getString("jam");
                    
                    Object[] rowData = {namaPerawat,jadwalPraktik,jamPraktik};
                    model.addRow(rowData);
                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuDashboard.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void loadDataJumat() {
        getDataDokterJumat((DefaultTableModel) tblDashboardDokter.getModel());
        getDataPerawatJumat((DefaultTableModel) tblDashboardPerawat.getModel());
    }

    private void getDataDokterJumat(DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
            String sql = "SELECT nm_dokter, spesialis, jadwal_praktik, jam_praktik\n" +
                            "FROM tbl_dokter\n" +
                            "WHERE jadwal_praktik = 'Jumat';";
            try(PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String namaDokter       = rs.getString("nm_dokter");
                    String spesialis        = rs.getString("spesialis");
                    String jadwalPraktik    = rs.getString("jadwal_praktik");
                    String jamPraktik       = rs.getString("jam_praktik");
                    
                    Object[] rowData = {namaDokter,spesialis,jadwalPraktik,jamPraktik};
                    model.addRow(rowData);
                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuDashboard.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void getDataPerawatJumat(DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
            String sql = "SELECT nm_perawat, jadwal, jam\n" +
                            "FROM tbl_perawat\n" +
                            "WHERE jadwal = 'Jumat';";
            try(PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String namaPerawat       = rs.getString("nm_perawat");
                    String jadwalPraktik    = rs.getString("jadwal");
                    String jamPraktik       = rs.getString("jam");
                    
                    Object[] rowData = {namaPerawat,jadwalPraktik,jamPraktik};
                    model.addRow(rowData);
                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuDashboard.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
