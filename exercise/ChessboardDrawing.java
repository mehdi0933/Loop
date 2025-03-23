package javacore.chapter03.exercise;

public class ChessboardDrawing {
    public static void main(String[] args) {

                int numberOfRows = 5;
                char hashatag = '#';
                char tired    = '-';

                for (int i = 0; i < numberOfRows; i++){

                    System.out.println("");

                    for (int j = 0; j < numberOfRows ; j++) {

                        if(i % 2 == 0){

                            if (j % 2  == 0){

                                System.out.print(hashatag + " " );

                            }else{

                                System.out.print(tired + " " );

                            }
                        }else {

                            if (j % 2  == 0){

                                System.out.print(tired + " " );

                            }else {

                                System.out.print(hashatag + " " );
                            }
                        }

                   }

                }
                


                /** resultat de la console
                 * # - # - #
                 * - # - # -
                 * # - # - #
                 * - # - # -
                 * # - # - #
                 */
    }
}


