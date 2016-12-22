// The "KM_HangManBody" class.
import java.awt.*;
import hsa.Console;

public class KM_HangManBody
{
    static Console c;           // The output console
    
    public static int Hangman (int exit)
    {
	if (exit == 1)
	{
	    //Head
	    c.setColor (Color.black);
	    c.drawOval (330, 210, 51, 51);
	    c.setColor (Color.blue);
	    c.fillOval (331, 211, 50, 50);
	    
	}
	else if (exit == 2)
	{
	    //Body
	    c.setColor (new Color (255, 158, 64));
	    c.fillRect (348, 260, 15, 60);
	    
	}
	else if (exit == 3)
	{
	    //Right Arm
	    c.setColor (Color.black);
	    c.drawLine (348, 260, 300, 300);
	  
	}
	else if (exit == 4)
	{    //Left Arm
	     c.drawLine (363, 260, 410, 300);
	}
	else if (exit == 5)
	{
	    //Right Leg
	    c.drawLine (348, 320, 300, 360);
	}
	else if (exit == 6)
	{
	    //Left Leg
	    c.drawLine (363, 320, 410, 360);
	}
	
	return exit;
    }
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	//Hangman Post
	c.setColor (new Color (85, 43, 0));
	c.fillRect (230, 170, 20, 200);
	c.setColor (new Color (85, 43, 0));
	c.fillRect (250, 170, 140, 20);
	c.setColor (new Color (85, 43, 0));
	c.fillRect (350, 185, 10, 25);
	
	int lose = 6;
	
	for (int i = 0; i <= lose; i++)
	{
	     Hangman(i);
	}
	
	
	
       
	
	// Place your program here.  'c' is the output console
    } // main method
} // KM_HangManBody class
