import java.util.*;
public class Floyds_Triangle
{
    public static void main(String [] args)
    {
        int x,y,z;
        int num1=1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        x=sc.nextInt();
        for(y=1;y<x;y++)
        {
            for(z=1;z<=y;z++)
            {
                System.out.print(num1+" ");
                num1++;
            }
            System.out.println();
        }
    }
}
