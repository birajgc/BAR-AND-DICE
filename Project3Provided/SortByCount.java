import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SortByCount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SortByCount extends ActionButton
{
        public SortByCount()
    {
        super("Sort By Count");
    }
    
    public void performAction()
    {
        MyWorld World = (MyWorld) getWorld();
        Bar temp;
       boolean fixed = false;
       while(fixed == false)
       {
           fixed =true;
           for(int i = 0; i < (World.face*2 -2); i++)
           {
           
           
               if (World.Histogram[i].getHeight() < World.Histogram[i+1].getHeight())
               {           
                temp = World.getArray(i+1);
                World.Histogram[i+1] = World.Histogram[i];
                World.Histogram[i] = temp;
                i++;
                fixed = false;
                }
        
           
            World.ArrayController();
                
            }
        }
        
    }
       
    
}
