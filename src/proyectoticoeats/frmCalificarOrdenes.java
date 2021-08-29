package proyectoticoeats;

import capaDatos.OrdenD;
import capaLogica.Orden;
import capaLogica.Usuario;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Francisco Arce Chavarria <danielarcesoftware@gmail.com>
 */
public class frmCalificarOrdenes extends javax.swing.JFrame {

    Usuario user = new Usuario();
    Boolean calificar = false;
    DefaultTableModel tblModelOrden = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            //all cells false
            return false;
        }
    };

    public frmCalificarOrdenes(Usuario user) {
        initComponents();
        getContentPane().requestFocus();
        this.user = user;
        cargarDatos();
    }

    //Cracion del modelo con sus respectivas columnas
    private void crearModelo() {
        tblModelOrden.addColumn("ORDEN");
        tblModelOrden.addColumn("TOTAL PAGADO");
        tblModelOrden.addColumn("RESTAURANTE");
        tblModelOrden.addColumn("FECHA CREACION");
        tblModelOrden.addColumn("CALIFICACION");
    }

    private void cargarDatos() {
        crearModelo();
        obtenerOrdenes();
    }

    //Obtiene las ordenes del respectivo usuario
    private void obtenerOrdenes() {
        tblModelOrden.setRowCount(0);
        ArrayList<Orden> lstOrdenes = new OrdenD().ConsultaOrdenesUsuario(3, "", user.CORREO_ELECTRONICO);
        if (lstOrdenes != null) {
            for (Orden itemOrden : lstOrdenes) {
                String[] fila = {Integer.toString(itemOrden.getPK_ORDEN()), Double.toString(itemOrden.getPRECIO_TOTAL()), itemOrden.getRESTAURANTE(), itemOrden.getFECHA_CREACION(), Integer.toString(itemOrden.getCALIFICACION()) + "★"};
                tblModelOrden.addRow(fila);
            }
        }
        tblOrden.setModel(tblModelOrden);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblMensaje = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrden = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ordenes Usuario");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(20, 183, 110));

        lblMensaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setText("Seleccione una orden para modificar calificacion");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMensaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

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

        tblOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrdenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOrden);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
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

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        if (!calificar) {
            frmMenu ventana = new frmMenu(user);
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_formWindowClosed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void tblOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrdenMouseClicked
        int row = tblOrden.getSelectedRow();
        String num_orden = tblOrden.getModel().getValueAt(row, 0).toString();
        
        frmCalificar ventana = new frmCalificar(this.user, num_orden, true);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        
        calificar = true;
        this.dispose();
    }//GEN-LAST:event_tblOrdenMouseClicked

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
            java.util.logging.Logger.getLogger(frmCalificarOrdenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCalificarOrdenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCalificarOrdenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCalificarOrdenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCalificarOrdenes(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JTable tblOrden;
    // End of variables declaration//GEN-END:variables
}
