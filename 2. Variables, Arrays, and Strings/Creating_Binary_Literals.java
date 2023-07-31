public class Creating_Binary_Literals
{
    public static void main(String[] args)
    {
        int val=0b00010000;
        int myPhases[]={0b00110011,0b11001100,0b01010101,0b11111111};
        for(int i=0;i<4;i++)
        {
            System.out.println("The values of myPhase["+i+"] is "+myPhases[i]);
        }
    }
}
