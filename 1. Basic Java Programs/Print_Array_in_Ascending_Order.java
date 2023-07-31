import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Print_Array_in_Ascending_Order
{
    public static void main(String [] args) throws IOException {
        int num1 = 0, num2[] = new int[10],x,y;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Array: ");
        for(x=0;x<num2.length;x++)
        {
            System.out.print("Element "+x+" : ");
            num2[x]= Integer.parseInt(br.readLine());
        }
        for(x=0;x<num2.length;x++)
        {
            for(y=x+1;y<num2.length;y++)
            {
                if(num2[x]>num2[y])
                {
                    num1=num2[x];
                    num2[x]=num2[y];
                    num2[y]=num1;
                }
            }
        }
        System.out.println("The sorted Array is: ");
        for(x=0;x<num2.length;x++)
        {
            System.out.print(" "+num2[x]);
        }
    }
}
