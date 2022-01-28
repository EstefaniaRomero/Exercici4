import java.util.Scanner;

public class Exercici4 {


    public static void main(String[] args) {



        String nom;
        Scanner in = new Scanner(System.in);
        System.out.println("Introdueix el teu Nom: ");
        nom = in.nextLine();
        System.out.println(nom);

        for(int contador = 0; contador < nom.length () ; contador ++ ){

            System.out.println(nom.charAt(contador));



        }




    }
}
