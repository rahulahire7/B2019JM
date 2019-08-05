public class Devloper extends Employee{
	private int noofhr;
	public Devloper(int empId, String empName, double empSal, int noofhr) {
		super(empId, empName, empSal);
		this.noofhr = noofhr;
	}
	public int getNoofhr() {
		return noofhr;
	}
	
	@Override
	public String toString() {
		return "Devloper Id :"+getEmpId()+"\nDevloper Name :"+getEmpName()+"\nDevloper Salary :"+getEmpSal()+"\nDevloper Noofhr :"+getNoofhr();
	}
	

}
