/* Deletion of certain text is possible even in StringBuffers in Java. */
public class Deleting_Text_in_StringBuffers
{
    public static void main(String args[])
    {
        StringBuffer s1 = new StringBuffer("We are not having a good time.");
        s1.delete(7,11);
        System.out.println(s1);
    }
}
