
import TurtleGraphics.Pen;
import TurtleGraphics.StandardPen;

abstract public class AbstractShape {
    protected double xPos, yPos;
    Pen p = new StandardPen();
    public AbstractShape()
    {
        xPos =0;
        yPos = 0;
        
    }
    public AbstractShape (double x, double y)
    {
     xPos = x;
     yPos = y;
    }
      abstract public double perimeter();
    abstract public double area();
    abstract public void draw(Pen p);
    abstract public void stretchBy (double fact);
    
    public final double getXPos()
    {
        return xPos;
        
    }
     public final double getYPos()
    {
        return yPos;
        
    }
     public void move (double xLoc, double yLoc)
     {
         xPos = xLoc;
         yPos = yLoc;
     }
     public String toString()
     {
         String str = "X-Y Position = " +xPos +", " + yPos;
         str += "\nArea = " +area ();
         return str;
     }
}
