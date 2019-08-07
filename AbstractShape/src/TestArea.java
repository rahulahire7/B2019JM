interface Shape{
	double PI=3.14;
	double findArea();//by default methods are public and abstract
	void sayThanks();
}
class Circle implements Shape{
	double r;
	public Circle(double r){
		this.r=r;
	}
	public double findArea(){
		return PI*r*r;
	}
	@Override
	public void sayThanks() {
		
		
	}
}
class Triangle implements Shape{
	double b,h;
	public Triangle(double b,double h){
		this.b=b;
		this.h=h;
	}
	public double findArea(){
		return 0.5*b*h;
	}
	@Override
	public void sayThanks() {
		// TODO Auto-generated method stub
		
	}
	
}
public class TestArea {
	public static void main(String[] args) {
		Shape s=null;//new Shape[10];
		s=new Circle(2.2);
		System.out.println("Area of circle is :"+s.findArea());
		s=new Triangle(2.2,3.3);
		System.out.println("Area of Trinagle is :"+s.findArea());
	}
}
