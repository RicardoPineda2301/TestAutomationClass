import java.util.Date;
import java.lang.Number;

public class Cliente extends Persona{
    int idCliente;
    Date FechaRegistro;

    public Cliente(Number idPersona, String nombre, String apellido, Number edad, int contadorPersonas, int idCliente, Date fechaRegistro) {
        super(idPersona, nombre, apellido, edad, contadorPersonas);
        this.idCliente = idCliente;
        FechaRegistro = fechaRegistro;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaRegistro() {
        return FechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        FechaRegistro = fechaRegistro;
    }
}
