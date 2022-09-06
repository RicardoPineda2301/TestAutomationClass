import java.util.Date;
import java.lang.Number;

public class Producto {
    Number IdProducto;
    String Nombre;
    Number precio;
    Number ContadorProducto;

    public Producto(Number idProducto, String nombre, Number precio, Number contadorProducto) {
        IdProducto = idProducto;
        Nombre = nombre;
        this.precio = precio;
        ContadorProducto = contadorProducto;
    }

    public Number getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(Number idProducto) {
        IdProducto = idProducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Number getPrecio() {
        return precio;
    }

    public void setPrecio(Number precio) {
        this.precio = precio;
    }

    public Number getContadorProducto() {
        return ContadorProducto;
    }

    public void setContadorProducto(Number contadorProducto) {
        ContadorProducto = contadorProducto;
    }
}
