public class StringManipulation
{
    public static void main(String[] args) {

        String str="The rains have started";
        String str1="The rains Have started";
        System.out.println("======");
        System.out.println(str.length());
        System.out.println(str.indexOf('s'));
        System.out.println(str.indexOf('s',str.indexOf('s')+1));
        System.out.println(str.charAt(5));
        System.out.println(str.indexOf("have"));
        System.out.println("======");

        //string comparision
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println("======");

        // substring
        System.out.println("======");

        System.out.println(str.substring(0,12));
        System.out.println("======");

        //trim
        String s="  hello world ";
        System.out.println(s.trim());
        System.out.println(s.replace(" ",""));

        String date = "22-5-2017";
        System.out.println(date.replace("-","/"));

        // split(return type is array so store in array)
        System.out.println("======");

        String test="hello_world_selenium_java";
        // once u remove _ there will be 4 string so we cannot store in variable
        //we have to store in array
         String testval[]=test.split("_");
         for (int i=0; i<testval.length; i++)
         {
             System.out.println(testval[i]);
         }
         //concatination
        System.out.println("======");

        String s2="care";
        System.out.println(s2.concat("s"));

        String x="hello";
        String y="world";
        int a=100;
        int b=200;
        System.out.println(x+y);
        System.out.println(x+y+a+b);
        System.out.println(x+y+(a+b));
        System.out.println(a+b+x+y);

    }
}
