/* Replacing Text is allowed even in StringBuffers*/
public class Replacing_Text_in_StringBuffer
{
    public static void main(String args[])
    {
        StringBuffer s1 = new StringBuffer("Hello from Java!");
        s1.replace(6,10,"to");
        System.out.println(s1);
    }
}
