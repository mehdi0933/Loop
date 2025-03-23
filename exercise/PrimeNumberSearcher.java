package javacore.chapter03.exercise;

public class PrimeNumberSearcher {
    public static void main(String[] args) {

                      /** trouver le plus petit diviseur **/

        int dividende = 12;

        for (int  diviseurPotentiel = 2; diviseurPotentiel < dividende; diviseurPotentiel++) {

          if (dividende % diviseurPotentiel == 0) {

             System.out.println("le plus petit diviseur est : " + diviseurPotentiel);
             diviseurPotentiel = dividende;
              /** le resultat le plus petit diviseur est : 2  */

          }

        }




        /** trouver les 50 1er nombre 1er **/



         int number = 2;
         int countLoop = 0;
         int numberLoopMax = 50;

        while (countLoop< numberLoopMax){

            boolean isNomberPrime = true;

            for (int  diviseurPotentiel = 2; diviseurPotentiel < number; diviseurPotentiel++) {

                if (number % diviseurPotentiel == 0) {

                    isNomberPrime = false;

                }

            }

            if(isNomberPrime){

                System.out.println(number);
                countLoop++;

            }

            number++;

        }

/** le resultat 2
 3
 5
 7
 11
 13
 17
 19
 23
 29
 31
 37
 41
 43
 47
 53
 59
 61
 67
 71
 73
 79
 83
 89
 97
 101
 103
 107
 109
 113
 127
 131
 137
 139
 149
 151
 157
 163
 167
 173
 179
 181
 191
 193
 197
 199
 211
 223
 227
 229  **/

    }
}


