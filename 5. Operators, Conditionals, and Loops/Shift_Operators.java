/*
* The shift operstor shifts the binary bits of the numbers by a specified value.
*/
public class Shift_Operators
{
    public static void main(String args[])
    {
        int value=16,negvalue=-1;
        System.out.println(value + "<< 2 = " + (value << 2));
        System.out.println(value + ">> 2 = " + (value >> 2));
        System.out.println(negvalue + " << 2 = " + (negvalue << 2));
        System.out.println(negvalue + " >> 2 = " + (negvalue >> 2));
    }
}
