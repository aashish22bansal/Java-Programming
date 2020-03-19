import java.util.Scanner;

public class Matrices
{
    public static void main(String args[])
    {
        int row,col;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of rows for the matrix: ");
        row=in.nextInt();
        System.out.println("Enter the number of columns for the matrix: ");
        col=in.nextInt();
        int first[][]=new int[row][col];
        int second[][]=new int[row][col];
        int sum[][]=new int[row][col];
        System.out.println("Enter the elements for the first matrix: \n");
        int i,j;
        for(i=0;i<row;i++)
        {
            System.out.println("Row "+(i+1));
            for(j=0;j<col;j++)
            {
                System.out.println("\tElement "+(1+j));
                first[i][j]=in.nextInt();

            }
        }
        System.out.println("Enter the elements for the second matrix: \n");
        //int row,col;
        for(i=0;i<row;i++)
        {
            System.out.println("Row "+(i+1));
            for(j=0;j<col;j++)
            {
                System.out.println("\tElement "+(1+j));
                second[i][j]=in.nextInt();

            }
        }
        System.out.println("Suming the matrices now!\n");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                sum[i][j]=first[i][j]+second[i][j];
            }
        }
        System.out.println("The sum of the matrices is: \n");
        for(i=0;i<row;i++)
        {
            System.out.println();
            for (j = 0; j < col; j++)
            {
                System.out.print(sum[i][j] + " ");
            }
        }
    }
}
