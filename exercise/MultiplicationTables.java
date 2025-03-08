package javacore.chapter03.exercise;

public class MultiplicationTables {
    public static void main(String[] args) {


        int maxTableNumber = 10;
        int maxMuplicationNumber= 15;


        resultMultiplication(maxTableNumber, maxMuplicationNumber);

    }




        public static void resultMultiplication ( int maxTableNumber, int maxMuplicationNumber ){

            for (int i = 1; i <= maxTableNumber; i++) {

                System.out.print(" table de multiplication "+ i + " : ");

                for (int j = 1; j <= maxMuplicationNumber; j++) {


                    System.out.print(" "+(i * j)+" ");



                }
                System.out.println("\n");
            }
        }
    }







