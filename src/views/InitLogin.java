package views;

import bean.SendMail;
import bean.Usuario;
import dao.UsuarioDAO;
import java.awt.event.KeyEvent;
import java.util.List;

/*
 * @author Douglas Kjellin <douglasaxelkjellin@gmail.com>
 */
public class InitLogin extends javax.swing.JFrame {

    public InitLogin() {
        initComponents();
//        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/logo32x32.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        bntEntrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblErro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(194, 85, 156));
        jLabel1.setText("Senha");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 120, -1));

        txtUsuario.setFont(new java.awt.Font("Cambria", 0, 30)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(130, 130, 130));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setBorder(null);
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyReleased(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 240, 40));

        txtSenha.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(130, 130, 130));
        txtSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSenha.setToolTipText("");
        txtSenha.setBorder(null);
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSenhaKeyReleased(evt);
            }
        });
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 240, 30));

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(194, 85, 156));
        jLabel3.setText("Login");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 120, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jLabel4.setLabelFor(jLabel4);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 267, 258));

        jSeparator1.setBackground(new java.awt.Color(139, 198, 62));
        jSeparator1.setForeground(new java.awt.Color(139, 198, 62));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 260, 20));

        jSeparator2.setBackground(new java.awt.Color(245, 172, 62));
        jSeparator2.setForeground(new java.awt.Color(245, 172, 62));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 260, 20));

        bntEntrar.setBackground(new java.awt.Color(58, 190, 232));
        bntEntrar.setForeground(new java.awt.Color(58, 190, 232));
        bntEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Entrar_OFF.png"))); // NOI18N
        bntEntrar.setBorder(null);
        bntEntrar.setBorderPainted(false);
        bntEntrar.setContentAreaFilled(false);
        bntEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntEntrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Entrar_ON.png"))); // NOI18N
        bntEntrar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Entrar_ON.png"))); // NOI18N
        bntEntrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Entrar_OFF.png"))); // NOI18N
        bntEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(bntEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, -1, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fechar.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Minimizar.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));

        lblErro.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblErro.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblErro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bntEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEntrarActionPerformed
        String usu = txtUsuario.getText();
        char[] pass = txtSenha.getPassword();
        if ((readUsuario(usu) && readSenha(pass)) || (readUsuario(usu) && readSenha(pass))) {
            Dashboard d = new Dashboard();
            d.lblBemVindo.setText(buscarUsuario().getNome());
            d.setVisible(true);
            this.dispose();
        } else {
            lblErro.setText("Usuário ou senha inválidos.");
        }
    }//GEN-LAST:event_bntEntrarActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(-1);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        this.setState(InitLogin.ICONIFIED);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void txtSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String usu = txtUsuario.getText();
            char[] pass = txtSenha.getPassword();
            if (readUsuario(usu) && readSenha(pass)) {
                Dashboard d = new Dashboard();
                d.lblBemVindo.setText(buscarUsuario().getNome());
                d.setVisible(true);
                this.dispose();
            } else {
                lblErro.setText("Usuário ou senha inválidos.");
            }
        }
    }//GEN-LAST:event_txtSenhaKeyReleased

    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String usu = txtUsuario.getText();
            char[] pass = txtSenha.getPassword();
            if (readUsuario(usu) && readSenha(pass)) {
                Dashboard d = new Dashboard();
                d.lblBemVindo.setText(buscarUsuario().getNome());
                d.setVisible(true);
                this.dispose();
            } else {
                lblErro.setText("Usuário ou senha inválidos.");
            }
        }
    }//GEN-LAST:event_txtUsuarioKeyReleased

    public Usuario buscarUsuario() {
        UsuarioDAO dao = new UsuarioDAO();
        Usuario u;
        List<Usuario> ul = dao.search_by_login(txtUsuario.getText());
        u = ul.get(0);
        return u;
    }

    public boolean readUsuario(String login) {
        return login.equals(buscarUsuario().getLogin());
    }

    public boolean readSenha(char[] pass) {
        String senha = "";
        for (byte i = 0; i < pass.length; i++) {
            senha += pass[i];
        }
        return senha.equals(buscarUsuario().getSenha());
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InitLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InitLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InitLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InitLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InitLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblErro;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
