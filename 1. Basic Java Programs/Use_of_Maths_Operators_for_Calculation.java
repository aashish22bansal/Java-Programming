import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Use_of_Maths_Operators_for_Calculation
{
    public static void main(String [] args) throws IOException
    {
        int x=0,y=0,z=0,xyz=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the First Number: ");
        try
        {
            xyz= Integer.parseInt(br.readLine());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("Enter the First Number: ");
        xyz = Integer.parseInt(br.readLine());

        while(xyz!=6)
        {
            System.out.print("Main Menu: \n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division\n5. Exit \n Enter your choice: ");
            switch(xyz)
            {
                case 1:
                    z=x+y;
                    System.out.println("Result: "+z);
                    break;
                case 2:
                    z=x-y;
                    System.out.println("Result: "+z);
                    break;
                case 3:
                    z=x*y;
                    System.out.println("Result: "+z);
                    break;
                case 4:
                    z=x/y;
                    System.out.println("Result: "+z);
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
