import java.util.Calendar;
import java.util.GregorianCalendar;
public class Date_and_Time
{
    public static void main(String args[])
    {
        int second,day,month,year,minute,hour;
        GregorianCalendar date=new GregorianCalendar();
        day=date.get(Calendar.DAY_OF_MONTH);
        month=date.get(Calendar.MONTH);
        year=date.get(Calendar.YEAR);
        second=date.get(Calendar.SECOND);
        minute=date.get(Calendar.MINUTE);
        hour=date.get(Calendar.HOUR);
        System.out.print("Current Date: "+day+"/"+month+"/"+year+"\nCurrent Time: "+hour+":"+minute+":"+second);
    }
}
