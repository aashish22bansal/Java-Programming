package sort;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.*;
//package sort; // package creation
public class User_Defined_Packages
{
    int x[];
    @Contract(pure = true)
    public User_Defined_Packages(@NotNull int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            x=a;
        }
    }

    public void arr()
    {
        int temp=0;
        for(int j=0;j<x.length;j++)
        {
            for(int k=0;k<x.length;k++)
            {
                if(x[k]>x[k+1])
                {
                    temp=x[k+1];
                    x[k+1]=x[k];
                    x[k]=temp;
                }
            }
        }
        System.out.println("Elements after sorting are: ");
        for(int j=0;j<x.length;j++)
        {
            System.out.println(x[j]);
        }
    }
    public static void main(String args[])
    {
        int m[]={3,2,6,4,7,98,4,8,4,3};
        User_Defined_Packages val = new User_Defined_Packages(m);
        val.arr();
    }
}
