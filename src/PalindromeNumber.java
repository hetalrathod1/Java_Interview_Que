public class PalindromeNumber
{
    //121 5335 3883 34543
    //teet

    public static boolean isPalindromenumber(int number) {
        int r = 0;
        int o=number;
        while (number!=0)
        {
            r=r*10+number%10;
            number=number/10;

        }
        if (r==o)
        {
            return true;
         }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("peli no :"+isPalindromenumber(34343));
    }
}
