
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

    public class Person
{
   
   String name; // what will we call this one
   Person human; //person behind us in the line
   int TimeInQ; //time they enterthe Queue.
   public Person()
    {
       Random B = new Random();
       this.name = B.Random(); 
       
    }
    
   public Person(String name){
     this.name=name;   
    }
    
   public void setName(String name){
     this.name=name;     
    }
    // this sets the person that is behind me
   public void setPersonBehindMe(Person behind){
     this.human=behind;
    }
   //returns the name of the person
   public String getName () 
    {
       return this.name;
    }
   //returns the name of the follower
   public Person getFollower()
    {
       return this.human;
    }
   int TimeInQ(){
       return this.TimeInQ;
    }
   //sets the time they enter the Queue to "entry"
   void setTime(int entry){
      TimeInQ = entry;
    }
   
}

