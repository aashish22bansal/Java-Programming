import java.util.Scanner;
public class MinAndSecToHHMMSS
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of minutes: ");
        int min_input=sc.nextInt();
        System.out.println("Enter the number of seconds: ");
        int sec_input=sc.nextInt();
        calculate(min_input,sec_input);
    }//end of the main method
    public static void calculate(int min_input,int sec_input)
    {
        int hh,mm,ss;
        if(min_input>59)
        {
            hh=min_input/60;
            mm=min_input-60;
            if(sec_input>59)
            {
                mm+=(sec_input/60);
                ss=sec_input-60;
            }
            else
            {
                ss=sec_input;
            }
        }
        else
        {
            hh=0;
            mm=min_input;
            if(sec_input>59)
            {
                mm+=(sec_input/60);
                ss=sec_input-60;
            }
            else
            {
                ss=sec_input;
            }
        }
        Display(hh,mm,ss);
    }//end of calculation method
    public static void Display(int hh,int mm,int ss)
    {
        System.out.println("The entered data in the given format HH:MM:SS is: "+hh+" : "+mm+" : "+ss);
    }
}
