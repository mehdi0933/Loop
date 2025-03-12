package javacore.chapter03.exercise;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        int nombre =153;
        int centaine = nombre%100;
        centaine= nombre - centaine;
        System.out.println(centaine );
// totalement faut fini aucune idee !
// recherche comment realiser la puissance  ce code est faux
           int a = 150;
           int b = 0;
           while( a >= 50){
               System.out.println(a);
               a = a - 50 ;
               b++;

           }
        System.out.println(b);
        }
    }

