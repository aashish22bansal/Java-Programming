/*
* When a subclass includes a method definition that has the same name, number, and type of parameters as a method
* already defined in its superclass, the definition of the method created in the subclass replaces the definition
* of the method created in the superclass. This is called method overriding. In other words, you can create a new
* definition for an already existing method through method overriding.
*/
class Method_Overriding
{
    public double calculate()
    {
        double speed, distance, time;
        distance = 100;
        time = 1;
        speed = distance/time;
        return speed;
    }
}
public class Method_Overriding_in_Inheritance extends Method_Overriding
{
    public double calculate()
    {
        double d;
        d=super.calculate();
        System.out.println("The Speed of the vedicle is "+d+" Km/h");
        return d;
    }
    public static void main(String args[])
    {
        Method_Overriding_in_Inheritance MOI = new Method_Overriding_in_Inheritance();
        MOI.calculate();
    }
}
