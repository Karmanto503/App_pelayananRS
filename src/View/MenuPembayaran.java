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

public class MenuPembayaran extends javax.swing.JPanel {
//    public long total;
//    public long bayar;
//    public long kembali;
    
    ResultSet Rs;
    private final Connection conn;
    public MenuPembayaran() {
        initComponents();
        
        conn = Koneksi.getConnection();
        setTableModel();
        setTableModelSementara();
        loadData();
        loadDataSementara();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new com.raven.datechooser.DateChooser();
        pnlPwtMain = new javax.swing.JPanel();
        pnlView = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPembayaran = new custom.Table_Custom();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnHapus1 = new rojerusan.RSMaterialButtonRectangle();
        btnAdd = new rojerusan.RSMaterialButtonRectangle();
        txtSearch = new custom.textfield_suggestion.TextFieldSuggestion();
        btnCetak = new rojerusan.RSMaterialButtonRectangle();
        btnBatal1 = new rojerusan.RSMaterialButtonRectangle();
        pnlAdd = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSave = new rojerusan.RSMaterialButtonRectangle();
        btnBatal = new rojerusan.RSMaterialButtonRectangle();
        jLabel12 = new javax.swing.JLabel();
        panelCustom1 = new custom.PanelCustom();
        jLabel13 = new javax.swing.JLabel();
        idBayar = new custom.textfield_suggestion.TextFieldSuggestion();
        jLabel14 = new javax.swing.JLabel();
        txtTglBayar = new custom.textfield_suggestion.TextFieldSuggestion();
        txtIdKunjungan = new custom.textfield_suggestion.TextFieldSuggestion();
        txtTglKunjungan = new custom.textfield_suggestion.TextFieldSuggestion();
        jLabel15 = new javax.swing.JLabel();
        txtKeluhan = new custom.textfield_suggestion.TextFieldSuggestion();
        jLabel16 = new javax.swing.JLabel();
        txtDiagnosis = new custom.textfield_suggestion.TextFieldSuggestion();
        jLabel17 = new javax.swing.JLabel();
        btnKunjungan = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtIdResep = new custom.textfield_suggestion.TextFieldSuggestion();
        btnResep = new javax.swing.JButton();
        txtNmObat = new custom.textfield_suggestion.TextFieldSuggestion();
        jLabel20 = new javax.swing.JLabel();
        txtJumlahObat = new custom.textfield_suggestion.TextFieldSuggestion();
        txtHarga = new custom.textfield_suggestion.TextFieldSuggestion();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtTelepon = new custom.textfield_suggestion.TextFieldSuggestion();
        txtAlamat = new custom.textfield_suggestion.TextFieldSuggestion();
        txtNmPasien = new custom.textfield_suggestion.TextFieldSuggestion();
        txtIdPasien = new custom.textfield_suggestion.TextFieldSuggestion();
        btnPasien = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtBayar = new custom.textfield_suggestion.TextFieldSuggestion();
        txtKembali = new custom.textfield_suggestion.TextFieldSuggestion();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSementara = new custom.Table_Custom();
        btnHapus = new rojerusan.RSMaterialButtonRectangle();
        btnSimpan = new rojerusan.RSMaterialButtonRectangle();
        jLabel28 = new javax.swing.JLabel();
        btnHitung = new rojerusan.RSMaterialButtonRectangle();
        panelCustom2 = new custom.PanelCustom();
        jLabel10 = new javax.swing.JLabel();
        lblHarga = new javax.swing.JLabel();

        dateChooser1.setTextRefernce(txtTglBayar);

        setLayout(new java.awt.CardLayout());

        pnlPwtMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlPwtMain.setLayout(new java.awt.CardLayout());

        pnlView.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(56, 182, 255));
        jLabel3.setText("Data Pembayaran Obat RS Kramat Jati");

