public class Static_Variable
{
    int Reg_No;
    String Name;
    static String Company = "Gstevewall";

    Static_Variable(int a,String b)
    {
        Reg_No=a;
        Name=b;
    }
    void display()
    {
        System.out.println("Your details are: "+Reg_No+" Name: "+Name+" "+Company);
    }
    public static void main(String [] args)
    {
        Static_Variable em = new Static_Variable(201,"Aashish");
        em.display();
    }
}
