package javacore.chapter03.exercise;

public class AlphabetPrinter {
    public static void main(String[] args) {

       char letterA = 'A';

       char letterMinusculeZ = 'z';


        while (letterA <= letterMinusculeZ){

            System.out.print(letterA);

            char lettreMinisculeA =  letterA+=32;

          while ( lettreMinisculeA <= letterMinusculeZ){

             System.out.print(lettreMinisculeA);

              lettreMinisculeA++;

          }
          break;


          // ce qui sort de dans la console :  Aabcdefghijklmnopqrstuvwxyz

        }
    }
}
