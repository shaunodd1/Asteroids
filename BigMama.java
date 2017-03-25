
import java.awt.Polygon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RealProgramming4Kids
 */
public class BigMama extends VectorSprite { 
    int size;
    public BigMama()
    {
        size = 10;  
        initializeMama();
    }
    public BigMama(double x, double y, int s)
    {
        size = s;
        initializeMama();
        xposition = x;
        yposition = y;
    }
    public void initializeMama()
    {
        shape = new Polygon();
        shape.addPoint(10*size, 0*size);
        shape.addPoint(-10*size, 10*size);
        shape.addPoint(-10*size, -10*size);
        shape.addPoint(0*size,10*size);
        drawShape = new Polygon();
        drawShape.addPoint(15*size, 0*size);
        drawShape.addPoint(-10*size, 10*size);
        drawShape.addPoint(-10*size, -10*size);
        drawShape.addPoint(0*size,10*size);
        xposition = 950;
        yposition = 800;
        ROTATION = 0.15;
        THRUST = 0.5;
        active = true;
        angle = -Math.PI/2;
    }
    public void updatePosition()
    {
        angle += ROTATION;
        super.updatePosition();
        if (Math.random()*500 < 1)
        {
            Asteroids.alienList.add(new AlienShip(xposition,yposition,1));
        }
    }
}