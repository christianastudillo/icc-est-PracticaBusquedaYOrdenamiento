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
        System.out.println("4. Buscar Persona por Edad");
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
    public int selectSortingMethod() {
        System.out.println("Ingrese la condicion: ");
        System.out.println("1. Ordenamiento por nombre");
        System.out.println("2. Ordenamiento por edad");
        System.out.print("Ingrese un método de ordenamiento: ");
        return scanner.nextInt();
    }

    
}
