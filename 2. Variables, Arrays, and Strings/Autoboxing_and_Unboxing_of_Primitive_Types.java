/*
* The statements encapsulating a value within an object is caleed boxing.
* Extracting the values from the type wrapper is known as unboxing.
*/
public class Autoboxing_and_Unboxing_of_Primitive_Types
{
    public static void main(String args[])
    {
        Integer intbox1,intbox2,intbox3;
        intbox1=250;     // encapsulating. This feature is known as autoboxing as we have not defined
                         // the object explicitly by using the new keyword.
        int a = intbox1; // this feature is unboxing.
        System.out.println("The value of intbox1 is: "+intbox1);
        System.out.println("The value of int1 is: "+a);
        intbox2=500;     // reboxing
        System.out.println("The value of intbox2 is: "+intbox2);
        intbox2=intbox2+1; // it will automaatically unbox the variables.
        System.out.println("The value of intbox2 after incrementing is: "+intbox2);
        intbox3=intbox2+(intbox2/5);
        System.out.println("The value of intbox3 after evaluation is: "+intbox3);
        Boolean bbox1=true;
        if(bbox1)
        {
            System.out.println("bbox1 contains the true value");
        }
        Character chbox1='H';
        char chbox2=chbox1;
        System.out.println("The value of chbox2 is "+chbox2);
        Integer intbox4 = Autobox2.mthdbox(500); // calling explicitly
        System.out.println("The value obtained from the method is: "+intbox4);
    }
    static class Autobox2
    {
        static int mthdbox(Integer b)
        {
            return b;
        }
        /*
        public static void main(String args[])
        {
            Integer intbox4 = mthdbox(500);
            System.out.println(intbox4);
        }
        If we include this method, then only this method gets executed not the above method.
         */
    }
}
