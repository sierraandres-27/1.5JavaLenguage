package Exercise5_Nivel1;

import java.io.*;


public class Serializable_metodo {

    public static void testMethods(){

        Persona person =new Persona("Carlos",31);

        serializePerson(person);

        deserializePerson();



    }


    public static void serializePerson(Persona persona) {


        try {
            FileOutputStream fileOutputStream = new FileOutputStream("persona.ser");

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(persona);

            System.out.println("Objeto Persona serializado en el archivo: ");

            objectOutputStream.close();

        } catch (IOException e) {

            System.out.println("Error al serializar el objeto Persona: " + e.getMessage());

        }


    }

    public static void  deserializePerson() {

        try (FileInputStream fileInputStream = new FileInputStream("persona.ser");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);){

            Persona personaEnfichero = (Persona) objectInputStream.readObject();

            System.out.println("Objeto Persona deserializado desde el archivo" );
            System.out.println( "The person: "+personaEnfichero.getName()+", tiene "+personaEnfichero.getAge());


        } catch (IOException | ClassNotFoundException e) {

            System.out.println("Error al deserializar el objeto Persona: " + e.getMessage());

        }


    }

}


