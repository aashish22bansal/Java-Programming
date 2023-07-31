public class BufferReplaceMethod
{
    public static void main(String [] args)
    {
        StringBuffer sb = new StringBuffer("Java Tutorial");
        sb.replace(0,5,"Video ");
        System.out.println(sb);
    }
}
