package co.edu.uniquindio.poo;

public class TrianguloRectangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public TrianguloRectangulo (double base,double altura ){
        assert base >0;
        assert altura>0;
        this.base=base;
        this.altura=altura;

    }
    public double calcularArea(){
        return (base*altura)/2.0;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    
}
