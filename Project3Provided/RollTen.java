import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RollTen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RollTen extends ActionButton
{
       public RollTen()
    {
        super("Roll X 10");
    }
    
    public void performAction()
    {
        MyWorld World = (MyWorld) getWorld();
        for (int i = 0 ; i < 10; i++)
        {
            World.ButtonRoll().performAction();
        }
    }
}
