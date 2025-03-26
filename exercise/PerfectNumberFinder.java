package javacore.chapter03.exercise;

public class PerfectNumberFinder {
    public static void main(String[] args) {
// pas encore fini aucune idee !


        int number = 21;
        int resultat = 0;
        int addition = 0;

        for(int i = 1 ; i < number; i++  ) {
            if(  number % i  == 0){

                resultat = i;
                addition +=resultat;
                System.out.println(addition);

            }

         }
        if( addition == number){
            System.out.println("le nombre est parfait");
        }else {
            System.out.println("le nombre n'est pas parfait");
        }
    }
}
