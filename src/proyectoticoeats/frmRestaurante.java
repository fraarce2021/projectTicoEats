package proyectoticoeats;

import capaDatos.RestauranteD;
import capaLogica.Restaurante;
import capaLogica.Usuario;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Francisco Arce Chavarria <danielarcesoftware@gmail.com>
 */
public class frmRestaurante extends javax.swing.JFrame {

    Usuario user = new Usuario();
    Boolean regresar_menu;
    String tipo_comida;
    Boolean carrito_comrpa = false;
    DefaultTableModel tblModelProducto = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            //all cells false
            return false;
        }
    };

    public frmRestaurante(Usuario user, String tipo_comida) {
        initComponents();
        this.user = user;
        this.tipo_comida = tipo_comida;
        getContentPane().requestFocus();
        cargarRestaurantes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblMensaje = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRestaurante = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnRegresarTipoComida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Restaurante");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(20, 183, 110));

        lblMensaje.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMensaje.setText("Seleccione un restaurante para ingresar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMensaje)
                .addContainerGap())
        );

        tblRestaurante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Restaurante", "Calificación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRestaurante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRestauranteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRestaurante);

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

        btnRegresarTipoComida.setBackground(new java.awt.Color(255, 255, 255));
        btnRegresarTipoComida.setForeground(new java.awt.Color(0, 153, 51));
        btnRegresarTipoComida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit.png"))); // NOI18N
        btnRegresarTipoComida.setText("Cambiar Tipo Comida");
        btnRegresarTipoComida.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegresarTipoComida.setIconTextGap(3);
        btnRegresarTipoComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarTipoComidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresarTipoComida, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnRegresarTipoComida))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblRestauranteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRestauranteMouseClicked
        int row = tblRestaurante.getSelectedRow();
        String restaurante = tblRestaurante.getModel().getValueAt(row, 0).toString();
        abrirCarritoCompras(restaurante);
    }//GEN-LAST:event_tblRestauranteMouseClicked

    private void btnRegresarTipoComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarTipoComidaActionPerformed
        regresar_menu = false;
        this.dispose();
    }//GEN-LAST:event_btnRegresarTipoComidaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        if (!carrito_comrpa) {
            if (regresar_menu) {
                frmMenu ventana = new frmMenu(user);
                ventana.setVisible(true);
                ventana.setLocationRelativeTo(null);
            } else {
                frmTipoRestaurante ventana = new frmTipoRestaurante(user);
                ventana.setVisible(true);
                ventana.setLocationRelativeTo(null);
            }
        }
    }//GEN-LAST:event_formWindowClosed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        regresar_menu = true;
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed
    private void abrirCarritoCompras(String restaurante) {
        carrito_comrpa = true;
        frmOrden ventana = new frmOrden(user, tipo_comida, restaurante);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        this.dispose();
    }

    private void cargarRestaurantes() {

        tblModelProducto.addColumn("RESTAURANTE");
        tblModelProducto.addColumn("CALIFICACIÓN");

        tblModelProducto.setRowCount(0);
        ArrayList<Restaurante> lstRestaurantes = new RestauranteD().ConsultaRestaurantes(3, "", "");
        if (lstRestaurantes != null) {
            for (Restaurante objRestaurante : lstRestaurantes) {
                if (objRestaurante.getTIPO_COMIDA().name().equals(tipo_comida)) {
                    String[] fila = {objRestaurante.getNOMBRE(), objRestaurante.getCALIFICACION().equals("0") ? "Sin Calificar" : objRestaurante.getCALIFICACION() +"★" };
                    tblModelProducto.addRow(fila);
                }
            }
        }
        tblRestaurante.setModel(tblModelProducto);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRestaurante(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresarTipoComida;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JTable tblRestaurante;
    // End of variables declaration//GEN-END:variables
}
