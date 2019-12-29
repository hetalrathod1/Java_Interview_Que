import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class DifferentWayOfIteratingArray
{
    public static void main(String args[]) {
        ArrayList<String> tvseries = new ArrayList<String>();
        tvseries.add("Game of Thornes");
        tvseries.add("Breaking Bad");
        tvseries.add("The Big Bang Theory");
        tvseries.add("The Walking Dad");
        tvseries.add("Prision Break");

        //iterating arraylist using java 8 foreach() with lamda expression
        System.out.println("===using foreach() with lamda expression==");

        tvseries.forEach(shows ->{
             System.out.println(shows);
         });
         // using iterator
        System.out.println("===using iterator==");
       Iterator<String> it= tvseries.iterator();
       while (it.hasNext())
       {
           String show=it.next();
           System.out.println(show);
       }
        System.out.println("===using for each loop==");
        for (String str:tvseries)
        {
            System.out.println(str);
        }
        System.out.println("===using java and iteraor and lamda and foreachremaining==");
      Iterator<String> it1= tvseries.iterator();
       it.forEachRemaining(show ->{
           System.out.println(show);
       });
        System.out.println("==using listiterator and traverse value=====");
        ListIterator<String>tvseriesiterator=tvseries.listIterator(tvseries.size());
        while (tvseriesiterator.hasPrevious())
        {

           String tv= tvseriesiterator.previous();
            System.out.println(tv);
        }
    }
}
