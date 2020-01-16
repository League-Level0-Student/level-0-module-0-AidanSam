package _02_robot_graffiti;
import org.jointheleague.graphical.robot.Robot;

public class Robot_Graffiti {

	public static void main(String[] args) {
		
		Robot rover = new Robot();
		
		rover.setSpeed(100000);
		
		rover.turn(-90);
		
		rover.move(300);
		
		rover.turn(90);
		
		rover.penDown();
		
		rover.hide();
		
		rover.setSpeed(255);
		
		rover.turn(20);
		
		rover.move(150);
		
		rover.turn(140);
		
		rover.move(150);
		
		rover.turn(180);
		
		rover.move(75);
		
		rover.turn(-70);
		
		rover.move(50);
	}
	
}
