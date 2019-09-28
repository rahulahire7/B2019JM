package linkcode.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import linkcode.dao.RegisterDao;
import linkcode.model.Login;
import linkcode.model.Register;
public class RegistarationController {
	public static void main(String[] args) {
		int ch;
		RegisterDao rd=new RegisterDao();
		Scanner sc=new Scanner(System.in);
		System.out.println("1-Save\n2-Validate");
		System.out.println("Enter your choice..");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter Reg No,Name,User Name,Password");
			int regNo=sc.nextInt();
			String custName=sc.next();
			String userName=sc.next();
			String password=sc.next();

			Register r=new Register();
			r.setRegNo(regNo);
			r.setCustName(custName);
			r.setUserName(userName);
			r.setPassword(password);
			List<Register> lst=new ArrayList<Register>();
			lst.add(r);

			int i=rd.saveData(lst);
			if(i>0){
				System.out.println("record save...");
			}
			break;
		case 2:
			System.out.println("Enter User Name and Password to validate user");
			Login l=new Login();
			l.setUserName(sc.next());
			l.setPassword(sc.next());
			List<Login> lst2=new ArrayList<Login>();
			lst2.add(l);
			boolean b=rd.validate(lst2);
			if(b){
				System.out.println("Valid User..");
			}
			break;
		default:System.out.println("invalid choice..");
		}
	}
}







