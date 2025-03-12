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

    System.out.println(" les 50 chiffres premiers  : ");

    int compteurNombrePremier = 1 ;


        for(int i = 2 ; i <= 229 ; i ++){

            if ((i == 2 || i == 3 ||  i == 5 || i == 7 || i == 11 || i == 13) || i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && i % 11 != 0 && i % 13 != 0){

                System.out.println("on compte les nombre premier  "+compteurNombrePremier++ +" "+ i );
    }


// resultat affiche a la console*
            /**
             *  les 50 chiffres premiers  : on compte les nombre premier  0 1
             * on compte les nombre premier  1 2
             * on compte les nombre premier  2 3
             * on compte les nombre premier  3 5
             * on compte les nombre premier  4 7
             * on compte les nombre premier  5 11
             * on compte les nombre premier  6 13
             * on compte les nombre premier  7 17
             * on compte les nombre premier  8 19
             * on compte les nombre premier  9 23
             * on compte les nombre premier  10 29
             * on compte les nombre premier  11 31
             * on compte les nombre premier  12 37
             * on compte les nombre premier  13 41
             * on compte les nombre premier  14 43
             * on compte les nombre premier  15 47
             * on compte les nombre premier  16 53
             * on compte les nombre premier  17 59
             * on compte les nombre premier  18 61
             * on compte les nombre premier  19 67
             * on compte les nombre premier  20 71
             * on compte les nombre premier  21 73
             * on compte les nombre premier  22 79
             * on compte les nombre premier  23 83
             * on compte les nombre premier  24 89
             * on compte les nombre premier  25 97
             * on compte les nombre premier  26 101
             * on compte les nombre premier  27 103
             * on compte les nombre premier  28 107
             * on compte les nombre premier  29 109
             * on compte les nombre premier  30 113
             * on compte les nombre premier  31 127
             * on compte les nombre premier  32 131
             * on compte les nombre premier  33 137
             * on compte les nombre premier  34 139
             * on compte les nombre premier  35 149
             * on compte les nombre premier  36 151
             * on compte les nombre premier  37 157
             * on compte les nombre premier  38 163
             * on compte les nombre premier  39 167
             * on compte les nombre premier  40 173
             * on compte les nombre premier  41 179
             * on compte les nombre premier  42 181
             * on compte les nombre premier  43 191
             * on compte les nombre premier  44 193
             * on compte les nombre premier  45 197
             * on compte les nombre premier  46 199
             * on compte les nombre premier  47 211
             * on compte les nombre premier  48 223
             * on compte les nombre premier  49 227
             * on compte les nombre premier  50 229
             */
  }
        // ca fonctionne pas
int a = 10 ;

        while (a<= 50 ){
            System.out.println(a);
            if ( a % 2 != 0){
                System.out.println(a);
                a++;
            }

        }
 }
}
