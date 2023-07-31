public class Bitwise_and_Bitwise_Logical_Operators {
    public static void main(String args[])
    {
        int value=12;
        int bit3setting = value & 1 << 3;
        if(bit3setting!=0)
        {
            System.out.println("Bit 3 is set.");
        }
        else
        {
            System.out.println("Bit 3 is not set.");
        }
    }
}
