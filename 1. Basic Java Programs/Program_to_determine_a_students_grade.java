import java.util.Scanner;

public class Program_to_determine_a_students_grade
{
    public static void main(String [] args)
    {
        System.out.print("Enter the marks: ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        char grade;
        if(marks<40)
        {
            grade='D';
        }
        else if(marks<60)
        {
            grade='C';
        }
        else if(marks<80)
        {
            grade='B';
        }
        else
        {
            grade='A';
        }
        System.out.print("\nGrade: "+grade);
    }
}
