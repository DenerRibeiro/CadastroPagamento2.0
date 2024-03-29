/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.ContasDAO;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import modelo.Contas;

/**
 *
 * @author dener
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        //configurações iniciais
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        jLDica.setVisible(false);
        jLabelLoginError.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTUsuario = new javax.swing.JTextField();
        jPSenha = new javax.swing.JPasswordField();
        jBEntrar = new javax.swing.JButton();
        jLDica = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelLoginError = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuário");

        jLabel2.setText("Senha");

        jTUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTUsuarioActionPerformed(evt);
            }
        });

        jPSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPSenhaActionPerformed(evt);
            }
        });

        jBEntrar.setText("Entrar");
        jBEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEntrarActionPerformed(evt);
            }
        });

        jLabel3.setText("Dica: admin admin");

        jLabelLoginError.setForeground(new java.awt.Color(255, 0, 0));
        jLabelLoginError.setText("jLabel4");

        jMenu2.setText("Usuário");

        jMenuItem1.setText("Novo Usuário");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLDica)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(7, 7, 7)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelLoginError)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jBEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                        .addComponent(jTUsuario, javax.swing.GroupLayout.Alignment.LEADING))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBEntrar)
                .addGap(7, 7, 7)
                .addComponent(jLabelLoginError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLDica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTUsuarioActionPerformed

    private void jBEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEntrarActionPerformed
        // TODO add your handling code here:
        //chama o evento de login
        ActionHandlerEntrar();
    }//GEN-LAST:event_jBEntrarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        ContasDAO dao = new ContasDAO();
        Contas contas = new Contas();

        //Confiurando o painel de senha do administrador
        JPanel panelAdmin = new JPanel();
        panelAdmin.setLayout(new GridLayout(2, 2));
        JLabel jLsenhaAdmin = new JLabel("             "
                + "Senha: ");

        JLabel jLLoginError = new JLabel("*Senha incorreta!");
        jLLoginError.setForeground(Color.red);
        jLLoginError.setVisible(false);

        JPasswordField jPsenhaAdmin = new JPasswordField(5);
        panelAdmin.add(jLsenhaAdmin);
        panelAdmin.add(jPsenhaAdmin);
        panelAdmin.add(jLLoginError);

        int resAdmin = 0;

        //enquando a senha não for correta e o usuário não cancelar a acao
        while (resAdmin == 0) {
            //pede senha do adiministrador
            resAdmin = JOptionPane.showConfirmDialog(null, panelAdmin,
                    "Senha do administrador", JOptionPane.OK_CANCEL_OPTION);
            //se botao cancel é acionado
            if (resAdmin != 0) {
                break;
            }//se botao ok é acionado
            //verifica a senha do administrador
            if (jPsenhaAdmin.getText().equals("admin")) {
                resAdmin = 1;

                //prepara o painel do novo usuário
                JPanel panel = new JPanel();
                panel.setLayout(new GridLayout(3, 1));
                JLabel jLusuario = new JLabel("Usuário:");
                JTextField jTusuario = new JTextField(5);

                JLabel jLsenha = new JLabel("Senha:");
                JPasswordField jPsenha = new JPasswordField(5);

                JLabel jLError = new JLabel("*Usuário já cadastrado!");
                jLError.setForeground(Color.red);
                jLError.setVisible(false);

                panel.add(jLusuario);
                panel.add(jTusuario);
                panel.add(jLsenha);
                panel.add(jPsenha);
                panel.add(jLError);

                boolean flag = true;
                //enquanto o usuário digitado já estiver cadastrado e
                //o usuário não cancelar a ação 
                while (flag) {
                    int resUsuario = JOptionPane.showConfirmDialog(null, panel,
                            "Cadastrar Usuário", JOptionPane.OK_CANCEL_OPTION);

                    //verifica campo vazio
                    if ((jTusuario.getText().isEmpty() || jPsenha.getText().isEmpty()) && resUsuario == 0) {
                        JOptionPane.showMessageDialog(null, "Os campos não podem estar vazios");
                    } else {
                        //adiciona usuáiro
                        contas.setUsuario(jTusuario.getText());
                        contas.setSenha(jPsenha.getText());

                        if (resUsuario == 0) {
                            //verifica se há usuário com esse login e adiciona no banco
                            if (dao.VerificaUsuario(jTusuario.getText()) == false
                                    && !jTusuario.getText().equals("admin")) {
                                dao.AdicionaUsuario(contas);
                                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
                                flag = false;
                            } else {

                                jLError.setVisible(true);
                                panel.invalidate();

                            }
                            jTusuario.setText("");
                            jPsenha.setText("");

                        } else {
                            flag = false;
                        }
                    }

                }
            } else {
//                JOptionPane.showMessageDialog(null, "senha inválida");
//                                jLsenhaAdmin.setVisible(true);
                jLLoginError.setVisible(true);
                panelAdmin.invalidate();
//                panelAdmin.add(jLLoginError);

            }
        }


    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jPSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPSenhaActionPerformed
        // TODO add your handling code here:
        //chama o evento de login
        ActionHandlerEntrar();
    }//GEN-LAST:event_jPSenhaActionPerformed

    //acao de login
    public void ActionHandlerEntrar() {

        ContasDAO dao = new ContasDAO();

        String senha = new String(jPSenha.getPassword());
        String usuario = jTUsuario.getText();
        
        //verifica usuario e senha
        if (dao.VerificaUsuarioESenha(usuario, senha)) {
            ContasGUI g = new ContasGUI(this, usuario);
            g.setVisible(true);
        }
        //caso usuario e/ou senha incorretos
        else {
            jLabelLoginError.setVisible(true);
            jLabelLoginError.setText("*Usuário e/ou senha incorretos!");
            jTUsuario.setText("");
            jPSenha.setText("");

        }
    }

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
    private javax.swing.JButton jBEntrar;
    private javax.swing.JLabel jLDica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelLoginError;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPasswordField jPSenha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTUsuario;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
