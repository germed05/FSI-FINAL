
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class FEventos extends javax.swing.JFrame {

    
    //Video del programa funcionando o de las peticiones 
    ImageIcon icono = new ImageIcon(getClass().getResource("/img/pacientes.png"));

    //-------------
    String url = "https://xglizaola.site/mysql.php";
    ConexionHR cnx = new ConexionHR(url);

    String eventos = "SELECT ideventos, titulo_evento AS evento, descripcion, fecha_evento AS fecha, categoria, costo FROM eventos ORDER BY ideventos ";
    String estado = "SELECT categoria FROM eventos GROUP BY categoria ORDER BY categoria";
    String recaudado = "SELECT "
            + "COUNT(Suscriptores_idsuscriptores) AS Total_Asistentes, "
            + "costo AS Unitario, "
            + "(COUNT(Suscriptores_idsuscriptores) * costo) AS Recaudado "
            + "FROM contrataciones "
            + "JOIN eventos ON eventos_ideventos = ideventos ";//recaudado por evento
    String evts = "SELECT titulo_evento AS 'Evento',COUNT(suscriptores_idsuscriptores) AS 'Total Asistentes'\n"
            + "FROM contrataciones\n"
            + "JOIN eventos ON eventos_ideventos = ideventos\n"
            + "WHERE eventos_ideventos =(' ";
    String grupo = "GROUP BY eventos.titulo_evento";//agruparlo por evento
    //------------

    public FEventos() {
        initComponents();
        TEventos.setAutoCreateRowSorter(true);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(this);
        this.setIconImage(icono.getImage());

        cnx.entablar(eventos, TEventos);
        cnx.seleccionar(estado, CBCategoria);
        if (cnx.probarConexion()) {
            JOptionPane.showMessageDialog(this, "Conectado a la base de datos");
        } else {
            JOptionPane.showMessageDialog(this, "ERROR");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PTitulo = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        BNuevo = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        BAgregar = new javax.swing.JButton();
        BActualizar = new javax.swing.JButton();
        BBorrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        BPdf = new javax.swing.JButton();
        BGrafica = new javax.swing.JButton();
        PFormulario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TTitulo = new javax.swing.JTextField();
        TID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TDesc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CBCategoria = new javax.swing.JComboBox<>();
        DCFecha = new com.toedter.calendar.JDateChooser();
        TCosto = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TEventos = new javax.swing.JTable();
        PFondo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Glucotel - Módulo de Pacientes");
        setBackground(new java.awt.Color(0, 0, 0));

        PTitulo.setBackground(new java.awt.Color(0, 0, 51));
        PTitulo.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 153, 255));
        jLabel11.setText("EventView");
        PTitulo.add(jLabel11);
        jLabel11.setBounds(150, 8, 230, 40);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Eventos");
        PTitulo.add(jLabel9);
        jLabel9.setBounds(150, 50, 190, 20);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/evento.png"))); // NOI18N
        PTitulo.add(jLabel8);
        jLabel8.setBounds(19, 17, 95, 60);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.png"))); // NOI18N
        PTitulo.add(jLabel10);
        jLabel10.setBounds(0, 0, 1030, 90);

        jToolBar1.setRollover(true);

        BNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new.png"))); // NOI18N
        BNuevo.setText("NUEVO");
        BNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BNuevo.setMaximumSize(new java.awt.Dimension(100, 70));
        BNuevo.setMinimumSize(new java.awt.Dimension(100, 70));
        BNuevo.setPreferredSize(new java.awt.Dimension(100, 70));
        BNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(BNuevo);
        jToolBar1.add(jSeparator2);

        BAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        BAgregar.setText("AGREGAR");
        BAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BAgregar.setMaximumSize(new java.awt.Dimension(100, 70));
        BAgregar.setMinimumSize(new java.awt.Dimension(100, 70));
        BAgregar.setPreferredSize(new java.awt.Dimension(100, 70));
        BAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAgregarActionPerformed(evt);
            }
        });
        jToolBar1.add(BAgregar);

        BActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        BActualizar.setText("ACTUALIZAR");
        BActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BActualizar.setMaximumSize(new java.awt.Dimension(100, 70));
        BActualizar.setMinimumSize(new java.awt.Dimension(100, 70));
        BActualizar.setPreferredSize(new java.awt.Dimension(100, 70));
        BActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActualizarActionPerformed(evt);
            }
        });
        jToolBar1.add(BActualizar);

        BBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        BBorrar.setText("BORRAR");
        BBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BBorrar.setMaximumSize(new java.awt.Dimension(100, 70));
        BBorrar.setMinimumSize(new java.awt.Dimension(100, 70));
        BBorrar.setPreferredSize(new java.awt.Dimension(100, 70));
        BBorrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBorrarActionPerformed(evt);
            }
        });
        jToolBar1.add(BBorrar);
        jToolBar1.add(jSeparator1);

        BPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf.png"))); // NOI18N
        BPdf.setText("PDF");
        BPdf.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BPdf.setMaximumSize(new java.awt.Dimension(100, 70));
        BPdf.setMinimumSize(new java.awt.Dimension(100, 70));
        BPdf.setPreferredSize(new java.awt.Dimension(100, 70));
        BPdf.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPdfActionPerformed(evt);
            }
        });
        jToolBar1.add(BPdf);

        BGrafica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Graph.png"))); // NOI18N
        BGrafica.setText("GRAFICA");
        BGrafica.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BGrafica.setMaximumSize(new java.awt.Dimension(100, 70));
        BGrafica.setMinimumSize(new java.awt.Dimension(100, 70));
        BGrafica.setPreferredSize(new java.awt.Dimension(100, 70));
        BGrafica.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BGrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGraficaActionPerformed(evt);
            }
        });
        jToolBar1.add(BGrafica);

        PFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del evento:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(78, 80, 82));
        jLabel1.setText("ID:");

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(78, 80, 82));
        jLabel2.setText("TITULO:");

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(78, 80, 82));
        jLabel3.setText("FECHA EVENTO");

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(78, 80, 82));
        jLabel4.setText("COSTO");

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(78, 80, 82));
        jLabel5.setText("DESCRIPCION");

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(78, 80, 82));
        jLabel6.setText("CATEGORIA");

        CBCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deportes", "Concierto", "Cine", "Especial" }));

        DCFecha.setDateFormatString("yyyy MM dd");

        javax.swing.GroupLayout PFormularioLayout = new javax.swing.GroupLayout(PFormulario);
        PFormulario.setLayout(PFormularioLayout);
        PFormularioLayout.setHorizontalGroup(
            PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PFormularioLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(TID, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PFormularioLayout.createSequentialGroup()
                        .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PFormularioLayout.createSequentialGroup()
                                .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(DCFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TDesc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(PFormularioLayout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CBCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PFormularioLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(TTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        PFormularioLayout.setVerticalGroup(
            PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PFormularioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(TCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(CBCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DCFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        TEventos.setModel(new javax.swing.table.DefaultTableModel(
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
        TEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TEventosMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(TEventos);

        PFondo.setBackground(new java.awt.Color(255, 255, 204));
        PFondo.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addGap(18, 18, 18)
                        .addComponent(PFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 1019, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        PFormulario.getAccessibleContext().setAccessibleName("Datos del evento:");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPdfActionPerformed
        int filaSeleccionada = TEventos.getSelectedRow();

        if (filaSeleccionada == -1) {
            // Si devuelve -1, significa que no hay nada seleccionado
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Seleccione un campo válido (un paciente de la tabla) para graficar.",
                    "Atención",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return; // <--- ESTO ES IMPORTANTE: Detiene el código aquí.
        }

        String id = TID.getText();
        String query = recaudado + "WHERE eventos_ideventos = '" + id + "' " + grupo;
        cnx.crearPDF("EventView", "Eventos: " + TTitulo.getText(),
                query, new float[]{0.3f, 0.4f, 0.3f}, "Total_PEvento");
        cnx.visualizarPDF("Total_PEvento");

    }//GEN-LAST:event_BPdfActionPerformed

    private void BNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNuevoActionPerformed
        TID.setText("");
        TTitulo.setText("");
        DCFecha.setDate(new Date());
        TDesc.setText("");
        CBCategoria.setSelectedIndex(0);
        TCosto.setText("");
    }//GEN-LAST:event_BNuevoActionPerformed

    private void BGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGraficaActionPerformed
        // 1. VALIDACIÓN: Verificar que haya un suscriptor seleccionado
        int filaSeleccionada = TEventos.getSelectedRow(); // <--- Asegúrate que tu tabla se llame TSuscriptores

        if (filaSeleccionada == -1) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Seleccione un suscriptor de la tabla para analizar sus eventos.",
                    "Atención",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        String id = TID.getText();
        String query = evts + id + " ')" + grupo;

        ArrayList<String> series = new ArrayList<>();
        ArrayList<ArrayList<String>> datos = new ArrayList<>();

        datos = cnx.consultar(query);

        series.add("Total Asistentes");

        GraficaXY graf = new GraficaXY(
                "Total de Asistentes por evento",
                "Evento",
                "Personas Asistiendo",
                series,
                datos
        );


        PFondo.removeAll();       
        PFondo.add(graf.chartPanel); 
        PFondo.updateUI();        

    }//GEN-LAST:event_BGraficaActionPerformed

    private void BAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAgregarActionPerformed
        String id = TID.getText();
        String tit = TTitulo.getText();
        String desc = TDesc.getText();
        String fech = cnx.toSQL(DCFecha.getDate());
        String cost = TCosto.getText();
        String cat = CBCategoria.getSelectedItem().toString();

        String[] valores = new String[]{id, tit, desc, fech, cost, cat};
        cnx.insertar("eventos", valores);
        cnx.entablar(eventos, TEventos);
    }//GEN-LAST:event_BAgregarActionPerformed

    private void BActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActualizarActionPerformed
        String id = TID.getText();
        String tit = TTitulo.getText();
        String desc = TDesc.getText();
        String fech = cnx.toSQL(DCFecha.getDate());
        String cost = TCosto.getText();
        String cat = CBCategoria.getSelectedItem().toString();

        String[] valores = new String[]{id, tit, desc, fech, cost, cat};
        cnx.actualizar("eventos", valores);

        cnx.entablar(eventos, TEventos);

    }//GEN-LAST:event_BActualizarActionPerformed

    private void BBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBorrarActionPerformed
        String id = TID.getText();
        String tit = TTitulo.getText();
        String desc = TDesc.getText();
        String fech = cnx.toSQL(DCFecha.getDate());
        String cost = TCosto.getText();
        String cat = CBCategoria.getSelectedItem().toString();

        String[] valores = new String[]{id, tit, desc, fech, cost, cat};
        cnx.borrar("eventos", valores);

        cnx.entablar(eventos, TEventos);

    }//GEN-LAST:event_BBorrarActionPerformed

    private void TEventosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TEventosMousePressed
        DefaultTableModel datos = (DefaultTableModel) TEventos.getModel();
        
        // 1. Obtener el renglón visual
        int rensel = TEventos.getSelectedRow();
        
        if (rensel > -1) {
            // 2. --- CONVERSIÓN DE ÍNDICE ---
            // Convertimos la posición visual a la posición real en el modelo
            int renselModel = TEventos.convertRowIndexToModel(rensel);
            // -------------------------------

            // 3. Usamos 'renselModel' para obtener los datos correctos
            String id = datos.getValueAt(renselModel, 0).toString();
            String tit = datos.getValueAt(renselModel, 1).toString();
            // Nota: Verifica que los índices 2, 4, 5 sean correctos según tu consulta SQL
            String desc = datos.getValueAt(renselModel, 2).toString(); 
            String cat = datos.getValueAt(renselModel, 4).toString();
            String cost = datos.getValueAt(renselModel, 5).toString();
            
            // La consulta a base de datos usa el ID, así que eso no cambia
            String fech = cnx.obtenerDato("SELECT fecha_evento FROM eventos WHERE ideventos = '" + id + "' ");

            // 4. Llenar los campos de texto
            TID.setText(id);
            TTitulo.setText(tit);
            DCFecha.setDate(cnx.toDate(fech));
            TDesc.setText(desc);
            CBCategoria.setSelectedItem(cat);
            TCosto.setText(cost);
        }
    }//GEN-LAST:event_TEventosMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FEventos().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BActualizar;
    private javax.swing.JButton BAgregar;
    private javax.swing.JButton BBorrar;
    private javax.swing.JButton BGrafica;
    private javax.swing.JButton BNuevo;
    private javax.swing.JButton BPdf;
    private javax.swing.JComboBox<String> CBCategoria;
    private com.toedter.calendar.JDateChooser DCFecha;
    private javax.swing.JPanel PFondo;
    private javax.swing.JPanel PFormulario;
    private javax.swing.JPanel PTitulo;
    private javax.swing.JTextField TCosto;
    private javax.swing.JTextField TDesc;
    private javax.swing.JTable TEventos;
    private javax.swing.JTextField TID;
    private javax.swing.JTextField TTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

}
