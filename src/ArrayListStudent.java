import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class ArrayListStudent
{
    public static void main(String[] args) {


        Student s1 = new Student("hetal", 22, 105);
        Student s2 = new Student("chirag", 5, 520);
        Student s3 = new Student("nishu", 45, 652);

        ArrayList<Student> studentdata = new ArrayList<Student>();
        studentdata.add(s1);
        studentdata.add(s2);
        studentdata.add(s3);

        for (Student s4:studentdata)
        {
            System.out.println(s4.id);
            System.out.println(s4.name);
            System.out.println(s4.total);
        }
        System.out.println("=========================");
        Iterator<Student> it = studentdata.iterator();
        while (it.hasNext())
        {
            Student next = it.next();
            System.out.println(next.name);
            System.out.println(next.id);
            System.out.println(next.total);
        }



    }
}
