package section2;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
Robot E5=new Robot();
	
	void go() {
		 // 3. delete this line (used only for testing)
		
		// 6. Make the robot go as fast as possible
E5.setSpeed(100);
		// 4. make a variable to hold the length of the triangle and set it to 50
int lengthtri=50;
		// 7. Use a for loop to repeat steps #9 to #10, 60 times
for (int i = 0; i < 60; i++) {
	

			// 9. Change the color of the pen to a random color
	E5.setRandomPenColor();
			// 8. Increase the length variable by 10
	lengthtri+=10;
			// 5. call your drawTriangle() method using your length variable
	drawTriangle(lengthtri);
			// 10. Turn the robot 6 degrees to the right
E5.turn(6);
}
	}

	/* 2. fill in the method below to draw a triangle. Use the length variable when you call move(). */
	private void drawTriangle(int length) {
		E5.penDown();
		for (int i = 0; i < 3; i++) {
			E5.move(length);
			E5.turn(120);
		}
		
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
