
/**
 * Write a description of class person here.
 *
 * @author (Aidan Boothby)
 * @version (10/06/2020)
 * @ this code was influenced by Gaurav Miglani 
 */
//class to represent a queue
//java program for an array
//implementation of a queue
public class Queue
{
    int front;
    int back;
    int size;
    int range;
    int array[];
 
    public Queue(int range)
    {
       this.range = range; 
       front = this.size = 0; 
       back = range - 1; 
       array = new int [this.range];
    
       }
    // that if the Queue is full when size becomes equal to the range 
    boolean isFull(Queue queue) 
    { 
      return (queue.size == queue.range); 
       } 
    // Queue is empty when size is 0 
    boolean isEmpty(Queue queue) 
    { 
      return (queue.size == 0);
       } 
    // Method to add an item to the queue. 
    // It changes rear and size 
    void enqueue(int item) 
    { 
        if (isFull(this)) 
            return; 
        this.back = (this.back + 1) 
                    % this.range; 
        this.array[this.back] = item; 
        this.size = this.size + 1; 
        System.out.println(item 
                           + " enqueued to queue"); 
    } 
  
    // Method to remove an item from queue. 
    // It changes front and size 
    int dequeue() 
    { 
        if (isEmpty(this)) 
            return Integer.MIN_VALUE; 
  
        int item = this.array[this.front]; 
        this.front = (this.front + 1) 
                     % this.range; 
        this.size = this.size - 1; 
        return item; 
    } 
  
    // Method to get front of queue 
    int front() 
    { 
        if (isEmpty(this)) 
            return Integer.MIN_VALUE; 
  
        return this.array[this.front]; 
    } 
  
    // Method to get rear of queue 
    int rear() 
    { 
        if (isEmpty(this)) 
            return Integer.MIN_VALUE; 
  
        return this.array[this.back]; 
    } 

    public static void main(String[] args) 
    { 
        Queue queue = new Queue(100); 
  
        queue.enqueue(1); 
        queue.enqueue(2); 
        queue.enqueue(3); 
        queue.enqueue(4); 
  
        System.out.println(queue.dequeue() 
                          + " dequeued from queue\n"); 
  
        System.out.println("Front item is "
                          + queue.front()); 
  
        System.out.println("Rear item is "
                          + queue.rear()); 
    } 








} 





  

  
// this code was influenced by Gaurav Miglani    

