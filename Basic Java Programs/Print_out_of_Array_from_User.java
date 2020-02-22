import java.io.*;
public class Print_out_of_Array_from_User
{
    public static void main(String [] args) throws IOException
    {
        int x[]=new int[7];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Array: ");
        for(int i=0;i<7;i++)
        {
            System.out.print("Element "+i+" : ");
            x[i]= Integer.parseInt(br.readLine());
        }
        for(int y=0;y<x.length;y++)
        {
            System.out.print(" "+x[y]);
        }
    }
}
