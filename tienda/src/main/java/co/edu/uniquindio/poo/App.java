package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("","","","");
        cliente.setNombre("Luisa");
        cliente.setApellidos("Londoño");
        cliente.setCedula("1321546556");
        cliente.setEmail("juandma.com");
        
        JOptionPane.showMessageDialog(null, cliente);

        Empleado empleado = new Empleado(350000, "Pedro", "", "");
        empleado.setNombre("robinson");
        empleado.setApellidos("rios");
        empleado.setCedula("54565654");
        empleado.setSalario(200000);
        JOptionPane.showMessageDialog(null, empleado);
        System.out.println("HOLAA");
    }
}

