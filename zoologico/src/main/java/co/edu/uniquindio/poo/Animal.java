package co.edu.uniquindio.poo;

public abstract class Animal {
    public String nombre;
    public int edad;

    public abstract void hacerSonido();

    public Animal (String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", edad=" + edad;
    }
    
}
