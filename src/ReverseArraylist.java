import java.util.ArrayList;
import java.util.Collections;

public class ReverseArraylist
{
    public static void main(String[] args) {

        ArrayList<Integer> n=new ArrayList<Integer>();
        n.add(3);
        n.add(45);
        n.add(35);
        System.out.println(n);

        Collections.reverse(n);
        System.out.println(n);
    }
}
