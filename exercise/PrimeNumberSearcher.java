package javacore.chapter03.exercise;

public class PrimeNumberSearcher {
    public static void main(String[] args) {

      int number = 11;

      for (int i = 2 ; i <= 100 ; i ++){


            if(number % i != 1  && i < number ){
                System.out.println("le plus petit diviseur de " + number + " et de " + i + " est :" +" "+ number / i);
            }


      }

        /**
         * resultat de la console.
         * le plus petit diviseur de 11 et de 3 est : 3
         * le plus petit diviseur de 11 et de 4 est : 2
         * le plus petit diviseur de 11 et de 6 est : 1
         * le plus petit diviseur de 11 et de 7 est : 1
         * le plus petit diviseur de 11 et de 8 est : 1
         * le plus petit diviseur de 11 et de 9 est : 1
         */

        System.out.println("exercice bonus");

    System.out.print(" les chiffres premiers jusqu'a 50 : ");

    for(int i = 0 ; i <= 50 ; i ++){

    if ((i == 2 || i == 3 ||  i == 5) || i % 2 != 0 && i % 3 != 0 && i % 5 != 0){
        System.out.print(i+" ");
    }
// resultat affiche a la console 1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 49
  }

 }
}
