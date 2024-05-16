package co.edu.uniquindio.poo;

public class Empleado extends Persona implements IEmpleado{
    private double salario;

    public Empleado(double salario, String nombre, String apellidos, String cedula) {
        super(nombre, apellidos, cedula);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public int calcularSalario() {
        throw new UnsupportedOperationException("Unimplemented method 'calcularSalario'");
    }

    @Override
    public String toString() {
        return "nombre:" + nombre + "\napellidos:" + apellidos + "\nsalario:" + salario + "\ncedula:" + cedula;
    }

}
