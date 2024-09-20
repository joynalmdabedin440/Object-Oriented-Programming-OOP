class Rectangle implements Shape{
    private double length;
    private double width;
    
    public Rectangle(double length, double width){
        
       this.length=length;
       this.width=width;
        
    }
    
    @Override
    public double calculateArea(){
        return length*width;
    }
    @Override
    public double calculatePerimeter(){
        return 2*(length+width);
    }
    
    @Override
    public String toString(){
        return "Value of length and Width of a Rectangle: "+ "length "+length+" Width: "+width;
    }
    
    
}
