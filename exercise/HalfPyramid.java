package javacore.chapter03.exercise;

public class HalfPyramid {
    public static void main(String[] args) {

        int numberOfRows = 5;

        for (int i = 0; i < numberOfRows; i++){

            System.out.println("");


            for (int J = 0; J < i; J++){

                for (int k = 0; k < J; k++){

                    System.out.print("*");
                }

            }

        }

            /**
             * le resultat affiche a la console
             * *
             * **
             * ***
             * ****
             */
    }
}
