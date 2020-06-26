
/**
 * Write a description of class Minutes_File here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Random
{
    double d;
    public String Random (){
      d = Math.random();
      if (d< 0.7)
         return ("student");
        //70% chance that students are selected
      else 
         return ("teacher");  
        //30%chance that the teacher is selected
       }  
 }
    
  
