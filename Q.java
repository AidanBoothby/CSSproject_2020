
/**
 * Write a description of class Q here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Q  
{
    Person front;
    Person back;
    int length;
    int TimeInQ;
    Person People[] = new Person[10];
    public static ArrayList<Person> normalQ = new ArrayList();
    public static ArrayList<Person> priorityQ = new ArrayList();
    
    public Q ()
    {
        this.front = null;
        this.back = null;
        this.length = -1;

        // for loop that adds people to the queue
        // so it prints out questions and when inputted runs the code
    }

    public static void print(){
        System.out.println("");
        for(int i = 0;i<normalQ.size();i++){
            System.out.print(normalQ.get(i).getID()+ " ");
        }
        System.out.println("");
        for(int i = 0;i<priorityQ.size();i++){
            System.out.print(priorityQ.get(i).getID()+ " ");
        }
        System.out.println("*****");
    }

    public boolean queueEmpty()
    {
        return this.front == null;
    }

    public void enqueue(Person toAdd)
    {
        this.length = this.length +1;
        toAdd.id(this.length);
        if (queueEmpty())  {        
            this.front = toAdd;
            this.back = toAdd;
            People[this.length] = toAdd;

        } else {
            this.back.setPersonBehindMe(toAdd);          
            this.back=toAdd; 
            People[this.length] = toAdd;

        }
        if(toAdd.getName() ==0){
            normalQ.add(toAdd);

        }else{
            priorityQ.add(toAdd);
        }

    }

    public void printQ ()
    {
        Person test = this.front;
        while (test != null){
            System.out.println(test.getName()); 
            test = test.getFollower();

        }
    }

    public Person dequeue()
    {
        this.length = this.length -1;
        Person atFront = this.front; // we are remenbering who is at the front
        this.front = this.front.getFollower();
        return atFront;
    }

    void Length()
    {
        System.out.println ("The length of the Queue is " +length); 
    }

    void TimeInQ()
    {
        System.out.println ("The time they entered the queue was "+TimeInQ+" seconds ");
    }

}
  
