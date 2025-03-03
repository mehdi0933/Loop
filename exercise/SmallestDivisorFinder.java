package javacore.chapter03.exercise;

public class SmallestDivisorFinder {
    public static void main(String[] args) {

        int number = 10;

        // value to be tested 2 / 3 / 4 / 5 / 6 / 7 / 8 / 9
        int divisor = 9 ;

        while(number % divisor != 0){

            System.out.println("le plus petit diviseur du nombres" + number + " est :" +" "+ number % divisor);

            divisor++;

        }

        // le resultat affiche est : le plus petit diviseur du nombres10 est : 1

        while(number % divisor == 0){

            System.out.println(number + " est paire");

            divisor++;

        }
        // le resultat affiche est : 10 est paire
    }
}
