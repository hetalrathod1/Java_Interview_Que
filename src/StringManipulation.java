public class StringManipulation
{
    public static void main(String[] args) {

        String str="The rains have started";
        String str1="The rains Have started";

        System.out.println(str.length());
        System.out.println(str.indexOf('s'));
        System.out.println(str.indexOf('s',str.indexOf('s')+1));
        System.out.println(str.charAt(5));
        System.out.println(str.indexOf("have"));
        //string comparision
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));
        // substring
        System.out.println(str.substring(0,12));
        //trim
        String s="  hello world ";
        System.out.println(s.trim());
        System.out.println(s.replace(" ",""));

        String date = "22-5-2017";
        System.out.println(date.replace("-","/"));

        // split(return type is array so store in array)
        String test="hello_world_selenium_java";
         String testval[]=test.split("_");
         for (int i=0; i<testval.length; i++)
         {
             System.out.println(testval[i]);
         }
         //concatination
        String s2="care";
        System.out.println(s2.concat("s"));


    }
}
