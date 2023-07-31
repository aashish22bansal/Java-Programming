/*
* Insertion and appending is possible even in StringBuffers.
*/
public class Appending_and_Inserting_Using_StringBuffers
{
    public static void main(String args[])
    {
        StringBuffer s1 = new StringBuffer("Hello");
        s1.append(" Java");
        System.out.println("s1");
        s1.insert(6,"from ");
        System.out.println(s1);
    }
}
