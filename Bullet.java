import java.awt.Polygon;
/**
 * Java Retro Asteroids - Lesson 10
 * @author Adrian Balogh
 */
public class Bullet extends VectorSprite
{
    
    public Bullet(double x, double y, double a)
    {
        shape = new Polygon();
        shape.addPoint(0, 0);
        shape.addPoint(0, 0);
        shape.addPoint(0, 0);
        shape.addPoint(0, 0);
        
        drawShape = new Polygon();
        drawShape.addPoint(0, 4);
        drawShape.addPoint(4, 0);
        drawShape.addPoint(0, -4);
        drawShape.addPoint(-4, 0);
        
        xposition = x;
        yposition = y;
        angle = a;
        THRUST = 10;
        
        xspeed = Math.cos(angle)*THRUST;
        yspeed = Math.sin(angle)*THRUST;
        
        active = true;
    }
    
}
