package proyectoticoeats;

import capaDatos.RestauranteD;
import capaDatos.UsuarioD;
import capaLogica.Restaurante;
import capaLogica.TipoComida;
import capaLogica.TipoUsuario;
import capaLogica.Usuario;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Francisco Arce Chavarria <danielarcesoftware@gmail.com>
 */
public class frmMantRestaurante extends javax.swing.JFrame {

    Usuario user = new Usuario();

    DefaultTableModel tblModelRestaurante = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            //all cells false
            return false;
        }
    };

    public frmMantRestaurante(Usuario user) {
        initComponents();
        getContentPane().requestFocus();
        this.user = user;
        cargarDatos();
        limpiarDatos(false);
        btnEliminar.setVisible(false);
        btnModificar.setVisible(false);
    }

    private void cargarDatos() {
        crearModelo();
        cargarTipoComida();
        cargarUsuarios();
        cargarDatosUsuario();
    }
    private void cargarDatosUsuario(){
        lblPerfil.setText(user.getNOMBRE() + " / " + user.TIPO_USUARIO.toString().toUpperCase());
    }
    private void crearModelo() {
        tblModelRestaurante.addColumn("NOMBRE");
        tblModelRestaurante.addColumn("LOCALIZACIÓN");
        tblModelRestaurante.addColumn("TIPO COMIDA");
        tblModelRestaurante.addColumn("GERENTE");
        cargarRestaurantes();
    }

    private void cargarRestaurantes() {
        tblModelRestaurante.setRowCount(0);
        ArrayList<Restaurante> lstRestaurantes = new RestauranteD().ConsultaRestaurantes(0, "", "");
        if (lstRestaurantes != null) {
            for (Restaurante objRestaurante : lstRestaurantes) {
                String[] fila = {objRestaurante.getNOMBRE(), objRestaurante.getLOCALIZACION(), objRestaurante.getTIPO_COMIDA().toString(), objRestaurante.getUSUARIO_GERENTE()};
                tblModelRestaurante.addRow(fila);
            }
        }
        tblRestaurantes.setModel(tblModelRestaurante);
    }

    private void cargarTipoComida() {
        for (TipoComida pais : TipoComida.values()) {
            cboTipoRestaurante.addItem(pais.name());
        }
        cboTipoRestaurante.setSelectedIndex(-1);
    }

    private void cargarUsuarios() {
        if (user.getTIPO_USUARIO() == TipoUsuario.Administrador) {
            ArrayList<Usuario> lstUsuario = new UsuarioD().ConsultaUsuarios("", "", 4);
            for (Usuario usuario : lstUsuario) {
                cboUsuarioGerente.addItem(usuario.getNOMBRE());
            }
            cboUsuarioGerente.setSelectedIndex(-1);
        } else {
            cboUsuarioGerente.addItem(user.getNOMBRE());
            cboUsuarioGerente.setSelectedIndex(0);
        }
    }

    private void limpiarDatos(Boolean esSeleccionadoDeTabla) {
        txtNombre.setText("");
        txtAreaLocalizacion.setText("");
        cboTipoRestaurante.setSelectedIndex(-1);
        if (user.TIPO_USUARIO == TipoUsuario.Administrador) {
            cboUsuarioGerente.setSelectedIndex(-1);
        }
        txtNombre.setEnabled(false);
        txtAreaLocalizacion.setEnabled(false);
        cboTipoRestaurante.setEnabled(false);
        cboUsuarioGerente.setEnabled(false);
        btnGuardar.setText("Nuevo");
        btnGuardar.setIcon(new ImageIcon(getClass().getResource("/assets/new.png")));
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
        if (!esSeleccionadoDeTabla) {
            tblRestaurantes.clearSelection();
        } else {
            btnModificar.setEnabled(true);
        }
    }

    private void habilitarFormulario(Boolean modifica) {
        if (!modifica) {
            txtNombre.setEnabled(true);
            txtNombre.requestFocus();
        } else {
            btnEliminar.setEnabled(true);
        }
        txtAreaLocalizacion.setEnabled(true);
        cboTipoRestaurante.setEnabled(true);
        cboUsuarioGerente.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnModificar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRestaurantes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cboTipoRestaurante = new javax.swing.JComboBox<>();
        lblUsuario = new javax.swing.JLabel();
        cboUsuarioGerente = new javax.swing.JComboBox<>();
        lblLocalizacion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaLocalizacion = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        lblImagenUser = new javax.swing.JLabel();
        lblPerfil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mantenimiento Restaurantes");
        setAutoRequestFocus(false);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(20, 183, 110));

        btnModificar.setBackground(new java.awt.Color(255, 255, 255));
        btnModificar.setForeground(new java.awt.Color(0, 153, 51));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnModificar.setIconTextGap(3);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setForeground(new java.awt.Color(0, 153, 51));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/exit.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalir.setIconTextGap(3);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setForeground(new java.awt.Color(0, 153, 51));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminar.setIconTextGap(3);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setForeground(new java.awt.Color(0, 153, 51));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/clean.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLimpiar.setIconTextGap(3);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setForeground(new java.awt.Color(0, 153, 51));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGuardar.setIconTextGap(3);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        tblRestaurantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblRestaurantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRestaurantesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRestaurantes);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Información Restaurante"));

        lblNombre.setText("Nombre");

        jLabel1.setText("Tipo Restaurante");

        lblUsuario.setText("Usuario Gerente");

        lblLocalizacion.setText("Localización");

        txtAreaLocalizacion.setColumns(20);
        txtAreaLocalizacion.setRows(5);
        jScrollPane2.setViewportView(txtAreaLocalizacion);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLocalizacion)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNombre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboTipoRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario)
                            .addComponent(cboUsuarioGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboTipoRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboUsuarioGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLocalizacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagenUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user.png"))); // NOI18N
        jPanel3.add(lblImagenUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, -1));

        lblPerfil.setText("Daniel Arce Chavarria / ADMINISTRADOR");
        lblPerfil.setToolTipText("");
        jPanel3.add(lblPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 13, 330, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            if (btnGuardar.getText().equals("Nuevo")) {
                limpiarDatos(false);
                habilitarFormulario(false);
                btnGuardar.setText("Guardar");
                btnGuardar.setIcon(new ImageIcon(getClass().getResource("/assets/save.png")));
            } else {
                if (!validarDatos()) {
                    return;
                }
                Restaurante objRestaurante = new Restaurante(txtNombre.getText(), txtAreaLocalizacion.getText(), TipoComida.valueOf(cboTipoRestaurante.getSelectedItem().toString()), cboUsuarioGerente.getSelectedItem().toString());
                new RestauranteD().MantenimientoRestaurante(0, objRestaurante, user.getNOMBRE());
                limpiarDatos(false);
                cargarRestaurantes();
                JOptionPane.showMessageDialog(this, "Se creo correctamente el restaurante");
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tblRestaurantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRestaurantesMouseClicked
//        try {
//            limpiarDatos(true);
//            int row = tblRestaurantes.getSelectedRow();
//            txtNombre.setText(tblRestaurantes.getModel().getValueAt(row, 0).toString());
//            txtAreaLocalizacion.setText(tblRestaurantes.getModel().getValueAt(row, 1).toString());
//            cboTipoRestaurante.setSelectedItem(tblRestaurantes.getModel().getValueAt(row, 2).toString());
//            cboUsuarioGerente.setSelectedItem(tblRestaurantes.getModel().getValueAt(row, 3).toString());
//            habilitarFormulario(true);
//        } catch (Exception e) {
//
//        }
    }//GEN-LAST:event_tblRestaurantesMouseClicked
    private Boolean validarDatos() {
        if (!isNotNullNotEmpty(txtNombre.getText())) {
            JOptionPane.showMessageDialog(this, "Ingrese el nombre");
            txtNombre.requestFocus();
            return false;
        }
        Restaurante objRestaurante = new Restaurante();
        objRestaurante = new RestauranteD().ExisteRestaurante(user.getNOMBRE(), txtNombre.getText());
        if (objRestaurante != null) {
            JOptionPane.showMessageDialog(this, "El nombre del restaurante ya se encuentra en uso");
            txtNombre.requestFocus();
            return false;
        }
        return true;
    }
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarDatos(false);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        frmMenu ventana = new frmMenu(user);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowClosed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            Restaurante objRestaurante = new Restaurante(txtNombre.getText(), txtAreaLocalizacion.getText(), TipoComida.valueOf(cboTipoRestaurante.getSelectedItem().toString()), "");
            new RestauranteD().MantenimientoRestaurante(2, objRestaurante, user.getNOMBRE());
            limpiarDatos(false);
            cargarRestaurantes();
            JOptionPane.showMessageDialog(this, "Se elimino el restaurante correctamente");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            Restaurante objRestaurante = new Restaurante(txtNombre.getText(), txtAreaLocalizacion.getText(), TipoComida.valueOf(cboTipoRestaurante.getSelectedItem().toString()), cboUsuarioGerente.getSelectedItem().toString());
            new RestauranteD().MantenimientoRestaurante(1, objRestaurante, user.getNOMBRE());
            limpiarDatos(false);
            cargarRestaurantes();
            JOptionPane.showMessageDialog(this, "Se modifico el restaurante correctamente");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void MensajeErrorTecnico(int numError) {
        JOptionPane.showMessageDialog(this, "Problema tecnico consulte con soporte de aplicación.\n Error en Mantenimiento Restaurante:" + numError);
    }

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
            java.util.logging.Logger.getLogger(frmMantRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMantRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMantRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMantRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMantRestaurante(null).setVisible(true);
            }
        });
    }

    public static boolean isNotNullNotEmpty(
            final String string) {
        return string != null && !string.isEmpty() && !string.trim().isEmpty();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboTipoRestaurante;
    private javax.swing.JComboBox<String> cboUsuarioGerente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblImagenUser;
    private javax.swing.JLabel lblLocalizacion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tblRestaurantes;
    private javax.swing.JTextArea txtAreaLocalizacion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
