class Demo
{
	//instance variable...
	int rno;
	Demo()//Default COnstructor...
	{
		rno=10;
	}
	Demo(int rno){
		this(100,1.1);//is used to call another constructor of same class..
		this.rno=rno;	
	}
	Demo(int rno,double per){
		System.out.println("third constructor..");
	}
	public void show(){
		System.out.println("value of ron is :"+rno);
	}
}
public class TestThis {
	public static void main(String[] args) {
		Demo d1=new Demo();
		Demo d2=new Demo(100);
		//Demo d3=new Demo(10,1.1);
		
		d1.show();
		d2.show();
	}
	

}
