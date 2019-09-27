public class TestAutomobile {
	public static void main(String[] args) {

		Automobile a=null;
		a=new Maruti();
		display(a,"Maruti");
		a=new Toyota();
		display(a,"Toyota");
		a=new Bmw();
		display(a,"Bmw");
		a=new HeroHonda();
		display(a, "HeroHonda");
		
		/*System.out.println("Maruti Model :"+a.getModel());
		System.out.println("Maruti Color :"+a.getColor());
		System.out.println("Maruti Price :"+a.getPrice());
		
		a=new Toyota();
		System.out.println("Toyota Model :"+a.getModel());
		System.out.println("Toyota Color :"+a.getColor());
		System.out.println("Toyota Price :"+a.getPrice());
		
		a=new Bmw();
		System.out.println("BMW Model :"+a.getModel());
		System.out.println("BMW Color :"+a.getColor());
		System.out.println("BMW Price :"+a.getPrice());
		*/
	}
	public static void display(Automobile a,String str){
		System.out.println("---------------------------------------");
		//System.out.println(a);
		System.out.println(str+" Model :"+a.getModel());
		System.out.println(str+" Color :"+a.getColor());
		System.out.println(str+" Price :"+a.getPrice());
		if(a instanceof Bike)
		{
			Bike b=(Bike)a;
			System.out.println(str+" CC :"+b.getCC());
		}
		
			
	}
}
