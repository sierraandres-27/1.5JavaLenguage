package Exercise4_Nivel1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Readtxt {

    public static void leerArchivoTxt(String rutaArchivo) {

        File archivo = new File(rutaArchivo);

        // Verificar si el archivo existe y es un archivo de texto
        if (archivo.exists() && archivo.isFile() && archivo.getName().endsWith(".txt")) {

            try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
                String linea;
                while ((linea = reader.readLine()) != null) {
                    System.out.println(linea);
                }
            } catch (IOException e) {
                System.out.println("Error al leer el archivo: " + e.getMessage());
            }
        } else {
            System.out.println("El archivo especificado no existe o no es un archivo de texto válido.");
        }
    }

}
