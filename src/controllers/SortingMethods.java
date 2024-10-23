package controllers;

import models.Person;

public class SortingMethods {

    // Método de burbuja para ordenar por nombre
    public Person[] sortByNameWithBubble(Person[] personas) {
        int tamanio = personas.length;
        for (int i = 0; i < tamanio - 1; i++) {
            for (int j = i + 1; j < tamanio; j++) {
                if (personas[i].getName().compareTo(personas[j].getName()) > 0) {
                    Person aux = personas[i];
                    personas[i] = personas[j];
                    personas[j] = aux;
                }
            }
        }
        return personas;
    }
    // Método de selección para ordenar por nombre
    public Person[] sortByNameWithSelection(Person[] personas) {
        int tamanio = personas.length;

        for (int i = 0; i < tamanio - 1; i++) {
            int indice = i;
            for (int j = i + 1; j < tamanio; j++) {
                if (personas[j].getName().compareTo(personas[indice].getName()) < 0) {
                    indice = j;
                }
            }
            Person aux = personas[indice];
            personas[indice] = personas[i];
            personas[i] = aux;
        }
        return personas;
    }

    // Método de burbuja para ordenar por edad
    public Person[] sortByAgeWithBubble(Person[] personas) {
        int tamanio = personas.length;
        for (int i = 0; i < tamanio - 1; i++) {
            for (int j = 0; j < tamanio - 1 - i; j++) {
                if (personas[j].getAge() > personas[j + 1].getAge()) {
                    Person aux = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = aux;
                }
            }
        }
        return personas;
    }

    // Método de selección para ordenar por edad
    public Person[] sortByAgeWithSelection(Person[] personas) {
        int tamanio = personas.length;

        for (int i = 0; i < tamanio - 1; i++) {
            int indice = i;
            for (int j = i + 1; j < tamanio; j++) {
                if (personas[j].getAge() < personas[indice].getAge()) {
                    indice = j;
                }
            }
            Person aux = personas[indice];
            personas[indice] = personas[i];
            personas[i] = aux;
        }
        return personas;
    }
}