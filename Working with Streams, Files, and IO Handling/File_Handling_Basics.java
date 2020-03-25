//package FileHandling;

import java.io.File;        // import the File Class
import java.io.IOException; // import the IOException class to handle errors

public class File_Handling_Basics
{
	public static void main(String args[])
	{
		try
		{
			File obj = new File("C:\\Users\\pukes\\IdeaProjects\\Core_And_Advanced_Java_Black_Book\\src\\New_Text_File.txt");
			if(obj.createNewFile())
			{
				System.out.println("File Created: "+obj.getName());
			}
			else
			{
				System.out.println("File Already Exists.");
			}
		}
		catch(IOException e)
		{
			System.out.println("An error occured!");
			e.printStackTrace();
		}
		System.out.println("\n\n\nEnd of Program!");
	}
}