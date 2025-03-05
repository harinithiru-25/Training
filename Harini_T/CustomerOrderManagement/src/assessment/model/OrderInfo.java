package assessment.model;

public class OrderInfo {
	private static int accNumber;
	private static String category;
	private static int productId;
	private static int quantity;
	private static double orderPrice;
	private static String status;
	
	
	public OrderInfo(int accNumber,String category,int productId,int quantity)
	{
		this.accNumber=accNumber;
		this.category=category;
		this.productId=productId;
		this.quantity=quantity;
		this.orderPrice=0;
		this.status="NEW";
	}


	public static int getAccNumber() {
		return accNumber;
	}


	public static void setAccNumber(int accNumber) {
		OrderInfo.accNumber = accNumber;
	}


	public static String getCategory() {
		return category;
	}


	public static void setCategory(String category) {
		OrderInfo.category = category;
	}


	public static int getProductId() {
		return productId;
	}


	public static void setProductId(int productId) {
		OrderInfo.productId = productId;
	}


	public static int getQuantity() {
		return quantity;
	}


	public static void setQuantity(int quantity) {
		OrderInfo.quantity = quantity;
	}


	public static double getOrderPrice() {
		return orderPrice;
	}


	public static void setOrderPrice(double orderPrice) {
		OrderInfo.orderPrice = orderPrice;
	}


	public static String getStatus() {
		return status;
	}


	public static void setStatus(String status) {
		OrderInfo.status = status;
	}
	
}
