
package simuladordeturnos;

public class Ejecucion {

    public static void main(String[] args) {
        System.out.println("Este es un cambio");
        SolicitarTurno st = new SolicitarTurno();
        st.setVisible(true);
        st.setTitle("Registrarse");
        st.setContentPane(st.getPanelPrincipal());
        st.setLocationRelativeTo(null);
        st.setSize(450,500);
    }
    
}
