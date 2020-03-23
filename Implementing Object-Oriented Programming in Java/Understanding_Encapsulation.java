/*
* In Java, one class cannot access another class directly. To access the member functions of another class, one needs
* to create an instance of that class inside the other class.*/
class Student
{
    private String name;
    private String subject;
    public void desc(String n,String sub)
    {
        name=n;
        subject=sub;
        System.out.println(name+" is doing Post-Graduation in "+subject);
    }
}
public class Understanding_Encapsulation
{
    public static void main(String args[])
    {
        Student UE = new Student();
        UE.desc("ABC DEF","Information Technology");
    }
}
