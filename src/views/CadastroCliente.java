package views;

import bean.Estilo;
import bean.Cliente;
import dao.ClienteDAO;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Douglas Kjellin <douglasaxelkjellin@gmail.com>
 */
public class CadastroCliente extends javax.swing.JFrame {

    public static CadastroCliente instance = null;

    public CadastroCliente() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/logo32x32.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfNomeSobre1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        tfNome = new javax.swing.JTextField();
        tfEndereco = new javax.swing.JTextField();
        tfBairro = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        ftCPF = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        tfSobreNome = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        cbRegiao = new javax.swing.JComboBox<>();
        ftTelefone = new javax.swing.JFormattedTextField();
        ftCelular = new javax.swing.JFormattedTextField();

        tfNomeSobre1.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        tfNomeSobre1.setText("Douglas Souza Axel Kjellin");
        tfNomeSobre1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(245, 172, 62)));
        tfNomeSobre1.setSelectionColor(new java.awt.Color(62, 194, 235));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(139, 198, 62)));
        jPanel4.setAutoscrolls(true);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel11.setText("Nome:");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel12.setText("Data de nascimento:");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel13.setText("CPF:");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel14.setText("Endereço:");

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel15.setText("Região:");

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel16.setText("Telefone:");

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel17.setText("Celular:");

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel18.setText("E-mail:");

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel19.setText("Bairro:");

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cadastrar.png"))); // NOI18N
        btnCadastrar.setBorder(null);
        btnCadastrar.setBorderPainted(false);
        btnCadastrar.setContentAreaFilled(false);
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        tfNome.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        tfNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(245, 172, 62)));
        tfNome.setSelectionColor(new java.awt.Color(62, 194, 235));

        tfEndereco.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        tfEndereco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(194, 85, 156)));
        tfEndereco.setSelectionColor(new java.awt.Color(62, 194, 235));

        tfBairro.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        tfBairro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(194, 85, 156)));
        tfBairro.setSelectionColor(new java.awt.Color(62, 194, 235));

        tfEmail.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        tfEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(245, 172, 62)));
        tfEmail.setSelectionColor(new java.awt.Color(62, 194, 235));

        ftCPF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(62, 194, 235)));
        try {
            ftCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftCPF.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        ftCPF.setSelectionColor(new java.awt.Color(62, 194, 235));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(62, 194, 235)));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(null);
        jTextArea1.setCaretColor(new java.awt.Color(62, 194, 235));
        jTextArea1.setSelectionColor(new java.awt.Color(62, 194, 235));
        jScrollPane2.setViewportView(jTextArea1);

        jLabel20.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Comentário:");

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel21.setText("Sobrenome:");

        tfSobreNome.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        tfSobreNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(245, 172, 62)));
        tfSobreNome.setSelectionColor(new java.awt.Color(62, 194, 235));

        jDateChooser1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(62, 194, 235)));
        jDateChooser1.setDateFormatString("dd/MM/yyyy");

        cbRegiao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Zona Norte", "Zona Nordeste", "Zona Leste", "Região do Glória e do Cristal", "Zona Sul", "Região do Partenon", "Zona Extremo Sul" }));
        cbRegiao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(139, 198, 62)));

        ftTelefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(139, 198, 62)));
        try {
            ftTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftTelefone.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        ftTelefone.setSelectionColor(new java.awt.Color(62, 194, 235));

        ftCelular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(245, 172, 62)));
        try {
            ftCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftCelular.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        ftCelular.setSelectionColor(new java.awt.Color(62, 194, 235));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNome)
                    .addComponent(tfSobreNome)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfEndereco)
                    .addComponent(tfBairro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfEmail)
                    .addComponent(ftCPF)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbRegiao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel21)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addComponent(jLabel13))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ftTelefone)
                    .addComponent(ftCelular, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addGap(1, 1, 1)
                .addComponent(tfSobreNome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ftCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(7, 7, 7)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbRegiao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(3, 3, 3)
                .addComponent(ftTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(7, 7, 7)
                .addComponent(ftCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 697, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (tfNome.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo \"Nome\" deve estar preenchido!");
        } else if (tfSobreNome.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo \"Sobrenome\" deve estar preenchido!");
        } else if (tfSobreNome.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo \"Celular\" deve estar preenchido!");
        } else {
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            Date d = jDateChooser1.getDate();
            String data = f.format(d);
            Cliente c = new Cliente();
            ClienteDAO dao = new ClienteDAO();

            if (!tfEndereco.getText().trim().equals("")) {
                c.setEndereco(Estilo.primeiraLetra(tfEndereco.getText().trim()));
            } else {
                c.setEndereco(tfEndereco.getText().trim());
            }

            if (!tfBairro.getText().trim().equals("")) {
                c.setBairro(Estilo.primeiraLetra(tfBairro.getText().trim()));
            } else {
                c.setBairro(tfBairro.getText().trim());
            }

            c.setNome(Estilo.primeiraLetra(tfNome.getText().trim()));
            c.setSobrenome(Estilo.primeiraLetra(tfSobreNome.getText().trim()));
            c.setCpf(ftCPF.getText().trim());
            c.setData_nasc(data);
            c.setRegiao(cbRegiao.getSelectedItem().toString());
            c.setTelefone(ftTelefone.getText().trim());
            c.setCelular(ftCelular.getText().trim());
            c.setEmail(tfEmail.getText().trim());
            c.setDescricao(jTextArea1.getText());
            dao.create(c);
            if (JOptionPane.showConfirmDialog(null, "Cliente cadastrado com sucesso!\n\nCadastrar novo cliente?", "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                tfNome.setText("");
                tfSobreNome.setText("");
                ftCPF.setText("");
                jDateChooser1.setDate(new Date());
                tfEndereco.setText("");
                tfBairro.setText("");
                cbRegiao.setSelectedIndex(0);
                ftTelefone.setText("");
                ftCelular.setText("");
                tfEmail.setText("");
                jTextArea1.setText("");
            } else {
                Dashboard db = new Dashboard();
                db.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        instance = null;
    }//GEN-LAST:event_formWindowClosed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JComboBox<String> cbRegiao;
    private javax.swing.JFormattedTextField ftCPF;
    private javax.swing.JFormattedTextField ftCelular;
    private javax.swing.JFormattedTextField ftTelefone;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNomeSobre1;
    private javax.swing.JTextField tfSobreNome;
    // End of variables declaration//GEN-END:variables
}
