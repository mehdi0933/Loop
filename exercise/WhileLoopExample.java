package javacore.chapter03.exercise;

public class WhileLoopExample {
    public static void main(String[] args){

        int loopCounter = 2;

        int valueMax = 20;


         while (loopCounter <= valueMax){

             System.out.println("les multiple de 2 de 2 jusqu'a 20 : " + loopCounter );

             loopCounter++;

        }


        /**
         * le resultat affiche a la consosole est :
         *les multiple de 2 jusqu'a 20 : 2
         * les multiple de 2 jusqu'a 20 : 3
         * les multiple de 2 jusqu'a 20 : 4
         * les multiple de 2 jusqu'a 20 : 5
         * les multiple de 2 jusqu'a 20 : 6
         * les multiple de 2 jusqu'a 20 : 7
         * les multiple de 2 jusqu'a 20 : 8
         * les multiple de 2 jusqu'a 20 : 9
         * les multiple de 2 jusqu'a 20 : 10
         * les multiple de 2 jusqu'a 20 : 11
         * les multiple de 2 jusqu'a 20 : 12
         * les multiple de 2 jusqu'a 20 : 13
         * les multiple de 2 jusqu'a 20 : 14
         * les multiple de 2 jusqu'a 20 : 15
         * les multiple de 2 jusqu'a 20 : 16
         * les multiple de 2 jusqu'a 20 : 17
         * les multiple de 2 jusqu'a 20 : 18
         * les multiple de 2 jusqu'a 20 : 19
         * les multiple de 2 jusqu'a 20 : 20
         *
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
