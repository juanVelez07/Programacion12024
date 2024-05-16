package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Juan", "Perez", "12345", "j@gmail.com");
        JOptionPane.showMessageDialog(null, cliente);

        Empleado empleado = new Empleado(350000, "Pedro", "Rios", "p@gmail.com");
        JOptionPane.showMessageDialog(null, empleado);
    }
}
