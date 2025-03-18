package javacore.chapter03.exercise;

public class ChessboardDrawing {
    public static void main(String[] args) {
// pas encore fini aucune idee !


                int numberOfRows = 5;

                for (int i = 0; i < numberOfRows; i++){

                    System.out.println("");
                    for (int l = 0; l < numberOfRows ; l++) {


                    for (int J = 0; J <  numberOfRows  ; J++){

                          //ca fonctionne pas
                            if(J % 2 == 0){
                               System.out.print(" # ");
                           } else if (J % 2 != 0) {
                               System.out.print("-");
                           }


                    }


                }
                


                /** resultat de la console
                 *  #  #  #  #  #
                 *  #  #  #  #  #
                 *  #  #  #  #  #
                 *  #  #  #  #  #
                 *  #  #  #  #  #
                 */
            }
        }}


