public class Working_with_Objects
{
    public void disp()
    {
        String fname="ABC";
        String sname="DEF";
        int age=19;
        System.out.println("The First Name of the person is: "+fname);
        System.out.println("The Last Name of the person is: "+sname);
        System.out.println("The Age of the person is: "+age);
    }
    public static void main(String args[])
    {
        Working_with_Objects info;         // declaring variable of class type
        info = new Working_with_Objects(); // creating an object and sorting its reference in variable
        info.disp();                       // calling the disp method through object reference variable
    }
}
