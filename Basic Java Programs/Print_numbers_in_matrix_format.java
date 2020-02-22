import java.io.*;
public class Print_numbers_in_matrix_format
{
    public static void main(String [] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1[][] = new int[3][3];
        int x,y;
        System.out.println("Enter nine integer values: ");
        for(x=0;x<3;x++)
        {
            for(y=0;y<3;y++)
            {
                System.out.print("x: "+x+" y: "+y+"\t Value: ");
                num1[x][y]=Integer.parseInt(br.readLine());
            }
        }
        for(x=0;x<num1.length;x++)
        {
            for(y=0;y<3;y++)
            {
                System.out.print(" "+num1[x][y]);
            }
            System.out.println();
        }
    }
}
