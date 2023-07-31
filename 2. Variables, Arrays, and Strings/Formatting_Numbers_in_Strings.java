import java.text.*;

public class Formatting_Numbers_in_Strings
{
    public static void main(String args[])
    {
        double value = 1.23456789;
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(6);
        String s = nf.format(value);
        System.out.println(s);
    }
}
