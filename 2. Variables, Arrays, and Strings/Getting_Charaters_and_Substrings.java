public class Getting_Charaters_and_Substrings
{
    public static void main(String args[])
    {
        String s1 = "Hello from Java";

        char c1 = s1.charAt(0);
        System.out.println("The first character of \""+s1+"\" is "+c1);

        char chars1[]=s1.toCharArray();
        System.out.println("The second character of \""+s1+"\" is "+chars1[1]);

        char chars2[] = new char[5];
        s1.getChars(0,5,chars2,0);
        System.out.println("The first five characters of \""+s1+"\" are "+chars2);
        System.out.println("The first five characters of \""+s1+"\" are "+new String(chars2));
        //The output above is different because the data in the string created gets stored as characters.

        String s2 = s1.substring(0,5);
        System.out.println("The substring generated for the first five characters from the main string s1 is: "+s2);
    }
}
