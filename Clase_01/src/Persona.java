
public class Persona {
    Number idPersona;
    String nombre;

    public Persona(Number idPersona, String nombre, String apellido, Number edad, int contadorPersonas) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.contadorPersonas = contadorPersonas;
    }

    String apellido;

    public Number getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Number idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Number getEdad() {
        return edad;
    }

    public void setEdad(Number edad) {
        this.edad = edad;
    }

    public int getContadorPersonas() {
        return contadorPersonas;
    }

    public void setContadorPersonas(int contadorPersonas) {
        this.contadorPersonas = contadorPersonas;
    }

    Number edad;
    int contadorPersonas;
}
