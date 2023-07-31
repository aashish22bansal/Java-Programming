public class Arrays
{
    public static void main(String[] args)
    {
        // SINGLE DIMENSION ARRAY
        double accounts[];                        // Single Dimension Array
        accounts=new double[100];                 //Declaration METHOD 1
        //double accounts[]=new double[100];      //Declaration METHOD 2
        /*double accounts[] = {0,0,0,0,43.23235};*/
        accounts[2]=43.325254;
        System.out.println("The elements at the second position for the array is: "+accounts[2]);

        // DOUBLE DIMENSION ARRAY
        double account[][] = new double[2][5];
        account[0][0]=34.34455;
        account[1][2]=3453443.3434334;
        System.out.println("The elements initialised in the array are "+account[0][0]+" and "+account[1][2]);
    }
}
