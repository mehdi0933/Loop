package javacore.chapter03.exercise;

public class PerfectNumberFinder {
    public static void main(String[] args) {
// pas encore fini aucune idee !
        int start = 1;
        int end   = 50;

        for( int i = start ; i <= end ; i++){
            for( int j = start ; j <= end ; j++){
                if(i % j == 0 && i != j ){

                   // ca ne fonctionne pas

                    //   System.out.println("le plus petit diviseur de " + number + " et de " + i + " est :" +" "+ number / i);
                    System.out.println(i + "/" + j + " = " + i / j );

                    int diviseurs = j;
                    int diviseurs2 = (j++);
                    int diviseursCumule = diviseurs + diviseurs2;

                    System.out.println( j + " j" );
                    if (diviseurs2 == i){
                        System.out.println(i+" est un nombre parfait !");
                    }

                }
                            }
            System.out.println("\n");
        }
    }
}
