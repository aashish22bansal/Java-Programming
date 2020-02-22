import java.util.Random;

public class Generate_Random_Numbers
{
    public static void main(String [] args)
    {
        int rand;
        Random radnum = new Random();

        System.out.println("Result of the random numbers are: ");
        for(rand=1;rand<=5;rand++)
        {
            System.out.println(radnum.nextInt(200));
        }
    }
}
