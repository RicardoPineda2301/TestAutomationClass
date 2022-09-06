public class Empleado extends Persona{
    Long IdEmpleado;
    Number sueldo;

    public Empleado(Number idPersona, String nombre, String apellido, Number edad, int contadorPersonas, Long idEmpleado, Number sueldo) {
        super(idPersona, nombre, apellido, edad, contadorPersonas);
        IdEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }

    public Long getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        IdEmpleado = idEmpleado;
    }

    public Number getSueldo() {
        return sueldo;
    }

    public void setSueldo(Number sueldo) {
        this.sueldo = sueldo;
    }
}
