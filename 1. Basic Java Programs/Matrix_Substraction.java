import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix_Substraction
{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1[][] = new int[3][3];
        int num2[][] = new int[3][3];
        int num3[][] = new int[3][3];
        System.out.println("INput Matrix 1: ");
        for(int x=0;x<3;x++)
        {
            for(int y=0;y<3;y++)
            {
                System.out.print("x: "+x+" y: "+y+"\t\t Value: ");
                num1[x][y]= Integer.parseInt(br.readLine());
            }
        }
        System.out.println("\n Input Matrix 2: ");
        for(int x=0;x<3;x++)
        {
            for(int y=0;y<3;y++)
            {
                System.out.print("x: "+x+" y: "+y+"\t\t Value: ");
                num2[x][y]= Integer.parseInt(br.readLine());
            }
        }
        System.out.println("Displaying both the MAtrices: ");
        System.out.println("Matrix 1: ");
        for(int x=0;x<3;x++)
        {
            for(int y=0;y<3;y++)
            {
                System.out.print("\t"+num1[x][y]);
            }
            System.out.println();
        }
        System.out.println("\nMatrix 2: ");
        for(int x=0;x<3;x++)
        {
            for(int y=0;y<3;y++)
            {
                System.out.print("\t"+num2[x][y]);
            }
            System.out.println();
        }
        System.out.println("Subtracting both the Matrices: ");
        for(int x=0;x<3;x++)
        {
            for(int y=0;y<3;y++)
            {
                num3[x][y]=num1[x][y]-num2[x][y];
            }
        }
        System.out.println("Displaying the Matrix: ");
        for(int x=0;x<3;x++)
        {
            for(int y=0;y<3;y++)
            {
                System.out.print("\t"+num3[x][y]);
            }
            System.out.println();
        }
    }
}
