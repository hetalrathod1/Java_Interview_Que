public class CharcterCountString
{
    public static void main(String[] args) {


    String h="hetalh";
    int l=h.length()-1;
    int count =0;
    for (int i=0;i<l;i++)
    {
        if (h.charAt(i)=='a'){
            count=count+1;
        }
    }
        System.out.println(count);
     }
}
