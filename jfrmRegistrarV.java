
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Usuario
 */
public class jfrmRegistrarV extends javax.swing.JFrame {
    private Lista lista; // Objeto para manejar los datos
    private JfrmPrincipal ventanaPrincipal; // Objeto para manejar los datos


    public jfrmRegistrarV(Lista lista) {
        initComponents();
        this.lista = lista;
        this.ventanaPrincipal = ventanaPrincipal;
        setLocationRelativeTo(null);
        jTextFieldFecha.setText("DD/MM/AAAA");

// Placeholder interactivo
jTextFieldFecha.addFocusListener(new java.awt.event.FocusAdapter() {
    @Override
    public void focusGained(java.awt.event.FocusEvent evt) {
        if (jTextFieldFecha.getText().equals("DD/MM/AAAA")) {
            jTextFieldFecha.setText("");
        }
    }

    @Override
    public void focusLost(java.awt.event.FocusEvent evt) {
        if (jTextFieldFecha.getText().isEmpty()) {
            jTextFieldFecha.setText("DD/MM/AAAA");
        }
    }
});
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonReg = new javax.swing.JButton();
        jButtonLimp = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldMarca = new javax.swing.JTextField();
        jTextFieldAño = new javax.swing.JTextField();
        jComboTipoS = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldModelo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCosto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxEstadoS = new javax.swing.JComboBox<>();
        jTextFieldFecha = new javax.swing.JTextField();

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Registrar Datos Del Vehiculo");

        jLabel2.setText("ID:");

        jLabel3.setText("Marca:");

        jLabel4.setText("Año:");

        jButtonReg.setText("Registar");
        jButtonReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegActionPerformed(evt);
            }
        });

        jButtonLimp.setText("Limpiar");
        jButtonLimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });

        jComboTipoS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Mantenimiento preventivo", "Reparación", "Diagnóstico" }));
        jComboTipoS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTipoSActionPerformed(evt);
            }
        });

        jLabel5.setText("Tipo de Servicio:");

        jLabel6.setText("Modelo:");

        jLabel7.setText("Costo:");

        jLabel8.setText("Fecha de Ingreso:");

        jLabel9.setText("Estado del Servicio:");

        jComboBoxEstadoS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "En proceso", "Completado", "Pendiente" }));

        jTextFieldFecha.setToolTipText("");
        jTextFieldFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldID)
                                    .addComponent(jTextFieldMarca)
                                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldAño, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBoxEstadoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboTipoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonReg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                        .addComponent(jButtonLimp)
                        .addGap(22, 22, 22)
                        .addComponent(salir)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboTipoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBoxEstadoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReg)
                    .addComponent(jButtonLimp)
                    .addComponent(salir))
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegActionPerformed
    if (validarCampos()) {
            try {
                // Obtener valores de los campos
                String id = jTextFieldID.getText().trim();
                String marca = jTextFieldMarca.getText().trim();
                String modelo = jTextFieldModelo.getText().trim();
                int año = Integer.parseInt(jTextFieldAño.getText().trim());
                String tipoServicio = jComboTipoS.getSelectedItem().toString();
                String fecha = jTextFieldFecha.getText().trim();
                String estadoServicio = jComboBoxEstadoS.getSelectedItem().toString();
                double costo = Double.parseDouble(jTextFieldCosto.getText().trim());
                
                // Crear objeto vehículo
                Vehiculo nuevoVehiculo = new Vehiculo(id, marca, modelo, año, tipoServicio, fecha, estadoServicio, costo);
                
                // Agregar a la lista
                boolean registrado = lista.agregarNodo(nuevoVehiculo);
                
                if (registrado) {
                    JOptionPane.showMessageDialog(this, "Vehículo registrado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    jTextFieldID.setText("");
        jTextFieldMarca.setText("");
        jTextFieldModelo.setText("");
        jTextFieldAño.setText("");
        jComboTipoS.setSelectedIndex(0);
        jTextFieldFecha.setText("");
        jComboBoxEstadoS.setSelectedIndex(0);
        jTextFieldCosto.setText("");
        jTextFieldID.requestFocus(); ;
                } else {
                    JOptionPane.showMessageDialog(this, "Error: Ya existe un vehículo con ese ID", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Error en formato de número. Verifique los campos numéricos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonRegActionPerformed

    private void jButtonLimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpActionPerformed
        jTextFieldID.setText("");
        jTextFieldMarca.setText("");
        jTextFieldModelo.setText("");
        jTextFieldAño.setText("");
        jComboTipoS.setSelectedIndex(0);
        jTextFieldFecha.setText("");
        jComboBoxEstadoS.setSelectedIndex(0);
        jTextFieldCosto.setText("");
        jTextFieldID.requestFocus(); 
    }//GEN-LAST:event_jButtonLimpActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
dispose(); // Muestra el frame principal

    }//GEN-LAST:event_salirActionPerformed

    private boolean validarCampos() {
        // Validar que los campos no estén vacíos
        if (jTextFieldID.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un ID para el vehículo", "Campo requerido", JOptionPane.WARNING_MESSAGE);
            jTextFieldID.requestFocus();
            return false;
        }
        
        if (jTextFieldMarca.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar la marca del vehículo", "Campo requerido", JOptionPane.WARNING_MESSAGE);
            jTextFieldMarca.requestFocus();
            return false;
        }
        
        if (jTextFieldModelo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el modelo del vehículo", "Campo requerido", JOptionPane.WARNING_MESSAGE);
            jTextFieldModelo.requestFocus();
            return false;
        }
        
        // Validar año
        try {
            int año = Integer.parseInt(jTextFieldAño.getText().trim());
            if (año < 1900 || año > 2100) {
                JOptionPane.showMessageDialog(this, "El año debe estar entre 1900 y 2100", "Valor inválido", JOptionPane.WARNING_MESSAGE);
                jTextFieldAño.requestFocus();
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El año debe ser un número entero", "Formato inválido", JOptionPane.WARNING_MESSAGE);
            jTextFieldAño.requestFocus();
            return false;
        }
        
        // Validar tipo de servicio
        if (jComboTipoS.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un tipo de servicio", "Campo requerido", JOptionPane.WARNING_MESSAGE);
            jComboTipoS.requestFocus();
            return false;
        }
        
        // Validar fecha
        String fecha = jTextFieldFecha.getText().trim();
        if (fecha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar la fecha de ingreso", "Campo requerido", JOptionPane.WARNING_MESSAGE);
            jTextFieldFecha.requestFocus();
            return false;
        }
        
        // Validar formato de fecha (simple)
        
        
        
        // Validar estado del servicio
        if (jComboBoxEstadoS.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un estado para el servicio", "Campo requerido", JOptionPane.WARNING_MESSAGE);
            jComboBoxEstadoS.requestFocus();
            return false;
        }
        
        // Validar costo
        try {
            double costo = Double.parseDouble(jTextFieldCosto.getText().trim());
            if (costo < 0) {
                JOptionPane.showMessageDialog(this, "El costo no puede ser negativo", "Valor inválido", JOptionPane.WARNING_MESSAGE);
                jTextFieldCosto.requestFocus();
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El costo debe ser un número válido", "Formato inválido", JOptionPane.WARNING_MESSAGE);
            jTextFieldCosto.requestFocus();
            return false;
        }
        
        return true;
        
    }
    
    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDActionPerformed

    private void jComboTipoSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTipoSActionPerformed
    
    

            // TODO add your handling code here:
    }//GEN-LAST:event_jComboTipoSActionPerformed

    private void jTextFieldFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFechaActionPerformed

    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLimp;
    private javax.swing.JButton jButtonReg;
    private javax.swing.JComboBox<String> jComboBoxEstadoS;
    private javax.swing.JComboBox<String> jComboTipoS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAño;
    private javax.swing.JTextField jTextFieldCosto;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldModelo;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
