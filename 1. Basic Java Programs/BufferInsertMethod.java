public class BufferInsertMethod
{
    public static void main(String [] args)
    {
        StringBuffer sb = new StringBuffer("Java Tutor");
        sb.insert(10,"ial videos");//(end index + 1)
        System.out.println(sb);
    }
}
