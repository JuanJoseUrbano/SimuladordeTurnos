package simuladordeturnos;

public class Persona {
private String nombre;
private String turno;
private String operacion;

    public Persona(){
    }

    public Persona(String nombre, String turno, String operacion) {
        this.nombre = nombre;
        this.turno = turno;
        this.operacion = operacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

}
