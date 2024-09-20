import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        //create object of racingBOt and ServiceRobot
        RacingBot ferrariBot = new RacingBot("FerrariBOT", 2016, 2.0, 2.0);
        ServiceRobot wallE = new ServiceRobot("WallE", 2009, 200.0, 2.4);
        
        // take input from user number of movement
        int numOfMovements ;
        System.out.println("Enter number of movements: ");
        Scanner s = new Scanner(System.in);
        numOfMovements = s.nextInt();
        
        //cordinate
        ferrariBot.setCoordinate(0.0, 0.0, 0.0, 0.0);
        wallE.setCoordinate(0.0, 0.0, 0.0, 0.0);
        
        // Testing RacingBot methods
        double distanceTraveledRacingBot = ferrariBot.calculateDistanceTraveled(numOfMovements);
        System.out.println("Distance Traveled by RacingBot: " + distanceTraveledRacingBot);

        double accelerationRacingBot = ferrariBot.calculateAcceleration(10, numOfMovements);
        System.out.println("Acceleration of RacingBot: " + accelerationRacingBot);

        ferrariBot.display();
    
    
        // Testing ServiceRobot methods
        double distanceTraveledServiceRobot = wallE.calculateDistanceTraveled(numOfMovements);
        System.out.println("Distance Traveled by ServiceRobot: " + distanceTraveledServiceRobot);

        double timeToRecharge = wallE.calculateTimeToRecharge();
        System.out.println("Time to Recharge for ServiceRobot: " + timeToRecharge);

        wallE.display();

        // Printing total number of robots
        System.out.println("Total robots created: " + Robot.getRobotCounter());

    }
}
