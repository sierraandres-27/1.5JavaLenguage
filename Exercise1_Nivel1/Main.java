package Exercise1_Nivel1;

public class Main {

    public static void main(String[] args) {


        if(args.length!=1){

            System.out.println("Not correct number os arguments");

        }else {


            String input =args[0];

            List_directory.ordereDirectory(input);

        }






    }
}
