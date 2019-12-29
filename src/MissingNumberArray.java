public class MissingNumberArray
{
    /*
    You can do this in O(n). Iterate through the array and compute the sum of all numbers. Now, sum of natural numbers from 1 to N, can be expressed as Nx(N+1)/2.

Subtract the sum of the array from Nx(N+1)/2.

That is the missing number.
     */

    public static void main(String args[])
    {
        int a[]={0,1,2,3,4,5,6,7,9};
        int sum=0;
        for (int i=0; i<a.length; i++)
        {
            sum=sum+a[i];
        }
        System.out.println(sum);

        int sum1=0;
        for (int j=0; j<=9; j++)
        {
              sum1= sum1+j;
        }
        System.out.println(sum1);

        System.out.println("missing no ::"+(sum1-sum));
    }
}
