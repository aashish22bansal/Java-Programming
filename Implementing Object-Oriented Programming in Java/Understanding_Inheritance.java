/*
* The feature by which one class acquires the characteristics of another class is known as inheritance.
*/
class Inheritance
{
    private String name;
    public void setName(String n)
    {
        name = n;
    }
    public void getName()
    {
        System.out.println("Name: "+name);
    }
}
public class Understanding_Inheritance extends Inheritance
{
    private String sport;
    public void setSport(String sp)
    {
        sport = sp;
    }
    public void getSport()
    {
        System.out.println("Sport: "+sport);
    }
    public static void main(String args[])
    {
        Understanding_Inheritance UI = new Understanding_Inheritance();
        UI.setName("ABC");
        UI.setSport("Basketball");
        UI.getName();
        UI.getSport();
    }
}
