public class CosineMethod
{
    public static void main(String [] args)
    {
        double degrees = 125.0;
        double radians = Math.toRadians(degrees);
        System.out.format("The cosine of %.1f degrees is %4f%n", degrees, Math.cos(radians));
    }
}
