class A
{
	int n1=10;
	A(){
		System.out.println("class A constructor...");
	}
	A(int n){
		System.out.println("Class A parametric constructor...");
	}
	void show()
	{
		System.out.println("display from base..");
	}
}
class B extends A
{
	int n1=20;
	B(){
		super(10);
		System.out.println("Class b constructor...");
	}
	public void show()
	{
		super.show();
		System.out.println("base class var n1 is :"+super.n1);
		System.out.println("derived class var n2 is :"+n1);
	}
}
public class TestInheritance {
	public static void main(String args[]){
		System.out.println("in main..");
		B b1=new B();
		b1.show();
		System.out.println("Thank you..");
		
	}

}
