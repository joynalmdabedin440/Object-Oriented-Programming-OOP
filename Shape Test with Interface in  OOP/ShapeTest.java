
public class ShapeTest
{
	public static void main(String[] args) {
		Circle c = new Circle(5.6);
		System.out.println(c);
		System.out.println("Area of Circle:"+c.calculateArea());
		System.out.println("Perimeter of Circle:"+c.calculatePerimeter());
		
		Rectangle R = new Rectangle(20.3,30.4);
		System.out.println(R);
		System.out.println("Area of Rectangle:"+R.calculateArea());
		System.out.println("Perimeter of Rectangle:"+R.calculatePerimeter());
		
		
		Triangle T = new Triangle(3.0,4.0,5.0);
		System.out.println(T);
		System.out.println("Area of Triangle:"+T.calculateArea());
		System.out.println("Perimeter of Triangle:"+T.calculatePerimeter());
	}
}
