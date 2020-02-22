import java.util.Scanner;

public class Area_of_a_Triangle
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("The type of triangles are: \n 1. Isosceles\n 2. Equilateral\n 3. Scalene\n 4. Right-angled" +
                "\nEnter your choice: ");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.print("Enter the length of the Base: ");
                float base=sc.nextFloat();
                System.out.print("Enter the length of the side: ");
                float side=sc.nextFloat();
                double height = Math.sqrt(Math.pow(side,2)+Math.pow(base,2));
                double Area=0.5*base*height;
                System.out.print("The area of the triangle is: "+Area);
                break;
            case 2:
                side=0;
                Area=0;
                System.out.print("Enter the length of the side: ");
                side = sc.nextFloat();
                float semi=(side*3)/2;
                Area = Math.sqrt(semi*(Math.pow(semi-side,3)));
                System.out.print("The area of the triangle is: "+Area);
                break;
            case 3:
                float side1,side2,side3;
                semi=0;
                Area=0;
                System.out.print("Enter the length of First side: ");
                side1=sc.nextFloat();
                System.out.print("Enter the length of Second side: ");
                side2=sc.nextFloat();
                System.out.print("Enter the length of Third side: ");
                side3=sc.nextFloat();
                semi=(side1+side2+side3)/2;
                Area=Math.sqrt(semi*(semi-side1)*(semi-side2)*(semi-side3));
                System.out.print("The area of the triangle is: "+Area);
                break;
            case 4:
                base=0;
                Area=0;
                height=0;
                System.out.print("Enter the length of the Base: ");
                base=sc.nextFloat();
                System.out.print("Enter the length of the side: ");
                height=sc.nextFloat();
                //double hypotenuse=Math.sqrt(Math.pow(base,2)+Math.pow(height,2));
                Area=0.5*base*height;
                System.out.print("The area of the triangle is: "+Area);
                break;
            default:
                System.out.print("Enter a valid choice!");
                break;
        }
    }
}
