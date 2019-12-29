import java.util.Arrays;

public class LargestSamllestNoInArray
{
    public static void main(String[] args) {
        int number[]={-10,-88,-100,10,50,87,653285,105845};
        int largest=0;
        int smallest=0;
//loop start form 1 because lagest n smallest number stored in 0 location
        for (int i=1; i<number.length;i++)
        {
            if (number[i]>largest)
            {
                largest=number[i];
             }
            else if (number[i]<smallest)
            {
                smallest=number[i];
            }
        }
        System.out.println("array number :: "+ Arrays.toString(number));
        System.out.println(largest);
        System.out.println(smallest);
    }
}
