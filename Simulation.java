/*
 * Write a description of class Simulation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner; // needed to read files
import java.io.IOException; // handle errors
import java.io.File;  //  File handles
public class Simulation 
{
  Q cafe;
  Person hungry;
  menuWithAction window;
  private basicPriorityQueue q; //our standard queue
  
  public Simulation()
    {
       //q= new basicPriorityQueue(); //queue for students
       cafe = new Q();
       hungry = new Person();
       window =new menuWithAction();
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
 }
}