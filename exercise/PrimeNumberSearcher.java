package javacore.chapter03.exercise;

public class PrimeNumberSearcher {
    public static void main(String[] args) {

        int number = 512;
        int resultat = 0;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                resultat = i;
                System.out.println(resultat);
            }

        }

        System.out.println("===================================");
        System.out.println("exercice bonus");

        System.out.println(" les 50 chiffres premiers  : ");

 
        // ca fonctionne pas
        System.out.println("bonus");
            number = 2;
        int count = 0;
while(count < 50 ){
    for (int i = 0; i < number ; i++){
        if (number % i == 0) {
            System.out.println(i);
            count++;
        }
    }
    number++;
}


    }
}

