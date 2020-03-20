/**
 * These functions help us find the length of the string initially assigned and how mush of length has been used up in
 * initalising after the declaration. Java is so flexible that it allows us to change the system allocated length for
 * the string.
 */
public class Getting_and_Setting_StringBuffer_Lengths_and_Capacities
{
    public static void main(String args[])
    {
        StringBuffer s1 = new StringBuffer("Hello from Java!");
        System.out.println("The length of thr string is "+s1.length());
        System.out.println("The allocated length is "+s1.capacity());
        s1.setLength(2000);
        System.out.println("The new length of the String is: "+s1.length());
    }
}
