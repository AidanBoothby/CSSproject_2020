
import java.util.Scanner; // needed to read files
import java.io.IOException; // handle errors
import java.io.File;  //  File handles
import java.awt.event.*; //listener
import javax.swing.*;
import java.awt.*;
import java.util.*;
// make length work
public class Simulation extends JFrame implements ActionListener 
{
    basicPriorityQueue cafe = new basicPriorityQueue ();
    Person hungry;
    private basicPriorityQueue q; //our standard queue
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem menuItem;
    //read CSV code V
    final String filename="arrivals.csv"; // change to reflect the CSV we are reading
    final int MAXLINES=51; // for ease of writing, we are only going to read at most 100 lines.
    final int VALUESPERLINE=4;  // for ease of writing, we know how many values we get on each line.
    String CSVlines[] = new String[MAXLINES];
    String AllLinesAllElements[][]=new String[MAXLINES][VALUESPERLINE];  // where we keep all those lines we read in.
    
    
     public void readCSV()
    {
        File  thefile = new File(filename);  // generate the file handle

        int linecount=0;  // initially keeps track of lines read, eventually used to remember the number that was read;

        try {
            Scanner reader = new Scanner(thefile); // open the file with the Scanner

            // Read in the file, stop at file end or if we read too many lines
            while (reader.hasNextLine()  && linecount < MAXLINES){
                String line=reader.nextLine();                   
                CSVlines[linecount]=line;
                linecount++;
            }
            for (int i =0; i<linecount; i++){
                String values[] = CSVlines[i].split(",");  // process the line from the Scanner and break it up at each comma.

                // Now we will print it out again, again, this is just to prove a point.  Real code doesn't need this.
                for (int j=0; j< values.length;j++)
                    System.out.print(values[j]+"****");
                System.out.println("");

                // However, we probably will want to put this into an array of Strings, which we may want to later do some
                // other processing on.
                for (int j=0; j< values.length;j++)
                    AllLinesAllElements[i][j]=values[j];
            }  // process the file we read, line by line.
        }catch (IOException e) {System.out.println(e);}
    }

    public Simulation()
    {
        readCSV();
        //q= new basicPriorityQueue(); //queue for students
        hungry = new Person(); 
        //creates 10 random people and puts them into the queue
        for (int i=0; i<10; i++)
        {
            hungry = new Person();

            double d = Math.random();
            if (d< 0.7)
                cafe.enqueue(hungry,false);

            //chamce its s student
            else 
                cafe.enqueue(hungry,true); 
            //chance its a teacher

        }
        cafe.printQ();
        System.out.println("\n********");

        //the code to dequeue
        for (int i=0; i<10; i++)
        {
            hungry = cafe.dequeue();
            System.out.println(hungry.getID());
        }  

        System.out.println("\n********"); 

        /*for (int i=0; i<5; i++){ //serving coustomers
        if (!staff.queueEmpty()){
        hungry = staff.dequeue();
        System.out.println("staff served");
        } else 
        if (!normalQ.queueEmpty()){
        hungry = normalQ.dequeue();
        System.out.println("Student served");
        } else System.out.println("served more than in Queue");

        }// for serving
        System.out.println("********"); 
        Q.priotityQ.printQ();
        Q.normalQ.printQ();
        menuWithAction(); */
        
    }
  
    
public void menuWithAction()
    {
        String setTitle = "my window name";

        setTitle(setTitle);

        int width;

        width = 300; 

        int height;

        height = 300; 

        //how big is it?-first is left to right second is top to bottom.
        this.getContentPane().setPreferredSize(new Dimension(width,height)); 

        //what happens when you close the window?
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        menuBar=new JMenuBar(); //bar at the top with menus on it.
        this.setJMenuBar(menuBar);

        menu= new JMenu ("simulation options");  
        menuBar.add(menu);

        String[] options = {"length","average time in Q","people served"};
        for (int i=0; i<options .length; i++){ 
            menuItem=new JMenuItem(options[i]);
            menuItem.addActionListener(this);
            menu.add(menuItem);

        }   

        //put most of your code below this line.

        //addfinally make the window visible.
        this.pack();
        this.toFront(); //Not too sure what this does
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String cmd=e.getActionCommand(); 
        System.out.println (cmd);
        switch (cmd) {
            case "length": 
            cafe.Length();
            break; // connect length

            case "people served": 
            cafe.PeopleServed();
            break ;

            default: 
            System.out.println ("that is not Avalible"); 
        }
    } 
}