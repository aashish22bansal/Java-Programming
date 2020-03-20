/*
* Varargs means variable length arguments or a method that takes a variable number of arguments.
* Instead of passing multiple arguments in an array, varargs automates and hides the process.
* It can be used only in the final argument position.
*/
public class Fundamentals_of_Varargs_Methods
{
    public static void main(String args[])
    {
        int list1[]={10,20,30,40,50,60,70,80,90,100};
        int total=0;
        for(int int1:list1)
        {
            System.out.println("Values of the element is: "+int1);
            total=total+int1;
        }
        System.out.println("Total sum of values defined is: "+total);
    }
}
