
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
    
    public Q ()
    {
        this.front = null;
        this.back = null;
    }
    public boolean queueEmpty()
    {
      return this.front == null;
    }
    public void enqueue(Person toAdd)
    {
       if (queueEmpty())  {        
          this.front = toAdd;
          this.back = toAdd;
        } else {
           this.back.setPersonBehindMe(toAdd);          
           this.back=toAdd; 
        }
       System.out.println(front);
       System.out.println(back);
     }
    
}
    
  
