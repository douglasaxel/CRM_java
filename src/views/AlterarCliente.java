/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import bean.Cliente;
import bean.Estilo;
import dao.ClienteDAO;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Douglas Kjellin <douglasaxelkjellin@gmail.com>
 */
public class AlterarCliente extends javax.swing.JFrame {

    public static AlterarCliente instance = null;
    ClienteDAO dao;
    List<Cliente> cl;
    Cliente c;

    public AlterarCliente() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/logo32x32.png")).getImage());
    }

    public AlterarCliente(long id) {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/logo32x32.png")).getImage());
        dao = new ClienteDAO();
        cl = dao.search_by_id(String.valueOf(id));
        c = cl.get(0);
        DateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        Date data;
        try {
            data = f.parse(c.getData_nasc());
            jDateChooser1.getDateEditor().setDate(data);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel converter a data!\n" + ex);
        }

        tfNome.setText(c.getNome());
        tfSobreNome.setText(c.getSobrenome());
        ftCPF.setText(c.getCpf());
        tfEndereco.setText(c.getEndereco());
        tfBairro.setText(c.getBairro());

        int op = 0;
        String r = String.valueOf(dao.search_by_regiao(c.getRegiao()));
        if (r.equalsIgnoreCase("zona norte")) {
            op = 0;
        } else if (r.equalsIgnoreCase("zona nordeste")) {
            op = 1;
        } else if (r.equalsIgnoreCase("zona leste")) {
            op = 2;
        } else if (r.equalsIgnoreCase("região do glória e do cristal")) {
            op = 3;
        } else if (r.equalsIgnoreCase("zona sul")) {
            op = 4;
        } else if (r.equalsIgnoreCase("região do partenon")) {
            op = 5;
        } else if (r.equalsIgnoreCase("zona extremo sul")) {
            op = 6;
        }

        cbRegiao.getItemAt(op);
        ftTelefone.setText(c.getTelefone());
        ftCelular.setText(c.getCelular());
        tfEmail.setText(c.getEmail());
        jTextArea1.setText(c.getDescricao());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        btnAlterar = new javax.swing.JButton();
        tfNome = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        cbRegiao = new javax.swing.JComboBox<>();
        tfBairro = new javax.swing.JTextField();
        tfEndereco = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        ftCPF = new javax.swing.JFormattedTextField();
        tfSobreNome = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        ftTelefone = new javax.swing.JFormattedTextField();
        ftCelular = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar informações");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(139, 198, 62)));
        jPanel8.setAutoscrolls(true);

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Alterar.png"))); // NOI18N
        btnAlterar.setBorder(null);
        btnAlterar.setBorderPainted(false);
        btnAlterar.setContentAreaFilled(false);
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        tfNome.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        tfNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(245, 172, 62)));
        tfNome.setSelectionColor(new java.awt.Color(62, 194, 235));

        tfEmail.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        tfEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(245, 172, 62)));
        tfEmail.setSelectionColor(new java.awt.Color(62, 194, 235));

        cbRegiao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Zona Norte", "Zona Nordeste", "Zona Leste", "Região do Glória e do Cristal", "Zona Sul", "Região do Partenon", "Zona Extremo Sul" }));
        cbRegiao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(139, 198, 62)));

        tfBairro.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        tfBairro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(194, 85, 156)));
        tfBairro.setSelectionColor(new java.awt.Color(62, 194, 235));

        tfEndereco.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        tfEndereco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(194, 85, 156)));
        tfEndereco.setSelectionColor(new java.awt.Color(62, 194, 235));

        jDateChooser1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(62, 194, 235)));
        jDateChooser1.setDateFormatString("dd/MM/yyyy");

        ftCPF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(62, 194, 235)));
        try {
            ftCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftCPF.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        ftCPF.setSelectionColor(new java.awt.Color(62, 194, 235));

        tfSobreNome.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        tfSobreNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(245, 172, 62)));
        tfSobreNome.setSelectionColor(new java.awt.Color(62, 194, 235));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel11.setText("Nome:");

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel21.setText("Sobrenome:");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel13.setText("CPF:");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel12.setText("Data de nascimento:");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel14.setText("Endereço:");

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel19.setText("Bairro:");

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

        jLabel20.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Comentário:");

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

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addComponent(tfNome)
                    .addComponent(tfSobreNome)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfEndereco)
                    .addComponent(tfBairro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfEmail)
                    .addComponent(ftCPF)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbRegiao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel21)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addComponent(jLabel13)
                            .addComponent(jLabel17))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ftCelular)
                    .addComponent(ftTelefone))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(7, 7, 7)
                .addComponent(ftCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja alterar os dados de " + c.getNome() + "?", "WARNING", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if (tfNome.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "O campo \"Nome\" deve estar preenchido!");
            } else if (tfSobreNome.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "O campo \"Sobrenome\" deve estar preenchido!");
            } else if (ftCelular.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "O campo \"Celular\" deve estar preenchido!");
            } else {
                SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
                Date d = jDateChooser1.getDate();
                String data = f.format(d);

                c.setNome(Estilo.primeiraLetra(tfNome.getText().trim()));
                c.setSobrenome(Estilo.primeiraLetra(tfSobreNome.getText().trim()));
                c.setCpf(ftCPF.getText().trim());
                c.setData_nasc(data);
                c.setEndereco(Estilo.primeiraLetra(tfEndereco.getText().trim()));
                c.setBairro(Estilo.primeiraLetra(tfBairro.getText().trim()));
                c.setRegiao(cbRegiao.getSelectedItem().toString());
                c.setTelefone(ftTelefone.getText().trim());
                c.setCelular(ftCelular.getText().trim());
                c.setEmail(tfEmail.getText().trim());
                c.setDescricao(jTextArea1.getText());
                dao.update(c);
                JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso!");
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        AlterarCliente.instance = null;
    }//GEN-LAST:event_formWindowClosed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfSobreNome;
    // End of variables declaration//GEN-END:variables
}
