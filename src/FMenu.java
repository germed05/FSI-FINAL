
public class FMenu extends javax.swing.JFrame {

    
    public FMenu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BEventos = new javax.swing.JButton();
        BSuscriptores = new javax.swing.JButton();
        BContrataciones = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 382));
        setMinimumSize(new java.awt.Dimension(700, 382));

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 440));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 440));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BEventos.setBackground(new java.awt.Color(157, 78, 221));
        BEventos.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        BEventos.setText("Eventos");
        BEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEventosActionPerformed(evt);
            }
        });
        jPanel1.add(BEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 410, 70));

        BSuscriptores.setBackground(new java.awt.Color(157, 78, 221));
        BSuscriptores.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        BSuscriptores.setText("Suscriptores");
        BSuscriptores.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        BSuscriptores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSuscriptoresActionPerformed(evt);
            }
        });
        jPanel1.add(BSuscriptores, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 410, 80));

        BContrataciones.setBackground(new java.awt.Color(157, 78, 221));
        BContrataciones.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        BContrataciones.setText("Contrataciones");
        BContrataciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BContratacionesActionPerformed(evt);
            }
        });
        jPanel1.add(BContrataciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 410, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/FND.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 440));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BSuscriptoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSuscriptoresActionPerformed
    new FSuscriptores().setVisible(true);
    }//GEN-LAST:event_BSuscriptoresActionPerformed

    private void BEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEventosActionPerformed
        new FEventos().setVisible(true);
    }//GEN-LAST:event_BEventosActionPerformed

    private void BContratacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BContratacionesActionPerformed
        new FContrataciones().setVisible(true);
    }//GEN-LAST:event_BContratacionesActionPerformed

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
            java.util.logging.Logger.getLogger(FMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BContrataciones;
    private javax.swing.JButton BEventos;
    private javax.swing.JButton BSuscriptores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
