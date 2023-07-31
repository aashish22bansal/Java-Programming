public class Using_nested_try_blocks
{
    public static void main(String args[])
    {
        try
        {
            int j,x=10,y;
            int k[]=new int[10];
            for(int i=0;i<args.length;i++)
            {
                System.out.println("Values retrieve through command line are "+args[i]);
            }
            try
            {
                for(j=0;j<args.length;j++)
                {
                    k[j]=Integer.parseInt(args[j]);
                    x=x/k[j];
                }
                System.out.println(x);
            }
            catch(ArithmeticException ae)
            {
                System.out.println("Exception is "+ae);
                System.out.println("Value is divided by zero, which is not allowed.");
            }
        }
        catch (Exception e)
        {
            System.out.println("Exception is "+e);
        }
    }
}
