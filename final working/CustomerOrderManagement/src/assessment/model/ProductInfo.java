package assessment.model;

public class ProductInfo {

	private static String productName;
	private static String category;
	private static double price;
	private static long stock;
	
	public ProductInfo(String productName,String category,double price,long stock)
	{
		this.productName=productName;
		this.category=category;
		this.price=price;
		this.stock=stock;
	}

	public static String getProductName() {
		return productName;
	}

	public static void setProductName(String productName) {
		ProductInfo.productName = productName;
	}

	public static String getCategory() {
		return category;
	}

	public static void setCategory(String category) {
		ProductInfo.category = category;
	}

	public static double getPrice() {
		return price;
	}

	public static void setPrice(double price) {
		ProductInfo.price = price;
	}

	public static long getStock() {
		return stock;
	}

	public static void setStock(long stock) {
		ProductInfo.stock = stock;
	}
	
}
