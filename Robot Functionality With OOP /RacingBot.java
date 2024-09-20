
import java.util.Random;   
public class RacingBot extends Robot{
    
    private double initialVelocity;
    private double distanceTravelTime;
    Random random=new Random();

    public RacingBot(String name, int yearBuilt, double initialVelocity, double distanceTravelTime){
        super(name, yearBuilt);
        this.initialVelocity=initialVelocity;
        this.distanceTravelTime=distanceTravelTime;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("With initial velocity of"+" "+initialVelocity+" "+getName()+" " + "took"+" "+distanceTravelTime+" "+"unit of time to move.");
        
    }
    
    @Override
    public double calculateDistanceTraveled(int noOfMovements){
        
        double d=0;
        for (int i = 0; i < noOfMovements; i++) {
            int rand = random.nextInt(50)%4;
            if(rand==0){
               
                y2=y2+1;
            }
            if(rand==1){

                y2=y2-1;
            }
            if(rand==2){
                x2=x2+1;
              
            }
            if(rand==2){
                x2=x2-1;
              
            }
            
            d += Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        }
        
        return Math.round(d);
    }
    
     public double calculateAcceleration(double accelerationTime, int noOfMovements) {
        double finalVelocity = calculateDistanceTraveled(noOfMovements) / distanceTravelTime;
        double d = (finalVelocity - initialVelocity) / accelerationTime;
        return Math.ceil(d);
    }
} 