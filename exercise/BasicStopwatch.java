package javacore.chapter03.exercise;

public class BasicStopwatch {

    public static void main(String[] args) throws InterruptedException {

            int i = 0;

            int secoond = 0;
            int minute  = 0;
            int hours   = 0;


            while (i < 100) {

                Thread.sleep(1000);



                secoond++;



               if (secoond >= 59) {

                    secoond = 0;

                    minute++;

                }

                if (minute >= 60) {

                    minute = 0;

                    secoond++;

                }

                if (hours  >= 24) {

                    hours  = 0;

                }

                String displayHours   = hours   < 10  ? "0" + hours    : "" + hours ;
                String displayMinute  = minute  < 10  ? "0" + minute   : "" + minute;
                String displaySecoond = secoond < 10  ? "0" + secoond  : "" + secoond;

                System.out.println(displayHours+":"+displayMinute+":"+displaySecoond);

              // System.out.printf("%02d:%02d:%02d%n", hours , minute, secoond);
                i++;

            }


    }}
