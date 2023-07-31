public class Searching_For_and_Replacing_Strings
{
    public static void main(String args[])
    {
        String s1 = "You did a great job.";
        System.out.println("The first occurence of \"a\" is at location "+s1.indexOf("a"));

        System.out.println("The last occurence of \"a\" is at location "+s1.lastIndexOf("a"));

        String s2 = "John, you're hired!";
        System.out.println(s2.replace('h','f'));
    }
}
