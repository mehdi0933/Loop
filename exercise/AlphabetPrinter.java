package javacore.chapter03.exercise;

public class AlphabetPrinter {
    public static void main(String[] args) {

       char letterA = 'A';

       char letterAPrime = 'A';

        char letterZ = 'Z';

       char letterMinusculeA = 'a';

       char letterMinusculeZ = 'z';

        /**
         *          exercice demande
         */

        while (letterA <= letterZ){

            System.out.print(letterA );

            letterA++;

        }
/**
 * exercice bonus  sans utilisation +32
 */
        System.out.println("\n");

        letterA = 'A';

        while (letterMinusculeA <= letterMinusculeZ){


            if (letterA <= letterAPrime){

                System.out.print(letterA);

                letterA++;

            }
            System.out.print(letterMinusculeA);

            letterMinusculeA++;

        }

        /**
         * ce qui sort de dans la console :
         * exercice demande
         * ABCDEFGHIJKLMNOPQRSTUVWXYZ
         * exercice bonus
         * Aabcdefghijklmnopqrstuvwxyz
         */
    }
}

