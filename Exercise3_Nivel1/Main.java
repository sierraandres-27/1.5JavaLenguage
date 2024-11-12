package Exercise3_Nivel1;


import Exercise1_Nivel1.List_directory;
import Exercise2_Nivel1.Listtree_directory;

public class Main {

    public static void main(String[] args) {


        if(args.length==2){

            String inputroute =args[0];

            String inputfie=args[1];

            Modified_Listtreedirectory.list_directorytree_m(inputroute,inputfie);

        }else {

            System.out.println("Not correct number os arguments");
        }

    }

}
