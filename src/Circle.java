import TurtleGraphics.Pen;

public class Circle implements Shape{

    private double xPos, yPos, radius;
    
    public Circle(){
        super();
        radius=1;
    }
    
    public Circle(double x, double y, double r){
       super(x,y);
        radius=r;
    }
    
      public double area() {
            return Math.PI * radius * radius;
    }

    @Override
    public void draw(Pen p) {
        double side = 2.0 * Math.PI * radius / 120.0;
        p.up();
        p.move(xPos + radius,yPos);
        p.setDirection(90);
        p.down();
        
        for (int i=1; i<120; i++)
        {
            p.move(side);
            p.turn(3);
        }
    }

    public double getXPos() {
        return xPos;
    }

    public double getYPos() {
        return yPos;
    }

    public void move(double xLoc, double yLoc) {
      xPos=xLoc;
       yPos=yLoc;
    }

    public void stretchBy(double factor) {
        radius *= factor;
    }
    
    public String toString(){
        String result="This is a CIRCLE\n";
        result += "XLOC: " + xPos + "\tYLOC: " + yPos + "\n";
        result += "RADIUS: " + radius + "\n";
        result += "AREA: " + area();
        return result;
    }
    
}
