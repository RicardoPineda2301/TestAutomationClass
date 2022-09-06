import java.util.Date;
import java.lang.Number;

public class Orden {
    Number orden;
    Number ContadorProductos;

    public Orden(Number orden, Number contadorProductos) {
        this.orden = orden;
        ContadorProductos = contadorProductos;
    }

    public Number getOrden() {
        return orden;
    }

    public void setOrden(Number orden) {
        this.orden = orden;
    }

    public Number getContadorProductos() {
        return ContadorProductos;
    }

    public void setContadorProductos(Number contadorProductos) {
        ContadorProductos = contadorProductos;
    }
}
