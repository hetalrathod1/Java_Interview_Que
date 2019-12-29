import java.util.stream.IntStream;

public class Sum_Array
{
    public static void main(String[] args) {

        int number[] = {10, 20, 30};
        int sum1= IntStream.of(number).sum();
        System.out.println(sum1);

        int n[]={50,5,5,10,22};
        int s=IntStream.of(n).sum();
        System.out.println(s);

        // using for loop
        int sum=0;
        for (int i:number)
        {
            sum=sum+i;

        }
        System.out.println(sum);

    }
}
