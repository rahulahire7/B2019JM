public class Triangle implements Shape{
	double b,h;
	public Triangle(double b, double h) {
		super();
		this.b = b;
		this.h = h;
	}
	public double triangleArea(){
		
		return 0.5*b*h;
	}
	@Override
	public double findArea() {
		// TODO Auto-generated method stub
		return 0.5*b*h;
	}
	@Override
	public void sayThank() {
		// TODO Auto-generated method stub
		
	}
	
}
