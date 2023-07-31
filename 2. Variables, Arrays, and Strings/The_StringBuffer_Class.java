/* We modify the actual String using a StringBuffer and helps us change the actual content.
**/
public class The_StringBuffer_Class
{
    public static void main(String args[])
    {
        StringBuffer s1 = new StringBuffer("Hello from Java");
        s1.replace(6,10,"to");
        System.out.println(s1);

    }
}
