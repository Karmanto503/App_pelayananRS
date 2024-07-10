package View;

import Config.Koneksi;
import static Config.Koneksi.getConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class MenuLaporan extends javax.swing.JPanel {

    ResultSet Rs;
    private final Connection conn;
    public MenuLaporan() {
        initComponents();
        
        conn = Koneksi.getConnection();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPwtMain = new javax.swing.JPanel();
        pnlView = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LaporanDokter = new rojerusan.RSMaterialButtonRectangle();
        LaporanPasien = new rojerusan.RSMaterialButtonRectangle();
        LaporanPerawat = new rojerusan.RSMaterialButtonRectangle();
        LaporanObat = new rojerusan.RSMaterialButtonRectangle();

        setLayout(new java.awt.CardLayout());

        pnlPwtMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlPwtMain.setLayout(new java.awt.CardLayout());

        pnlView.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(56, 182, 255));
        jLabel3.setText("Data Laporan RS Kramat Jati");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DATA PASIEN FIX-Photoroom.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(56, 182, 255));
        jLabel2.setText("Laporan > Laporan Data");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Monitor-removebg-preview (1).png"))); // NOI18N

        LaporanDokter.setText("Laporan Data Dokter");
        LaporanDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanDokterActionPerformed(evt);
            }
        });

        LaporanPasien.setText("Laporan Data Pasien");
        LaporanPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanPasienActionPerformed(evt);
            }
        });

        LaporanPerawat.setText("Laporan Data Perawat");
        LaporanPerawat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanPerawatActionPerformed(evt);
            }
        });

        LaporanObat.setText("Laporan Data Obat");
        LaporanObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanObatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlViewLayout = new javax.swing.GroupLayout(pnlView);
        pnlView.setLayout(pnlViewLayout);
        pnlViewLayout.setHorizontalGroup(
            pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlViewLayout.createSequentialGroup()
                .addGroup(pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlViewLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(508, 508, 508)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(pnlViewLayout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addGroup(pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LaporanDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LaporanPasien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105)
                        .addGroup(pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LaporanObat, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LaporanPerawat, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addGap(200, 200, 200)
                .addGroup(pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LaporanDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LaporanPerawat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LaporanPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LaporanObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(473, 473, 473))
        );

        pnlPwtMain.add(pnlView, "card2");

        add(pnlPwtMain, "card4");
    }// </editor-fold>//GEN-END:initComponents

    private void LaporanDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanDokterActionPerformed
        try {
            String reportPath = "src/Report/Report_DataDokter.jasper";
            Connection conn = getConnection();
            HashMap<String, Object> parameters = new HashMap<>();
            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error displaying Report : " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_LaporanDokterActionPerformed

    private void LaporanPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanPasienActionPerformed
        try {
            String reportPath = "src/Report/Report_DataPasien.jasper";
            Connection conn = getConnection();
            HashMap<String, Object> parameters = new HashMap<>();
            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error displaying Report : " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_LaporanPasienActionPerformed

    private void LaporanPerawatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanPerawatActionPerformed
        try {
            String reportPath = "src/Report/Report_DataPerawat.jasper";
            Connection conn = getConnection();
            HashMap<String, Object> parameters = new HashMap<>();
            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error displaying Report : " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_LaporanPerawatActionPerformed

    private void LaporanObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanObatActionPerformed
        try {
            String reportPath = "src/Report/Report_DataObat.jasper";
            Connection conn = getConnection();
            HashMap<String, Object> parameters = new HashMap<>();
            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error displaying Report : " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_LaporanObatActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle LaporanDokter;
    private rojerusan.RSMaterialButtonRectangle LaporanObat;
    private rojerusan.RSMaterialButtonRectangle LaporanPasien;
    private rojerusan.RSMaterialButtonRectangle LaporanPerawat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel pnlPwtMain;
    private javax.swing.JPanel pnlView;
    // End of variables declaration//GEN-END:variables

    
}