/**
 * basicElement in a queue.
 *
 * @author  Bill Viggers
 * @version 21-May-2020
 *
 *
 *  This is a very simiple generic class.
 *  Each element holds something, and a link to the thing in the queue that 
 *  follows it.
 *  
 */
public class basicElement    // E will be the type of thing we store in our queue
{
    boolean TorS; //teacher or student picker
    private int iHold; // What is it a queue of ?
    private basicElement next;  // Who is next after me in the queue?

    /**
     * Constructor for objects of class basicElement
     * Give it the contents, and who comes after it.
     * 
     */
    public basicElement(int putIn)
    {
        this.iHold=putIn;
        this.next=null;

    }

    /*
     *  Set the identity of the element that follows me. 
     */
    public void setFollows(basicElement followingMe){
        this.next=followingMe;
    }

    /*
     * Find out the identity of the element that follows me
     */
    public basicElement getFollows(){
        return this.next;
    }

    /*
     * Say what element is actually being held.
     */
    public int getValue(){
        return this.iHold;
    }

    /*  
     * teacher or student picker
     */
    public String TorS()
    {
        if (this.TorS == true){
            return "teacher";
        }else{
            return "student";
        }
    }
}

