import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ResetByCount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ResetByCount extends ActionButton
{
    public ResetByCount()
    {
        super("Reset By Count");
    }
    
    public void performAction()
    {
        MyWorld World = (MyWorld) getWorld();
        for(int i = 0; i<World.Histogram.length; i++)
        {
            World.Histogram[i].Heightreset();
        }
        
        World.GetValueSorting().performAction();
        
    } 
}
