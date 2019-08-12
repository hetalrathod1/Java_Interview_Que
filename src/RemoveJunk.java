public class RemoveJunk
{
    /*
    How to Remove Junk/Special Characters in a String by using Regular Expression:

-Remove special chars/Chinese/Japanese chars from a String.

We use this Regular Expression: [^a-zA-Z0-9] to remove the Junk Characters from a String.

     */


    public static void main(String args[])
    {
        String s="hetal £$% Automation_=()@";

        // regular expression - regex [^a-zA-Z0-9]

        s=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);
    }
}
