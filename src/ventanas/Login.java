
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
//import javax.swing.Icon;
//import javax.swing.ImageIcon;
import java.sql.*;
import Modelo.Conexion;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public static String user = ""; //Se declara así para enviar datos entre interfaces
    String pass = "";
    
    public Login() {
        initComponents();
        setSize(400, 600);
        setResizable(false);
        setTitle("Accediendo al sistema");
        setLocationRelativeTo(null);

      
        
    }
    
    

   @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Img/Para la vida.png"));
        return retValue;
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        btnsaliraplicacion = new javax.swing.JButton();
        jButton_Acceder = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Para la vida.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 240, 160));

        txt_password.setBackground(new java.awt.Color(51, 51, 51));
        txt_password.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        txt_password.setForeground(new java.awt.Color(255, 255, 255));
        txt_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_password.setBorder(null);
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 210, 30));

        btnsaliraplicacion.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        btnsaliraplicacion.setText("SALIR");
        btnsaliraplicacion.setBorder(null);
        btnsaliraplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaliraplicacionActionPerformed(evt);
            }
        });
        jPanel1.add(btnsaliraplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 190, 30));

        jButton_Acceder.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jButton_Acceder.setText("Iniciar Sesión");
        jButton_Acceder.setBorder(null);
        jButton_Acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AccederActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 190, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 210, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 210, 20));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 180, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuarios.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 40, 40));

        txt_user.setBackground(new java.awt.Color(51, 51, 51));
        txt_user.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_user.setForeground(new java.awt.Color(255, 255, 255));
        txt_user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_user.setBorder(null);
        jPanel1.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 210, 30));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre de usuario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 180, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mostrar-contrasena.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 40, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AccederActionPerformed

        user = txt_user.getText().trim();
        pass = txt_password.getText().trim();
        if (!user.equals("") || !pass.equals("")) {

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "select tipo_nivel, estatus from usuarios where username = '" + user
                        + "' and password = '" + pass + "'");

                ResultSet rs = pst.executeQuery();
                if (rs.next()) {

                    String tipo_nivel = rs.getString("tipo_nivel");
                    String estatus = rs.getString("estatus");

                    if (tipo_nivel.equalsIgnoreCase("Administrador") && estatus.equalsIgnoreCase("Activo")) {
                        //dispose(); Hace que el JFrame sea destruido y limpiado por el sistema operativo.
                        dispose();
                        new Administrador().setVisible(true);
                    } else if (tipo_nivel.equalsIgnoreCase("Capturista") && estatus.equalsIgnoreCase("Activo")) {
                        dispose();
                        new Capturista().setVisible(true);
                        
                    } else if (tipo_nivel.equalsIgnoreCase("Tecnico") && estatus.equalsIgnoreCase("Activo")) {
                        dispose();
                        new Tecnico().setVisible(true);
                    }
                    else if (tipo_nivel.equalsIgnoreCase("Vendedor") && estatus.equalsIgnoreCase("Activo")){
                        dispose();
                       new ModuloVenta().setVisible(true);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Datos de acceso incorrectos.");
                    txt_user.setText("");
                    txt_password.setText("");
                }

            } catch (SQLException e) {
                System.err.println("Error en el botón Acceder." + e);
                JOptionPane.showMessageDialog(null, "¡¡ERROR al iniciar!!, contacte al administrador.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
        }

    }//GEN-LAST:event_jButton_AccederActionPerformed

    private void btnsaliraplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaliraplicacionActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnsaliraplicacionActionPerformed

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
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsaliraplicacion;
    private javax.swing.JButton jButton_Acceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
