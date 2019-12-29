import java.util.Scanner;

public class PrimeNumber {
    //prime number start from 2
    // prime number can divided by itself or 1 only

    public static boolean PrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;}

        public static void main (String[]args){
            System.out.println("8 is prime number ::" + PrimeNumber(5));

        }
    }

