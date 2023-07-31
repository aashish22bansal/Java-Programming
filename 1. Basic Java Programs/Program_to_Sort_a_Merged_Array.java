import java.util.Scanner;

public class Program_to_Sort_a_Merged_Array
{
    public static void sort(int[] x, int upper, int lower)
    {
        int num1 = upper - lower;
        if(num1<=1)
        {
            return;
        }
        int num2 = lower + num1/2;
        sort(x,lower,num2);
        sort(x,num2,upper);
        int[] num3 = new int[num1];
        int y = lower,z=num2;
        for(int w=0;w<num1;w++)
        {
            if(y==num2)
            {
                num3[w] = x[z++];
            }
            else if(z==upper)
            {
                num3[w] = x[z++];
            }
            else if(x[z]<x[y])
            {
                num3[w]= x[z++];
            }
            else
            {
                num3[w] = x[y++];
            }
        }
        for(int w=0;w<num1;w++)
        {
            x[lower+w]=num3[w];
        }
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1,y;
        System.out.print("Enter the number of Elements: ");
        num1=sc.nextInt();
        int xyz[]=new int[num1];
        System.out.print("Array Input: ");
        for(y=0;y<num1;y++)
        {
            System.out.print("Element "+(y+1)+" : ");
            xyz[y]=sc.nextInt();
        }
        sort(xyz,0,num1);
        System.out.print("Array after sorting is: \n");
        for(y=0;y<num1;y++)
        {
            System.out.println("ELement "+(y+1)+" : "+xyz[y]);
        }
    }
}
