package views;

import java.util.Scanner;
import models.Person;

public class View {
    private Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    public int showMenu() {
        System.out.println("Menu:");
        System.out.println("1. Ingresar Personas");
        System.out.println("2. Mostrar Personas");
        System.out.println("3. Ordenar Personas");
        //System.out.println("4. Buscar Persona por Edad");
        //System.out.println("5. Buscar Persona por Nombre");
        System.out.println("100. Salir");
        System.out.print("Ingrese una opción: ");
        return scanner.nextInt(); 
    }

    public int inputInt(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }

    public Person inputPerson() {
        String name = inputName();  
        int age = inputAge(); 
        System.out.println("--------------");     
        return new Person(name, age); 
    }

    public String inputName() {
        System.out.print("Ingrese nombre: ");
        return scanner.next();
    }

    public int inputAge() {
        System.out.print("Ingrese edad: ");
        return scanner.nextInt();
    }
    public void showMessage(String message) {
        System.out.println("LOG" + message);
    }
    // public int selectSortingMethod() {
    //     System.out.println("Ingrese la condicion: ");
    //     System.out.println("1. Ordenamiento por nombre");
    //     System.out.println("2. Ordenamiento por edad");
    //     System.out.print("Ingrese un método de ordenamiento: ");
    //     return scanner.nextInt();
    // }
    public void showPersons(Person[] personas) {
        for (Person persona : personas) {
            System.out.println(persona);
        }
    }
    public void displayPersons(Person[] personas) {
        if (personas == null || personas.length == 0) {
            System.out.println("No hay personas para mostrar.");
            return;
        }

        System.out.println("Lista de personas:");
        for (Person persona : personas) {
            System.out.println(persona);  // Asumiendo que la clase Person tiene el método toString() implementado.
        }
    }
    public int selectSortingMethod() {
        System.out.println("Seleccione el método de ordenamiento:");
        System.out.println("1. Ordenamiento por nombre (Burbuja)");
        System.out.println("2. Ordenamiento por nombre (Selección)");
        System.out.println("3. Ordenamiento por edad (Burbuja)");
        System.out.println("4. Ordenamiento por edad (Selección)");
        System.out.print("Ingrese un método de ordenamiento: ");
        return scanner.nextInt();
    }
    
}
