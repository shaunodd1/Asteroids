import java.awt.Polygon;
/**
 * Java Retro Asteroids - Lesson 10
 * @author Adrian Balogh
 */
public class Asteroid extends VectorSprite 
{
    int size;
    
    
    public Asteroid()
    {
        size = 3;
        initializeAsteroid();
    }
    
    
    public Asteroid(double x, double y, int s)
    {
        size = s;
        initializeAsteroid();
        xposition = x;
        yposition = y;
    }
    
    
    public void initializeAsteroid()
    {
        shape = new Polygon();
        shape.addPoint(15*size, 6*size);
        shape.addPoint(7*size, 17*size);
        shape.addPoint(-13*size, 8*size);
        shape.addPoint(-11*size, -10*size);
        shape.addPoint(12*size, -16*size);
        
        drawShape = new Polygon();
        drawShape.addPoint(15*size, 6*size);
        drawShape.addPoint(7*size, 17*size);
        drawShape.addPoint(-13*size, 8*size);
        drawShape.addPoint(-11*size, -10*size);
        drawShape.addPoint(12*size, -16*size);
        
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
    }
}











































































































































































































































































































/*Intro]
Robbie: “Are you, uh, a real villain?”
Bobbie: “Well, uh, technically... nah.”
Robbie: “Have you ever caught a good guy, like, uh, like a real superhero?”
Bobbie: “Nah.”
Robbie: “Have you ever tried a disguise?”
Bobbie: “Nah, nah...”
Robbie: “Alright! I can see that I will have to teach you how to be villains!”

[Hook]
Hey!
We are Number One
Hey!
We are Number One

[Verse 1]
Now listen closely
Here's a little lesson in trickery
This is going down in history
If you wanna be a Villain Number One
You have to chase a superhero on the run
Just follow my moves, and sneak around
Be careful not to make a sound
(Shh)
(No, don't touch that!)

[Hook]
We are Number One
Hey!
We are Number One
We are Number One

[Verse 2]
Ha ha ha
Now look at this net, that I just found
When I say go, be ready to throw
Go!
(Throw it on him, not me!)
(Ugh, let's try something else)
Now watch and learn, here's the deal
He'll slip and slide on this banana peel!
(Ha ha ha, gasp! what are you doing!?)

[Outro]
Ba-ba-biddly-ba-ba-ba-ba, ba-ba-ba-ba-ba-ba-ba
We are Number One
Hey!
Ba-ba-biddly-ba-ba-ba-ba, ba-ba-ba-ba-ba-ba-ba
We are Number One
Ba-ba-biddly-ba-ba-ba-ba, ba-ba-ba-ba-ba-ba-ba
We are Number One
Hey!
Ba-ba-biddly-ba-ba-ba-ba, ba-ba-ba-ba-ba-ba-ba
We are Number One
Hey!
Hey!
*/
