package solid.liskovSubstitution;

public class CalcularAreaCuadrado extends CalculoArea {

    @Override
    public void calcularArea() {
        super.calcularArea();
        System.out.println("Algo especifico para el cuadrado.");
    }

}
