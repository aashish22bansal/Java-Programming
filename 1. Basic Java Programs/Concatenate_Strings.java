import java.util.Scanner;

public class Concatenate_Strings
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str1="",str2="";
        int n1,n2,n_concat;
        System.out.print("Enter the first String: ");
        str1=in.nextLine();
        n1=str1.length();
        System.out.print("Enter the second String: ");
        str2=in.nextLine();
        n2=str2.length();
        char[] chr=new char[n1+n2];
        n_concat=0;
        for(int i=0;i<n1;i++)
        {
            chr[n_concat]=0;
            chr[n_concat++]=str1.charAt(i);
        }
        for(int i=0;i<n2;i++)
        {
            chr[n_concat]=0;
            chr[n_concat++]=str2.charAt(i);
        }
        String str=String.valueOf(chr);
        System.out.println(str);
    }
}
