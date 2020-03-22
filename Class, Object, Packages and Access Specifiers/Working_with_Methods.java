public class Working_with_Methods
{
    public void no_para()
    {
        int j=5;
        int k=6;
        int s=j+k;
        System.out.println("Sum of two numbers in a method withod parameters is: "+s);
    }
    public void para(int a,int b)
    {
        int c,d;
        c=a;
        d=b;
        int sum=c+d;
        System.out.println("The sum of the numbers in a method with parameters is: "+sum);
    }
    public static void main(String args[])
    {
        Working_with_Methods get_sum = new Working_with_Methods();
        Working_with_Methods get_sum1 = new Working_with_Methods();
        get_sum.no_para();
        get_sum1.para(1,2);
    }
}
