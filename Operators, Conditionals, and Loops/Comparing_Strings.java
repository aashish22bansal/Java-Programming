public class Comparing_Strings
{
    public static void main(String args[])
    {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "ABC";
        String s4 = "bcd";
        if(s1.equals(s2))
        {
            System.out.println("s1=s2");
        }
        else
        {
            System.out.println("s1!=s2");
        }
        if(s1.equalsIgnoreCase(s3))
        {
            System.out.println("s1=s3 ignoring the case.");
        }
        else
        {
            System.out.println("s1!=s3 even after ignoring the case");
        }
        if(s1.compareTo(s4) < 0)
        {
            System.out.println("s1<s2");
        }
        else if(s1.compareTo(s4) == 0)
        {
            System.out.println("s1=s2");
        }
        else if(s1.compareTo(s4) > 0)
        {
            System.out.println("s1>s2");
        }
    }
}
