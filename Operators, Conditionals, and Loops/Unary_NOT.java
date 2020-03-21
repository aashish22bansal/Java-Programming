/*The '~' operator flips all the bits of numeric arguments, and '!' flips true values to false and false values to true.*/
public class Unary_NOT
{
    public static void main(String args[])
    {
        short s1=32767;
        boolean boolean1 = true;
        System.out.println("Most negative short = "+~s1);
        System.out.println("!true = "+!boolean1);
    }
}
