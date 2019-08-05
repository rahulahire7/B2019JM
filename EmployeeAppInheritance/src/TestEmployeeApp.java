
public class TestEmployeeApp {

	public static void main(String[] args) {
		Manager m1=new Manager(101,"Ram",10000,1000);
		Manager m2=new Manager(101,"Ganesh",10000,1000);
		if(m1.equals(m2))
		{
			System.out.println("same object..");
		}
		else
		{
			System.out.println("not same..");
		}
		
		display(m1,"Manager");
		
		Devloper d=new Devloper(201,"SUresh",20000,10);
		display(d,"Devloper");
	}
	public static void display(Employee e,String str){
		System.out.println("----------------------------");
		
		System.out.println(e);
	/*
		System.out.println(str+" is :"+e.getEmpId());
		System.out.println(str+" Name :"+e.getEmpName());
		System.out.println(str+" Sal :"+e.getEmpSal());
		//System.out.println(e.getBonus());
		if(e instanceof Manager){
			Manager m=(Manager)e;
			System.out.println("Manager Bonus :"+m.getBonus());
		}
		else if(e instanceof Devloper){
			Devloper d=(Devloper)e;
			System.out.println("Dev no of hr :"+d.getNoofhr());
		}
		*/
	}

}
