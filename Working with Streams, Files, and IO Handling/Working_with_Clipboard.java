import java.awt.*;
import java.awt.datatransfer.*;

public class Working_with_Clipboard
{
    public static void main(String[] argv)
    {
        useClipboard clipboard = new useClipboard();
    }
}
class useClipboard extends Frame implements ClipboardOwner
{
    useClipboard()
    {
        Clipboard clipboard = getToolkit().getSystemClipboard();
        StringSelection contents = new StringSelection("Java Programming");
        clipboard.setContents(contents,this);
        System.exit(0);
    }
    public void lostOwnership(Clipboard clipboard,Transferable contents)
    {
        System.out.println("Clipboard contents replaced!");
    }
}
