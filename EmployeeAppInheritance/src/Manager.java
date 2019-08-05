public class Manager extends Employee {
	private double bonus;
	
	public Manager(int empId, String empName, double empSal, double bonus) {
		super(empId, empName, empSal);
		this.bonus = bonus;
	}
	public double getBonus() {
		return bonus;
	}
	@Override
	public String toString() {
		return "Manager id :"+getEmpId()+"\nMang Name :"+getEmpName()+"\nMang Salary "+getEmpSal()+"\n Mang Bonus :"+getBonus();
	}
	@Override
	public boolean equals(Object obj) {
		Manager m=(Manager)obj;
		if((this.getEmpId()==m.getEmpId())&&(this.getEmpName()==m.getEmpName())&&(this.getEmpSal()==m.getEmpSal()))
		{
			return true;
		}
		return false;
	}
	
	
}
