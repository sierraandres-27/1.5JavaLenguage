package Exercise2_Nivel1;

import Exercise1_Nivel1.List_directory;

public class Main {

    public static void main(String[] args) {


        if(args.length==1){

            String input =args[0];

            Listtree_directory.list_directorytree(input);

        }else {

            System.out.println("Not correct number os arguments");
        }






    }
}
