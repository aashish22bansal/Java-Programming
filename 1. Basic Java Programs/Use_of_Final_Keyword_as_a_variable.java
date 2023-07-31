public class Use_of_Final_Keyword_as_a_variable
{
    final int Reg_No;
    Use_of_Final_Keyword_as_a_variable(int num)
    {
        Reg_No=num;
    }
    void display()
    {
        System.out.println("Employee number is: "+Reg_No);
    }
    public static void main(String [] args)
    {
        Use_of_Final_Keyword_as_a_variable em = new Use_of_Final_Keyword_as_a_variable(201);
        em.display();
    }
}