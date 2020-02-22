import java.io.*;
public class Program_for_Interface
{
    int Reg_No,Rt1,Rt2,Rt3;
    String Name;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void getInput() throws Exception
    {
        System.out.println("Please Enter the Employee details in the order Reg_No, Name, Skill Levels of Java-Python_PHP : ");
        Reg_No = Integer.parseInt(br.readLine());
        Name = br.readLine();
        Rt1 = Integer.parseInt(br.readLine());
        Rt2 = Integer.parseInt(br.readLine());
        Rt3 = Integer.parseInt(br.readLine());
    }
    void display()
    {
        System.out.print("Your details are:\n\tReg_No is: "+Reg_No+"\n\tName: "+Name+"\n\tJava Skill: "+Rt1+"\n\tPython Skill: " +
                ""+Rt2+"\n\tPHP Skill: "+Rt3);
    }
    static class Output extends Program_for_Interface
    {
        float average;
        float total;

        void evaluate() throws Exception
        {
            getInput();
            average = (Rt1+Rt2+Rt3)/3;
            total = Rt1+Rt2+Rt3;
        }
        void screenshow()
        {
            System.out.print("\nOverall tolal is: "+total+"\nOverall average is: "+average);
        }
    }
    static class Company
    {
        public static void main(String [] args)
        {
            Output ot = new Output();
            try
            {
                ot.evaluate();
                ot.screenshow();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
