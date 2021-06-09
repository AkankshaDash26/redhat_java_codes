package comm.example;

public class Product {
	
	private String productId;
	private String productName;
	private static Double productPrice;
	private static Integer numberOfProduct;
	private static double sum;
	private double discountPercent;
	
	
	
	static
	{
		numberOfProduct=0;
		sum=0;
	}
	
	public  void  createProduct(String id, String name, Double price) {
		numberOfProduct++;
		productId = id;
		productName = name;
		productPrice = price;
	}
	
	
	public static Integer getNumberOfProduct()
	{
		return numberOfProduct;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	public static double totalPrice()
	{
		return sum=sum+productPrice;
	}
	public double discount(double discountPercent)
	{
		this.discountPercent=discountPercent;
		return (totalPrice()-(totalPrice()*this.discountPercent)/100);
	}

}
