class Circle implements Shape {
	private double r=5;
	public Circle(double r) {
		this.r = r;
	}
	@Override
	public double findArea() {
		
		return PI*r*r;
	}
	@Override
	public void sayThank() {
		// TODO Auto-generated method stub
		
	}
}
