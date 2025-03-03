package javacore.chapter03.exercise;

public class SmallestDivisorFinder {
    public static void main(String[] args) {
int number = 10;
int divisor = 4;
while (number % divisor != 0){
    System.out.println("  l8  "+ number+ " % "+ divisor+ " = " + (number % divisor));
    System.out.println(divisor++ + " une itertion fini");

    divisor++;
}
    }
}
