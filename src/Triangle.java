
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

@Override
    public void draw(Pen p);
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double area() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void draw(Pen p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void stretchBy(double fact) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
