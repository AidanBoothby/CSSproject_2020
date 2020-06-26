
/**
 * Write a description of class Q here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
    public class Q
{
    Person front;
    Person back;
    int length;
    int TimeInQ;
    
    public Q ()
    {
        this.front = null;
        this.back = null;
        this.length = 0;
        
        for (int i = 1; i < 3600; i++)
	  {
	          Person queuer = new Person();
	          if(length < 20){
	              enqueue (queuer); 
	           }
	           
	
	       }
	printQ();
     
        // for loop that adds people to the queue
        // so it prints out questions and when inputted runs the code
    }
    public boolean queueEmpty()
    {
      return this.front == null;
    }
    public void enqueue(Person toAdd)
    {
        this.length = this.length +1;
        if (queueEmpty())  {        
          this.front = toAdd;
          this.back = toAdd;
          
        } else {
           this.back.setPersonBehindMe(toAdd);          
           this.back=toAdd; 
            
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
    
  
