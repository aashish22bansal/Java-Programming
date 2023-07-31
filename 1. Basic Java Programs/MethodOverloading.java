import java.util.Scanner;
public class MethodOverloading
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose from the options provided: \n1. Square\n2. Rectangle \n3. Triangle\n" +
                "\n Enter your choice: ");
        byte choice = sc.nextByte();
        switch(choice)
        {
            case 1:
                System.out.print("Enter the length of the side of the square: ");
                int squarelen=sc.nextInt();
                int Area=area(squarelen);
                System.out.print("The area of the square is: "+Area);
                break;
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                int len = sc.nextInt();
                System.out.print("Enter the breadth of the rectangle: ");
                int wid = sc.nextInt();
                Area = area(len,wid);
                System.out.print("The area of the rectangle is: "+Area);
                break;
            case 3:
                System.out.print("Enter the length of the first side: ");
                int len1 = sc.nextInt();
                System.out.print("Enter the length of the second side: ");
                int len2 = sc.nextInt();
                System.out.print("Enter the length of the third side: ");
                int len3 = sc.nextInt();
                double triArea=area(len1,len2,len3);
                System.out.print("The area of the triangle is: "+triArea);
                break;
            default:
                System.out.print("Give a valid input!");
                break;
        }
    }
    public static int area(int len)
    {
        return len*len;
    }
    public static int area(int len,int wid)
    {
        return len*wid;
    }
    public static double area(int len1, int len2, int len3)
    {
        int s=(len1+len2+len3)/2;
        return Math.sqrt(s*(s-len1)*(s-len2)*(s-len3));
    }
}
