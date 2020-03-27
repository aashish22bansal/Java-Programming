import java.io.File;
public class Using_the_File_Class
{
    public static void main(String args[])
    {
        File file1 = new File("Using_the_File_Class.txt");
        System.out.println("File: "+file1.getName()+(file1.isFile()?"has been created":"has not been created"));
        System.out.println("Size: "+file1.length());
        System.out.println("Path: "+file1.getPath());
        System.out.println("Parent: "+file1.getParent());
        System.out.println("Absolute Path: "+file1.getAbsolutePath());
        System.out.println("File was last modified: "+file1.lastModified());
        System.out.println(file1.exists()?"File exists":"File does not exist");
        System.out.println(file1.canRead()?"File is readable":"File is not readable");
        System.out.println(file1.canWrite()?"File is writable":"File is not writable");
        System.out.println(file1.isDirectory()?"File is a directory":"File is not a directory");
        System.out.println(file1.isAbsolute()?"File is absolute":"File is not absolute");
    }
}
