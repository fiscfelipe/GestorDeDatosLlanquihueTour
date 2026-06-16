package ui;

import data.GestorDatos;
import model.Tour;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String rutaArchivo = "resources/tours.txt";
        
        GestorDatos gestor = new GestorDatos();

        ArrayList<Tour> tours = gestor.cargarTours(rutaArchivo);

        System.out.println("---- Llanquihue Tour tiene los siguientes panoramas para ti ----");

        for (Tour tour : tours) {
            System.out.println(tour);
        }

        System.out.println("\n\n --- Tours agotados ----");

        for (Tour tour : tours) {

            if (tour.getStock() == 0) {
                System.out.println(tour);
            }
        }
    }
    
}