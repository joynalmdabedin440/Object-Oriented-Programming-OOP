class Triangle implements Shape{
    
    private double base;
    private double height;
    private double hypotenuse;
    
    public Triangle(double base,double height, double hypotenuse){
        this.base=base;
        this.height=height;
        this.hypotenuse=hypotenuse;
    }
    
    @Override
    public double calculateArea(){
        return 0.5*base*height;
    }
    @Override
    public double calculatePerimeter(){
        return base+height+hypotenuse;
    }
    
    @Override
    public String toString(){
        return "Three side of Triangle are:"+"base: "+base+" height: "+height+" hypotenuse: "+hypotenuse;
    }
    
}