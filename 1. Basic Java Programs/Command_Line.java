public class Command_Line
{
    public static void main(String args[])
    {
        System.out.println("Command-line arguments are:");
        for(String str:args)
        {
            int argument=Integer.parseInt(str);
            System.out.println("Argument in integer form: "+argument);
        }
    }
}
