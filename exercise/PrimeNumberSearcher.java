package javacore.chapter03.exercise;

public class PrimeNumberSearcher {
    public static void main(String[] args) {

    // trouver le plus petit diviseur

        int dividende = 512;
        
        for (int  diviseur = 2;  diviseur < dividende; diviseur++) {

            if (dividende %  diviseur == 0) {

                System.out.println("le diviseur est : " + diviseur);

            }

        }



      //  exercice bonus  les 50 chiffres premiers


        // ca fonctionne pas

        int numberIteration   = 50;
        int countNumberPrime  = 0;
            dividende         = 2;

        while(countNumberPrime < numberIteration ){

            for (int diviseur = 1; diviseur < dividende ; diviseur++){

                if (dividende % diviseur == 0) {

                     System.out.println(diviseur);
                      dividende++;

                }
            }

            countNumberPrime++;

        }


    }
}

