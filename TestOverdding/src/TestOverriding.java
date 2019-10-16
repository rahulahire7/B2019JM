public class TestOverriding {
	public static void main(String[] args) {
		Shape s=null;//we can take ref of interface
		s=new Circle(2.2);
		System.out.println("Area of Circle is :"+s.findArea());
		s=new Triangle(2.2, 3.3);
		System.out.println("Area of Triangle is :"+s.findArea());
	}
}
