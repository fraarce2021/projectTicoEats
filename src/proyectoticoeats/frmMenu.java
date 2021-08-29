package proyectoticoeats;

import capaDatos.UsuarioD;
import capaLogica.Usuario;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco Arce Chavarria <danielarcesoftware@gmail.com>
 */
public class frmMenu extends javax.swing.JFrame {

    Usuario user = new Usuario();

    public frmMenu(Usuario userLogin) {
        initComponents();
        getContentPane().requestFocus();
        this.user = userLogin;
        ocultarContenido();
        cargarDatos();
    }

    private void cargarDatos() {
        cargarDatosUsuario();
        cargarPerfilMenu();
    }

    private void cargarDatosUsuario() {
        lblPerfil.setText(user.getNOMBRE() + " / " + user.TIPO_USUARIO.toString().toUpperCase());
    }

    private void cargarPerfilMenu() {
        switch (user.TIPO_USUARIO.name()) {
            case "Regular":
                btnOrden.setVisible(true);
                btnCalificarOrden.setVisible(true);
                btnCerrarSesion.setVisible(true);
                break;
            case "Gerente":
                btnMantRestaurante.setVisible(true);
                btnMantProducto.setVisible(true);
                btnCerrarSesion.setVisible(true);
                break;
            default:
                btnMantRestaurante.setVisible(true);
                btnMantProducto.setVisible(true);
                btnOrden.setVisible(true);
                btnCalificarOrden.setVisible(true);
                btnUsuariosBloqueados.setVisible(true);
                btnReportes.setVisible(true);
                btnCerrarSesion.setVisible(true);
                break;
        }
    }

    private void ocultarContenido() {
        btnMantRestaurante.setVisible(false);
        btnMantProducto.setVisible(false);
        btnOrden.setVisible(false);
        btnCalificarOrden.setVisible(false);
        btnUsuariosBloqueados.setVisible(false);
        btnReportes.setVisible(false);
        btnCerrarSesion.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblImagenUser = new javax.swing.JLabel();
        lblPerfil = new javax.swing.JLabel();
        btnMantRestaurante = new javax.swing.JButton();
        btnMantProducto = new javax.swing.JButton();
        btnOrden = new javax.swing.JButton();
        btnCalificarOrden = new javax.swing.JButton();
        btnUsuariosBloqueados = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(20, 183, 110));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagenUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user.png"))); // NOI18N
        jPanel2.add(lblImagenUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 30));

        lblPerfil.setText("Daniel Arce Chavarria / ADMINISTRADOR");
        lblPerfil.setToolTipText("");
        jPanel2.add(lblPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 3, 250, 20));

        jPanel1.add(jPanel2);

        btnMantRestaurante.setBackground(new java.awt.Color(255, 255, 255));
        btnMantRestaurante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/restaurant.png"))); // NOI18N
        btnMantRestaurante.setText("Mantenimiento Restaurantes");
        btnMantRestaurante.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMantRestaurante.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnMantRestaurante.setPreferredSize(new java.awt.Dimension(300, 41));
        btnMantRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantRestauranteActionPerformed(evt);
            }
        });
        jPanel1.add(btnMantRestaurante);

        btnMantProducto.setBackground(new java.awt.Color(255, 255, 255));
        btnMantProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fast-food.png"))); // NOI18N
        btnMantProducto.setText("Mantenimiento Productos");
        btnMantProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMantProducto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnMantProducto.setPreferredSize(new java.awt.Dimension(300, 41));
        btnMantProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnMantProducto);

        btnOrden.setBackground(new java.awt.Color(255, 255, 255));
        btnOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/order.png"))); // NOI18N
        btnOrden.setText("Crear Orden");
        btnOrden.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnOrden.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnOrden.setPreferredSize(new java.awt.Dimension(300, 41));
        btnOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenActionPerformed(evt);
            }
        });
        jPanel1.add(btnOrden);

        btnCalificarOrden.setBackground(new java.awt.Color(255, 255, 255));
        btnCalificarOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/rating.png"))); // NOI18N
        btnCalificarOrden.setText("Calificar Orden");
        btnCalificarOrden.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCalificarOrden.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCalificarOrden.setPreferredSize(new java.awt.Dimension(300, 41));
        btnCalificarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalificarOrdenActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalificarOrden);

        btnUsuariosBloqueados.setBackground(new java.awt.Color(255, 255, 255));
        btnUsuariosBloqueados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user-block.png"))); // NOI18N
        btnUsuariosBloqueados.setText("Usuarios Bloqueados");
        btnUsuariosBloqueados.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUsuariosBloqueados.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnUsuariosBloqueados.setPreferredSize(new java.awt.Dimension(300, 41));
        btnUsuariosBloqueados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosBloqueadosActionPerformed(evt);
            }
        });
        jPanel1.add(btnUsuariosBloqueados);

        btnReportes.setBackground(new java.awt.Color(255, 255, 255));
        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/report.png"))); // NOI18N
        btnReportes.setText("Reportes");
        btnReportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReportes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnReportes.setPreferredSize(new java.awt.Dimension(300, 41));
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        jPanel1.add(btnReportes);

        btnCerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/log-out.png"))); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCerrarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCerrarSesion.setPreferredSize(new java.awt.Dimension(300, 41));
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrarSesion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMantRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantRestauranteActionPerformed
        frmMantRestaurante ventana = new frmMantRestaurante(user);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMantRestauranteActionPerformed

    private void btnMantProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantProductoActionPerformed
        frmMantProducto ventana = new frmMantProducto(user);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMantProductoActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        frmInicio ventana = new frmInicio();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnUsuariosBloqueadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosBloqueadosActionPerformed
        ArrayList<Usuario> lstUsuarios = new UsuarioD().ConsultaUsuarios("", "", 3);
        if (lstUsuarios == null || lstUsuarios.size() == 0) {
            JOptionPane.showMessageDialog(this, "No hay usuarios desactivados");
            return;
        }
        frmReactivarUsuarios ventana = new frmReactivarUsuarios(user);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnUsuariosBloqueadosActionPerformed

    private void btnOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenActionPerformed
        frmTipoRestaurante ventana = new frmTipoRestaurante(user);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnOrdenActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        frmReportes ventana = new frmReportes(user);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnCalificarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalificarOrdenActionPerformed
        frmCalificarOrdenes ventana = new frmCalificarOrdenes(user);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCalificarOrdenActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalificarOrden;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnMantProducto;
    private javax.swing.JButton btnMantRestaurante;
    private javax.swing.JButton btnOrden;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnUsuariosBloqueados;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblImagenUser;
    private javax.swing.JLabel lblPerfil;
    // End of variables declaration//GEN-END:variables
}
