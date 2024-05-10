package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.Scanner;

public class Zoologico {
    
    public static Scanner scanner= new Scanner(System.in);
    public static LinkedList<Animal> animales = new LinkedList<>();
    public static void main(String[] args) {
    
    int opcion=0;

    while (opcion<=4){
        System.out.println("\nMenú principal:");
        System.out.println("\n1. Añadir un animal");
        System.out.println("2. Mostrar animales");
        System.out.println("3. Mostrar tipo de sonido");
        System.out.println("4. Salir");

        System.out.print("\nIngrese la opción que desea realizar: ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                anadirAnimal();
                break;
            case 2:
                mostrarAnimales();
                break;
            case 3:
                hacerSonido();
                break;
            case 4:
                System.out.println("Chao.......");
                break;
        }
    }
    }
    private static void anadirAnimal(){
        System.out.println("\nSeleccione el tipo de animal según las siguientes opciones: \n 1.Perro,  2.Gato,  3.Pato\n");
        System.out.print("Ingrese el tipo de animal: ");
        int tipoAnimal = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Ingrese el nombre del animal: ");
        String nombre= scanner.nextLine();

        System.out.print("Ingrese la edad del animal: ");
        int edad= scanner.nextInt();

        switch (tipoAnimal) {
            case 1:
                animales.add(new Perro(nombre, edad));
                break;
            case 2:
                animales.add(new Gato(nombre, edad));
                break;
            case 3:
                animales.add(new Pato(nombre, edad));
                break;
            default:
                System.err.println(" La opción ingresada no es válida");
        }


    }
    private static void mostrarAnimales(){
        for (Animal animal: animales){
            System.out.println(animal);
        }
    }
    private static void hacerSonido(){
        for (Animal animal: animales){
            animal.hacerSonido();
        }
    }
}
