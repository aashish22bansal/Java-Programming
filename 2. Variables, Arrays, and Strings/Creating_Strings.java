public class Creating_Strings
{
    public static void main(String args[])
    {
        String s1="Hello!";
        String s2;
        s2="Hi";
        String s3=new String();
        s3 = "hey";
        String s4 = new String("Sup!");
        char c1[]={'H','e','y',' ','t','h','e','r','e'};
        String s5 = new String(c1);
        String s6 = new String(c1,0,2);
        String s7 = String.valueOf(c1);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
    }
}
