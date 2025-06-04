
/**
 *
 * @author Usuario
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;

public class JfrmPrincipal extends javax.swing.JFrame {
    private Lista lista; // Objeto para gestionar los vehículos
    private DefaultTableModel tableModel;

    /**
     * Creates new form JfrmPrincipal
     */
    public JfrmPrincipal() {
        initComponents();
        lista = new Lista();
        initTableModel();
    }

    private void initTableModel() {
        tableModel = new DefaultTableModel(
        new String[]{"ID", "Marca", "Modelo", "Año", "Tipo de Servicio", "Fecha de Ingreso", "Estado", "Costo"}, 0
    );
    jTable1.setModel(tableModel);
    }

    private void actualizarTabla() {
    tableModel.setRowCount(0);
        for (Vehiculo v : lista.obtenerVehiculos()) {
            tableModel.addRow(new Object[]{
                v.getIdVehiculo(),
                v.getMarca(),
                v.getModelo(),
                v.getAñoFabricacion(),
                v.getTipoServicio(),
                v.getFechaIngreso(),
                v.getEstadoServicio(),
                v.getCostoServicio()
            });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonOrdenarF = new javax.swing.JButton();
        jButtonOrdenarM = new javax.swing.JButton();
        jButtonOrdenarE = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuRegistrarV = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuActualizarS = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuGenerarRpt = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGap(0, 832, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Datos de los Vehiculos");

        jButtonOrdenarF.setText("Ordenar por Fecha de Ingreso");
        jButtonOrdenarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarFActionPerformed(evt);
            }
        });

        jButtonOrdenarM.setText("Ordenar por Marca");
        jButtonOrdenarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarMActionPerformed(evt);
            }
        });

        jButtonOrdenarE.setText("Ordenar por Estado del Servicio");
        jButtonOrdenarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarEActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Marca", "Modelo", "Año de Fabricacion", "Tipo de Servicio", "Fecha de Ingreso", "Estado", "Costo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu2.setText("Opciones");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuRegistrarV.setText("Registrar Vehiculos");
        jMenuRegistrarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRegistrarVActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuRegistrarV);
        jMenu2.add(jSeparator1);

        jMenuActualizarS.setText("Actualizar Servicios");
        jMenuActualizarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuActualizarSActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuActualizarS);
        jMenu2.add(jSeparator2);

        jMenuGenerarRpt.setText("Generación de Reportes de Servicios");
        jMenuGenerarRpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGenerarRptActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuGenerarRpt);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonOrdenarF)
                        .addGap(75, 75, 75)
                        .addComponent(jButtonOrdenarM)
                        .addGap(95, 95, 95)
                        .addComponent(jButtonOrdenarE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOrdenarF)
                    .addComponent(jButtonOrdenarM)
                    .addComponent(jButtonOrdenarE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuRegistrarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRegistrarVActionPerformed
     jfrmRegistrarV registroForm = new jfrmRegistrarV(lista);
    registroForm.setVisible(true);

    // Agregar un WindowListener para detectar cuando se cierra el formulario
    registroForm.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosed(java.awt.event.WindowEvent windowEvent) {
            // Actualizar la tabla cuando se cierre el formulario
            actualizarTabla();
        }
    });
    }//GEN-LAST:event_jMenuRegistrarVActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
      // Actualizar la tabla al cerrar la ventana de registro         
           // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuActualizarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuActualizarSActionPerformed
    jfrmActualizarServicio actualizar = new jfrmActualizarServicio(lista);
    actualizar.setVisible(true);

        
    
    }//GEN-LAST:event_jMenuActualizarSActionPerformed

    private void jButtonOrdenarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarFActionPerformed
    lista.ordenarVehiculosPorFechaIngreso();
    actualizarTabla();
    }//GEN-LAST:event_jButtonOrdenarFActionPerformed

    private void jMenuGenerarRptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGenerarRptActionPerformed
    
          // TODO add your handling code here:
    }//GEN-LAST:event_jMenuGenerarRptActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonOrdenarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarMActionPerformed
lista.ordenarVehiculosPorMarca();
    actualizarTabla();         // TODO add your handling code here:
    }//GEN-LAST:event_jButtonOrdenarMActionPerformed

    private void jButtonOrdenarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarEActionPerformed
    lista.ordenarVehiculosPorEstadoServicio();
    actualizarTabla();     // TODO add your handling code here:
    }//GEN-LAST:event_jButtonOrdenarEActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
java.awt.EventQueue.invokeLater(() -> new JfrmPrincipal().setVisible(true));
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonOrdenarE;
    private javax.swing.JButton jButtonOrdenarF;
    private javax.swing.JButton jButtonOrdenarM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuActualizarS;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuGenerarRpt;
    private javax.swing.JMenuItem jMenuRegistrarV;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