        tblPembayaran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblPembayaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPembayaranMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPembayaran);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/9__1_-removebg-preview.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(56, 182, 255));
        jLabel2.setText("Transaksi > Pembayaran");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Monitor-removebg-preview (1).png"))); // NOI18N

        btnHapus1.setBackground(new java.awt.Color(255, 0, 0));
        btnHapus1.setText("HAPUS");
        btnHapus1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnHapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapus1ActionPerformed(evt);
            }
        });

        btnAdd.setText("TAMBAH");
        btnAdd.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
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

        btnBatal1.setBackground(new java.awt.Color(255, 153, 0));
        btnBatal1.setText("BATAL");
        btnBatal1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnBatal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatal1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlViewLayout = new javax.swing.GroupLayout(pnlView);
        pnlView.setLayout(pnlViewLayout);
        pnlViewLayout.setHorizontalGroup(
            pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlViewLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlViewLayout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapus1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlViewLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
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
                .addGap(45, 45, 45)
                .addGroup(pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
        );

        pnlPwtMain.add(pnlView, "card2");

        pnlAdd.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(56, 182, 255));
        jLabel5.setText("Tambah Data Kunjungan RS Kramat Jati");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/9__1_-removebg-preview.png"))); // NOI18N

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

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("ID_Kunjungan");

        panelCustom1.setBackground(new java.awt.Color(204, 255, 255));
        panelCustom1.setRoundBottomLeft(20);
        panelCustom1.setRoundBottomRight(20);
        panelCustom1.setRoundTopLeft(20);
        panelCustom1.setRoundTopRight(20);

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("ID_Pembayaran");

        idBayar.setForeground(new java.awt.Color(102, 102, 102));
        idBayar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Tgl. Pembayaran");

        txtTglBayar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        javax.swing.GroupLayout panelCustom1Layout = new javax.swing.GroupLayout(panelCustom1);
        panelCustom1.setLayout(panelCustom1Layout);
        panelCustom1Layout.setHorizontalGroup(
            panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTglBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
        panelCustom1Layout.setVerticalGroup(
            panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(txtTglBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(idBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        txtIdKunjungan.setForeground(new java.awt.Color(102, 102, 102));

        txtTglKunjungan.setForeground(new java.awt.Color(102, 102, 102));

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("Tgl. Kunjungan");

        txtKeluhan.setForeground(new java.awt.Color(102, 102, 102));

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("Keluhan");

        txtDiagnosis.setForeground(new java.awt.Color(102, 102, 102));

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 153, 153));
        jLabel17.setText("Diagnosis");

        btnKunjungan.setText("...");
        btnKunjungan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKunjunganActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setText("ID_Resep");

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 153, 153));
        jLabel19.setText("Nama Obat");

        txtIdResep.setForeground(new java.awt.Color(102, 102, 102));

        btnResep.setText("...");
        btnResep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResepActionPerformed(evt);
            }
        });

        txtNmObat.setForeground(new java.awt.Color(102, 102, 102));

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 153, 153));
        jLabel20.setText("Jumlah");

        txtJumlahObat.setForeground(new java.awt.Color(102, 102, 102));

        txtHarga.setForeground(new java.awt.Color(102, 102, 102));

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 153, 153));
        jLabel21.setText("Harga");

        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 153, 153));
        jLabel22.setText("ID_Pasien");

        jLabel23.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 153, 153));
        jLabel23.setText("Nama");

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 153, 153));
        jLabel24.setText("Alamat");

        jLabel25.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 153, 153));
        jLabel25.setText("No. Telepon");

        txtTelepon.setForeground(new java.awt.Color(102, 102, 102));

        txtAlamat.setForeground(new java.awt.Color(102, 102, 102));

        txtNmPasien.setForeground(new java.awt.Color(102, 102, 102));

        txtIdPasien.setForeground(new java.awt.Color(102, 102, 102));

        btnPasien.setBackground(new java.awt.Color(204, 204, 204));
        btnPasien.setText("...");
        btnPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasienActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("PEMBAYARAN");

        jLabel26.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setText("Bayar");

        txtBayar.setForeground(new java.awt.Color(102, 102, 102));

        txtKembali.setEditable(false);
        txtKembali.setForeground(new java.awt.Color(102, 102, 102));

        jLabel27.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
        jLabel27.setText("Kembali");

        tblSementara.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblSementara.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSementaraMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSementara);

        btnHapus.setBackground(new java.awt.Color(255, 0, 0));
        btnHapus.setText("HAPUS");
        btnHapus.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnSimpan.setText("TAMBAH");
        btnSimpan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 102, 102));
        jLabel28.setText("Total Bayar");

        btnHitung.setBackground(new java.awt.Color(204, 204, 204));
        btnHitung.setForeground(new java.awt.Color(0, 0, 0));
        btnHitung.setText("HITUNG");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Rp.");

        lblHarga.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblHarga.setForeground(new java.awt.Color(102, 102, 102));
        lblHarga.setText("...");

        javax.swing.GroupLayout panelCustom2Layout = new javax.swing.GroupLayout(panelCustom2);
        panelCustom2.setLayout(panelCustom2Layout);
        panelCustom2Layout.setHorizontalGroup(
            panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHarga)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        panelCustom2Layout.setVerticalGroup(
            panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout pnlAddLayout = new javax.swing.GroupLayout(pnlAdd);
        pnlAdd.setLayout(pnlAddLayout);
        pnlAddLayout.setHorizontalGroup(
            pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddLayout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAddLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddLayout.createSequentialGroup()
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlAddLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlAddLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlAddLayout.createSequentialGroup()
                                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlAddLayout.createSequentialGroup()
                                        .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel25)
                                            .addComponent(jLabel24)
                                            .addComponent(jLabel23)
                                            .addComponent(jLabel22))
                                        .addGap(18, 18, 18)
                                        .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtNmPasien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddLayout.createSequentialGroup()
                                                .addComponent(txtIdPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel12))
                                        .addGap(18, 18, 18)
                                        .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtKeluhan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtTglKunjungan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlAddLayout.createSequentialGroup()
                                                .addComponent(txtIdKunjungan, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnKunjungan, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtDiagnosis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(pnlAddLayout.createSequentialGroup()
                                        .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addGroup(pnlAddLayout.createSequentialGroup()
                                                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(21, 21, 21)
                                        .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel28)
                                            .addComponent(panelCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(133, 133, 133)
                                        .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel26)
                                            .addComponent(jLabel27))
                                        .addGap(14, 14, 14)
                                        .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtKembali, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                            .addComponent(txtBayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlAddLayout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel20)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel18))
                                        .addGap(18, 18, 18)
                                        .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlAddLayout.createSequentialGroup()
                                                .addComponent(txtIdResep, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnResep, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtNmObat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtJumlahObat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtHarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(pnlAddLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(pnlAddLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panelCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(91, 91, 91))
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
                .addGap(18, 18, 18)
                .addComponent(panelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddLayout.createSequentialGroup()
                        .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAddLayout.createSequentialGroup()
                                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIdResep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnResep, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNmObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtJumlahObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlAddLayout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlAddLayout.createSequentialGroup()
                        .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAddLayout.createSequentialGroup()
                                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtIdKunjungan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnKunjungan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTglKunjungan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtKeluhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDiagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlAddLayout.createSequentialGroup()
                                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtIdPasien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNmPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(26, 26, 26)
                        .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAddLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlAddLayout.createSequentialGroup()
                                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtBayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(120, 120, 120))
                            .addGroup(pnlAddLayout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );

        pnlPwtMain.add(pnlAdd, "card2");

        add(pnlPwtMain, "card4");
    }// </editor-fold>//GEN-END:initComponents

    private void showPanel(){
        pnlPwtMain.removeAll();
        pnlPwtMain.add(new MenuPembayaran());
        pnlPwtMain.repaint();
        pnlPwtMain.revalidate();
    }
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        pnlPwtMain.removeAll();
        pnlPwtMain.add(pnlAdd);
        pnlPwtMain.repaint();
        pnlPwtMain.revalidate();
        
        idBayar.setText(setIdPembayaran());
        btnHapus.setVisible(false);
        

//        if (btnAdd.getText().equals("UBAH")) {
//            dataTable();
//            btnSave.setText("PERBARUI");
//        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (btnSave.getText().equals("TAMBAH")) {
            setIdPembayaran();
            btnSave.setText("SIMPAN");
        } else if(btnSave.getText().equals("SIMPAN")){
            insertData();
            insertDataDetail();
            deleteSementara();
            resetForm();
            loadData();
            showPanel();
        }
        resetForm();
        showPanel();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        deleteSementara();
        showPanel();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        searchData();
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnKunjunganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKunjunganActionPerformed
        setKunjungan();
    }//GEN-LAST:event_btnKunjunganActionPerformed

    private void tblSementaraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSementaraMouseClicked
        if (btnAdd.getText().equals("TAMBAH")) {
            btnHapus.setVisible(true);
        }
    }//GEN-LAST:event_tblSementaraMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        delete();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        
        insertDataSementara();
        loadDataSementara();
        if (JOptionPane.showConfirmDialog(this, "Mau tambah Obat?", "Konfirmasi", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
                    resetFormObat();
                    btnResep.requestFocus();
                } else {
                    resetFormObat();
                    btnResep.requestFocus();
                }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasienActionPerformed
        setPasien();
    }//GEN-LAST:event_btnPasienActionPerformed

    private void btnResepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResepActionPerformed
        setResep();
    }//GEN-LAST:event_btnResepActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed

        try {
            String idPembayaran = idBayar.getText();
            String totalHarga = lblHarga.getText();
            String bayar = txtBayar.getText();

            if (idPembayaran.isEmpty() || bayar.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Semua Kolom Harus Di Isi !", "Validasi", JOptionPane.ERROR_MESSAGE);
                return;
            }else{
                String a = txtBayar.getText();
                int aa = Integer.parseInt(a);



                    if(txtBayar.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "ISI JUMLAH BELI !");
                    }else{
                        int totalByr, harga, total;

                        totalByr = Integer.parseInt(txtBayar.getText().toString());
                        harga = Integer.parseInt(lblHarga.getText().toString());
                        total = totalByr - harga;

                        txtKembali.setText(Integer.toString(total));

                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuResep.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnHapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapus1ActionPerformed
        delete1();
    }//GEN-LAST:event_btnHapus1ActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        int row = tblPembayaran.getSelectedRow();
        
        String id = tblPembayaran.getValueAt(row, 0).toString();
        try {
            String reportPath = "src/Report/Report_Pembayaran.jasper";
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

    private void tblPembayaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPembayaranMouseClicked
        btnHapus1.setVisible(true);
        btnCetak.setVisible(true);
        btnBatal1.setVisible(true);
    }//GEN-LAST:event_tblPembayaranMouseClicked

    private void btnBatal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatal1ActionPerformed
        showPanel();
        loadData();
    }//GEN-LAST:event_btnBatal1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btnAdd;
    private rojerusan.RSMaterialButtonRectangle btnBatal;
    private rojerusan.RSMaterialButtonRectangle btnBatal1;
    private rojerusan.RSMaterialButtonRectangle btnCetak;
    private rojerusan.RSMaterialButtonRectangle btnHapus;
    private rojerusan.RSMaterialButtonRectangle btnHapus1;
    private rojerusan.RSMaterialButtonRectangle btnHitung;
    private javax.swing.JButton btnKunjungan;
    private javax.swing.JButton btnPasien;
    private javax.swing.JButton btnResep;
    private rojerusan.RSMaterialButtonRectangle btnSave;
    private rojerusan.RSMaterialButtonRectangle btnSimpan;
    private com.raven.datechooser.DateChooser dateChooser1;
    private custom.textfield_suggestion.TextFieldSuggestion idBayar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHarga;
    private custom.PanelCustom panelCustom1;
    private custom.PanelCustom panelCustom2;
    private javax.swing.JPanel pnlAdd;
    private javax.swing.JPanel pnlPwtMain;
    private javax.swing.JPanel pnlView;
    private custom.Table_Custom tblPembayaran;
    private custom.Table_Custom tblSementara;
    private custom.textfield_suggestion.TextFieldSuggestion txtAlamat;
    private custom.textfield_suggestion.TextFieldSuggestion txtBayar;
    private custom.textfield_suggestion.TextFieldSuggestion txtDiagnosis;
    private custom.textfield_suggestion.TextFieldSuggestion txtHarga;
    private custom.textfield_suggestion.TextFieldSuggestion txtIdKunjungan;
    private custom.textfield_suggestion.TextFieldSuggestion txtIdPasien;
    private custom.textfield_suggestion.TextFieldSuggestion txtIdResep;
    private custom.textfield_suggestion.TextFieldSuggestion txtJumlahObat;
    private custom.textfield_suggestion.TextFieldSuggestion txtKeluhan;
    private custom.textfield_suggestion.TextFieldSuggestion txtKembali;
    private custom.textfield_suggestion.TextFieldSuggestion txtNmObat;
    private custom.textfield_suggestion.TextFieldSuggestion txtNmPasien;
    private custom.textfield_suggestion.TextFieldSuggestion txtSearch;
    private custom.textfield_suggestion.TextFieldSuggestion txtTelepon;
    private custom.textfield_suggestion.TextFieldSuggestion txtTglBayar;
    private custom.textfield_suggestion.TextFieldSuggestion txtTglKunjungan;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        
        getData((DefaultTableModel) tblPembayaran.getModel());
        btnHapus1.setVisible(false);
        btnCetak.setVisible(false);
        btnBatal1.setVisible(false);
    }
    
    private void loadDataSementara(){
        getDataSementara((DefaultTableModel) tblSementara.getModel());
    }
    
    private void resetForm() {
        idBayar.setText("");
        txtTglBayar.setText("");
        txtBayar.setText("");
        txtKembali.setText("");
    }
    
    private void resetFormObat() {
        txtIdResep.setText("");
        txtNmObat.setText("");
        txtHarga.setText("");
        txtJumlahObat.setText("");
        
    }
    
    private void setTableModel() {
        DefaultTableModel model  = (DefaultTableModel) tblPembayaran.getModel();
        model.addColumn("ID Pembayaran");
        model.addColumn("Tgl Pembayaran");
        model.addColumn("Nama Pasien");
        model.addColumn("Tgl Kunjungan");
        model.addColumn("Total Bayar");
        model.addColumn("Kembalian");
    }

    private void getData(DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
            String sql = "SELECT pb.id_pembayaran, pb.tgl_pembayaran, psn.nm_pasien, kj.tgl_kunjungan,\n" +
                        "pb.jumlah_bayar, pb.kembalian\n" +
                        "FROM tbl_pembayaran pb\n" +
                        "INNER JOIN tbl_pasien psn ON psn.id_pasien = pb.id_pasien\n" +
                        "INNER JOIN tbl_kunjungan kj ON kj.id_kunjungan = pb.id_kunjungan";
            try(PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String idBayar         = rs.getString("id_pembayaran");
                    String tglBayar       = rs.getString("tgl_pembayaran");
                    String namaPasien       = rs.getString("nm_pasien");
                    String tglKunjungan       = rs.getString("tgl_kunjungan");
                    String totalBayar        = rs.getString("jumlah_bayar");
                    String kemabali        = rs.getString("kembalian");
                    
                    
                    Object[] rowData = {idBayar,tglBayar,namaPasien,tglKunjungan,totalBayar,kemabali};
                    model.addRow(rowData);
                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuPembayaran.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void setTableModelSementara() {
        DefaultTableModel model  = (DefaultTableModel) tblSementara.getModel();
        model.addColumn("ID Obat");
        model.addColumn("Nama Obat");
        model.addColumn("Jumlah Obat");
        model.addColumn("Total Harga");
    }

    private void getDataSementara(DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
            String sql = "SELECT * FROM tbl_sementara";
            try(PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String idResep       = rs.getString("id_resep");
                    String nmObat        = rs.getString("nama_Obat");
                    String jumlah        = rs.getString("jumlah");
                    String totalHrg        = rs.getString("total_harga");
                    
                    
                    Object[] rowData = {idResep,nmObat,jumlah,totalHrg};
                    model.addRow(rowData);
                }
                
                btnHapus.setVisible(false);
            }
        } catch (Exception e) {
            Logger.getLogger(MenuPembayaran.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private String setIdPembayaran(){
        String urutan = null;
        
        String sql = "SELECT RIGHT (id_pembayaran, 4) As Nomor " +
                "FROM tbl_pembayaran " +
                "WHERE id_pembayaran LIKE 'PB%' " +
                "ORDER BY id_pembayaran DESC " +
                "LIMIT 1";
        try(PreparedStatement st = conn.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();
            
            if (rs.next()) {
                int nomor = Integer.parseInt(rs.getString("Nomor")) + 1;
                urutan = "PB" + String.format("%04d", nomor);
            }else{
                urutan = "PB0001";
            }
        } catch (Exception e) {
            Logger.getLogger(MenuPembayaran.class.getName()).log(Level.SEVERE, null, e);
        }
        return urutan;
    }
    
    private void setPasien(){
        boolean closable = true;
        DataPasien pasien = new DataPasien(null, closable);
        pasien.setVisible(true);
        
        txtIdPasien.setText(pasien.getIdPasien());
        txtNmPasien.setText(pasien.getNamaPasien());
        txtAlamat.setText(pasien.getAlamatPasien());
        txtTelepon.setText(pasien.getTeleponPasien());
        
        txtIdPasien.setEnabled(false);
        txtNmPasien.setEnabled(false);
        txtAlamat.setEnabled(false);
        txtTelepon.setEnabled(false);
    }
    
    private void setKunjungan(){
        boolean closable = true;
        DataKunjungan kunjungan = new DataKunjungan(null, closable);
        kunjungan.setVisible(true);
        
        txtIdKunjungan.setText(kunjungan.getIdKunjungan());
        txtTglKunjungan.setText(kunjungan.getTglKunjungan());
        txtKeluhan.setText(kunjungan.getKeluhan());
        txtDiagnosis.setText(kunjungan.getDiagnosis());
        
        txtIdKunjungan.setEnabled(false);
        txtTglKunjungan.setEnabled(false);
        txtKeluhan.setEnabled(false);
        txtDiagnosis.setEnabled(false);
    }
    
    private void setResep(){
        boolean closable = true;
        DataResep Resep = new DataResep(null, closable);
        Resep.setVisible(true);
        
        txtIdResep.setText(Resep.getIdResep());
        txtNmObat.setText(Resep.getNamaObat());
        txtJumlahObat.setText(Resep.getJumlah());
        txtHarga.setText(Resep.getHarga());
        
        txtIdResep.setEnabled(false);
        txtNmObat.setEnabled(false);
        txtJumlahObat.setEnabled(false);
        txtHarga.setEnabled(false);
    }
    
    private void insertDataSementara() {
        String idResep = txtIdResep.getText();
        String nmObat = txtNmObat.getText();
        String Jumlah = txtJumlahObat.getText();
        String Harga = txtHarga.getText();
        
        if (idResep.isEmpty() || nmObat.isEmpty() || Jumlah.isEmpty() || Harga.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua Kolom Harus Di Isi !", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            String sql = "INSERT INTO tbl_sementara (id_resep, nama_obat, jumlah, total_harga) VALUES (?,?,?,?)";
            try(PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, idResep);
                st.setString(2, nmObat);
                st.setString(3, Jumlah);
                st.setString(4, Harga);
                
                st.executeUpdate();
                
                int totalBayar = getTotalBayar();
                lblHarga.setText(String.valueOf(totalBayar));
            }
        } catch (Exception e) {
            Logger.getLogger(MenuPembayaran.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private int getTotalBayar() {
        int totalBayar = 0;
        
        try {
            String sql = "SELECT SUM(total_harga) as total FROM tbl_sementara";
            try(PreparedStatement st = conn.prepareStatement(sql)){
                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    totalBayar = rs.getInt("total");
                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuPembayaran.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return totalBayar;
    }

    private void insertData() {
        String idPembayaran = idBayar.getText();
        String tglBayar = txtTglBayar.getText();
        String idPasien = txtIdPasien.getText();
        String idKunjungan = txtIdKunjungan.getText();
        String totalBayar = lblHarga.getText();
        String bayar = txtBayar.getText();
        String kembali = txtKembali.getText();
        
        if (idPembayaran.isEmpty() || tglBayar.isEmpty() || idPasien.isEmpty() || idKunjungan.isEmpty() || totalBayar.isEmpty() || bayar.isEmpty() || kembali.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua Kolom Harus Di Isi !", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            String sql = "INSERT INTO tbl_pembayaran (id_pembayaran, tgl_pembayaran, id_pasien, id_kunjungan, total_bayar, jumlah_bayar, kembalian) VALUES (?,?,?,?,?,?,?)";
            try(PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, idPembayaran);
                st.setString(2, tglBayar);
                st.setString(3, idPasien);
                st.setString(4, idKunjungan);
                st.setString(5, totalBayar);
                st.setString(6, bayar);
                st.setString(7, kembali);
                
                int rowInserted = st.executeUpdate();
                if (rowInserted > 0) {
                    JOptionPane.showMessageDialog(this, "Data Berhasil Di Tambahkan");
                    resetForm();
                    loadData();
                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuPembayaran.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void insertDataDetail() {
        String idPembayaran = txtIdResep.getText();
        try {
            String sql = "INSERT INTO tbl_pembayarandetail (id_pembayaran, id_resep, nama_obat, jumlah, total_harga) SELECT '"+idPembayaran+"', id_resep, nama_obat, jumlah, total_harga FROM tbl_sementara";
            try(PreparedStatement st = conn.prepareStatement(sql)){
                st.executeUpdate();
            }
        } catch (Exception e) {
            Logger.getLogger(MenuPembayaran.class.getName()).log(Level.SEVERE, null, e);
        }
        
        
    }

    private void delete() {
        int selectedRow = tblSementara.getSelectedRow();
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Yakin Akan Menghapus Data Ini ?","Konfirmasi Hapus Data", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            String id = tblSementara.getValueAt(selectedRow, 0).toString();
            try {
                String sql = "DELETE FROM tbl_sementara WHERE id_resep = ?";
                try(PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, id);
                
                int rowDeleted = st.executeUpdate();
                    if (rowDeleted > 0) {
                        JOptionPane.showMessageDialog(this, "Data Berhasil Di Hapus !");
                        resetFormObat();
                        loadDataSementara();
                    } else {
                        JOptionPane.showMessageDialog(this, "Data Gagal Di Hapus !");
                    }
            }
            } catch (Exception e) {
                Logger.getLogger(MenuPembayaran.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
    
    private void delete1() {
        int selectedRow = tblPembayaran.getSelectedRow();
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Yakin Akan Menghapus Data Ini ?","Konfirmasi Hapus Data", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            String id = tblPembayaran.getValueAt(selectedRow, 0).toString();
            try {
                String sql = "DELETE FROM tbl_pembayaran WHERE id_pembayaran = ?";
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
     
     private void deleteSementara(){
        try {
            String sql = "DELETE FROM tbl_sementara ";
            try(PreparedStatement st = conn.prepareStatement(sql)) {
                st.executeUpdate();
            }
            } catch (Exception e) {
                Logger.getLogger(MenuPembayaran.class.getName()).log(Level.SEVERE, null, e);
            }
     }

    private void searchData() {
        String katakunci = txtSearch.getText();
        
        DefaultTableModel model = (DefaultTableModel) tblPembayaran.getModel();
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
            Logger.getLogger(MenuPembayaran.class.getName()).log(Level.SEVERE, null, e);
        }
    }


}
