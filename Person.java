
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

    public class Person
{
   private double d;
   private int name; // what will we call this one
   private Person human; //person behind us in the line
   private int TimeInQ; //time they enterthe Queue.
   private int id; // gives person a identification 
   public Person()
    {
       //Random B = new Random();
       this.name = 0;
       
    }
    
   public Person(int name){
     this.name=name;   
    }
    
   public void setName(int name){
     this.name=name;     
    }
    // this sets the person that is behind me
   public void setPersonBehindMe(Person behind){
     this.human=behind;
    }
   //returns the name of the person
   public int getName () 
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
   //random teacher or student code
   /*public int Random (){
      d = Math.random();
      if (d< 0.7)
         return (0);
        //chamce its s student
      else 
         return (1);  
        //chance its a teacher
       }*/   
   public void id(int length){
       this.id = length;
    }
   public int getID(){
        return(this.id);
    }
    
}

