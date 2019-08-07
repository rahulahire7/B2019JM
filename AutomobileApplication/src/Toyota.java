
public class Toyota implements Automobile {

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "T111";
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Gray";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 1000000;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Toyota Model :"+getModel()+"\nToyota Color :"+getColor()+"\nTOyota Price :"+getPrice();
	}

}
