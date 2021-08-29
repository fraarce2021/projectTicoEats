package proyectoticoeats;

import capaDatos.ProductoD;
import capaDatos.RestauranteD;
import capaLogica.Producto;
import capaLogica.Restaurante;
import capaLogica.TipoProducto;
import capaLogica.TipoUsuario;
import capaLogica.Usuario;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Francisco Arce Chavarria <danielarcesoftware@gmail.com>
 */
public class frmMantProducto extends javax.swing.JFrame {

    Usuario user = new Usuario();

    DefaultTableModel tblModelProducto = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            //all cells false
            return false;
        }
    };

    public frmMantProducto(Usuario user) {
        initComponents();
        getContentPane().requestFocus();
        this.user = user;
        cargarDatos();
        limpiarDatos(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdbGroupTipoProducto = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnModificar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtDescripcion = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtPkCodigo = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        rdbPreparado = new javax.swing.JRadioButton();
        lblCodigo1 = new javax.swing.JLabel();
        rdbEmpacado = new javax.swing.JRadioButton();
        lblPreparacion = new javax.swing.JLabel();
        txtTiempoPreparacion = new javax.swing.JTextField();
        txtCantidadBodega = new javax.swing.JTextField();
        lblCantidadBodega = new javax.swing.JLabel();
        txtPorcentajeIVA = new javax.swing.JTextField();
        lblPorcentajeIVA = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblImagenUser = new javax.swing.JLabel();
        lblPerfil = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblRestaurante = new javax.swing.JLabel();
        cboRestaurante = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mantenimiento Producto");
        setMinimumSize(new java.awt.Dimension(664, 480));
        setPreferredSize(new java.awt.Dimension(664, 480));
        setResizable(false);
        setSize(new java.awt.Dimension(664, 480));
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

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductos);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Información Producto"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 47, 265, -1));

        lblNombre.setText("Descripción Producto");
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 27, -1, -1));

        lblPrecio.setText("Precio");
        jPanel2.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 78, -1, -1));

        lblCodigo.setText("Código Producto");
        jPanel2.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 27, -1, -1));

        txtCodigo.setToolTipText("");
        jPanel2.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 47, 106, -1));

        txtPkCodigo.setEnabled(false);
        jPanel2.add(txtPkCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 47, 23, -1));

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        jPanel2.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 98, 135, -1));

        rdbGroupTipoProducto.add(rdbPreparado);
        rdbPreparado.setText("Preparado");
        rdbPreparado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdbPreparadoMouseClicked(evt);
            }
        });
        jPanel2.add(rdbPreparado, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 44, -1, -1));

        lblCodigo1.setText("Tipo Producto");
        jPanel2.add(lblCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 28, -1, -1));

        rdbGroupTipoProducto.add(rdbEmpacado);
        rdbEmpacado.setText("Empacado");
        rdbEmpacado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdbEmpacadoMouseClicked(evt);
            }
        });
        jPanel2.add(rdbEmpacado, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 44, -1, -1));

        lblPreparacion.setText("Tiempo Preparacion(minutos)");
        jPanel2.add(lblPreparacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 78, -1, -1));
        jPanel2.add(txtTiempoPreparacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 98, 85, -1));

        txtCantidadBodega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadBodegaKeyTyped(evt);
            }
        });
        jPanel2.add(txtCantidadBodega, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 98, 80, -1));

        lblCantidadBodega.setText("Cantidad Bodega");
        jPanel2.add(lblCantidadBodega, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 78, -1, -1));
        jPanel2.add(txtPorcentajeIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 98, 80, -1));

        lblPorcentajeIVA.setText("Porcentaje IVA");
        jPanel2.add(lblPorcentajeIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 78, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagenUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user.png"))); // NOI18N
        jPanel3.add(lblImagenUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, -1));

        lblPerfil.setText("Daniel Arce Chavarria / ADMINISTRADOR");
        lblPerfil.setToolTipText("");
        jPanel3.add(lblPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 13, 330, 10));

        lblRestaurante.setText("Restaurante");
        lblRestaurante.setAlignmentY(0.0F);

        cboRestaurante.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboRestauranteItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRestaurante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblRestaurante, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addComponent(cboRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
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

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            Producto objProducto = new Producto(txtPkCodigo.getText()+txtCodigo.getText(), txtDescripcion.getText(), Double.parseDouble(txtPrecio.getText()),"",rdbEmpacado.isSelected() ? TipoProducto.Empacados: TipoProducto.Preparados,rdbEmpacado.isSelected() ? Integer.parseInt(txtCantidadBodega.getText()): 0,rdbEmpacado.isSelected() ? Integer.parseInt(txtPorcentajeIVA.getText()): 0,rdbEmpacado.isSelected() ? 0: Integer.parseInt(txtTiempoPreparacion.getText()));
            new ProductoD().MantenimientoProducto(1, objProducto, user.getNOMBRE());
            limpiarDatos(false);
            cargarProductos(cboRestaurante.getSelectedItem().toString());
            JOptionPane.showMessageDialog(this, "Se modifico el producto correctamente");
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            Producto objProducto = new Producto(txtPkCodigo.getText()+txtCodigo.getText(), "", 0,"",rdbEmpacado.isSelected() ? TipoProducto.Empacados: TipoProducto.Preparados,0,0,0);
            new ProductoD().MantenimientoProducto(2, objProducto, user.getNOMBRE());
            limpiarDatos(false);
            cargarProductos(cboRestaurante.getSelectedItem().toString());
            JOptionPane.showMessageDialog(this, "Se elimino el producto correctamente");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarDatos(false);
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
                Producto objProducto = new Producto(txtPkCodigo.getText()+txtCodigo.getText(), txtDescripcion.getText(), Double.parseDouble(txtPrecio.getText()),cboRestaurante.getSelectedItem().toString(),rdbEmpacado.isSelected() ? TipoProducto.Empacados: TipoProducto.Preparados,rdbEmpacado.isSelected() ? Integer.parseInt(txtCantidadBodega.getText()): 0,rdbEmpacado.isSelected() ? Integer.parseInt(txtPorcentajeIVA.getText()): 0,rdbEmpacado.isSelected() ? 0: Integer.parseInt(txtTiempoPreparacion.getText()));
                new ProductoD().MantenimientoProducto(0, objProducto, user.getNOMBRE());
                limpiarDatos(false);
                cargarProductos(cboRestaurante.getSelectedItem().toString());
                JOptionPane.showMessageDialog(this, "Se creo correctamente el producto");
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
        try {
            limpiarDatos(true);
            int row = tblProductos.getSelectedRow();
            String codigo = tblProductos.getModel().getValueAt(row, 0).toString();
            txtCodigo.setText(codigo.split("-")[1]);
            Producto objProducto = new Producto();
            objProducto = new ProductoD().ExisteProducto(codigo);
            if (objProducto != null) {
                txtDescripcion.setText(objProducto.getDESCRIPCION());
                txtPrecio.setText(Double.toString(objProducto.getPRECIO()));
                if (objProducto.getTIPO_PRODUCTO() == TipoProducto.Empacados) {
                    rdbEmpacado.setSelected(true);
                    txtCantidadBodega.setText(Integer.toString(objProducto.getCANTIDAD_DISPONIBLE()));
                    txtPorcentajeIVA.setText(Integer.toString(objProducto.getIMPUESTO()));
                }else{
                    rdbPreparado.setSelected(true);
                    txtTiempoPreparacion.setText(Integer.toString(objProducto.getTIEMPO_MINIMO_PREPARADO()));
                }  
                validarTipoProducto();
            }

            habilitarFormulario(true);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_tblProductosMouseClicked

    private void rdbPreparadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbPreparadoMouseClicked
        validarTipoProducto();
    }//GEN-LAST:event_rdbPreparadoMouseClicked

    private void rdbEmpacadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbEmpacadoMouseClicked
        validarTipoProducto();
    }//GEN-LAST:event_rdbEmpacadoMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        frmMenu ventana = new frmMenu(user);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowClosed

    private void cboRestauranteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboRestauranteItemStateChanged
        ArrayList<Restaurante> lstRestaurante = new RestauranteD().ConsultaRestaurantes(2, "", evt.getItem().toString());
        txtPkCodigo.setText(lstRestaurante.get(0).getPK_RESTAURANTE() + "-");
        cargarProductos(lstRestaurante.get(0).getNOMBRE());
        limpiarDatos(false);
    }//GEN-LAST:event_cboRestauranteItemStateChanged

    private void txtCantidadBodegaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadBodegaKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadBodegaKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        char c=evt.getKeyChar();
        if((Character.isDigit(c))||(c==KeyEvent.VK_PERIOD)||(c==KeyEvent.VK_BACK_SPACE)){
            int punto=0;
            if(c==KeyEvent.VK_PERIOD){ 
                        String s=txtPrecio.getText();
                        int dot=s.indexOf('.');
                        punto=dot;
                        if(dot!=-1){
                            getToolkit().beep();
                            evt.consume();
                        }
                    }
        }
        else{    
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped
    private void cargarDatos() {
        crearModelo();
        cargarRestaurantes();
        cargarDatosUsuario();
        validarTipoProducto();
    }

    private void cargarDatosUsuario() {
        lblPerfil.setText(user.getNOMBRE() + " / " + user.TIPO_USUARIO.toString().toUpperCase());
    }

    private void crearModelo() {
        tblModelProducto.addColumn("CÓDIGO");
        tblModelProducto.addColumn("DESCRIPCIÓN");
        tblModelProducto.addColumn("TIPO PRODUCTO");
        cargarProductos("");
    }

    private void cargarProductos(String restaurante) {
        tblModelProducto.setRowCount(0);
        ArrayList<Producto> lstProductos = new ProductoD().ConsultaProductos(restaurante.equals("") ? 0 : 2, "", restaurante);
        if (lstProductos != null) {
            for (Producto objProducto : lstProductos) {
                String[] fila = {objProducto.getCODIGO(), objProducto.getDESCRIPCION(), objProducto.getTIPO_PRODUCTO().toString()};
                tblModelProducto.addRow(fila);
            }
        }
        tblProductos.setModel(tblModelProducto);
    }

    private void cargarRestaurantes() {
        if (user.getTIPO_USUARIO() == TipoUsuario.Administrador) {
            ArrayList<Restaurante> lstRestaurante = new RestauranteD().ConsultaRestaurantes(0, "", "");
            for (Restaurante restaurante : lstRestaurante) {
                cboRestaurante.addItem(restaurante.getNOMBRE());
            }
        } else {
            ArrayList<Restaurante> lstRestaurante = new RestauranteD().ConsultaRestaurantes(0, "", "");
            for (Restaurante restaurante : lstRestaurante) {
                if (restaurante.getUSUARIO_GERENTE().equals(user.getNOMBRE())) {
                    cboRestaurante.addItem(restaurante.getNOMBRE());
                }
            }
        }
        cboRestaurante.setSelectedIndex(0);
    }

    private void limpiarDatos(Boolean esSeleccionadoDeTabla) {
        txtCodigo.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
        txtCantidadBodega.setText("");
        txtPorcentajeIVA.setText("");
        txtTiempoPreparacion.setText("");
        txtCodigo.setEnabled(false);
        txtDescripcion.setEnabled(false);
        txtPrecio.setEnabled(false);
        txtPorcentajeIVA.setEnabled(false);
        txtPorcentajeIVA.setEnabled(false);
        txtTiempoPreparacion.setEnabled(false);
        btnGuardar.setText("Nuevo");
        btnGuardar.setIcon(new ImageIcon(getClass().getResource("/assets/new.png")));
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
        if (!esSeleccionadoDeTabla) {
            tblProductos.clearSelection();
        } else {
            btnModificar.setEnabled(true);
        }
    }

    private Boolean validarDatos() {
        if (!isNotNullNotEmpty(txtCodigo.getText())) {
            JOptionPane.showMessageDialog(this, "Ingrese el nombre");
            txtCodigo.requestFocus();
            return false;
        }
        Producto objProducto = new Producto();
        objProducto = new ProductoD().ExisteProducto(txtPkCodigo.getText() + txtCodigo.getText());
        if (objProducto != null) {
            JOptionPane.showMessageDialog(this, "El código del producto ya se encuentra en uso");
            txtCodigo.requestFocus();
            return false;
        }
        return true;
    }

    private void habilitarFormulario(boolean modifica) {
        if (!modifica) {
            txtCodigo.setEnabled(true);
            txtCodigo.requestFocus();
        } else {
            btnEliminar.setEnabled(true);
        }
        txtDescripcion.setEnabled(true);
        txtPrecio.setEnabled(true);
        txtCantidadBodega.setEnabled(true);
        txtPorcentajeIVA.setEnabled(true);
        txtTiempoPreparacion.setEnabled(true);
    }

    private void validarTipoProducto() {
        boolean respEmpacado, respPreparado;

        respEmpacado = rdbEmpacado.isSelected();
        respPreparado = rdbPreparado.isSelected();

        lblCantidadBodega.setVisible(respEmpacado);
        txtCantidadBodega.setVisible(respEmpacado);
        lblPorcentajeIVA.setVisible(respEmpacado);
        txtPorcentajeIVA.setVisible(respEmpacado);
        lblPreparacion.setVisible(respPreparado);
        txtTiempoPreparacion.setVisible(respPreparado);
    }

    public static boolean isNotNullNotEmpty(
            final String string) {
        return string != null && !string.isEmpty() && !string.trim().isEmpty();
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
            java.util.logging.Logger.getLogger(frmMantProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMantProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMantProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMantProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMantProducto(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboRestaurante;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidadBodega;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigo1;
    private javax.swing.JLabel lblImagenUser;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblPorcentajeIVA;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblPreparacion;
    private javax.swing.JLabel lblRestaurante;
    private javax.swing.JRadioButton rdbEmpacado;
    private javax.swing.ButtonGroup rdbGroupTipoProducto;
    private javax.swing.JRadioButton rdbPreparado;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtCantidadBodega;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtPkCodigo;
    private javax.swing.JTextField txtPorcentajeIVA;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTiempoPreparacion;
    // End of variables declaration//GEN-END:variables
}
