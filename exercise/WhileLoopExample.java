package javacore.chapter03.exercise;

public class WhileLoopExample {
    public static void main(String[] args){

        int loopCounter = 2;
        int valueMax = 20;
        int multiplacation = 2;

         while (loopCounter <= valueMax){
            System.out.println("les multiple de 2 " + loopCounter );
            loopCounter++;
            multiplacation = loopCounter++ * 2;

        }

        while (valueMax >= loopCounter){
            System.out.println("hello world " + valueMax );
            valueMax--;

        }
    }
}
