package javacore.chapter03.exercise;

public class CoinChangerV3 {
    public static void main(String[] args) {

        int  monnaie = 35;

        while (monnaie>=50){

            System.out.println("nombre de billet(s) de 50 rendu : "+ monnaie/50);
            monnaie = monnaie- (((monnaie/50))*50);

        }
        while (monnaie>=20){

            System.out.println("nombre de billet(s) de 20 rendu : " + monnaie/20);
            monnaie = monnaie- (((monnaie/20))*20);

        }

        while (monnaie>=10){

            System.out.println("nombre de billet(s) de 10 rendu : " + monnaie/10);
            monnaie = monnaie- (((monnaie/10))*10);

        }

        while (monnaie>=2){

            System.out.println("nombre de billet(s) de 2 rendu : " + monnaie/2);
            monnaie = monnaie- (((monnaie/2))*2);

        }

        while (monnaie>=1){

            System.out.println("nombre de billet(s) de 1 rendu : " + monnaie/1);
            monnaie = monnaie- (((monnaie/1))*1);

        }
    }
}
