
package Vista;

import Modelo.Mesa;
import Persistencia.Conexion;
import Persistencia.MesaData;
import java.sql.Connection;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import java.util.List;

/**
 *
 * @author Roma
 */
public class GMesas extends javax.swing.JPanel {
    private Connection con;
    private MesaData mesaData; 
    private DefaultTableModel modelo;
    private ButtonGroup grupoEstado;
    
    /**
     * Creates new form GMesas
     */
    public GMesas() {
        initComponents();
        configurarComponentes();
        iniciarConexion();
        armarCabecera();
        cargarDatos();
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
        jLabel1 = new javax.swing.JLabel();
        jCBSector = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSCapacidad = new javax.swing.JSpinner();
        jCBSituacion = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRON = new javax.swing.JRadioButton();
        jROFF = new javax.swing.JRadioButton();
        jBGuardar1 = new javax.swing.JButton();
        jBModificar1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jSId1 = new javax.swing.JSpinner();
        jBLimpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jROFF2 = new javax.swing.JRadioButton();
        filtroSec = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        filtroSit = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jRON2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTMesas = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Felix Titling", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("AGREGAR MESA");

        jCBSector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Terraza", "Patio", "Comedor" }));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("SECTOR");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CAPACIDAD");

        jCBSituacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libre", "Ocupada", "Reservada" }));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ESTADO");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("SITUACION");

        jRON.setText("Alta");

        jROFF.setText("Baja");

        jBGuardar1.setText("GUARDAR");
        jBGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardar1ActionPerformed(evt);
            }
        });

        jBModificar1.setText("MODIFICAR");
        jBModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificar1ActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("NRO");

        jSId1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSId1StateChanged(evt);
            }
        });

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
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
                        .addComponent(jBModificar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jBGuardar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSId1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBLimpiar)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jRON)
                                                .addGap(18, 18, 18)
                                                .addComponent(jROFF, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel1)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jCBSector, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jCBSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jSCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRON)
                    .addComponent(jROFF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCBSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBGuardar1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBModificar1)
                    .addComponent(jLabel10)
                    .addComponent(jSId1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLimpiar))
                .addGap(13, 13, 13))
        );

        jPanel2.setBackground(new java.awt.Color(255, 153, 102));

        jROFF2.setText("Baja");
        jROFF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jROFF2ActionPerformed(evt);
            }
        });

        filtroSec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Terraza", "Patio", "Comedor" }));
        filtroSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroSecActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("POR SECTOR");

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("POR ESTADO");

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("POR SITUACION");

        filtroSit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libre", "Ocupada", "Reservada" }));
        filtroSit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroSitActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Felix Titling", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("FILTRAR:");

        jRON2.setText("Alta");
        jRON2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRON2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(filtroSit, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(33, 33, 33))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRON2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jROFF2))
                            .addComponent(filtroSec, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel2)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jRON2)
                    .addComponent(jROFF2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filtroSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filtroSit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(43, 43, 43))
        );

        jScrollPane1.setBackground(new java.awt.Color(0, 153, 153));

        jTMesas.setBackground(new java.awt.Color(0, 153, 153));
        jTMesas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTMesas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardar1ActionPerformed
         Mesa mesa = configurarMesa(new Mesa());
        mesaData.guardarMesa(mesa);
        cargarDatos();
        JOptionPane.showMessageDialog(this, "Mesa guardada correctamente.");
    }//GEN-LAST:event_jBGuardar1ActionPerformed

    private void jBModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificar1ActionPerformed
        int idMesa = (int) jSId1.getValue();
        Mesa mesa = mesaData.buscarMesa(idMesa);

        if (mesa != null) {
            mesa = configurarMesa(mesa);
            mesaData.modificarMesa(mesa);
            cargarDatos();
            JOptionPane.showMessageDialog(this, "Mesa modificada correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró la mesa con el ID especificado.");
        }
    }//GEN-LAST:event_jBModificar1ActionPerformed

    private void jROFF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jROFF2ActionPerformed
        cargarMesas("estado", false);
    }//GEN-LAST:event_jROFF2ActionPerformed

    private void filtroSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroSecActionPerformed
        cargarMesas("sector", filtroSec.getSelectedItem().toString());
    }//GEN-LAST:event_filtroSecActionPerformed

    private void filtroSitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroSitActionPerformed
        cargarMesas("situacion", filtroSit.getSelectedItem().toString());
    }//GEN-LAST:event_filtroSitActionPerformed

    private void jRON2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRON2ActionPerformed
       cargarMesas("estado", true);
    }//GEN-LAST:event_jRON2ActionPerformed

    private void jSId1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSId1StateChanged
       int idMesa = (int) jSId1.getValue(); 
        Mesa mesa = mesaData.buscarMesa(idMesa); 

        if (mesa != null) {
            jSCapacidad.setValue(mesa.getCapacidad());               
            jCBSector.setSelectedItem(mesa.getSector());             
            jCBSituacion.setSelectedItem(mesa.getSituacion());       
            jRON.setSelected(mesa.isEstado());                      
            jROFF.setSelected(!mesa.isEstado());                     
        } else {
            limpiarCampos();                                        
            JOptionPane.showMessageDialog(this, "No se encontró una mesa con el ID especificado.", "Mesa no encontrada", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jSId1StateChanged

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void cargarMesas(String criterio, Object valor) {
        modelo.setRowCount(0);
        List<Mesa> mesas;

        switch (criterio) {
            case "estado":
                mesas = mesaData.listarMesasPorEstado((boolean) valor);
                break;
            case "sector":
                mesas = mesaData.listarMesasPorSector((String) valor);
                break;
            case "situacion":
                mesas = mesaData.buscarMesasPorSituacion((String) valor);
                break;
            default:
                mesas = mesaData.listarMesas();
        }

        for (Mesa m : mesas) {
            modelo.addRow(new Object[]{
                m.getIdMesa(),
                m.getCapacidad(),
                m.isEstado() ? "Habilitada" : "Deshabilitada",
                m.getSector(),
                m.getSituacion()
            });
        }
    }

    private Mesa configurarMesa(Mesa mesa) {
        mesa.setCapacidad((int) jSCapacidad.getValue());
        mesa.setEstado(jRON.isSelected());
        mesa.setSector(jCBSector.getSelectedItem().toString());
        mesa.setSituacion(jCBSituacion.getSelectedItem().toString());
        return mesa;
    }
    
    private void configurarComponentes() {
        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return false;
            }
        };

        grupoEstado = new ButtonGroup();
        grupoEstado.add(jRON);
        grupoEstado.add(jROFF);
        grupoEstado.add(jRON2);
        grupoEstado.add(jROFF2);

        jSCapacidad.setModel(new SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 1));
        jSId1.setModel(new SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 1));
    }

    private void iniciarConexion() {
        this.con = Conexion.getConexion();
        this.mesaData = new MesaData(con);
    }
    
    private void limpiarCampos() {
        jCBSector.setSelectedIndex(-1);  
        jCBSituacion.setSelectedIndex(-1);  
        filtroSec.setSelectedIndex(-1);   
        filtroSit.setSelectedIndex(-1);   

        jSCapacidad.setValue(0);  
        jSId1.setValue(0);  

        grupoEstado.clearSelection(); 
        jRON2.setSelected(false);     
        jROFF2.setSelected(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> filtroSec;
    private javax.swing.JComboBox<String> filtroSit;
    private javax.swing.JButton jBGuardar1;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBModificar1;
    private javax.swing.JComboBox<String> jCBSector;
    private javax.swing.JComboBox<String> jCBSituacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jROFF;
    private javax.swing.JRadioButton jROFF2;
    private javax.swing.JRadioButton jRON;
    private javax.swing.JRadioButton jRON2;
    private javax.swing.JSpinner jSCapacidad;
    private javax.swing.JSpinner jSId1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTMesas;
    // End of variables declaration//GEN-END:variables
    
    private void armarCabecera() {
        String[] columnas = {"N° MESA", "CAPACIDAD", "ESTADO", "SECTOR", "SITUACION"};
        for (String col : columnas) {
            modelo.addColumn(col);
        }

        jTMesas.setModel(modelo);
        jTMesas.getTableHeader().setReorderingAllowed(false);
    }

    private void cargarDatos() {
        cargarMesas("", null); // Carga todas las mesas sin filtros
    }



}