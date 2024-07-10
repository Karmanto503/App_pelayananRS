package Main;

import View.MenuDashboard;
import View.MenuDokter;
import View.MenuKunjungan;
import View.MenuLaporan;
import View.MenuObat;
import View.MenuPasien;
import View.MenuPembayaran;
import View.MenuPerawat;
import View.MenuResep;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainMenu extends javax.swing.JFrame {

    int xx, xy;
    public MainMenu() {
        initComponents();
        actionButton();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnl_kiri = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnl_dashboard = new javax.swing.JPanel();
        pnl_on = new javax.swing.JPanel();
        btn_dashboard = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnl_dokter = new javax.swing.JPanel();
        pnl_on1 = new javax.swing.JPanel();
        btn_dokter = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnl_perawat = new javax.swing.JPanel();
        pnl_on2 = new javax.swing.JPanel();
        btn_perawat = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnl_pasien = new javax.swing.JPanel();
        pnl_on3 = new javax.swing.JPanel();
        btn_pasien = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pnl_obat = new javax.swing.JPanel();
        pnl_on4 = new javax.swing.JPanel();
        btn_obat = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pnl_kunjungan = new javax.swing.JPanel();
        pnl_on5 = new javax.swing.JPanel();
        btn_kunjungan = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pnl_resep = new javax.swing.JPanel();
        pnl_on6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btn_Resep = new javax.swing.JLabel();
        pnl_pembayaran = new javax.swing.JPanel();
        pnl_on7 = new javax.swing.JPanel();
        btn_pembayaran = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pnl_Laporan = new javax.swing.JPanel();
        pnl_on8 = new javax.swing.JPanel();
        btn_Laporan = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        pnl_kanan = new javax.swing.JPanel();
        pnl_dasar = new javax.swing.JPanel();
        pnl_utama = new javax.swing.JPanel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1500, 1000));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1360, 768));

        pnl_kiri.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(56, 182, 255));
        jLabel1.setText("M-Health");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/pixel_60-60_logo-removebg-preview.png"))); // NOI18N

        pnl_dashboard.setBackground(new java.awt.Color(255, 255, 255));

        pnl_on.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnl_onLayout = new javax.swing.GroupLayout(pnl_on);
        pnl_on.setLayout(pnl_onLayout);
        pnl_onLayout.setHorizontalGroup(
            pnl_onLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        pnl_onLayout.setVerticalGroup(
            pnl_onLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        btn_dashboard.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        btn_dashboard.setForeground(new java.awt.Color(56, 182, 255));
        btn_dashboard.setText("Dashboard");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout pnl_dashboardLayout = new javax.swing.GroupLayout(pnl_dashboard);
        pnl_dashboard.setLayout(pnl_dashboardLayout);
        pnl_dashboardLayout.setHorizontalGroup(
            pnl_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_dashboardLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_dashboard)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(pnl_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_dashboardLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnl_on, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(184, Short.MAX_VALUE)))
        );
        pnl_dashboardLayout.setVerticalGroup(
            pnl_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_dashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pnl_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_dashboardLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnl_on, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("MASTER DATA");

        pnl_dokter.setBackground(new java.awt.Color(255, 255, 255));

        pnl_on1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnl_on1Layout = new javax.swing.GroupLayout(pnl_on1);
        pnl_on1.setLayout(pnl_on1Layout);
        pnl_on1Layout.setHorizontalGroup(
            pnl_on1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        pnl_on1Layout.setVerticalGroup(
            pnl_on1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        btn_dokter.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        btn_dokter.setForeground(new java.awt.Color(56, 182, 255));
        btn_dokter.setText("Data Dokter");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/3__1_-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout pnl_dokterLayout = new javax.swing.GroupLayout(pnl_dokter);
        pnl_dokter.setLayout(pnl_dokterLayout);
        pnl_dokterLayout.setHorizontalGroup(
            pnl_dokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_dokterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_dokter)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(pnl_dokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_dokterLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnl_on1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(187, Short.MAX_VALUE)))
        );
        pnl_dokterLayout.setVerticalGroup(
            pnl_dokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_dokterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_dokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn_dokter, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pnl_dokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_dokterLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnl_on1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pnl_perawat.setBackground(new java.awt.Color(255, 255, 255));

        pnl_on2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnl_on2Layout = new javax.swing.GroupLayout(pnl_on2);
        pnl_on2.setLayout(pnl_on2Layout);
        pnl_on2Layout.setHorizontalGroup(
            pnl_on2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        pnl_on2Layout.setVerticalGroup(
            pnl_on2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        btn_perawat.setBackground(new java.awt.Color(255, 255, 255));
        btn_perawat.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        btn_perawat.setForeground(new java.awt.Color(56, 182, 255));
        btn_perawat.setText("Data Perawat");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/4__1_-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout pnl_perawatLayout = new javax.swing.GroupLayout(pnl_perawat);
        pnl_perawat.setLayout(pnl_perawatLayout);
        pnl_perawatLayout.setHorizontalGroup(
            pnl_perawatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_perawatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_perawat, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_perawatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_perawatLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnl_on2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(187, Short.MAX_VALUE)))
        );
        pnl_perawatLayout.setVerticalGroup(
            pnl_perawatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_perawatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_perawatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_perawat, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pnl_perawatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_perawatLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnl_on2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pnl_pasien.setBackground(new java.awt.Color(255, 255, 255));

        pnl_on3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnl_on3Layout = new javax.swing.GroupLayout(pnl_on3);
        pnl_on3.setLayout(pnl_on3Layout);
        pnl_on3Layout.setHorizontalGroup(
            pnl_on3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        pnl_on3Layout.setVerticalGroup(
            pnl_on3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        btn_pasien.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        btn_pasien.setForeground(new java.awt.Color(56, 182, 255));
        btn_pasien.setText("Data Pasien");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Icon_pasien-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout pnl_pasienLayout = new javax.swing.GroupLayout(pnl_pasien);
        pnl_pasien.setLayout(pnl_pasienLayout);
        pnl_pasienLayout.setHorizontalGroup(
            pnl_pasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_pasienLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_pasien)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_pasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_pasienLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnl_on3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(184, Short.MAX_VALUE)))
        );
        pnl_pasienLayout.setVerticalGroup(
            pnl_pasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_pasienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_pasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(btn_pasien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pnl_pasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_pasienLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnl_on3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pnl_obat.setBackground(new java.awt.Color(255, 255, 255));

        pnl_on4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnl_on4Layout = new javax.swing.GroupLayout(pnl_on4);
        pnl_on4.setLayout(pnl_on4Layout);
        pnl_on4Layout.setHorizontalGroup(
            pnl_on4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        pnl_on4Layout.setVerticalGroup(
            pnl_on4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        btn_obat.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        btn_obat.setForeground(new java.awt.Color(56, 182, 255));
        btn_obat.setText("Data Obat");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Tanpa_judul__Poster___4_-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout pnl_obatLayout = new javax.swing.GroupLayout(pnl_obat);
        pnl_obat.setLayout(pnl_obatLayout);
        pnl_obatLayout.setHorizontalGroup(
            pnl_obatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_obatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_obat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_obatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_obatLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnl_on4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(187, Short.MAX_VALUE)))
        );
        pnl_obatLayout.setVerticalGroup(
            pnl_obatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_obatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_obatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_obat, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pnl_obatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_obatLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnl_on4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("TRANSAKSI");

        pnl_kunjungan.setBackground(new java.awt.Color(255, 255, 255));

        pnl_on5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnl_on5Layout = new javax.swing.GroupLayout(pnl_on5);
        pnl_on5.setLayout(pnl_on5Layout);
        pnl_on5Layout.setHorizontalGroup(
            pnl_on5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        pnl_on5Layout.setVerticalGroup(
            pnl_on5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        btn_kunjungan.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        btn_kunjungan.setForeground(new java.awt.Color(56, 182, 255));
        btn_kunjungan.setText("Kunjungan");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Kunjungan_FIX__1_-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout pnl_kunjunganLayout = new javax.swing.GroupLayout(pnl_kunjungan);
        pnl_kunjungan.setLayout(pnl_kunjunganLayout);
        pnl_kunjunganLayout.setHorizontalGroup(
            pnl_kunjunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_kunjunganLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_kunjungan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_kunjunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_kunjunganLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnl_on5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(187, Short.MAX_VALUE)))
        );
        pnl_kunjunganLayout.setVerticalGroup(
            pnl_kunjunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_kunjunganLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_kunjunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_kunjungan, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pnl_kunjunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_kunjunganLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnl_on5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pnl_resep.setBackground(new java.awt.Color(255, 255, 255));

        pnl_on6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnl_on6Layout = new javax.swing.GroupLayout(pnl_on6);
        pnl_on6.setLayout(pnl_on6Layout);
        pnl_on6Layout.setHorizontalGroup(
            pnl_on6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        pnl_on6Layout.setVerticalGroup(
            pnl_on6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/5-removebg-preview.png"))); // NOI18N

        btn_Resep.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        btn_Resep.setForeground(new java.awt.Color(56, 182, 255));
        btn_Resep.setText("Resep Obat");

        javax.swing.GroupLayout pnl_resepLayout = new javax.swing.GroupLayout(pnl_resep);
        pnl_resep.setLayout(pnl_resepLayout);
        pnl_resepLayout.setHorizontalGroup(
            pnl_resepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_resepLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_on6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Resep, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_resepLayout.setVerticalGroup(
            pnl_resepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_resepLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_resepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Resep, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_on6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_pembayaran.setBackground(new java.awt.Color(255, 255, 255));

        pnl_on7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnl_on7Layout = new javax.swing.GroupLayout(pnl_on7);
        pnl_on7.setLayout(pnl_on7Layout);
        pnl_on7Layout.setHorizontalGroup(
            pnl_on7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        pnl_on7Layout.setVerticalGroup(
            pnl_on7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        btn_pembayaran.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        btn_pembayaran.setForeground(new java.awt.Color(56, 182, 255));
        btn_pembayaran.setText("Pembayaran");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/9__1_-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout pnl_pembayaranLayout = new javax.swing.GroupLayout(pnl_pembayaran);
        pnl_pembayaran.setLayout(pnl_pembayaranLayout);
        pnl_pembayaranLayout.setHorizontalGroup(
            pnl_pembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_pembayaranLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(pnl_on7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_pembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_pembayaranLayout.setVerticalGroup(
            pnl_pembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_pembayaranLayout.createSequentialGroup()
                .addGroup(pnl_pembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_on7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(btn_pembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("CETAK  ");

        pnl_Laporan.setBackground(new java.awt.Color(255, 255, 255));

        pnl_on8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnl_on8Layout = new javax.swing.GroupLayout(pnl_on8);
        pnl_on8.setLayout(pnl_on8Layout);
        pnl_on8Layout.setHorizontalGroup(
            pnl_on8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        pnl_on8Layout.setVerticalGroup(
            pnl_on8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btn_Laporan.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        btn_Laporan.setForeground(new java.awt.Color(56, 182, 255));
        btn_Laporan.setText("Laporan Data");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DATA PASIEN FIX-Photoroom.png"))); // NOI18N

        javax.swing.GroupLayout pnl_LaporanLayout = new javax.swing.GroupLayout(pnl_Laporan);
        pnl_Laporan.setLayout(pnl_LaporanLayout);
        pnl_LaporanLayout.setHorizontalGroup(
            pnl_LaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_LaporanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_on8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Laporan)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pnl_LaporanLayout.setVerticalGroup(
            pnl_LaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_LaporanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_LaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_on8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Laporan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl_kiriLayout = new javax.swing.GroupLayout(pnl_kiri);
        pnl_kiri.setLayout(pnl_kiriLayout);
        pnl_kiriLayout.setHorizontalGroup(
            pnl_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_kiriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_kiriLayout.createSequentialGroup()
                        .addGroup(pnl_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)
                            .addComponent(jLabel14)
                            .addComponent(pnl_Laporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_kiriLayout.createSequentialGroup()
                        .addGroup(pnl_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnl_obat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnl_pasien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnl_kiriLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_kiriLayout.createSequentialGroup()
                                .addGroup(pnl_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pnl_dashboard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(pnl_dokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pnl_perawat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(pnl_kunjungan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnl_resep, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnl_pembayaran, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(97, 97, 97))))
        );
        pnl_kiriLayout.setVerticalGroup(
            pnl_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_kiriLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(pnl_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(pnl_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_dokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_perawat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_pasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_obat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_kunjungan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_resep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_pembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_Laporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_kanan.setLayout(new java.awt.BorderLayout());

        pnl_dasar.setBackground(new java.awt.Color(255, 255, 255));

        pnl_utama.setBackground(new java.awt.Color(255, 255, 255));
        pnl_utama.setLayout(new java.awt.BorderLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(51, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(56, 182, 255));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cancel.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(1060, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(29, 29, 29))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_dasarLayout = new javax.swing.GroupLayout(pnl_dasar);
        pnl_dasar.setLayout(pnl_dasarLayout);
        pnl_dasarLayout.setHorizontalGroup(
            pnl_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1121, Short.MAX_VALUE)
            .addGroup(pnl_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_dasarLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnl_utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_dasarLayout.setVerticalGroup(
            pnl_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1074, Short.MAX_VALUE)
            .addGroup(pnl_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_dasarLayout.createSequentialGroup()
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(pnl_utama, javax.swing.GroupLayout.DEFAULT_SIZE, 943, Short.MAX_VALUE)))
        );

        pnl_kanan.add(pnl_dasar, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnl_kiri, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pnl_kanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnl_kanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addComponent(pnl_kiri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMouseExited

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        dispose();
        System.exit(0);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        pnl_utama.removeAll();
        pnl_utama.add(new MenuDashboard());
        pnl_utama.repaint();
        pnl_utama.revalidate();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_Laporan;
    private javax.swing.JLabel btn_Resep;
    private javax.swing.JLabel btn_dashboard;
    private javax.swing.JLabel btn_dokter;
    private javax.swing.JLabel btn_kunjungan;
    private javax.swing.JLabel btn_obat;
    private javax.swing.JLabel btn_pasien;
    private javax.swing.JLabel btn_pembayaran;
    private javax.swing.JLabel btn_perawat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JPanel pnl_Laporan;
    private javax.swing.JPanel pnl_dasar;
    private javax.swing.JPanel pnl_dashboard;
    private javax.swing.JPanel pnl_dokter;
    private javax.swing.JPanel pnl_kanan;
    private javax.swing.JPanel pnl_kiri;
    private javax.swing.JPanel pnl_kunjungan;
    private javax.swing.JPanel pnl_obat;
    private javax.swing.JPanel pnl_on;
    private javax.swing.JPanel pnl_on1;
    private javax.swing.JPanel pnl_on2;
    private javax.swing.JPanel pnl_on3;
    private javax.swing.JPanel pnl_on4;
    private javax.swing.JPanel pnl_on5;
    private javax.swing.JPanel pnl_on6;
    private javax.swing.JPanel pnl_on7;
    private javax.swing.JPanel pnl_on8;
    private javax.swing.JPanel pnl_pasien;
    private javax.swing.JPanel pnl_pembayaran;
    private javax.swing.JPanel pnl_perawat;
    private javax.swing.JPanel pnl_resep;
    private javax.swing.JPanel pnl_utama;
    // End of variables declaration//GEN-END:variables

    private void actionButton() {
        btn_dashboard.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                pnl_dashboard.setBackground(new Color(240,240,240));
                pnl_on.setBackground(new Color(51, 255, 255));

                pnl_utama.removeAll();
                pnl_utama.add(new MenuDashboard());
                pnl_utama.repaint();
                pnl_utama.revalidate();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                pnl_dashboard.setBackground(new Color(255, 255, 255));
                pnl_on.setBackground(new Color(51, 255, 255));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                pnl_dashboard.setBackground(new Color(255,255,255));
                pnl_on.setBackground(new Color(255,255,255));
            }  
        });
        
        btn_dokter.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                pnl_dokter.setBackground(new Color(240,240,240));
                pnl_on1.setBackground(new Color(51, 255, 255));

                pnl_utama.removeAll();
                pnl_utama.add(new MenuDokter());
                pnl_utama.repaint();
                pnl_utama.revalidate();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                pnl_dokter.setBackground(new Color(255, 255, 255));
                pnl_on1.setBackground(new Color(51, 255, 255));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                pnl_dokter.setBackground(new Color(255,255,255));
                pnl_on1.setBackground(new Color(255,255,255));
            }  
        });
        
        btn_perawat.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                pnl_perawat.setBackground(new Color(240,240,240));
                pnl_on2.setBackground(new Color(51, 255, 255));
                
                pnl_utama.removeAll();
                pnl_utama.add(new MenuPerawat());
                pnl_utama.repaint();
                pnl_utama.revalidate();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                pnl_perawat.setBackground(new Color(255,255,255));
                pnl_on2.setBackground(new Color(51, 255, 255));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                pnl_perawat.setBackground(new Color(255,255,255));
                pnl_on2.setBackground(new Color(255,255,255));
            }  
        });
        
        btn_pasien.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                pnl_pasien.setBackground(new Color(240,240,240));
                pnl_on3.setBackground(new Color(51, 255, 255));
                
                pnl_utama.removeAll();
                pnl_utama.add(new MenuPasien());
                pnl_utama.repaint();
                pnl_utama.revalidate();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                pnl_pasien.setBackground(new Color(255,255,255));
                pnl_on3.setBackground(new Color(51, 255, 255));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                pnl_pasien.setBackground(new Color(255,255,255));
                pnl_on3.setBackground(new Color(255,255,255));
            }  
        });
        
        btn_obat.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                pnl_obat.setBackground(new Color(240,240,240));
                pnl_on4.setBackground(new Color(51, 255, 255));
                
                pnl_utama.removeAll();
                pnl_utama.add(new MenuObat());
                pnl_utama.repaint();
                pnl_utama.revalidate();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                pnl_obat.setBackground(new Color(255,255,255));
                pnl_on4.setBackground(new Color(51, 255, 255));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                pnl_obat.setBackground(new Color(255,255,255));
                pnl_on4.setBackground(new Color(255,255,255));
            }  
        });
        
        btn_kunjungan.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                pnl_kunjungan.setBackground(new Color(240,240,240));
                pnl_on5.setBackground(new Color(51, 255, 255));
                
                pnl_utama.removeAll();
                pnl_utama.add(new MenuKunjungan());
                pnl_utama.repaint();
                pnl_utama.revalidate();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                pnl_kunjungan.setBackground(new Color(255,255,255));
                pnl_on5.setBackground(new Color(51, 255, 255));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                pnl_kunjungan.setBackground(new Color(255,255,255));
                pnl_on5.setBackground(new Color(255,255,255));
            }  
        });
        
        btn_Resep.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                pnl_resep.setBackground(new Color(240,240,240));
                pnl_on6.setBackground(new Color(51, 255, 255));
                
                pnl_utama.removeAll();
                pnl_utama.add(new MenuResep());
                pnl_utama.repaint();
                pnl_utama.revalidate();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                pnl_resep.setBackground(new Color(255,255,255));
                pnl_on6.setBackground(new Color(51, 255, 255));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                pnl_resep.setBackground(new Color(255,255,255));
                pnl_on6.setBackground(new Color(255,255,255));
            }  
        });
        
        btn_pembayaran.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                pnl_pembayaran.setBackground(new Color(240,240,240));
                pnl_on7.setBackground(new Color(51, 255, 255));
                
                pnl_utama.removeAll();
                pnl_utama.add(new MenuPembayaran());
                pnl_utama.repaint();
                pnl_utama.revalidate();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                pnl_pembayaran.setBackground(new Color(255,255,255));
                pnl_on7.setBackground(new Color(51, 255, 255));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                pnl_pembayaran.setBackground(new Color(255,255,255));
                pnl_on7.setBackground(new Color(255,255,255));
            }  
        });
        
        btn_Laporan.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                pnl_Laporan.setBackground(new Color(240,240,240));
                pnl_on8.setBackground(new Color(51, 255, 255));
                
                pnl_utama.removeAll();
                pnl_utama.add(new MenuLaporan());
                pnl_utama.repaint();
                pnl_utama.revalidate();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                pnl_Laporan.setBackground(new Color(255,255,255));
                pnl_on8.setBackground(new Color(51, 255, 255));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                pnl_Laporan.setBackground(new Color(255,255,255));
                pnl_on8.setBackground(new Color(255,255,255));
            }  
        });
        
    }
}
