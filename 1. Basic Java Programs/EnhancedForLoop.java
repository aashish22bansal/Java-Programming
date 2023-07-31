public class EnhancedForLoop
{
    public static void main(String [] args)
    {
        int [] numbers = {5,10,15,20,25};
        for(int x:numbers)
        {
            System.out.println(x+",");
        }
        System.out.println("\n");
        String [] names = {"Kettle","Pot","Cup","Jug"};
        for(String name:names)
        {
            System.out.println( name + "," );
        }
    }
}
