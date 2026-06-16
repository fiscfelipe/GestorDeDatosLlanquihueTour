package data;

import model.Tour;
import java.io.*;
import java.util.ArrayList;

public class GestorDatos {
   /**
    *  /**
     * Método para generar una lista a partir de los datos de un archivo.txt
     * @param rutaArchivo ruta donde está el archivo con la información.
     * @return listaTours, la cual es una lista donde cada elemento contiene un objeto de tipo Tour.
    
    */
    public ArrayList<Tour> cargarTours(String rutaArchivo) {

        ArrayList<Tour> listaTours = new ArrayList<>();

        try {

            BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));

            String linea;

            while ((linea = lector.readLine()) != null) {

                String[] datos = linea.split(";");

                String nombre = datos[0];
                String tipo = datos[1];
                int precio = Integer.parseInt(datos[2]);
                int stock = Integer.parseInt(datos[3]);

                Tour tour = new Tour(nombre, tipo, precio, stock);

                listaTours.add(tour);
            }

            lector.close();

        } catch (IOException e) {
            System.out.println("ERROR, no se pudo leer el archivo: "+ e.getMessage());
        }

        return listaTours;
    }
}