
import TurtleGraphics.Pen;


 //* @author conn6070

public class Triangle extends AbstractShape {
private double x2, y2,x3,y3;

public Triangle()
{
    super();
    x2=50;
    y2 = 50;
    x3=100;
    y3=0;
}
public void draw(Pen p)
    {
        
    p.up();
    p.move(xPos,yPos);
    p.down();
    p.move(x2,y2);
    p.move(x3,y3);
    p.move(xPos,yPos);
    }
   
    @Override
    public double perimeter() {
     return  Math.sqrt((xPos-x2)*(xPos-x2) + (yPos-y2)*(yPos-y2));
   
    }

    @Override
    public double area() {
    return Math.abs ((xPos*y2-x2*yPos) + (x2*y3-x3*y2) + (x3 *yPos-xPos*y3) /2);
    }


    @Override
    public void stretchBy(double factor) {
       x2= (x2-xPos) * factor + x2;
       
    }
    
}
