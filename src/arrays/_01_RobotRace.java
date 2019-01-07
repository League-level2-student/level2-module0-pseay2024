package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args)
	{
		Robot[] r = new Robot[15];
		for (int i = 0; i < r.length; i++)
		{
			r[i] = new Robot();
			r[i].setX(400);
			r[i].setY(550);
			r[i].setSpeed(5000);
			r[i].turn(-90);
			r[i].move(3);
			r[i].turn(1);
		}
		Random rand = new Random();
		boolean isRacing = true;
		while (isRacing)
		{
			for (Robot bb8 : r)
			{
				if (bb8.getX() != 400 || bb8.getY() != 550)
				{
					if (rand.nextInt(2) == 0)
					{
						bb8.move(3);
						bb8.turn(1);
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "A robot has won the race");
					isRacing = false;
				}
			}
		}
	}
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
