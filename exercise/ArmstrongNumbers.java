package javacore.chapter03.exercise;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        // value tested for arstrong number
        int nombre = 101;

        int centaine = nombre%100;
        int resteCentaine = centaine;

        // centaine de la variable nombre
        centaine= (nombre - resteCentaine)/100;

        int untite = resteCentaine%10;
       // System.out.println(untite);
        int dizaine = (resteCentaine - untite) / 10;

        int resultatPuissanceCentaine = centaine;
        int resultatPuissanceDizaine  = dizaine;
        int resultatPuissanceUnite    = untite;
int p = 0;
int d = 0;
int c =0 ;
        for (int i = 1;  i <= 9; i++) {

            for (int j = 0; j < i; j++) {

                if(resultatPuissanceUnite == 1 || resultatPuissanceUnite == 0 ){
                }else {
                    int saveValueUnite     = i;
                    int saveValueDizaine   = i;
                    int saveValueCentaine  = i;

                  // System.out.print(saveValueI);
                    //System.out.println(  " jz suis dans le esles"+resultatPuissanceCentaine);
                    saveValueUnite *= resultatPuissanceUnite;
                  p = saveValueUnite;//     122333444455555666666777777788888888999999999
                    System.out.println(p);

                    if(resultatPuissanceCentaine == 1){
                        c =1;
                        System.out.println(c + "  c  ");  
                    }else {
                        saveValueCentaine *= resultatPuissanceCentaine;
                        c = saveValueCentaine;
                        System.out.println(c + "  c  ");
                    }
                     if((p+c)==64){
                         System.out.println(" 64");
                          j +=i;
                     }

              //i *=resultatPuissanceDizaine;
              //d = saveValueI;
                   // System.out.println(d + "  d  "+  " " + p + " p1");
                    System.out.println("    ");
                   // System.out.println(p + "   p2 ");
                if(j == 8){
                    j +=i;
                }

            } }

           // resultatPuissanceCentaine*=i;
          //  resultatPuissanceDizaine*=i;

        //    System.out.println(tes*=p);


            if(((resultatPuissanceCentaine + resultatPuissanceDizaine + resultatPuissanceUnite)) == 9){
               // System.out.println(" le resultat est 153");//6
                }else{
                //System.out.println("dans le else");
            }

        }
      /**


        for (int i = 1;  i < untite; i++) {

            resultatPuissanceUnite*=untite;

        }

        System.out.println(resultatPuissanceCentaine);
        System.out.println(resultatPuissanceDizaine);
        System.out.println(resultatPuissanceUnite);**/

    }
    }

