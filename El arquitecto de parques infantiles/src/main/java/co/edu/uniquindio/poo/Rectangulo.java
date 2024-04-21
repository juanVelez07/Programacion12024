package co.edu.uniquindio.poo;

public class Rectangulo extends FiguraGeometrica{
    public double ancho;
    public double alto;

    public Rectangulo (double ancho, double alto){
        assert ancho > 0;
        assert alto >0;
        this.ancho=ancho;
        this.alto=alto;
    }

    public double calcularArea() {
        return ancho*alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }
    
}
