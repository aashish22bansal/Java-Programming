import java.text.SimpleDateFormat;
import java.util.Date;

public class Print_Current_Date_and_Time
{
    public static void main(String [] args)
    {
        Date dTime = new Date();
        SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2= new SimpleDateFormat("E");
        SimpleDateFormat sdf3= new SimpleDateFormat("hh:mm:ss a");
        SimpleDateFormat sdf4= new SimpleDateFormat("MMM");

        System.out.print("\nCurrent Date is: "+sdf1.format(dTime));
        System.out.print("\nCurrent Day is: "+sdf2.format(dTime));
        System.out.print("\nCurrent Time is: "+sdf3.format(dTime));
        System.out.print("\nCurrent Month is: "+sdf4.format(dTime));
    }
}
