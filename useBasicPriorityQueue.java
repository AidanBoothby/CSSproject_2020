
/**
 * Write a description of class useBasicPriorityQueue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class useBasicPriorityQueue
{
    private useBasicPriorityQueue q; //our standard queue
    
    public useBasicPriorityQueue()
    {
       q= new  useBasicPriorityQueue(); //queue for students
       
       for (int i=0; i<10; i++){
         // we are going to give priority to the teacher
         System.out.println ("About to Enqueue "+i);
         q.enqueue(i,(i%teacher==0));
        }
    }
}
