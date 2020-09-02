package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		int x = 120;
		
		int rob1 = 0;
		int rob2 = 0;
		int rob3 = 0;
		int rob4 = 0;
		
		int[] rob1c = {0, 0};
		int[] rob2c = {0, 0};
		int[] rob3c = {0, 0};
		int[] rob4c = {0, 0};
		
		Robot[] rob = new Robot[4];
		for (int i = 0; i < rob.length; i++) {
			rob[i] = new Robot();
			rob[i].miniaturize();
			rob[i].setX(x);
			if (i == 0) {
				rob1c[0] = rob[0].getX();
				rob1c[1] = rob[0].getY();
			}
			x = x - 30;
		}
		
		int dis = 0;
		boolean win = false;
		while (win == false) {
			for (int i = 0; i < 4; i++) {
				if (i == 0) {
					dis = new Random().nextInt(30);
					for (int j = 0; j < dis; j++) {
						rob[0].move(1);
						rob1++;
						if (rob1 == 30) {
							rob[0].turn(36);
							rob1 = 0;
						}
					}
				}
				
				if (i == 1) {
					dis = new Random().nextInt(60);
					for (int j = 0; j < dis; j++) {
						rob[1].move(1);
						rob2++;
						if (rob2 == 60) {
							rob[1].turn(36);
							rob2 = 0;
						}
					}
				}
				
				if (i == 2) {
					dis = new Random().nextInt(90);
					for (int j = 0; j < dis; j++) {
						rob[2].move(1);
						rob3++;
						if (rob3 == 90) {
							rob[2].turn(36);
							rob3 = 0;
						}
					}
				}
				
				if (i == 3) {
					dis = new Random().nextInt(120);
					for (int j = 0; j < dis; j++) {
						rob[3].move(1);
						rob4++;
						if (rob4 == 120) {
							rob[3].turn(36);
							rob4 = 0;
						}
					}
				}
			}
		}

	}
	// 2. create an array of 5 robots.

	// 3. use a for loop to initialize the robots.

	// 4. make each robot start at the bottom of the screen, side by side, facing up

	// 5. use another for loop to iterate through the array and make each robot move
	// a random amount less than 50.
	// 6. use a while loop to repeat step 5 until a robot has reached the top of the
	// screen.

	// 7. declare that robot the winner and throw it a party!

	// 8. try different races with different amounts of robots.

	// 9. make the robots race around a circular track.
}
