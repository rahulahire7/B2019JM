class GrandFather {
	int gage;//80
	public GrandFather(int gage){
		this.gage = gage;
	}
	public void showAge(){
		System.out.println("Grand Father Age is :"+gage);//80
	}
}
class Father extends GrandFather{
	private int fage;//50
	public Father(int fage) {
		super(fage+30);
		this.fage = fage;//50
	}
	public void showAge(){
		super.showAge();
		System.out.println("Father Age is :"+fage);//50
	}
}
class Son extends Father {
	private int sage;//20
	public Son(int sage) {
		super(sage+30);
		this.sage = sage;//20
	}
	public void showAge(){
		super.showAge();
		System.out.println("Son Age is :"+sage);//20
	}
}
public class TestAge {
	public static void main(String[] args) {
		Son s=new Son(20);
		s.showAge();
	}
}




