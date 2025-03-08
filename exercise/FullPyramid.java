package javacore.chapter03.exercise;

public class FullPyramid {
    public static void main(String[] args) {

        int numberOfRows = 5;

        for (int i = 0; i < numberOfRows; i++){

            System.out.println("");
            for (int l = 0; l < numberOfRows - i-1; l++) {
                System.out.print(" ");
            }

            for (int J = 0; J < i; J++){

                for (int k = 0; k < J; k++){
                    System.out.print("*");

                }

            }

        }

        /**
         * le resultat affiche a la console
         *   *
         *  ***
         * ******
         */
    }
}
