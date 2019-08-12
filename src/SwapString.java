public class SwapString
{
    public static void main(String[] args) {
        String a="hello";
        String b="world";

         //append two string
        a=a+b;//helloworld
        // store a value in b
        b=a.substring(0,b.length());//hello
        System.out.println(b);
        //store b value in a
        a=a.substring(b.length());//world
        System.out.println(a);

    }
}
