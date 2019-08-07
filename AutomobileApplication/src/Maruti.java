
public class Maruti implements Automobile{

	
	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "M123";
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "White";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 700000;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Maruti Model :"+getModel()+"\nMaruti Color :"+getColor()+"\nMaruti Price :"+getPrice();
	}

}
