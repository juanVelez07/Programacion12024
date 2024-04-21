package co.edu.uniquindio.poo;

public class Circulo extends FiguraGeometrica{
    private double radio;

    public Circulo (double radio){
        assert radio >0;
        this.radio=radio;

    }

    public double getRadio() {
        return radio;
    }

    public double calcularArea(){
        return Math.PI*radio*radio;
    }

}
