 class Circle implements Shape{
    private double r;
    
    public Circle(double r){
        this.r=r;
        
        
    }
    
    @Override
    public double calculateArea(){
        return Math.PI*Math.pow(r,2);
    }
    
    @Override
    public double calculatePerimeter(){
        return 2*Math.PI*r;
    }
    
    @Override
    public String toString(){
        return "Radius of circle is:"+r;
    }
}