
/**
 * Simple queue class that works with an  elements.
 *
 * @author Bill Viggers
 * @version 21-May-2020
 */
public class basicPriorityQueue
{
    int Length = -1;
    int TimeInQ;
    int PeopleServed;
    
    public Person front;  // Element at the front of the priority queue
    private Person pEnd ;   // last element with high priority
    private Person end;    // Element at the end of the queue

    /**
     * Constructor for objects of class basicPriorityQueue
     */
    public basicPriorityQueue()
    {
        this.front=null;
        this.pEnd=null;
        this.end=null;
    }

    /*
     * Make a new element with the Item in it.
     * Add it to the end of the queue.
     * For a high priority item, make sure it is is the front section of the queue, but still
     * behind other priority components.
     */

    void enqueue(Person item, boolean highPriority){
        //Person item = new Person(item); // Wrap our item up in a item to put in the queue
        //System.out.println (item.getName()+""+highPriority);
        
        
        if(highPriority){
            if (queueEmpty()){  // empty queue
                this.front=item;
                this.pEnd=item;
                this.end=item;
            }
            else  // if not empty, then add it at the end of the priority bit of the queue
            {    
                // First a special case - queue non empty, but priority section was empty
                if (this.pEnd==null) {
                    item.setPersonBehindMe(this.front.getFollower());
                    this.front=item;                                        
                } else { // normal priority queue enqueue                
                    // whoever was the following the previous end of the priority q, is not after item;
                    item.setPersonBehindMe(this.pEnd.getFollower()); 
                    this.pEnd.setPersonBehindMe(item);        // put item after the current last priority element;                
                } 
                this.pEnd=item;                      // make item the last priority element.
            }  // high priority, not empty queue
        } // high priority
        else { // not high priority
            if (this.front == null)  // empty queue
                this.front=item;
            else  // if not empty, then add it at the end of the queue
                this.end.setPersonBehindMe(item);        
            this.end=item;
        }
        this.Length = this.Length +1;
        item.id(this.Length);
    } // enqueue

    /*
     * Remove the front item from the priority queue
     */
    Person dequeue(){
        if (this.front==null) 
        return null;
        
        
        Person hold=this.front;
        if ( this.front== this.pEnd) pEnd=null;// this was the last high priority item in the queue            
        this.front=this.front.getFollower();
        if (this.front==null) this.end=null;
        return hold;
        
    } // dequeue

    /*
     * Says if the queue is empty
     */

    public boolean queueEmpty(){
        return this.front==null;
    }
    public void printQ ()
    {
        Person test = this.front;
        while (test != null){
            System.out.println(test.getName()); 
            test = test.getFollower();

        }
    }
    void Length()
    {
        System.out.println ("The length of the Queue is " +Length); 
    }
     void PeopleServed()
    {
      System.out.println ("the amount of people served " +PeopleServed);
    }
 }