
/**
 * Write a description of class menuWithAction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.event.*; //listener
import javax.swing.*;
import java.awt.*;
import java.util.*;
public class menuWithAction extends JFrame implements ActionListener 
{
    // Class variables
     JMenuBar menuBar;
     JMenu menu;
     JMenuItem menuItem;
     

    /**
     * Constructor for objects of class menuWithAction
     */
    public menuWithAction()
    {
       String setTitle = "my window name";/*
       System.out.println ("what do you want to call the window?");
       Scanner myObj = new Scanner(System.in);  // Create a Scanner object
       setTitle = myObj.nextLine();  // Read user input
       System.out.println("your windows name is " + setTitle);  // Output user inpu */ 
       setTitle(setTitle);
       
       int width;
       //System.out.println ("what width do you want your window to be?");
       
       width = 300; //myObj.nextInt();  // Read user input
       
       int height;
       //System.out.println ("how high do you want the window to be?");
       height = 300; //myObj.nextInt();  // Read user input 
      
       //how big is it?-first is left to right second is top to bottom.
       this.getContentPane().setPreferredSize(new Dimension(width,height)); 
       
       //what happens when you close the window?
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        menuBar=new JMenuBar(); //bar at the top with menus on it.
        this.setJMenuBar(menuBar);
        
        menu= new JMenu ("Drinks");  
        menuBar.add(menu);
        
        String[] drinks = {"Water","CocaCola","Lemonade"};
        for (int i=0; i<drinks .length; i++){ 
            menuItem=new JMenuItem(drinks[i]);
            menuItem.addActionListener(this);
            menu.add(menuItem);
            
        }   
       
        menu= new JMenu ("Foods");  
        menuBar.add(menu);
        String[] foods = {"Pizzas","Burgers","Nachos"};
        for (int i=0; i<foods .length; i++){ 
            menuItem=new JMenuItem(foods[i]);
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
         case "Water": System.out.println ("Water Costs $2"); break ;
         case "CocaCola": System.out.println ("CocaCola Costs $4"); break ;
         case "Lemonade": System.out.println ("Lemonade Costs $3"); break ;
         //foods
         case "Nachos": System.out.println ("Nachos Costs $4.5"); break ;
         case "Burgers": System.out.println ("Burgers Costs $4"); break ;
         case "Pizzas": System.out.println ("Pizzas Costs $6"); break ;
         default: System.out.println ("that is not Avalible"); 
        }
    } 
} 