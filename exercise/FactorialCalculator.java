package javacore.chapter03.exercise;

public class FactorialCalculator {
    public static void main(String[] args) {

        int number  = 6;

        long result = 1L;

        int count   = 1;


        if(number < 0){

            System.err.println(" le nombre doit etre positif");
        }

        if(number == 0){

        System.err.println(" le nombre doit etre supperieur a 0 si on multiplie par 0 le resultat est 0");

        }


        while (count < number){

            result= result * count;

            count++;

        }
        System.out.println(" la factorielle de " + ""+number + " est : " + result);

        // la factorielle de 6 est : 120 le resultat affiche a la console

    }
}
