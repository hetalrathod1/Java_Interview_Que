public class ReverseString
{

    /*
 How to Reverse a String:
1. using for loop and charAt() method
2. using StringBuffer class and reverse function

Interview Questions:
//Reverse a String
//Difference between String and StringBuffer
//Do we have reverse function in String?

  // String is imutable class and stringbuffer is mutable class thats why we can use reverse function in stringbuffer


     */
    public static void main( String []args)

    {
        String c="chirag";
        int length=c.length();//5
        int i;
        String rev="";

        for (i=length-1; i>=0; i--)
        {
           rev=rev+c.charAt(i);
        }
        System.out.println(rev);

        // using Stringbuffer class

        StringBuffer stringBuffer=new StringBuffer(c);
        System.out.println(stringBuffer.reverse());
    }
}
