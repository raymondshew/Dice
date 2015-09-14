import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

public void setup()
{
	size(700,700);
	noLoop();
}
public void draw()
{
	
	background(100,15,152);
	for(int y = 75; y <= 600; y += 100)
	{
		for(int x = 50; x <= 600; x += 100)
		{
		  Die bob = new Die(x,y);
		  bob.roll();
	      bob.show();
          
		}
        
	}	
	
}
public void mousePressed()
{
	redraw();
}
class Die //models one single dice cube
{
	int myX, myY, diceNum;
	Die(int x, int y) //constructor
	{
		myX = x;
		myY = y;
	}
	public void roll()
	{
		diceNum = (int)(Math.random()*6) + 1;
	}
	public void show()
	{
		
		fill(255);
		rect(myX,myY,100,100);
		fill(0);
		if(diceNum == 1)
		{
			ellipse(myX + 50,myY + 50,18,18);
		}
		else if(diceNum == 2)
		{
			ellipse(myX + 75,myY + 25,18,18);
			ellipse(myX + 25,myY + 75,18,18);
		}
		else if(diceNum == 3)
		{
			ellipse(myX + 50,myY + 50,18,18);
			ellipse(myX + 75,myY + 25,18,18);
			ellipse(myX + 25,myY + 75,18,18);
		}
		else if(diceNum == 4)
		{
			ellipse(myX + 75,myY + 25,18,18);
			ellipse(myX + 25,myY + 75,18,18);
			ellipse(myX + 75,myY + 75,18,18);
			ellipse(myX + 25,myY + 25,18,18);
		}
		else if(diceNum == 5)
		{
			ellipse(myX + 50,myY + 50,18,18);
			ellipse(myX + 75,myY + 25,18,18);
			ellipse(myX + 25,myY + 75,18,18);
			ellipse(myX + 75,myY + 75,18,18);
			ellipse(myX + 25,myY + 25,18,18);
		}
		else if(diceNum == 6)
		{
			ellipse(myX + 75,myY + 25,18,18);
			ellipse(myX + 25,myY + 75,18,18);
			ellipse(myX + 75,myY + 75,18,18);
			ellipse(myX + 25,myY + 25,18,18);
			ellipse(myX + 25,myY + 50,18,18);
			ellipse(myX + 75,myY + 50,18,18);
		}
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
