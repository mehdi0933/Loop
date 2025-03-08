package javacore.chapter03.exercise;

public class WhileLoopExample {
    public static void main(String[] args) throws InterruptedException {



        int loopCounter = 1;

        int valueMax = 10;


        while (loopCounter <= valueMax){

            System.out.println("une suite de nombre "+loopCounter);

            loopCounter++;

        }
        /**
         * le resultat a la console est :
         * une suite de nombre 1
         * une suite de nombre 2
         * une suite de nombre 3
         * une suite de nombre 4
         * une suite de nombre 5
         * une suite de nombre 6
         * une suite de nombre 7
         * une suite de nombre 8
         * une suite de nombre 9
         * une suite de nombre 10
         */


        loopCounter = 2;

        valueMax = 20;


         while (loopCounter <= valueMax){

             System.out.println("les multiple de 2 de 2 jusqu'a 20 : " + loopCounter );

             loopCounter += 2;

        }


        /**
         * le resultat affiche a la consosole est :
         les multiple de 2 de 2 jusqu'a 20 : 2
         les multiple de 2 de 2 jusqu'a 20 : 4
         les multiple de 2 de 2 jusqu'a 20 : 6
         les multiple de 2 de 2 jusqu'a 20 : 8
         les multiple de 2 de 2 jusqu'a 20 : 10
         les multiple de 2 de 2 jusqu'a 20 : 12
         les multiple de 2 de 2 jusqu'a 20 : 14
         les multiple de 2 de 2 jusqu'a 20 : 16
         les multiple de 2 de 2 jusqu'a 20 : 18
         les multiple de 2 de 2 jusqu'a 20 : 20
         */

        loopCounter = 1;


        while (valueMax >= loopCounter){

            System.out.println("hello world " + valueMax );

            valueMax--;

        }


        /**
         *  le resultat affiche a la consosole  est:
         * hello world 20
         * hello world 19
         * hello world 18
         * hello world 17
         * hello world 16
         * hello world 15
         * hello world 14
         * hello world 13
         * hello world 12
         * hello world 11
         * hello world 10
         * hello world 9
         * hello world 8
         * hello world 7
         * hello world 6
         * hello world 5
         * hello world 4
         * hello world 3
         * hello world 2
         * hello world 1
         * Process finished with exit code 0
         */
    }


}
