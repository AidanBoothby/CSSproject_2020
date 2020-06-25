
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
    public Q ()
    {
        this.front = null;
        this.back = null;
        this.length = 0;
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
    public int Length()
    {
        return this.length; 
    }

}
    
  
