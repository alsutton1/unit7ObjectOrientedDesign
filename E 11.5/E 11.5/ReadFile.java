import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadFile
{
    private int charNum;
    private int wordNum;
    private int lineNum;
    public ReadFile(String fileName)
    {
        File inputFile = new File(fileName);
        
        try
        {
            Scanner in = new Scanner(inputFile);
            charNum = 0;
            while (in.hasNextLine())
            {
                lineNum++;
                String continued = in.nextLine();
            }

            in = new Scanner(inputFile);

            while (in.hasNext())
            {
                wordNum++;
                String continued = in.next();
                charNum += continued.length();
            }                        
        }

        catch(FileNotFoundException e)
        {
            System.out.println("Error: File not Found");
        } 
    }
    
    public String toString()
    {
        String str = "Number of Characters: " + charNum + "\nNumbers of Words:" + wordNum +
        "\nNumber of Lines: " + lineNum;
        return str;
    }
    
    public static void main(String[] args)
    {
        ReadFile file = new ReadFile("hello.txt");
        System.out.println(file.toString());
    }
}

