public class Swapping_two_different_Values
{
    public static void main(String [] args)
    {
        int x = 200,y=500;
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.print("After swapping:\n Value of x: "+x+"\n Value of y: "+y);
    }
}
