public class User_defined_Exceptions extends Exception
{
    User_defined_Exceptions(String str)
    {
        super(str);
    }
    public static void main(String args[])
    {
        try
        {
            int a[]={4,6,7,8,9};
            int sum=0;
            for(int i=0;i<a.length;i++)
            {
                sum=sum+a[i];
            }
            System.out.println("Sum of the array elements is "+sum);
            if(sum<100)
            {
                User_defined_Exceptions own = new User_defined_Exceptions("Total sum of the array elements is less than 100");
                throw own;
            }
        }
        catch(User_defined_Exceptions own)
        {
            System.out.println("Exception is "+own);
        }
    }
}
