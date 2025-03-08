package javacore.chapter03.exercise;

public class ForLoopExample {
    public static void main(String[] args) {

        System.out.println("exercice 1");

        for( int i = 1 ; i <= 10 ; i++ ){

            System.out.print(i);
        }
        // le resultat a la console 12345678910

        System.out.println("\nexercice 2");
        for( int i = 10 ; i >= 1 ; i-- ){

            System.out.print(i);
        }
        // le resultat a la console 10987654321

        System.out.println("\nexercice 3");

        for( int i = 2 ; i <= 20 ; i+=2 ){

            System.out.print(i);
        }

        // le resultat a la console 2468101214161820

        System.out.println("\nexercice 4");

         char  letterZ = 'Z' ;

        for (char letterA = 'A'; letterA <= letterZ ; letterA++ ){

            System.out.print(letterA);

        }

        // le resultat a la console ABCDEFGHIJKLMNOPQRSTUVWXYZ

        System.out.println("\nexercice 5");

        int  factorielle = 4;
        long resutat = 1L;

        for (int i = 1 ; i <= factorielle ; i++ ){

            resutat = i * resutat;

        }
        System.out.println("la factorielle de "+""+factorielle+" de "+resutat);
        // le resultat a la console la factorielle de 4 de 24
    }
}
