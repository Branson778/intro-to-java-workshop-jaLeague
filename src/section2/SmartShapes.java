package section2;

import org.jointheleague.graphical.robot.Robot;

public class SmartShapes {
	
    public static void main(String[] args) throws Exception {
        // 1. Make a new Robot

Robot D4=new Robot();
        // 3. Put the robot's pen down

D4.penDown();
        // 6. Make the robot move as fast as possible
D4.setSpeed(500);

        // 5. Use a for loop to repeat everything below 4 times. 

for (int i = 0; i < 3; i++) {
	

        //         2. Move your robot 200 pixels

D4.move(100);
        //         4. Turn the robot 90 degrees to the right

    	D4.turn(360/3);
    		// 7. Change steps 4 and 5 to draw a different shape (e.g. triangle (3-sides), pentagon (5-sides), decagon (10-sides)).
   
}
    }
}
