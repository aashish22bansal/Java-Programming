public class This_Keyword
{
    int num1,num2;
    This_Keyword(int num1,int num2)
    {
        this.num1=num1;
        this.num2=num2;
    }
    void show()
    {
        System.out.println("Value of num1: "+num1+" and num2: "+num2);
    }
    public static void main(String [] args)
    {
        This_Keyword ut = new This_Keyword(100,200);
        ut.show();
    }
}
