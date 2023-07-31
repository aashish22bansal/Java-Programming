public class Inner_and_Outer_Class // Outer Class
{
    int a[]={1,2,3,4,5}; // Array
    class Inner_Class // Inner Class
    {
        public void odd_even()
        {
            for(int i=0;i<a.length;i++)
            {
                if(a[i]%2==0)
                {
                    System.out.println("The value at position "+a[i]+" is even.");
                }
                else
                {
                    System.out.println("The value at positon "+a[i]+" is odd.");
                }
            }
        }
    }// End of inner class
    public void cal_inner()
    {
        Inner_Class val = new Inner_Class(); // Object of Inner class created
        val.odd_even();                      // calling method of inner class
    }
    public static void main(String args[])
    {
        Inner_and_Outer_Class mthd = new Inner_and_Outer_Class(); // Object of Outer class created
        mthd.cal_inner();                                         // calling method of outer class
    }
}//end of outer class
