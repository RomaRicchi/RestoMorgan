
package Vista;

import Modelo.Mesero;
import Persistencia.MesaData;
import Persistencia.MeseroData;
import Persistencia.PedidoProductoData;
import Persistencia.Conexion;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Roma
 */

public class GGanancias extends javax.swing.JPanel {
    private Connection con; 
    private PedidoProductoData pedidoProductoData; 
    private DefaultTableModel model;
    private MesaData mesaData;
    private MeseroData meseroData;
 
    public GGanancias(Connection connection) {
        initComponents();
        if (connection == null) {
            throw new IllegalArgumentException("La conexión no puede ser nula");
        }
        
        this.con = Conexion.getConexion(); 
        this.pedidoProductoData = new PedidoProductoData(con);
        this.mesaData = new MesaData(con);
        this.meseroData = new MeseroData(con);
        if (this.meseroData != null) {
            this.meseroData.listarMeseros();
            } else {
                System.out.println("meseroData es null");
            }
        
        cargarNombresMeseros();
        cargarSectores();
        armarCabecera();
        configurarListeners();
        configureDateTimePickers();
        
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
        jLabel20 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTFResult = new javax.swing.JTextField();
        jDate2Fin = new com.toedter.calendar.JDateChooser();
        jDateSimp = new com.toedter.calendar.JDateChooser();
        jCSector = new javax.swing.JComboBox<>();
        jCNombre = new javax.swing.JComboBox<>();
        jBGanaciaTotal = new javax.swing.JButton();
        jDate3Fin = new com.toedter.calendar.JDateChooser();
        jDate4Fin = new com.toedter.calendar.JDateChooser();
        jDate3Inicio = new com.toedter.calendar.JDateChooser();
        jDate2Inicio = new com.toedter.calendar.JDateChooser();
        jDate4Inicio = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jBLimpiar = new javax.swing.JButton();
        jTR1 = new javax.swing.JTextField();
        jTR2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTResults = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        jLabel20.setFont(new java.awt.Font("Felix Titling", 3, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 102, 51));
        jLabel20.setText("cALCULAR GANANCIAS");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("DEL DIA");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("DE UN PERIODO");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("POR SECTOR");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("POR MESERO");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ENTRE PERIODOS");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("RESULTADO");

        jTFResult.setEditable(false);

        jDate2Fin.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDate2FinPropertyChange(evt);
            }
        });

        jDateSimp.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateSimpPropertyChange(evt);
            }
        });

        jCSector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCSector.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCSectorPropertyChange(evt);
            }
        });

        jCNombre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCNombre.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCNombrePropertyChange(evt);
            }
        });

        jBGanaciaTotal.setText("GANANCIAS TOTALES");
        jBGanaciaTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBGanaciaTotalMousePressed(evt);
            }
        });

        jDate4Fin.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDate4FinPropertyChange(evt);
            }
        });

        jLabel1.setText("Fecha inicio");

        jLabel2.setText("Fecha inicio");

        jLabel8.setText("Fecha inicio");

        jLabel10.setText("Fecha fin");

        jLabel11.setText("Fecha fin");

        jLabel12.setText("Fecha fin");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(169, 169, 169))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel1))
                                    .addComponent(jDate2Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addComponent(jLabel10))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(jDate2Fin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(5, 5, 5)
                                .addComponent(jDateSimp, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(jDate3Fin, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTR1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBGanaciaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jTFResult, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBLimpiar)
                                .addGap(32, 32, 32)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jDate4Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCSector, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jDate4Fin, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTR2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addGap(167, 167, 167))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jDate3Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateSimp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDate2Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDate2Fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDate3Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDate3Fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDate4Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDate4Fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jCSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBGanaciaTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLimpiar))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new java.awt.Color(0, 153, 153));

        jTResults.setBackground(new java.awt.Color(0, 153, 153));
        jTResults.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTResults);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        limpiarCamposYTablas();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jDateSimpPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateSimpPropertyChange
        calcularGananciaPorDia();
    }//GEN-LAST:event_jDateSimpPropertyChange

    private void jDate2FinPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDate2FinPropertyChange
        calcularGananciasPorPeriodo(jDate2Inicio, jDate2Fin);
    }//GEN-LAST:event_jDate2FinPropertyChange

    private void jDate4FinPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDate4FinPropertyChange
        comparaPeriodos();
    }//GEN-LAST:event_jDate4FinPropertyChange

    private void jBGanaciaTotalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGanaciaTotalMousePressed
        double gananciasTotales = pedidoProductoData.obtenerGananciasTotales(); 
        jTFResult.setText(String.format("%.2f", gananciasTotales)); 
    }//GEN-LAST:event_jBGanaciaTotalMousePressed

    private void jCSectorPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCSectorPropertyChange
        filtrarPorSector();
    }//GEN-LAST:event_jCSectorPropertyChange

    private void jCNombrePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCNombrePropertyChange
        filtrarPorMesero();
    }//GEN-LAST:event_jCNombrePropertyChange
    
    private void calcularGananciaPorDia() {
        LocalDate fecha = obtenerFecha(jDateSimp);
        if (fecha != null) {
            double ganancia = pedidoProductoData.obtenerGananciasDiarias(fecha);
            jTFResult.setText(String.valueOf(ganancia));
            actualizarTablaGanancias(fecha, fecha);
        }
    }

    private void calcularGananciasPorPeriodo(com.toedter.calendar.JDateChooser inicio, com.toedter.calendar.JDateChooser fin) {
        LocalDate fechaInicio = obtenerFecha(inicio);
        LocalDate fechaFin = obtenerFecha(fin);
        if (fechaInicio != null && fechaFin != null) {
            double ganancia = pedidoProductoData.obtenerGananciasEntreFechas(fechaInicio, fechaFin);
            jTFResult.setText(String.valueOf(ganancia));
            actualizarTablaGanancias(fechaInicio, fechaFin);
        }
    }
    
    private void comparaPeriodos() {  
        LocalDate fechaInicio1 = obtenerFecha(jDate3Inicio);
        LocalDate fechaFin1 = obtenerFecha(jDate3Fin);
        LocalDate fechaInicio2 = obtenerFecha(jDate4Inicio);
        LocalDate fechaFin2 = obtenerFecha(jDate4Fin);

        if (fechaInicio1 != null && fechaFin1 != null && fechaInicio2 != null && fechaFin2 != null) {
            Map<String, Double> comparativaGanancias = pedidoProductoData.obtenerComparativaGanancias(fechaInicio1, fechaFin1, fechaInicio2, fechaFin2);

            double gananciaPeriodo1 = comparativaGanancias.getOrDefault("gananciasPeriodo1", 0.0);
            double gananciaPeriodo2 = comparativaGanancias.getOrDefault("gananciasPeriodo2", 0.0);

            jTR1.setText(String.format("%.2f", gananciaPeriodo1));
            jTR2.setText(String.format("%.2f", gananciaPeriodo2));

            double gananciaTotal = gananciaPeriodo1 + gananciaPeriodo2;
            jTFResult.setText(String.format("%.2f", gananciaTotal));

            actualizarTablaGanancias(fechaInicio1, fechaFin2);
        } else {
            jTFResult.setText(" ");
        }
    }
    
    private void filtrarPorSector() {
        String sectorSeleccionado = (String) jCSector.getSelectedItem();
        LocalDate fechaInicio = obtenerFecha(jDate2Inicio);
        LocalDate fechaFin = obtenerFecha(jDate2Fin);
        LocalDate fechaSimp = obtenerFecha(jDateSimp);

        double totalGanancias = 0.0;  // Variable para acumular los subtotales

        if (sectorSeleccionado != null) {
            List<Map<String, Object>> gananciasPorProducto;

            if (fechaSimp != null) {
                // Caso: Se seleccionó solo jDateSimp
                gananciasPorProducto = pedidoProductoData.obtenerGananciasPorProductoEnSectorYFechas(sectorSeleccionado, fechaSimp, fechaSimp);
                actualizarTablaGananciasConFiltro(sectorSeleccionado, fechaSimp, fechaSimp);
            } else if (fechaInicio != null && fechaFin != null) {
                // Caso: Se seleccionaron jDate2Inicio y jDate2Fin para un rango de fechas
                gananciasPorProducto = pedidoProductoData.obtenerGananciasPorProductoEnSectorYFechas(sectorSeleccionado, fechaInicio, fechaFin);
                actualizarTablaGananciasConFiltro(sectorSeleccionado, fechaInicio, fechaFin);
            } else {
                // Caso: Solo se selecciona el sector, mostrar todos los productos vendidos en ese sector desde la primera fecha
                LocalDate fechaMasAntigua = pedidoProductoData.obtenerFechaMasAntigua(); 
                LocalDate fechaActual = LocalDate.now();
                gananciasPorProducto = pedidoProductoData.obtenerGananciasPorProductoEnSectorYFechas(sectorSeleccionado, fechaMasAntigua, fechaActual);
                actualizarTablaGananciasConFiltro(sectorSeleccionado, fechaMasAntigua, fechaActual);
            }

            // Calcula la suma de los subtotales
            for (Map<String, Object> producto : gananciasPorProducto) {
                totalGanancias += (double) producto.get("totalGanancias");
            }

            // Muestra el total en jTFResult
            jTFResult.setText(String.format("%.2f", totalGanancias));
        }
    }
    
    private void actualizarTablaGananciasConFiltro(String sectorSeleccionado, LocalDate fechaInicio, LocalDate fechaFin) {
        model.setRowCount(0);
        List<Map<String, Object>> gananciasPorProducto = pedidoProductoData.obtenerGananciasPorProductoEnSectorYFechas(sectorSeleccionado, fechaInicio, fechaFin);

        for (Map<String, Object> producto : gananciasPorProducto) {
            model.addRow(new Object[]{
                producto.get("producto"),
                producto.get("cantidadVendida"),
                producto.get("totalGanancias"),
                sectorSeleccionado,
                jCNombre.getSelectedItem()
            });
        }
    }

    private void actualizarTablaGananciasConFiltro2(String meseroSeleccionado, LocalDate fechaInicio, LocalDate fechaFin) { 
        model.setRowCount(0);
        List<Map<String, Object>> gananciasPorProducto = pedidoProductoData.obtenerGananciasPorProductoEnMeseroYFechas(meseroSeleccionado, fechaInicio, fechaFin);

        for (Map<String, Object> producto : gananciasPorProducto) {
            model.addRow(new Object[]{
                producto.get("producto"),
                producto.get("cantidadVendida"),
                producto.get("totalGanancias"),
                jCSector.getSelectedItem(),
                meseroSeleccionado
            });
        }
    }

    private void filtrarPorMesero() {
        String meseroSeleccionado = (String) jCNombre.getSelectedItem();
        LocalDate fechaInicio = obtenerFecha(jDate2Inicio);
        LocalDate fechaFin = obtenerFecha(jDate2Fin);
        LocalDate fechaSimp = obtenerFecha(jDateSimp);

        double totalGanancias = 0.0;  // Variable para acumular los subtotales

        if (meseroSeleccionado != null) {
            List<Map<String, Object>> gananciasPorProducto;

            if (fechaSimp != null) {
                // Caso: Se seleccionó solo jDateSimp
                gananciasPorProducto = pedidoProductoData.obtenerGananciasPorProductoEnMeseroYFechas(meseroSeleccionado, fechaSimp, fechaSimp);
                actualizarTablaGananciasConFiltro2(meseroSeleccionado, fechaSimp, fechaSimp);
            } else if (fechaInicio != null && fechaFin != null) {
                // Caso: Se seleccionaron jDate2Inicio y jDate2Fin para un rango de fechas
                gananciasPorProducto = pedidoProductoData.obtenerGananciasPorProductoEnMeseroYFechas(meseroSeleccionado, fechaInicio, fechaFin);
                actualizarTablaGananciasConFiltro2(meseroSeleccionado, fechaInicio, fechaFin);
            } else {
                // Caso: Solo se selecciona el mesero, mostrar todos los productos vendidos por ese mesero desde la primera fecha
                LocalDate fechaMasAntigua = pedidoProductoData.obtenerFechaMasAntigua(); 
                LocalDate fechaActual = LocalDate.now();
                gananciasPorProducto = pedidoProductoData.obtenerGananciasPorProductoEnMeseroYFechas(meseroSeleccionado, fechaMasAntigua, fechaActual);
                actualizarTablaGananciasConFiltro2(meseroSeleccionado, fechaMasAntigua, fechaActual);
            }

            // Calcula la suma de los subtotales
            for (Map<String, Object> producto : gananciasPorProducto) {
                totalGanancias += (double) producto.get("totalGanancias");
            }

            // Muestra el total en jTFResult
            jTFResult.setText(String.format("%.2f", totalGanancias));
        }
    }
    
    private void actualizarTablaGanancias(LocalDate fechaInicio, LocalDate fechaFin) {
        // Limpia el contenido de la tabla antes de llenarla con nuevos datos
        model.setRowCount(0);
      

        // Obtén la lista de productos y sus ganancias para el rango de fechas especificado
        List<Map<String, Object>> gananciasPorProducto = pedidoProductoData.obtenerGananciasPorProductoEntreFechas(fechaInicio, fechaFin);

        // Agrega cada producto a la tabla
        for (Map<String, Object> producto : gananciasPorProducto) {
            model.addRow(new Object[]{
                producto.get("producto"),         // Nombre del producto
                producto.get("cantidadVendida"),  // Cantidad vendida
                producto.get("totalGanancias"),   // Total de ganancias
                                         
            });
        }
    }

    private LocalDate obtenerFecha(com.toedter.calendar.JDateChooser dateChooser) {
        Date fecha = dateChooser.getDate();
        return fecha != null ? fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate() : null;
    }
    
    private void configureDateTimePickers() {
        jDateSimp.setDateFormatString("dd-MM-yyyy");
        jDate2Fin.setDateFormatString("dd-MM-yyyy");
        jDate3Fin.setDateFormatString("dd-MM-yyyy");
        jDate4Fin.setDateFormatString("dd-MM-yyyy");
        jDate2Inicio.setDateFormatString("dd-MM-yyyy");
        jDate3Inicio.setDateFormatString("dd-MM-yyyy");
        jDate4Inicio.setDateFormatString("dd-MM-yyyy");
    }
    
    private void configurarListeners() {
        jDateSimp.addPropertyChangeListener("date", evt -> calcularGananciaPorDia());
        jDate2Fin.addPropertyChangeListener("date", evt -> calcularGananciasPorPeriodo(jDate2Inicio, jDate2Fin));
        jDate4Fin.addPropertyChangeListener("date", evt -> comparaPeriodos());

        jCSector.addActionListener(e -> filtrarPorSector());
        jCNombre.addActionListener(e -> filtrarPorMesero());
    }
    
    private void cargarNombresMeseros() {
        List<Mesero> meseros = meseroData.listarMeseros();
        jCNombre.removeAllItems();
        meseros.forEach(mesero -> jCNombre.addItem(mesero.getNombre()));
        jCNombre.setSelectedIndex(-1); 
    } 
    
    private void cargarSectores() {
        jCSector.removeAllItems();
        List<String> sectores = mesaData.obtenerSectoresUnicos();
        sectores.forEach(jCSector::addItem);
        jCSector.setSelectedIndex(-1); 
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGanaciaTotal;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JComboBox<String> jCNombre;
    private javax.swing.JComboBox<String> jCSector;
    private com.toedter.calendar.JDateChooser jDate2Fin;
    private com.toedter.calendar.JDateChooser jDate2Inicio;
    private com.toedter.calendar.JDateChooser jDate3Fin;
    private com.toedter.calendar.JDateChooser jDate3Inicio;
    private com.toedter.calendar.JDateChooser jDate4Fin;
    private com.toedter.calendar.JDateChooser jDate4Inicio;
    private com.toedter.calendar.JDateChooser jDateSimp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFResult;
    private javax.swing.JTextField jTR1;
    private javax.swing.JTextField jTR2;
    private javax.swing.JTable jTResults;
    // End of variables declaration//GEN-END:variables
    
    private void armarCabecera() {
        model = new DefaultTableModel(new Object[]{"Producto", "Cantidad Vendida", "Subtotal", "Sector", "Mesero"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Hace que todas las celdas no sean editables
            }
        };

        jTResults.setModel(model);
        jTResults.getTableHeader().setReorderingAllowed(false); // Impide mover las columnas 
    }
       
    private void limpiarCamposYTablas() {
        jCNombre.setSelectedIndex(-1);
        jCSector.setSelectedIndex(-1);
        jDateSimp.setCalendar(null);
        jDate2Fin.setCalendar(null);
        jDate3Fin.setCalendar(null);
        jDate4Fin.setCalendar(null);
        jDate2Inicio.setCalendar(null);
        jDate3Inicio.setCalendar(null);
        jDate4Inicio.setCalendar(null);
        jTFResult.setText(" ");
        jTR1.setText(" ");
        jTR2.setText(" ");
        model.setRowCount(0);
          
    }
    
}