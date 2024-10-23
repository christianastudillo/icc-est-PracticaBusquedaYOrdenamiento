package controllers;

import models.Person;
import views.View;

public class Controller {
    private View view;
    private SortingMethods sortingMethods;
    private SearchMethods searchMethods;
    private Person[] personas;

    public Controller(View view, SortingMethods sortingMethods, SearchMethods searchMethods) {
        this.view = view;
        this.searchMethods = searchMethods;
        this.sortingMethods = sortingMethods;
        this.personas = new Person[0];
        System.out.println("Controller Created");
    }

    public void start() {
        int option;
        do {
            option = view.showMenu();
            switch (option) {
                case 1:
                    inputPersons();
                    break;
                case 2:
                    //view.displayPersons(personas);
                    //view.showPersons(personas);
                    view.displayPersons(personas);
                    break;
                case 3:
                    sortPersons();
                    break;
                case 4:
                    //searchPersonByAge();
                    break;
                case 5:
                    //searchPersonByName();
                    break;
                case 100:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (option != 0); 
    }
    public void sortPersons() {
        int sortingOption = view.selectSortingMethod();
        if (sortingOption == 1) {
            sortingMethods.sortByNameWithBubble(personas);
        } else if (sortingOption == 2) {
            sortingMethods.sortByNameWithSelection(personas);
        } else if (sortingOption == 3) {
            sortingMethods.sortByAgeWithBubble(personas); // Cambio: agregar opción para ordenar por edad
        } else if (sortingOption == 4) {
            sortingMethods.sortByAgeWithSelection(personas); // Cambio: agregar opción para ordenar por edad
        } else {
            view.showMessage("Opción no válida");
        }
        view.displayPersons(personas);
    }

    public void inputPersons() {
        int numeroPersonas = view.inputInt("Ingrese el número de personas: ");
        personas = new Person[numeroPersonas]; 

        for (int i = 0; i < numeroPersonas; i++) {
            personas[i] = view.inputPerson(); 
        }
    }

    public void addPerson() {
        if(personas == null) {
            view.showMessage("No existen personas");
            inputPersons();
        }
        int numeroPersonas = view.inputInt("Ingrese el número de personas a agregar: ");
        
        Person[] personasTotales = new Person[personas.length + numeroPersonas];
        
        for (int i = 0; i < personas.length; i++) {
            personasTotales[i] = personas[i];
        }
        
        for (int i = personas.length; i < personasTotales.length; i++) {
            personasTotales[i] = view.inputPerson();
        }
        
        personas = personasTotales;
    }
}
