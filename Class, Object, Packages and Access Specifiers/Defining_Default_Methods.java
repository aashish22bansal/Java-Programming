/*
* It is accessible by all the implementation classes of that interface. These classes can override the implementation
* of the default method and provide a different implementation. The default method also allows adding new functionality
* to interfaces present in libraries and makes sure that the new code written for these interfaces should be compatible
* with their older versions.*/
// functional Interface with a default and an abstract methods
interface FuncInterface
{
    // Abstract Method
    void add(int num1,int num2);
    // Default Method
    default void div(int num1,int num2)
    {
        int division=num1/num2;
        System.out.println("The result of division is: "+division);
    }
}
class ImplClass implements FuncInterface
{
    public void add(int num1,int num2)
    {
        int sum=num1+num2;
        System.out.println("The result of addition is: "+sum);
    }
}
class Defining_Default_Methods
{
    public static void main(String args[])
    {
        FuncInterface fi = new ImplClass();
        fi.add(1,2);
        fi.div(4,2);
    }
}
