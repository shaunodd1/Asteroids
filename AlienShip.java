
import java.awt.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RealProgramming4Kids
 */

public class AlienShip extends VectorSprite
{
    int size;
    public AlienShip()
    {
        size = 1;
        intializeAlienShip();
    }
    
     public AlienShip(double x, double y, int s)
    {
        size = s;
        intializeAlienShip();
        xposition = x;
        yposition = y;
    }
    public void intializeAlienShip()
    
    {
        shape = new Polygon();
        shape.addPoint(-10*size, -10*size);
        shape.addPoint(-20*size, 20*size);
        shape.addPoint(10*size, 10*size);
        shape.addPoint(20*size, -20*size);
        
        
        drawShape = new Polygon();
        drawShape.addPoint(-10*size, -10*size);
        drawShape.addPoint(-20*size, 20*size);
        drawShape.addPoint(10*size, 10*size);
        drawShape.addPoint(20*size, -20*size);
        
        
        double h, a;
        h = (Math.random() + 0.5) / size;
        a = Math.random()* 2*Math.PI;
        xspeed = Math.cos(a)*h;
        yspeed = Math.sin(a)*h;
        
        h = Math.random() * 400 + 100;
        a = Math.random()* 2*Math.PI;
        xposition = Math.cos(a)*h + 450;
        yposition = Math.sin(a)*h + 300;
        
        ROTATION = (Math.random() / 2 - 0.25) / size;
        
        active = true;
    }
    
    public void updatePosition()
    {
        angle += ROTATION;
        super.updatePosition();
        if (Math.random()*50 < 1)
        {
            Asteroids.badBulletList.add(new EnemyBullet(xposition,yposition,Math.random()*360));
        }
    }

}


