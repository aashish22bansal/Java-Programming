public class Conversion_between_Data_Types
{
    public static void main(String[] args)
    {
        byte byte1=1;
        int int1;
        int1=byte1;
        System.out.println("The value of variable int1="+int1);

        byte byte2;
        int int2=1;
        byte2=(byte)int2;
        System.out.println("The value of variable byte2="+byte2);

        byte byte3=100;
        byte byte4=100;
        byte byte5;
        byte5=(byte)(byte3*byte4);
        System.out.println("Byte5="+byte5);
    }
}
