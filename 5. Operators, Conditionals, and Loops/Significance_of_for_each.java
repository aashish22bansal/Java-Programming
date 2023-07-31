import java.util.*;
import java.math.BigDecimal;
public final class Significance_of_for_each
{
    public static void main(String args[])
    {
        List<Number> numbers = new ArrayList<Number>();
        numbers.add(new Integer(42));
        numbers.add(new Integer(-30));
        numbers.add(new BigDecimal("654.2"));
        for(Number number:numbers)
        {
            log(number);
        }
        String[] names = {"John","Eda"};
        for(String name:names)
        {
            log("Name: "+name);
        }
        // ITTLERATOR:
        Collection<String> words = new ArrayList<String>();
        words.add("I have the  following choices: ");
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        for(Iterator<String> iter = words.iterator(); iter.hasNext();)
        {
            if(iter.next().length()==4)
            {
                iter.remove();
            }
        }
        log("Edited words: "+words.toString());
        Collection<String> stuff = new ArrayList<String>();
        stuff.add("blah");
        for(Object thing:stuff)
        {
            String item = (String)thing;
            log("Thing: "+item);
        }
    }
    private static void log(Object aThing)
    {
        System.out.println(aThing);
    }
}
