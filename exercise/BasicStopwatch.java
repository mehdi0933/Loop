package javacore.chapter03.exercise;

public class BasicStopwatch {

    public static void main(String[] args) throws InterruptedException {

            int s = 0;
            int m = 0;
            int h = 0;

            while (true) {

                Thread.sleep(1000);



                s++;



               if (s >= 59) {

                    s = 0;

                    m++;

                }

                if (m >= 60) {

                    m = 0;

                    h++;

                }

                if (h >= 24) {

                    h = 0;
                    
                }


                System.out.printf("%02d:%02d:%02d%n", h, m, s);

            }
        }

    }
