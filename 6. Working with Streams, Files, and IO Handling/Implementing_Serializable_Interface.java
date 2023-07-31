import java.io.*;

public class Implementing_Serializable_Interface
{
    public static void main(String args[])
    {
        NewString inobject,outobject;
        inobject = new NewString("");
        outobject = new NewString("Java Programming!");
        try
        {
            FileOutputStream fileOutputStream = new FileOutputStream("Serialized.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(outobject);
            objectOutputStream.flush();
            objectOutputStream.close();
            FileInputStream fileInputStream = new FileInputStream("Serialized.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            inobject = (NewString)objectInputStream.readObject();
            objectInputStream.close();
        }
        catch(Exception e)
        {

        }
        System.out.println(inobject);
    }
}
