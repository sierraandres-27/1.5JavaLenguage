package Exercise1_Nivel1;

import java.io.File;
import java.util.Arrays;

public class List_directory {


    public static void ordereDirectory(String path){

        File directory =new File(path);

        if(directory.isDirectory()){

            String[] namesfiles=directory.list();

            if (namesfiles!=null){

                Arrays.sort(namesfiles);

                for (String f:namesfiles){

                    System.out.println(f);


                }
            } else {

                System.out.println("The directory is emprty or is not possible to get it");
            }
        }else {

            System.out.println("The rout is not a valid directory");
        }


    }


}
