package Exercise2_Nivel1;

import java.io.File;

import java.util.Arrays;

import java.text.SimpleDateFormat;




public class Listtree_directory {


 public static void list_directorytree (String path){

    File directory= new File(path);

    if (directory.isDirectory()){

        listarRecursivo(directory);

    } else{

        System.out.println("Incorrect path or the directoy is a file");

    }

 }


 private static void listarRecursivo(File directory){

     File [] files = directory.listFiles();

     if (files!=null){

         Arrays.sort(files);

     }

     SimpleDateFormat datem = new SimpleDateFormat("dd/MM/yyyy");

     for ( File file : files){

         String type=" ";

         if (file.isDirectory()){

             type="D";

         } else {

             type= "F";

         }

         String datemodification=datem.format(file.lastModified());

         System.out.println(type+" "+file.getName()+"-"+datemodification);

         if (file.isDirectory()){

             listarRecursivo(file);
         }


     }




 }






}
