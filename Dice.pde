void setup()
{
	size(700,700);
	noLoop();
}
void draw()
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
void mousePressed()
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
	void roll()
	{
		diceNum = (int)(Math.random()*6) + 1;
	}
	void show()
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