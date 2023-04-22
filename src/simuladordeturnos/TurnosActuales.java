package simuladordeturnos;

import javax.swing.JPanel;

public class TurnosActuales extends javax.swing.JFrame {
    private String atendidoFila1;
    private String atendidoFila2;
    public TurnosActuales(String atendido1, String atendido2) {
        initComponents();
        atendidoFila1 = atendido1;
        atendidoFila2= atendido2;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JtextTurnoAtendido1 = new javax.swing.JTextField();
        PanelVentanaTres = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TurnoAtendido1 = new javax.swing.JTextField();
        TurnoAtendido2 = new javax.swing.JTextField();
        BotonMostrarTActuales = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        JtextTurnoAtendido1.setEditable(false);
        JtextTurnoAtendido1.setBackground(new java.awt.Color(255, 255, 255));
        JtextTurnoAtendido1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        JtextTurnoAtendido1.setForeground(new java.awt.Color(0, 0, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PanelVentanaTres.setBackground(new java.awt.Color(0, 0, 204));

        jLabel1.setFont(new java.awt.Font("Snap ITC", 0, 30)); // NOI18N
        jLabel1.setText("BANCO DE BOGOTÁ");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("CAJERO 1 :");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("CAJERO 2 :");

        TurnoAtendido1.setEditable(false);
        TurnoAtendido1.setBackground(new java.awt.Color(255, 255, 255));
        TurnoAtendido1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TurnoAtendido1.setForeground(new java.awt.Color(0, 0, 0));

        TurnoAtendido2.setEditable(false);
        TurnoAtendido2.setBackground(new java.awt.Color(255, 255, 255));
        TurnoAtendido2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TurnoAtendido2.setForeground(new java.awt.Color(0, 0, 0));

        BotonMostrarTActuales.setBackground(new java.awt.Color(204, 204, 0));
        BotonMostrarTActuales.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BotonMostrarTActuales.setForeground(new java.awt.Color(0, 0, 0));
        BotonMostrarTActuales.setText("Mostrar");
        BotonMostrarTActuales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMostrarTActualesActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Turnos siendo atendidos.");

        javax.swing.GroupLayout PanelVentanaTresLayout = new javax.swing.GroupLayout(PanelVentanaTres);
        PanelVentanaTres.setLayout(PanelVentanaTresLayout);
        PanelVentanaTresLayout.setHorizontalGroup(
            PanelVentanaTresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVentanaTresLayout.createSequentialGroup()
                .addGroup(PanelVentanaTresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelVentanaTresLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(PanelVentanaTresLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(PanelVentanaTresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(PanelVentanaTresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TurnoAtendido2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TurnoAtendido1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelVentanaTresLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel7))
                    .addGroup(PanelVentanaTresLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(BotonMostrarTActuales, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        PanelVentanaTresLayout.setVerticalGroup(
            PanelVentanaTresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVentanaTresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelVentanaTresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelVentanaTresLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(24, 24, 24)
                        .addGroup(PanelVentanaTresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TurnoAtendido1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel6))
                    .addComponent(TurnoAtendido2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BotonMostrarTActuales, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelVentanaTres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelVentanaTres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonMostrarTActualesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMostrarTActualesActionPerformed
        BotonMostrarTActuales.setEnabled(false);
        TurnoAtendido1.setText(atendidoFila1);
        TurnoAtendido2.setText(atendidoFila2);
    }//GEN-LAST:event_BotonMostrarTActualesActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonMostrarTActuales;
    private javax.swing.JTextField JtextTurnoAtendido1;
    private javax.swing.JPanel PanelVentanaTres;
    private javax.swing.JTextField TurnoAtendido1;
    private javax.swing.JTextField TurnoAtendido2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

    public JPanel getPanelVentanaTres() {
        return PanelVentanaTres;
    }


}
