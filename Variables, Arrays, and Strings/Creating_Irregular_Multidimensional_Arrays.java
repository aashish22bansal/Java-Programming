public class Creating_Irregular_Multidimensional_Arrays
{
    public static void main(String args[])
    {
        double array[][]=new double[5][];
        array[0]=new double[500];
        array[1]=new double[400];
        array[2]=new double[300];
        array[3]=new double[200];
        array[4]=new double[100];
        array[3][3]=1335.67;
        System.out.print("\nAccount 1 has balance: $"+array[0][400]);
        System.out.print("\nAccount 1 has balance: $"+array[1][300]);
        System.out.print("\nAccount 1 has balance: $"+array[2][200]);
        System.out.print("\nAccount 1 has balance: $"+array[3][100]);
        System.out.print("\nAccount 1 has balance: $"+array[4][50]);
        System.out.print("\nAccount 1 has balance: $"+array[3][3]);
    }
}
