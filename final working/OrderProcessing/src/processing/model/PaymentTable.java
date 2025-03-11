package processing.model;

public class PaymentTable {

	private static int orderId;
	private static int totalAmount;
	private static String paymentStatus;
	public static int getOrderId() {
		return orderId;
	}
	public static void setOrderId(int orderId) {
		PaymentTable.orderId = orderId;
	}
	public static int getTotalAmount() {
		return totalAmount;
	}
	public static void setTotalAmount(int totalAmount) {
		PaymentTable.totalAmount = totalAmount;
	}
	public static String getPaymentStatus() {
		return paymentStatus;
	}
	public static void setPaymentStatus(String paymentStatus) {
		PaymentTable.paymentStatus = paymentStatus;
	}
	
	
}
