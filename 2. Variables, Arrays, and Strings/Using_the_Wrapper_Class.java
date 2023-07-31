/*
* Java provides a wrapper class inorder to use the primitive data types as objects, which wraps the
* primitive data types within an object. So, every primitive data type has a corresponding class
* defined in the Java API class Library.
*/
public class Using_the_Wrapper_Class
{
    public static void main(String args[])
    {
        Integer intwrap = new Integer(250);
        Character chrwrap = new Character('H');
        int int1 = intwrap.intValue();
        char chr1 = chrwrap.charValue();
        System.out.println(int1+"    "+intwrap);
        System.out.println(chr1+"    "+chrwrap);
    }
}
