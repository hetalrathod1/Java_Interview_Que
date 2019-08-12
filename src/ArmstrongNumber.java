import java.sql.SQLOutput;

public class ArmstrongNumber
{
    //153
    //1*1*1=1
    //5*5*5=125
    //3*3*3=27
    // 1+125+27= 153

    public static void isArmstrongNumber(int num)
    {
        int r;
        int cube=0;
        int t;
        t=num;

        while (num>0)
        {
            r=num%10;
            num=num/10;
            cube=cube+(r*r*r);
        }
        if (t==cube)
        {
            System.out.println("armstrong number");
        }
        else
        {
            System.out.println("not a armstrong number" );
        }


    }
    public static void main(String[] args) {
        isArmstrongNumber(153);
    }
}
