/*
* Abstraction is the method by which you hide the data from the user which is not required.
* The advantage of abstraction is that the user can work on only the required data and is not required to view the
* unwanted data.*/
class Abstraction
{
    private int x;
    private String str;
    private double bal;
    private double sal;
    private double credit;
    public void disp(int val,String name,double bal)
    {
        x=val;
        str=name;
        bal=bal;
        System.out.println("Account Number: "+x+"\nCustomer Namre: "+name+"\nTotal Balance: "+bal);
    }
}
public class Understanding_Abstraction
{
    public static void main(String args[])
    {
        Abstraction Ab = new Abstraction();
        Ab.disp(100,"ABC",1234567890);
    }
}
