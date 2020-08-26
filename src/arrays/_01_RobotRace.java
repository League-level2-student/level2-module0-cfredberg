package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		int x = 100;
		Robot[] rob = new Robot[8];
		int rob1x = 0;
		int rob2x = 0;
		int rob3x = 0;
		int rob4x = 0;
		int rob5x = 0;
		int rob6x = 0;
		int rob7x = 0;
		int rob8x = 0;
		for (int i = 0; i < rob.length; i++) {
			rob[i] = new Robot();
			rob[i].setX(x);
			x = x + 100;
			rob[i].setY(500);
			rob[i].setSpeed(100);
			rob[i].show();
			if (i == 0) {
				rob[i] = new Robot();
				rob[i].setX(x);
				x = x + 100;
				rob[i].setY(500);
				rob[i].setSpeed(100);
				rob[i].show();
				
				rob1x = rob[i].getX();
			}
		}
		boolean win = false;
		int rob1s = 0;
		int rob2s = 0;
		int rob3s = 0;
		int rob4s = 0;
		int rob5s = 0;
		int rob6s = 0;
		int rob7s = 0;
		int rob8s = 0;
		while(win == false) {
		for (int i = 0; i < rob.length; i++) {
			int num = i + 1;
			int a = new Random().nextInt(50);
			for(int t = 0; t < a; t++) {
				if (i == 0) {
					rob[i].move(1);
					rob1s++;
					if (rob1s == 10) {
						rob[i].turn(36);
						rob1s = 0;
					}
				}
				if (i == 1) {
					rob[i].move(1);
					rob2s++;
					if (rob2s == 10) {
						rob[i].turn(36);
						rob2s = 0;
					}
				}
				if (i == 2) {
					rob[i].move(1);
					rob3s++;
					if (rob3s == 10) {
						rob[i].turn(36);
						rob3s = 0;
					}
				}
				if (i == 3) {
					rob[i].move(1);
					rob4s++;
					if (rob4s == 10) {
						rob[i].turn(36);
						rob4s = 0;
					}
				}
				if (i == 4) {
					rob[i].move(1);
					rob5s++;
					if (rob5s == 10) {
						rob[i].turn(36);
						rob5s = 0;
					}
				}
				
				if (i == 5) {
					rob[i].move(1);
					rob6s++;
					if (rob6s == 10) {
						rob[i].turn(36);
						rob6s = 0;
					}
				}
				if (i == 6) {
					rob[i].move(1);
					rob7s++;
					if (rob7s == 10) {
						rob[i].turn(36);
						rob7s = 0;
					}
				}
				if (i == 7) {
					rob[i].move(1);
					rob8s++;
					if (rob8s == 10) {
						rob[i].turn(36);
						rob8s = 0;
					}
				}
			}
			if (i == 1) {
				if () {
					
				}
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
