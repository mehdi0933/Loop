package javacore.chapter03.exercise;

import java.math.BigInteger;

public class FibonacciCalculator {
    public static void main(String[] args) {

        BigInteger  valeur1 = new BigInteger("0");
        BigInteger  valeur2 = new BigInteger("1") ;
        BigInteger  resutat = new BigInteger("0");
        int  countNombreFinbonacci = 1;
        int  countLoop  = 500;

        System.out.println(countNombreFinbonacci +":"+valeur1);



            for (int i =0 ; i <= countLoop ; i++){
                countNombreFinbonacci++;
                if(countNombreFinbonacci == 500){
                    System.out.println(countNombreFinbonacci +":"+valeur2);
                }


                resutat = valeur1.add(valeur2);

                valeur1 = valeur2;
                valeur2 = resutat;

            }




    }
}
