public class TestApp {
	public static void main(String[] args) {
		Customer c1=accept();
		display(c1);
	}
	public static Customer accept(){
		Product p1=new Product(101,"Book",500,2);
		Customer c1=new Customer(11,"Ramesh",p1);
		return c1;
	}
	public static void display(Customer c1){

		System.out.println("Cust Id :"+c1.getCustId());
		System.out.println("Cust Name :"+c1.getCustName());
		System.out.println("Product Id :"+c1.getP1().getProdId());
			System.out.println("Product Name :"+c1.getP1().getCustName());
			System.out.println("Product Price :"+c1.getP1().getPrice());
			System.out.println("Product Qty :"+c1.getP1().getQty());
	}

}
