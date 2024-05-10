package co.edu.uniquindio.poo;

public class Pato extends Animal{

    public Pato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Cuac Cuac");
    }
    
}
