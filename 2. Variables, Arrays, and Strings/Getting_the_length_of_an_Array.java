public class Getting_the_length_of_an_Array
{
    public static void main(String args[])
    {
        double grades[]={23,45,57,43,45,86,45,32,5,68,43,23};
        double sum,average;
        sum=0;
        for(int loop_index=0;loop_index<grades.length;loop_index++)
        {
            sum+=grades[loop_index];
        }
        average=sum/grades.length;
        System.out.println("Average grade = "+average);
    }
}
