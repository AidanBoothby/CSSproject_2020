
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
    Q cafe = new Q();
    Person hungry;
    private basicPriorityQueue q; //our standard queue
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem menuItem;

    public Simulation()
    {
        //q= new basicPriorityQueue(); //queue for students
        cafe = new Q();
        hungry = new Person();
        for (int i=0; i<10; i++)
        {
            hungry = new Person();
            cafe.enqueue(hungry);
        }
        Q.print();   

        for (int i=0; i<10; i++)
        {
            hungry = cafe.dequeue();
            System.out.println(hungry.getID());
        }  

        System.out.println("********"); 

        Q staff = new Q();
        Q Students = new Q();
        for (int i=0; i<7; i++){ //adding 7 hungry students
            hungry = new Person();
            Students.enqueue(hungry);
        }    
        for (int i=0; i<2; i++){ //adding hungry staff
            hungry = new Person();
            staff.enqueue(hungry);
        }  
        for (int i=0; i<5; i++){ //serving coustomers
            if (!staff.queueEmpty()){
                hungry = staff.dequeue();
                System.out.println("staff served");
            } else 
            if (!Students.queueEmpty()){
                hungry = Students.dequeue();
                System.out.println("Student served");
            } else System.out.println("served more than in Queue");

        }// for serving
        System.out.println("********"); 
        staff.printQ();
        Students.printQ();
        menuWithAction();
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
            //drinks
            case "length": 
            cafe.Length();
            break; // connect length
            case "average time in Q":
            cafe.TimeInQ();
            break; //connect timer
            case "people served": 

            cafe.PeopleServed();
            break ;
            //foods
            default: 
            System.out.println ("that is not Avalible"); 
        }
    } 
}