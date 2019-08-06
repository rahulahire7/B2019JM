public class Product {
	//instance variable..
	private int prodId;
	private String custName;
	private double price;
	private int qty;
	private String desc;
	
	public Product(int prodId, String custName, double price,int qty) {
		this.prodId = prodId;
		this.custName = custName;
		this.price = price;
		this.qty=qty;
	}
	public int getQty(){
		return qty;
	}
	public int getProdId() {
		return prodId;
	}
	public String getCustName() {
		return custName;
	}
	public double getPrice() {
		return price;
	}
}
