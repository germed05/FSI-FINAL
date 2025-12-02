
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class FSuscriptores extends javax.swing.JFrame {

    //Video del programa funcionando o de las peticiones 
    ImageIcon icono = new ImageIcon(getClass().getResource("/img/pacientes.png"));

    //-------------
    String url = "https://xglizaola.site/mysql.php";
    ConexionHR cnx = new ConexionHR(url);

    String vista = "SELECT titulo_evento, codigo_acceso, fecha_evento " +
               "FROM Vista_Mis_Boletos " +
               "WHERE id_usuario = ";
    String vista2 = " AND estado_pago = 'Aprobado'";
    String suscriptores = "SELECT idsuscriptores, nombre, estado FROM suscriptores ORDER BY idsuscriptores ";
    String estado = "SELECT estado FROM suscriptores GROUP BY estado ORDER BY estado";
    String asistencia = "SELECT eventos_ideventos, titulo_evento \n"
            + "FROM contrataciones \n"
            + "JOIN eventos ON eventos_ideventos = ideventos ";//eventos a los que asistira
//    String evts = "SELECT "
//                + "titulo_evento, "
//                + "COUNT(suscriptores_idsuscriptores) "
//                + "FROM contrataciones "
//                + "JOIN eventos ON eventos_ideventos = ideventos "
//                + "WHERE eventos_ideventos IN ( "
//                + "    SELECT eventos_ideventos "
//                + "    FROM contrataciones "
//                + "    WHERE suscriptores_idsuscriptores = '";
//    String grupo = "')GROUP BY titulo_evento";//agruparlo por evento
    //------------

    public FSuscriptores() {
        initComponents();
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(this);
        this.setIconImage(icono.getImage());

        cnx.entablar(suscriptores, TPacientes);
        cnx.seleccionar(estado, CBEstado);
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
        BNuevo1 = new javax.swing.JButton();
        PFormulario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TNombre = new javax.swing.JTextField();
        TID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CBPago = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        TEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CBEstado = new javax.swing.JComboBox<>();
        DCFecha = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        TPacientes = new javax.swing.JTable();
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
        jLabel9.setText("Suscriptores");
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

        BNuevo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new.png"))); // NOI18N
        BNuevo1.setText("Mis Boletos");
        BNuevo1.setFocusable(false);
        BNuevo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BNuevo1.setMaximumSize(new java.awt.Dimension(100, 70));
        BNuevo1.setMinimumSize(new java.awt.Dimension(100, 70));
        BNuevo1.setPreferredSize(new java.awt.Dimension(100, 70));
        BNuevo1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BNuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNuevo1ActionPerformed(evt);
            }
        });
        jToolBar1.add(BNuevo1);

        PFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del suscriptor:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(78, 80, 82));
        jLabel1.setText("ID:");

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(78, 80, 82));
        jLabel2.setText("NOMBRE:");

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(78, 80, 82));
        jLabel3.setText("Fecha De Registro");

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(78, 80, 82));
        jLabel4.setText("Metodo de pago");

        CBPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarjeta Crédito", "PayPal", "Transferencia", "Efectivo", " " }));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(78, 80, 82));
        jLabel5.setText("Email");

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(78, 80, 82));
        jLabel6.setText("Estado");

        CBEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo", "Suspendido" }));

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
                                    .addComponent(TEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PFormularioLayout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PFormularioLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CBPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(TNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addComponent(TNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(CBPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(CBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DCFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        TPacientes.setModel(new javax.swing.table.DefaultTableModel(
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
        TPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TPacientesMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(TPacientes);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPdfActionPerformed
        int filaSeleccionada = TPacientes.getSelectedRow();

        if (filaSeleccionada == -1) {
            // Si devuelve -1, significa que no hay nada seleccionado
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Seleccione un campo válido (un paciente de la tabla) para graficar.",
                    "Atención",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return; // <--- ESTO ES IMPORTANTE: Detiene el código aquí.
        }

        String id = TID.getText();
        String query = asistencia + "WHERE suscriptores_idsuscriptores = '" + id + "' ";
        cnx.crearPDF("EventView", "Eventos a asistir para " + TNombre.getText(),
                query, new float[]{0.5f, 0.5f}, "Eventos_Asistir");
        cnx.visualizarPDF("Eventos_Asistir");

    }//GEN-LAST:event_BPdfActionPerformed

    private void BNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNuevoActionPerformed
        TID.setText("");
        TNombre.setText("");
        DCFecha.setDate(new Date());
        CBPago.setSelectedIndex(0);
        TEmail.setText("");
        CBEstado.setSelectedIndex(0);
        cnx.entablar(suscriptores, TPacientes);
    }//GEN-LAST:event_BNuevoActionPerformed

    private void BGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGraficaActionPerformed
        // 1. VALIDACIÓN: Verificar que haya un suscriptor seleccionado
        int filaSeleccionada = TPacientes.getSelectedRow(); // <--- Asegúrate que tu tabla se llame TSuscriptores

        if (filaSeleccionada == -1) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Seleccione un suscriptor de la tabla para analizar sus eventos.",
                    "Atención",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        String id = TID.getText(); 

         String query = "CALL ObtenerEventosDeUsuario(" + id + ")";


        ArrayList<String> series = new ArrayList<>();
        ArrayList<ArrayList<String>> datos = new ArrayList<>();


        datos = cnx.consultar(query);

        series.add("Total Asistentes");


        GraficaXY graf = new GraficaXY(
                "Popularidad de los eventos a los que asistira ",
                "Eventos",
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
        String nom = TNombre.getText();
        String fech = cnx.toSQL(DCFecha.getDate());
        String pago = CBPago.getSelectedItem().toString();
        String mail = TEmail.getText();
        String est = CBEstado.getSelectedItem().toString();

        String[] valores = new String[]{id, nom, mail, fech, pago, est};
        cnx.insertar("suscriptores", valores);

        cnx.entablar(suscriptores, TPacientes);
    }//GEN-LAST:event_BAgregarActionPerformed

    private void BActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActualizarActionPerformed
        String id = TID.getText();
        String nom = TNombre.getText();
        String fech = cnx.toSQL(DCFecha.getDate());
        String pago = CBPago.getSelectedItem().toString();
        String mail = TEmail.getText();
        String est = CBEstado.getSelectedItem().toString();

        String[] valores = new String[]{id, nom, mail, fech, pago, est};
        cnx.actualizar("suscriptores", valores);

        cnx.entablar(suscriptores, TPacientes);

    }//GEN-LAST:event_BActualizarActionPerformed

    private void BBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBorrarActionPerformed
        String id = TID.getText();
        String nom = TNombre.getText();
        String fech = cnx.toSQL(DCFecha.getDate());
        String pago = CBPago.getSelectedItem().toString();
        String mail = TEmail.getText();
        String est = CBEstado.getSelectedItem().toString();

        String[] valores = new String[]{id, nom, mail, fech, pago, est};
        cnx.borrar("suscriptores", valores);

        cnx.entablar(suscriptores, TPacientes);

    }//GEN-LAST:event_BBorrarActionPerformed

    private void TPacientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TPacientesMousePressed
        DefaultTableModel datos = (DefaultTableModel) TPacientes.getModel();
        int rensel = TPacientes.getSelectedRow();
        if (rensel > -1) {
            String id = datos.getValueAt(rensel, 0).toString();
            String nom = datos.getValueAt(rensel, 1).toString();
            String estado = datos.getValueAt(rensel, 2).toString();
            String fech = cnx.obtenerDato("SELECT fecha_reg FROM suscriptores WHERE idsuscriptores = '" + id + "' ");
            String email = cnx.obtenerDato("SELECT email FROM suscriptores WHERE idsuscriptores = '" + id + "' ");
            String pago = cnx.obtenerDato("SELECT metodo_pago FROM suscriptores WHERE idsuscriptores = '" + id + "' ");

            TID.setText(id);
            TNombre.setText(nom);
            CBPago.setSelectedItem(pago);
            DCFecha.setDate(cnx.toDate(fech));
            System.out.println("FSuscriptores.TPacientesMousePressed()" + cnx.toSQL(DCFecha.getDate()));
            TEmail.setText(email);
            CBEstado.setSelectedItem(estado);

        }
    }//GEN-LAST:event_TPacientesMousePressed

    private void BNuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNuevo1ActionPerformed
        int filaSeleccionada = TPacientes.getSelectedRow(); // <--- Asegúrate que tu tabla se llame TSuscriptores

        if (filaSeleccionada == -1) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Seleccione un suscriptor de la tabla para analizar sus eventos.",
                    "Atención",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        String id = TID.getText();
        String vst=vista+id+vista2;
        
        cnx.entablar(vst, TPacientes);
        
    }//GEN-LAST:event_BNuevo1ActionPerformed

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
                new FSuscriptores().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BActualizar;
    private javax.swing.JButton BAgregar;
    private javax.swing.JButton BBorrar;
    private javax.swing.JButton BGrafica;
    private javax.swing.JButton BNuevo;
    private javax.swing.JButton BNuevo1;
    private javax.swing.JButton BPdf;
    private javax.swing.JComboBox<String> CBEstado;
    private javax.swing.JComboBox<String> CBPago;
    private com.toedter.calendar.JDateChooser DCFecha;
    private javax.swing.JPanel PFondo;
    private javax.swing.JPanel PFormulario;
    private javax.swing.JPanel PTitulo;
    private javax.swing.JTextField TEmail;
    private javax.swing.JTextField TID;
    private javax.swing.JTextField TNombre;
    private javax.swing.JTable TPacientes;
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
