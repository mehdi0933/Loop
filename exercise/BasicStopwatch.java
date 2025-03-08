package javacore.chapter03.exercise;

public class BasicStopwatch {

    public static void main(String[] args) throws InterruptedException {

            int s = 0;
            int m = 0;
            int h = 0;

            while (true) {

                Thread.sleep(1000);
                if(s < 10){
                    System.out.println("0"+s);
                } else if (s> 10) {
                    System.out.println(s);

                }


                s++;



               if (s >= 59) {

                    s = 0;
                   if(m < 10){
                       System.out.println("0"+m);
                   } else if (m> 10) {
                       System.out.println(m);

                   }
                    m++;

                }

                if (m >= 60) {

                    m = 0;
                    if(h < 10){
                        System.out.println("0"+h);
                    } else if (h > 10) {
                        System.out.println(h);

                    }
                    h++;

                    System.out.print(h);
                }
                if (h > 23) {

                    h = 0;

                    h++;

                    System.out.print(h);
                }

            }
        }

    }
