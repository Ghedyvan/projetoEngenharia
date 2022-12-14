package View;

import Controller.LoginController;
import Model.DAO.Banco;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ghedyvan
 */
public class Login extends javax.swing.JFrame {

    static Object view;

    private final LoginController controller;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        controller = new LoginController(this);
        try {
            Banco.inicia();
        } catch (ParseException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        TextUser = new javax.swing.JTextField();
        TextPassword = new javax.swing.JPasswordField();
        PasswordText = new javax.swing.JLabel();
        UserText = new javax.swing.JLabel();
        LoginText = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setText("Entrar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 280, 40));

        TextUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextUserActionPerformed(evt);
            }
        });
        getContentPane().add(TextUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 280, 40));
        getContentPane().add(TextPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 280, 40));

        PasswordText.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        PasswordText.setForeground(new java.awt.Color(255, 255, 255));
        PasswordText.setText("Senha");
        getContentPane().add(PasswordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        UserText.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        UserText.setForeground(new java.awt.Color(255, 255, 255));
        UserText.setText("Usu??rio");
        getContentPane().add(UserText, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        LoginText.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        LoginText.setForeground(new java.awt.Color(255, 255, 255));
        LoginText.setText("LOGIN");
        getContentPane().add(LoginText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/ghedyvan/Downloads/D_NQ_NP_741947-MLB42158299867_062020-O.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 470, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextUserActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        //Deve ser executado quando o bot??o for pressionado    
        System.out.println(TextUser.getText()); // user
        System.out.println(TextPassword.getText()); // senha
        //this.controller.fizTarefa(); 
        this.controller.entrarNoSistema();
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
    private javax.swing.JLabel LoginText;
    private javax.swing.JLabel PasswordText;
    private javax.swing.JPasswordField TextPassword;
    private javax.swing.JTextField TextUser;
    private javax.swing.JLabel UserText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

    public void exibeMensagem(String mensagem) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public JPasswordField getTextPassword() {
        return TextPassword;
    }

    public void setTextPassword(JPasswordField TextPassword) {
        this.TextPassword = TextPassword;
    }

    public JTextField getTextUser() {
        return TextUser;
    }

    public void setTextUser(JTextField TextUser) {
        this.TextUser = TextUser;
    }
    
    
}
