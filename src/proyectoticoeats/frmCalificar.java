package proyectoticoeats;

import capaDatos.OrdenD;
import capaLogica.Usuario;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco Arce Chavarria <danielarcesoftware@gmail.com>
 */
public class frmCalificar extends javax.swing.JFrame {

    Usuario user = new Usuario();
    String numero_orden = "";
    Boolean es_calificacion_seleccionada = false;
    Integer calificacion_seleccionada = 0;
    Boolean pantallaCalificacion = false;

    public frmCalificar(Usuario user, String num_orden, Boolean pantallaCalificacion) {
        initComponents();
        getContentPane().requestFocus();
        this.user = user;
        this.numero_orden = num_orden;
        this.pantallaCalificacion = pantallaCalificacion;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEstrella1 = new javax.swing.JButton();
        btnEstrella2 = new javax.swing.JButton();
        btnEstrella3 = new javax.swing.JButton();
        btnEstrella4 = new javax.swing.JButton();
        btnEstrella5 = new javax.swing.JButton();
        btnCalificar = new javax.swing.JButton();
        btnOmitir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calificar Orden");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(20, 183, 110));

        btnEstrella1.setBackground(new java.awt.Color(255, 255, 255));
        btnEstrella1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/star_empty.png"))); // NOI18N
        btnEstrella1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEstrella1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEstrellaMouseExited(evt);
            }
        });
        btnEstrella1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstrella1ActionPerformed(evt);
            }
        });

        btnEstrella2.setBackground(new java.awt.Color(255, 255, 255));
        btnEstrella2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/star_empty.png"))); // NOI18N
        btnEstrella2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEstrella2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEstrellaMouseExited(evt);
            }
        });
        btnEstrella2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstrella2ActionPerformed(evt);
            }
        });

        btnEstrella3.setBackground(new java.awt.Color(255, 255, 255));
        btnEstrella3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/star_empty.png"))); // NOI18N
        btnEstrella3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEstrella3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEstrellaMouseExited(evt);
            }
        });
        btnEstrella3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstrella3ActionPerformed(evt);
            }
        });

        btnEstrella4.setBackground(new java.awt.Color(255, 255, 255));
        btnEstrella4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/star_empty.png"))); // NOI18N
        btnEstrella4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEstrella4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEstrellaMouseExited(evt);
            }
        });
        btnEstrella4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstrella4ActionPerformed(evt);
            }
        });

        btnEstrella5.setBackground(new java.awt.Color(255, 255, 255));
        btnEstrella5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/star_empty.png"))); // NOI18N
        btnEstrella5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEstrella5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEstrellaMouseExited(evt);
            }
        });
        btnEstrella5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstrella5ActionPerformed(evt);
            }
        });

        btnCalificar.setText("Calificar");
        btnCalificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalificarActionPerformed(evt);
            }
        });

        btnOmitir.setText("Omitir");
        btnOmitir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOmitirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEstrella1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEstrella2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEstrella3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEstrella4, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(btnOmitir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCalificar, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(btnEstrella5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEstrella5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnEstrella3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                        .addComponent(btnEstrella2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEstrella1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEstrella4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalificar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOmitir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnEstrella1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstrella1MouseEntered
        mostrarEstrellas(1);
    }//GEN-LAST:event_btnEstrella1MouseEntered

    private void btnEstrella2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstrella2MouseEntered
        mostrarEstrellas(2);
    }//GEN-LAST:event_btnEstrella2MouseEntered

    private void btnEstrella3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstrella3MouseEntered
        mostrarEstrellas(3);
    }//GEN-LAST:event_btnEstrella3MouseEntered

    private void btnEstrella4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstrella4MouseEntered
        mostrarEstrellas(4);
    }//GEN-LAST:event_btnEstrella4MouseEntered

    private void btnEstrella5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstrella5MouseEntered
        mostrarEstrellas(5);
    }//GEN-LAST:event_btnEstrella5MouseEntered

    private void btnEstrellaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstrellaMouseExited
        if (!es_calificacion_seleccionada) {
            mostrarEstrellas(0);
        } else {
            mostrarEstrellas(calificacion_seleccionada);
        }
    }//GEN-LAST:event_btnEstrellaMouseExited

    private void btnEstrella1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstrella1ActionPerformed
        es_calificacion_seleccionada = true;
        calificacion_seleccionada = 1;
    }//GEN-LAST:event_btnEstrella1ActionPerformed

    private void btnEstrella2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstrella2ActionPerformed
        es_calificacion_seleccionada = true;
        calificacion_seleccionada = 2;
    }//GEN-LAST:event_btnEstrella2ActionPerformed

    private void btnEstrella3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstrella3ActionPerformed
        es_calificacion_seleccionada = true;
        calificacion_seleccionada = 3;
    }//GEN-LAST:event_btnEstrella3ActionPerformed

    private void btnEstrella4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstrella4ActionPerformed
        es_calificacion_seleccionada = true;
        calificacion_seleccionada = 4;
    }//GEN-LAST:event_btnEstrella4ActionPerformed

    private void btnEstrella5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstrella5ActionPerformed
        es_calificacion_seleccionada = true;
        calificacion_seleccionada = 5;
    }//GEN-LAST:event_btnEstrella5ActionPerformed

    private void btnOmitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOmitirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnOmitirActionPerformed

    private void btnCalificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalificarActionPerformed
        if (calificacion_seleccionada == 0) {
            JOptionPane.showMessageDialog(this, "Presione una estrella para calificar la orden");
        }
        new OrdenD().CalificarOrden(numero_orden, calificacion_seleccionada);
        JOptionPane.showMessageDialog(this, "Gracias por la calificaci??n");
        this.dispose();
    }//GEN-LAST:event_btnCalificarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        if (pantallaCalificacion) {
            frmCalificarOrdenes ventana = new frmCalificarOrdenes(user);
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);
        } else {
            frmMenu ventana = new frmMenu(user);
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_formWindowClosed

    //Asigna la cantidad de estrellas a mostrar para hacer un efecto llamativo a la hora del hover o preisonar 
    private void mostrarEstrellas(Integer estrella) {
        if (estrella > 0) {
            btnEstrella1.setIcon(new ImageIcon(getClass().getResource("/assets/star.png")));
        } else {
            btnEstrella1.setIcon(new ImageIcon(getClass().getResource("/assets/star_empty.png")));
        }
        if (estrella > 1) {
            btnEstrella2.setIcon(new ImageIcon(getClass().getResource("/assets/star.png")));
        } else {
            btnEstrella2.setIcon(new ImageIcon(getClass().getResource("/assets/star_empty.png")));
        }
        if (estrella > 2) {
            btnEstrella3.setIcon(new ImageIcon(getClass().getResource("/assets/star.png")));
        } else {
            btnEstrella3.setIcon(new ImageIcon(getClass().getResource("/assets/star_empty.png")));
        }
        if (estrella > 3) {
            btnEstrella4.setIcon(new ImageIcon(getClass().getResource("/assets/star.png")));
        } else {
            btnEstrella4.setIcon(new ImageIcon(getClass().getResource("/assets/star_empty.png")));
        }
        if (estrella > 4) {
            btnEstrella5.setIcon(new ImageIcon(getClass().getResource("/assets/star.png")));
        } else {
            btnEstrella5.setIcon(new ImageIcon(getClass().getResource("/assets/star_empty.png")));
        }
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
            java.util.logging.Logger.getLogger(frmCalificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCalificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCalificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCalificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCalificar(null, null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalificar;
    private javax.swing.JButton btnEstrella1;
    private javax.swing.JButton btnEstrella2;
    private javax.swing.JButton btnEstrella3;
    private javax.swing.JButton btnEstrella4;
    private javax.swing.JButton btnEstrella5;
    private javax.swing.JButton btnOmitir;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
