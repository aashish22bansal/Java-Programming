public class Creating_Character_Literals
{
    public static void main(String[] args)
    {
        char char1;
        char1=67; // gets converted to its corresponding character value
        System.out.println("The character stored in the variable is "+char1);
        /*The value assigned to every variable must correspond to some value in UCS as these act as indexes into the UCS
         * and not actual characters.*/

        // USING ESCAPE SEQUENCES
        System.out.println("Nishitha said, \"Hello!\"");
    }

}
