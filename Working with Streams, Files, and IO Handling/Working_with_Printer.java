import java.awt.*;
import java.awt.event.*;

public class Working_with_Printer
{
    public static void main(String[] argv)
    {
        usePrinter useprinter = new usePrinter();
    }
}
class usePrinter extends Frame
{
    usePrinter()
    {
        PrintJob printJob = getToolkit().getPrintJob(this, "Print Graphics",null);
        Graphics graphics = printJob.getGraphics();
        graphics.drawRect(2,2,100,100);
        graphics.drawLine(2,2,100,100);
        graphics.dispose();
        printJob.end();
        System.exit(0);
    }
}
