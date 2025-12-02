
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class FContrataciones extends javax.swing.JFrame {

    //Video del programa funcionando o de las peticiones 
    ImageIcon icono = new ImageIcon(getClass().getResource("/img/pacientes.png"));

    //-------------
    String url = "https://xglizaola.site/mysql.php";
    ConexionHR cnx = new ConexionHR(url);

    String contrataciones = "SELECT suscriptores_idsuscriptores AS suscriptores, eventos_ideventos AS evento, fecha_pago, codigo_acceso, estado_pago FROM contrataciones ORDER BY suscriptores_idsuscriptores ";
    String suscriptor = "SELECT idsuscriptores FROM suscriptores GROUP BY idsuscriptores ORDER BY idsuscriptores";
    String evento = "SELECT ideventos FROM eventos GROUP BY ideventos ORDER BY ideventos";
    String estpago = "SELECT estado_pago FROM contrataciones GROUP BY estado_pago ORDER BY estado_pago";
    String asistencia = "SELECT titulo_evento, estado_pago\n"
            + "FROM contrataciones\n"
            + "JOIN eventos ON eventos_ideventos = ideventos\n";//Estados de pago
    String evts = "SELECT estado_pago, COUNT(estado_pago) as Total\n"
            + "FROM contrataciones ";
    String grupo = "GROUP BY estado_pago";//agruparlo por evento
    //------------

    public FContrataciones() {
        initComponents();
        TPacientes.setAutoCreateRowSorter(true);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(this);
        this.setIconImage(icono.getImage());

        cnx.entablar(contrataciones, TPacientes);
        cnx.seleccionar(suscriptor, CBSuscriptor);
        cnx.seleccionar(evento, CBEvento);
        cnx.seleccionar(estpago, CBEstado);
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
        jLabel4 = new javax.swing.JLabel();
        CBSuscriptor = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        CBEstado = new javax.swing.JComboBox<>();
        DCFecha = new com.toedter.calendar.JDateChooser();
        CBEvento = new javax.swing.JComboBox<>();
        TFCodigo = new javax.swing.JTextField();
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
        jLabel9.setText("Contrataciones");
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

        PFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del suscriptor:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(78, 80, 82));
        jLabel1.setText("Suscriptor:");

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(78, 80, 82));
        jLabel2.setText("Evento:");

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(78, 80, 82));
        jLabel3.setText("Fecha De Pago");

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(78, 80, 82));
        jLabel4.setText("Codigo de Acceso");

        CBSuscriptor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "xxxx" }));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(78, 80, 82));
        jLabel6.setText("Estado de Pago");

        CBEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aprobado", "Pendiente", "Rechazado" }));

        DCFecha.setDateFormatString("yyyy MM dd");

        CBEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "xxxx" }));
        CBEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBEventoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PFormularioLayout = new javax.swing.GroupLayout(PFormulario);
        PFormulario.setLayout(PFormularioLayout);
        PFormularioLayout.setHorizontalGroup(
            PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CBSuscriptor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PFormularioLayout.createSequentialGroup()
                        .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TFCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DCFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PFormularioLayout.setVerticalGroup(
            PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PFormularioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CBSuscriptor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CBEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(DCFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(PFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(CBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
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
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        String id = CBSuscriptor.getSelectedItem().toString();
        String query = asistencia + "WHERE suscriptores_idsuscriptores = '" + id + "' ";
        cnx.crearPDF("EventView", "Estado de pago eventos",
                query, new float[]{0.5f, 0.5f}, "Estado_pago");
        cnx.visualizarPDF("Estado_pago");

    }//GEN-LAST:event_BPdfActionPerformed

    private void BNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNuevoActionPerformed
        DCFecha.setDate(new Date());
        CBSuscriptor.setSelectedIndex(0);
        CBEstado.setSelectedIndex(0);
        CBEvento.setSelectedIndex(0);
        TFCodigo.setText("");
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
        String id = CBSuscriptor.getSelectedItem().toString();
        String query = evts + "WHERE suscriptores_idsuscriptores = '" + id + "' " + grupo;

        ArrayList<String> series = new ArrayList<>();
        ArrayList<ArrayList<String>> datos = new ArrayList<>();

        datos = cnx.consultar(query);

        series.add("Total Asistentes");

        GraficaXY graf = new GraficaXY(
                "Estadistica de pago por usuario",
                "Eventos",
                "Personas Asistiendo",
                series,
                datos
        );

// 5. MOSTRAR EN PANTALLA
        PFondo.removeAll();       // Limpia el gráfico anterior
        PFondo.add(graf.chartPanel); // Añade el nuevo
        PFondo.updateUI();        // Refresca la interfaz

    }//GEN-LAST:event_BGraficaActionPerformed

    private void BAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAgregarActionPerformed
        String id = CBSuscriptor.getSelectedItem().toString();
        String event = CBEvento.getSelectedItem().toString();
        String fech = cnx.toSQL(DCFecha.getDate());
        String cdg = TFCodigo.getText();
        String est = CBEstado.getSelectedItem().toString();
        String[] valores = new String[]{id, event, fech, cdg, est};
        cnx.insertar("contrataciones", valores);

        cnx.entablar(contrataciones, TPacientes);
    }//GEN-LAST:event_BAgregarActionPerformed

    private void BActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActualizarActionPerformed
        String id = CBSuscriptor.getSelectedItem().toString();
        String event = CBEvento.getSelectedItem().toString();
        String fech = cnx.toSQL(DCFecha.getDate());
        String cdg = TFCodigo.getText();
        String est = CBEstado.getSelectedItem().toString();
        String[] valores = new String[]{id, event, fech, cdg, est};
        cnx.actualizarDoble("contrataciones", valores, "Suscriptores_idsuscriptores", id, "eventos_ideventos", event);

        cnx.entablar(contrataciones, TPacientes);

    }//GEN-LAST:event_BActualizarActionPerformed

    private void BBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBorrarActionPerformed
        String id = CBSuscriptor.getSelectedItem().toString();
        String event = CBEvento.getSelectedItem().toString();
        String fech = cnx.toSQL(DCFecha.getDate());
        String cdg = TFCodigo.getText();
        String est = CBEstado.getSelectedItem().toString();
        String[] valores = new String[]{id, event, fech, cdg, est};
        cnx.borrarDoble("contrataciones", "suscriptores_idsuscriptores", id, "eventos_ideventos", event);

        cnx.entablar(contrataciones, TPacientes);

    }//GEN-LAST:event_BBorrarActionPerformed

    private void TPacientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TPacientesMousePressed
        DefaultTableModel datos = (DefaultTableModel) TPacientes.getModel();
        
        
        int rensel = TPacientes.getSelectedRow();
        
        if (rensel > -1) {
            
            int renselModel = TPacientes.convertRowIndexToModel(rensel);
            

            
            String id = datos.getValueAt(renselModel, 0).toString();     // ID Suscriptor
            String event = datos.getValueAt(renselModel, 1).toString();  // ID Evento
            String estado = datos.getValueAt(renselModel, 4).toString(); // Estado Pago
            
            String fech = cnx.obtenerDato("SELECT fecha_pago FROM contrataciones WHERE suscriptores_idsuscriptores = '" + id + "' AND eventos_ideventos = '" + event + "' ");
            String cdg = cnx.obtenerDato("SELECT codigo_acceso FROM contrataciones WHERE suscriptores_idsuscriptores = '" + id + "' AND eventos_ideventos = '" + event + "' ");

            
            CBSuscriptor.setSelectedItem(id);
            CBEvento.setSelectedItem(event);
            DCFecha.setDate(cnx.toDate(fech));
            CBEstado.setSelectedItem(estado);
            TFCodigo.setText(cdg);
        }
    }//GEN-LAST:event_TPacientesMousePressed

    private void CBEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBEventoActionPerformed

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
                new FContrataciones().setVisible(true);
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
    private javax.swing.JComboBox<String> CBEstado;
    private javax.swing.JComboBox<String> CBEvento;
    private javax.swing.JComboBox<String> CBSuscriptor;
    private com.toedter.calendar.JDateChooser DCFecha;
    private javax.swing.JPanel PFondo;
    private javax.swing.JPanel PFormulario;
    private javax.swing.JPanel PTitulo;
    private javax.swing.JTextField TFCodigo;
    private javax.swing.JTable TPacientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

}
