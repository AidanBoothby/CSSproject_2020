
/**
 * Write a description of class Minutes_File here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Random
{
   
   int i = 30;
   public Random (){ 
     for (int i = 30; i>1;i--){
   
      var d = Math.random();
      if (d< 0.7)
      System.out.println("student");
      //60% chance that students are selected
      else 
      System.out.println("teacher");  
      //40%chance that the teacher is selected
      
       
        
    }  
       
 }
    
  
  
}
