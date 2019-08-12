public class ReverseInt {
    /*
    How to Reverse an Integer :

Java reverse an int value - Pseudocode:

Let's say number = 12345
a. Extract the rightmost digit of your input number. (12345 % 10) = 5

b. Take that digit (5) and add it into a new reversedNum.

c. Multiply reversedNum by 10 (5 * 10) = 50, this exposes a zero to the right of your (5).

d. Divide the input by 10, (removing the rightmost digit). (12345 / 10) = 1234

e. Repeat at step a with 1234

     */


    public static void main(String[] args) {

        int num=123456;
        int rev=0;
        while (num!=0)
        {
        rev=rev*10+num%10;
        num=num/10;
        }
        System.out.println("reverse no : "+rev);

        // reverse int with stringbuffer
        int num1=123456;
        System.out.println(new StringBuffer(String.valueOf(num1)).reverse());//num we have to convert in string then reverse

    }
}