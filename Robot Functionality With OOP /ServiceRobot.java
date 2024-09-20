import java.util.Random; 
class ServiceRobot extends Robot{
    private double batteryCapacity;
    private double chargingRate;
    Random random=new Random();
    public ServiceRobot(String name, Integer yearBuilt, double batteryCapacity, double chargingRate) {
        super(name, yearBuilt);
        this.batteryCapacity = batteryCapacity;
        this.chargingRate = chargingRate;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Battery Capacity: " + batteryCapacity + " Ah with a charging rate of " + chargingRate);
    }
    
    @Override
    public double calculateDistanceTraveled(int noOfMovements) {
        double d = 0;
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
            
            d += Math.abs(x1 - x2) + Math.abs(y1 - y2);
            
        }
        return Math.round(d);
        
    }
    
    public double calculateTimeToRecharge() {
        double takenTime = batteryCapacity / chargingRate;
        
       return Math.round(takenTime);
    }


}
