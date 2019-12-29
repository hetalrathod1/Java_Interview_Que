import java.util.Iterator;

public class ArrayList

{
    public static void main(String[] args) {
        int a[]= new  int[4]; // static array

        //dynamic array - Arraylist
        //1. can contains duplicate value/element
        //2.maintain insertion order
        //3.synchronised
        //4.allow random access to fetch the element because it store the value on the basis of index

        java.util.ArrayList arr=new java.util.ArrayList();
        arr.add("java");
        arr.add("ruby");
        arr.add("python");

        System.out.println(arr.size());// size of arraylist

        // print all value of arraylist
        //1. using for loop
        //2. using iterator
        for (int i=0; i<arr.size();i++)
        {
            System.out.println(arr.get(i));// print all value
        }

        System.out.println("..................");


        java.util.ArrayList<String> arr1 =new java.util.ArrayList<String>();
        arr1.add("hetal");
        arr1.add("chirag");
//        System.out.println("java 8 feature");
//        arr1.forEach(System.out::println);
        System.out.println(arr1.get(1));// print index 1


        java.util.ArrayList<Integer> arr2 =new java.util.ArrayList<Integer>();
        arr2.add(1);
        arr2.add(45);
        System.out.println(arr2.get(1));// print index 1

        // creating Employee class object(we have made employee class constructor in employee class)
        Employee e1=new Employee("hetal",27,"Qa");
        Employee e2=new Employee("chirag",28,"DevOp");
        Employee e3=new Employee("nishu",29,"Qc");

        // create arraylist
        java.util.ArrayList<Employee> arr3=new java.util.ArrayList<Employee>();
        arr3.add(e1);
        arr3.add(e2);
        arr3.add(e3);

        // Iterator to traverse the value
        Iterator<Employee> it = arr3.iterator();// u cannot use for loop so using while loop
        while (it.hasNext())
        {
            Employee emp = it.next();
            System.out.println(emp.name);
            System.out.println(emp.age);
            System.out.println(emp.dept);

        }

        //...........................
        //addAll()
        java.util.ArrayList<String> arr4 =new java.util.ArrayList<String>();
        arr4.add("hetal");
        arr4.add("chirag");
        arr4.add("nishu");

        java.util.ArrayList<String> arr5 =new java.util.ArrayList<String>();
        arr5.add("hetal");
        arr5.add("chirag");

        arr4.addAll(arr5);// add all value of arr5 in arr4(merge two arraylist together)
        for (int i=0; i<arr4.size();i++)
        {
            System.out.println(arr4.get(i));
        }
        System.out.println("******************");
        //removerAll

        arr4.removeAll(arr5);
        for (int i=0; i<arr4.size();i++)
        {
            System.out.println(arr4.get(i));
        }
        System.out.println("*********************");
        //retain all - to check common value
        java.util.ArrayList<String> arr6 =new java.util.ArrayList<String>();
        arr6.add("hetal");
        arr6.add("ila");
        arr6.add("nishu");
        java.util.ArrayList<String> arr7 =new java.util.ArrayList<String>();
        arr7.add("hetal");
        arr7.add("chirag");
        arr7.add("nishu");

         arr7.retainAll(arr6);
         for (int i=0; i<arr7.size();i++)
         {
             System.out.println(arr7.get(i));
         }

    }
}
