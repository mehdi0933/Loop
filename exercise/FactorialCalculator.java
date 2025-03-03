package javacore.chapter03.exercise;

public class FactorialCalculator {
    public static void main(String[] args) {
        int number  = 30;
        long result = 1L;
        int count   = 0;
        if(number < 0){
            System.err.println(" le nombre doit etre positif");
        }
        if(number == 0){
        System.err.println(" le nombre doit etre supperieur a 0 si on multiplie par 0 le resultat est 0");
        }
        while (count < number){

            count++;
           // System.out.println(count);
            result= result * count;
            System.out.println(result);

        }



    }
}
