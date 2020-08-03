package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot Steve=new Robot ();
	Steve.penDown();
	Steve.setSpeed(500);
	Steve.move(200);
	Steve.turn(90);
	Steve.move(200);
	Steve.turn(90);
	Steve.move(200);
	Steve.turn(90);
	Steve.move(200);
	
	for (int i = 0; i < 4; i++) {
		Steve.move(200);
		Steve.turn(-90);		
	}
	}
}
