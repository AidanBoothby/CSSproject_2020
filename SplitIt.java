
/**
 * SplitIt:
 * Demonstration code that uses the Split function.
 *
 * @author Bill Viggers
 * @version 18-Jun-2020
 */
import java.util.Scanner;

public class SplitIt
{
    // instance variables - replace the example below with your own
    //github test

    /**
     * Constructor for objects of class SplitIt
     */
    public SplitIt()
    {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("What enter the string you want to split up: ");
        String splitMe=keyboard.nextLine();
        System.out.println("And what would you like to split it up on?");
        String splitOn=keyboard.nextLine();
        System.out.println("Splitting: '"+splitMe+"' on each instance of '"+splitOn+"' gives:" );
        String parts[]=splitMe.split(splitOn);  // this is the magic where we use the split command.
        int fields=0;
        for (int i=0;i<parts.length;i++)
            System.out.println(parts[i]);         
    }

    
}