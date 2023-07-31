/*
* In Java, you can call a lambda expression by creating a functional interface, which ia an interface comprising only
* one abstract method. The advantage of using multiple interface is that it can be used to for assigning a lambda
* expression or as a method reference.
*/
public class Using_Lambda_Expression
{
    interface Functional_Interface
    {
        void show_Message();
    }
    public static void main(String args[])
    {
        Functional_Interface FI = () -> {System.out.println("Hello Everyone!");};
        FI.show_Message();
    }
}
