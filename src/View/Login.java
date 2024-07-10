package View;

import Config.Koneksi;
import Main.MainMenu;
import com.mysql.cj.protocol.Resultset;
import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    private Connection conn;
    int xx, xy;
    public Login() {
        initComponents();
        conn = Koneksi.getConnection();
        ActionButton();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlLogin = new javax.swing.JPanel();
        txtUser = new custom.textfield.TextField();
        hide = new javax.swing.JLabel();
        txtPassword = new custom.textfield.PasswordField();
        jLabel2 = new javax.swing.JLabel();
        btnLogin = new rojerusan.RSMaterialButtonRectangle();
        eye = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        btnBatal = new rojerusan.RSMaterialButtonRectangle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Page login.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlLogin.setBackground(new java.awt.Color(51, 255, 255));
        pnlLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.setBackground(new java.awt.Color(51, 255, 255));
        txtUser.setLabelText("Username");
        pnlLogin.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 125, 250, -1));

        hide.setBackground(new java.awt.Color(255, 255, 255));
        hide.setForeground(new java.awt.Color(255, 255, 255));
        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/eye_hide.png"))); // NOI18N
        pnlLogin.add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));

        txtPassword.setBackground(new java.awt.Color(51, 255, 255));
        txtPassword.setLabelText("Password");
        pnlLogin.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 194, 255, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 36)); // NOI18N
        jLabel2.setText("LOGIN");
        pnlLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 64, -1, -1));

        btnLogin.setBackground(new java.awt.Color(51, 102, 255));
        btnLogin.setText("LOGIN");
        btnLogin.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        pnlLogin.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 133, 56));

        eye.setBackground(new java.awt.Color(255, 255, 255));
        eye.setForeground(new java.awt.Color(255, 255, 255));
        eye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/eye.png"))); // NOI18N
        pnlLogin.add(eye, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cancel.png"))); // NOI18N
        pnlLogin.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        btnBatal.setBackground(new java.awt.Color(51, 102, 255));
        btnBatal.setText("CANCEL");
        btnBatal.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        pnlLogin.add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 133, 56));

        jPanel1.add(pnlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 330, 400));

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

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        txtUser.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btnBatal;
    private javax.swing.JLabel btnExit;
    private rojerusan.RSMaterialButtonRectangle btnLogin;
    private javax.swing.JLabel eye;
    private javax.swing.JLabel hide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnlLogin;
    private custom.textfield.PasswordField txtPassword;
    private custom.textfield.TextField txtUser;
    // End of variables declaration//GEN-END:variables

    private void ActionButton() {
        eye.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                eye.setVisible(false);
                hide.setVisible(true);
                txtPassword.setEchoChar('*');
            }
        });
        hide.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                eye.setVisible(true);
                hide.setVisible(false);
                txtPassword.setEchoChar((char)0);
            }
        });
        
        btnLogin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                prosesLogin();
            }
        });
        
        btnExit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                dispose();
                System.exit(0);
            }
        });
        
        txtPassword.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    btnLogin.doClick();
                }
            }
            
        });
    }
    
    private boolean validasiInput(){
        boolean valid = false;
        if (txtUser.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username Tidak Boleh Kosong !");
        } else if(txtPassword.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Password Tidak Boleh Kosong !");
        } else {
            valid = true;
        }
        return valid;
    }
    
    private boolean checkLogin(String username, String password){
        if (conn != null) {
            try {
                String sql = "SELECT * FROM tbl_pengguna WHERE username=? AND password=?";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1, username);
                st.setString(2, password);
                
                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "Anda Berhasil Login");
                    return true;
                }
            } catch (Exception e) {
                printStackTrace();
            }
        }
        return false;
    }
    
    private void prosesLogin(){
        if (validasiInput()) {
            String username = txtUser.getText();
            String password = new String(txtPassword.getPassword());
            
            if (checkLogin(username, password)) {
                MainMenu mn = new MainMenu();
                mn.setVisible(true);
                mn.revalidate();
                
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Username Dan Password Salah !","Pesan",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
