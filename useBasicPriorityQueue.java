import java.util.ArrayList;
/**
 * Write a description of class useBasicPriorityQueue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class useBasicPriorityQueue
{
    private basicPriorityQueue q; //our standard queue
    
    public useBasicPriorityQueue()
    {
       q= new basicPriorityQueue(); //queue for students

       for (int i=0; i<10; i++){
         // we are going to give priority to the teacher
         System.out.println ("About to Enqueue "+1);
         q.enqueue(i,(1%3==0));
         }
        while (! q.queueEmpty())
         System.out.println(q.dequeue());
         
    }
}
