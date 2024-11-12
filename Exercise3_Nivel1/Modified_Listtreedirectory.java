package Exercise3_Nivel1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Modified_Listtreedirectory {

    public static void list_directorytree_m(String rutaDirectorio, String archivoSalida) {

        File directorio = new File(rutaDirectorio);

        if (directorio.isDirectory()) {

            try(BufferedWriter writer = new BufferedWriter(new FileWriter(archivoSalida))){

                listarRecursivo(directorio, writer);

                System.out.println("Directorio listado en el archivo: " + archivoSalida);


            }catch (IOException e) {

                System.out.println("Error al escribir en el archivo: " + e.getMessage());

            }

        } else {

            System.out.println("La ruta proporcionada no es un directorio válido.");

        }

    }


    private static void listarRecursivo(File directorio, BufferedWriter writer) throws IOException {

        File[] archivos = directorio.listFiles();

        if (archivos != null) {

            Arrays.sort(archivos);

        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        for (File archivo : archivos) {


            String type = " ";

            if (archivo.isDirectory()) {

                type = "D";

            } else {

                type = "F";

            }

            String fechaModificacion = sdf.format(archivo.lastModified());




                writer.write(type + " " + archivo.getName() + "-" + fechaModificacion);
                writer.newLine();







            if (archivo.isDirectory()) {
                listarRecursivo(archivo,  writer);
            }

        }

    }

}
