// An advanced example of using while loop.
import java.util.*;
public class The_While_Loop
{
    public static void main(String args[])
    {
        int value=32,temp=value;
        StringBuffer sb = new StringBuffer();
        Stack <String> st = new Stack<String>();
        while(temp>0)
        {
            st.push(String.valueOf(temp%16));
            temp>>>=4;
        }
        while(!st.empty())
        {
            sb.append(new String((String) st.pop()));
        }
        System.out.println("Converting "+value+" to Hexadecimal yields 0x"+sb);
    }
}
