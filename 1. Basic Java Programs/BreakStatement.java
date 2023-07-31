public class BreakStatement
{
    public static void main(String [] args)
    {
        int [] numbers = {5,10,15,20,25};
        for(int x:numbers)
        {
            if(x==15)
            {
                break;
            }
            System.out.println(x);
        }
    }
}
