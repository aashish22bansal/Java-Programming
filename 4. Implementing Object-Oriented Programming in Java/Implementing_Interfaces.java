interface myInterface
{
    void connect();
}
class Oracle implements myInterface
{
    public void connect()
    {
        System.out.println("Successfully connected to the Oracle Database.");
    }
}
class SQL_Server implements myInterface
{
    public void connect()
    {
        System.out.println("Successfully connected to the SQL Server Database.");
    }
}
public class Implementing_Interfaces
{
    public static void main(String args[]) throws Exception
    {
        Class c = Class.forName(args[0]);
        myInterface obj = (myInterface)c.newInstance();
        obj.connect();
    }
}
