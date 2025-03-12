package javacore.chapter03.exercise;

public class SmallestDivisorFinder {
    public static void main(String[] args) {

        // value to be tested  3 / 4 / 5 / 6 / 7 / 8 / 9
        int number  = 11;

        int divisor = 2;

        while(number % divisor != 0){

           if(number % divisor != 1 && divisor != number  ){
               System.out.println("le plus petit diviseur de " + number + " et de " + divisor + " est :" +" "+ number / divisor);
           }


            divisor++;

        }

        /**
         * resultat de la console.
         * le plus petit diviseur de 11 et de 3 est : 3
         * le plus petit diviseur de 11 et de 4 est : 2
         * le plus petit diviseur de 11 et de 6 est : 1
         * le plus petit diviseur de 11 et de 7 est : 1
         * le plus petit diviseur de 11 et de 8 est : 1
         * le plus petit diviseur de 11 et de 9 est : 1
         */

        System.out.println( " exercice bonus");

         number  = 7;


        if((number == 2 || number == 3 ||  number == 5) || number % 2 != 0 && number % 3 != 0 && number % 5 != 0){

            System.out.println("Ce nombre est premier !");

        }

        //le resultat de la console : Ce nombre est premier !
    }
}
