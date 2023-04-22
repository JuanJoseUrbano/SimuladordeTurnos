package simuladordeturnos;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JPanel;

public class TurnosProximos extends javax.swing.JFrame {
    private String asistidoUno, asistidoDos, acu1 = "", acu2="";
    private Queue<String>turnoUno = new LinkedList<>();
    private Queue<String>turnoDos = new LinkedList<>();
    public TurnosProximos(Queue<String>turnoUno, Queue<String>turnoDos) {
        initComponents();
    this.turnoUno=turnoUno;
    this.turnoDos= turnoDos;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelVentanaDos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BotonMostrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Texto1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Texto2 = new javax.swing.JTextArea();
        AbrirVentanaTres = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PanelVentanaDos.setBackground(new java.awt.Color(51, 0, 204));

        jLabel1.setFont(new java.awt.Font("Snap ITC", 0, 30)); // NOI18N
        jLabel1.setText("BANCO DE BOGOTÁ");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Cola de turnos en espera.");

        BotonMostrar.setBackground(new java.awt.Color(204, 204, 0));
        BotonMostrar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BotonMostrar.setForeground(new java.awt.Color(0, 0, 0));
        BotonMostrar.setText("Mostrar");
        BotonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMostrarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CAJERO 2");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CAJERO 1");

        Texto1.setEditable(false);
        Texto1.setBackground(new java.awt.Color(204, 204, 0));
        Texto1.setColumns(20);
        Texto1.setRows(5);
        jScrollPane1.setViewportView(Texto1);

        Texto2.setEditable(false);
        Texto2.setBackground(new java.awt.Color(204, 204, 0));
        Texto2.setColumns(20);
        Texto2.setRows(5);
        jScrollPane2.setViewportView(Texto2);

        AbrirVentanaTres.setBackground(new java.awt.Color(204, 204, 0));
        AbrirVentanaTres.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        AbrirVentanaTres.setForeground(new java.awt.Color(0, 0, 0));
        AbrirVentanaTres.setText("Aquí");
        AbrirVentanaTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirVentanaTresActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Mirar turnos Actuales...");

        javax.swing.GroupLayout PanelVentanaDosLayout = new javax.swing.GroupLayout(PanelVentanaDos);
        PanelVentanaDos.setLayout(PanelVentanaDosLayout);
        PanelVentanaDosLayout.setHorizontalGroup(
            PanelVentanaDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVentanaDosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelVentanaDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(BotonMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelVentanaDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanelVentanaDosLayout.createSequentialGroup()
                .addGroup(PanelVentanaDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelVentanaDosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelVentanaDosLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1))
                    .addGroup(PanelVentanaDosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AbrirVentanaTres, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        PanelVentanaDosLayout.setVerticalGroup(
            PanelVentanaDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVentanaDosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(PanelVentanaDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(PanelVentanaDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelVentanaDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(PanelVentanaDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(AbrirVentanaTres, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelVentanaDos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelVentanaDos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMostrarActionPerformed
        BotonMostrar.setEnabled(false);
        // condicionales para agregar turnos hasta que llegue a 10 personas
        if (turnoUno.size() > 1) {
            asistidoUno = turnoUno.poll();
            while (!turnoUno.isEmpty()) {
                acu1+= (" - " + turnoUno.poll() + "\n");
                /*-EE2
                  -EE3
                  -EE4
                */
            }
            Texto1.setText(acu1);
        } else {
            asistidoUno = turnoUno.peek();
            Texto1.setText("Turno: " + turnoUno.poll() + ". Acercarse");
        }
        if (turnoDos.size() > 1) {
            asistidoDos = turnoDos.poll();
            while (!turnoDos.isEmpty()) {
               acu2 += (" - " + turnoDos.poll() + "\n");
            }
            Texto2.setText(acu2);
        } else {
            asistidoDos = turnoDos.peek();
            Texto2.setText("Turno: " + turnoDos.poll() + ". . Acercarse");
        }
    }//GEN-LAST:event_BotonMostrarActionPerformed

    private void AbrirVentanaTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirVentanaTresActionPerformed
       TurnosActuales turnosActuales = new TurnosActuales(asistidoUno, asistidoDos);
       turnosActuales.setVisible(true);
       turnosActuales.setTitle("Turnos Actuales");
       turnosActuales.setContentPane(turnosActuales.getPanelVentanaTres());
       turnosActuales.setLocationRelativeTo(null);
       turnosActuales.setSize(450, 500);
       this.dispose();
    }//GEN-LAST:event_AbrirVentanaTresActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbrirVentanaTres;
    private javax.swing.JButton BotonMostrar;
    private javax.swing.JPanel PanelVentanaDos;
    private javax.swing.JTextArea Texto1;
    private javax.swing.JTextArea Texto2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    public JPanel getPanelVentanaDos() {
        return PanelVentanaDos;
    }

   

}

