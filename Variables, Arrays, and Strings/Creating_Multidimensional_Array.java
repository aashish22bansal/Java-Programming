public class Creating_Multidimensional_Array
{
    public static void main(String args[])
    {
        double accounts[][]=new double[2][100];
        accounts[0][2]=34.45;
        accounts[1][44]=34.4545;
        System.out.print("Account 1 has balance: $"+accounts[0][2]);
        System.out.print("\nAccount 1 has balance: $"+accounts[1][44]);
    }
}
