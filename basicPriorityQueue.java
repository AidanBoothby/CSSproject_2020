
/**
 * Simple queue class that works with an  elements.
 *
 * @author Bill Viggers
 * @version 21-May-2020
 */
public class basicPriorityQueue
{
    private basicElement front;  // Element at the front of the priority queue
    private basicElement pEnd ;   // last element with high priority
    private basicElement end;    // Element at the end of the queue

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

    void enqueue(int item, boolean highPriority){
        basicElement box = new basicElement(item); // Wrap our item up in a box to put in the queue
        if(highPriority){
            if (queueEmpty()){  // empty queue
                this.front=box;
                this.pEnd=box;
                this.end=box;
            }
            else  // if not empty, then add it at the end of the priority bit of the queue
            {    
                // First a special case - queue non empty, but priority section was empty
                if (this.pEnd==null) {
                    box.setFollows(this.front.getFollows());
                    this.front=box;                                        
                } else { // normal priority queue enqueue                
                    // whoever was the following the previous end of the priority q, is not after box;
                    box.setFollows(this.pEnd.getFollows()); 
                    this.pEnd.setFollows(box);        // put box after the current last priority element;                
                } 
                this.pEnd=box;                      // make box the last priority element.
            }  // high priority, not empty queue
        } // high priority
        else { // not high priority
            if (this.front == null)  // empty queue
                this.front=box;
            else  // if not empty, then add it at the end of the queue
                this.end.setFollows(box);        
            this.end=box;
        }

    } // enqueue

    /*
     * Remove the front item from the priority queue
     */
    int dequeue(){
        int hold=this.front.getValue();
        if ( this.front== this.pEnd) pEnd=null;// this was the last high priority item in the queue            
        this.front=this.front.getFollows();
        if (this.front==null) this.end=null;
        return hold;
    } // dequeue

    /*
     * Says if the queue is empty
     */

    public boolean queueEmpty(){
        return this.front==null;
    }

}