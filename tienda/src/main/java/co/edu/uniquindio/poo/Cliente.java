package co.edu.uniquindio.poo;

public class Cliente extends Persona implements ICliente{

    private String email;

    public Cliente(String nombre, String apellidos, String cedula, String email) {
        super(nombre, apellidos, cedula);
        this.email=email;
    
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int calcularMaximoCompras() {
        throw new UnsupportedOperationException("Unimplemented method 'calcularMaximoCompras'");
    }

    @Override
    public String toString() {
        return "nombre:" + nombre + "\napellidos:" + apellidos + "\nemail:" + email + "\ncedula=" + cedula;
    }  
    
}
