import java.util.HashSet;
import java.util.Set;

public class DuplicateElementArray {
    public static void main(String[] args) {

        String name[] = {"java", "array", "perl", "python", "perl", "java", "java"};
    // comapre each element.
        for (int i=0;i<name.length;i++){
            for (int j=i+1;j<name.length;j++){
                if (name[i].equals(name[j]))
                {
                    System.out.println(name[i]);
                }
            }
        }
        // using hashset : java collection : it store unique value
          Set<String> store=new HashSet<String>();
        for (String name1: name) {
            if (store.add(name1) == false)
            {
                System.out.println("duplicate name:: "+name1);

            }
        }





}}