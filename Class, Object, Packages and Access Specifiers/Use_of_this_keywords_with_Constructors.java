public class Use_of_this_keywords_with_Constructors
{
    //declaring instance variables
    int x,y;
    Use_of_this_keywords_with_Constructors()
    {
        this(12,8); // parameterized constructor
        this.multiply();
    }
    Use_of_this_keywords_with_Constructors(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public void multiply()
    {
        int product=x*y;
        System.out.println("The result of multiplication is: "+product);
    }
    public static void main(String args[])
    {
        Use_of_this_keywords_with_Constructors mthd = new Use_of_this_keywords_with_Constructors();// object created
    }
}
