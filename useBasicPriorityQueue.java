
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
       
       for (int student=0; student<10; student++){
         // we are going to give priority to the teacher
         System.out.println ("About to Enqueue "+student);
         q.enqueue(student,(student%3==0));
         }
        while (! q.queueEmpty())
         System.out.println(q.dequeue());
         
    }
}
