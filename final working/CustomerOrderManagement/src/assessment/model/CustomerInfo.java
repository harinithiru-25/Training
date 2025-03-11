package assessment.model;

public class CustomerInfo {
	private static String firstName;
	private static String lastName;
	private static String mobileNum;
	private static String email;
	private static String paymentChoice;
	private static String cardStatus;
	
	public CustomerInfo(String firstName,String lastName,String mobileNum,String email,String paymentChoice,String cardStatus)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.mobileNum=mobileNum;
		this.email=email;
		this.paymentChoice=paymentChoice;
		this.cardStatus=cardStatus;
	}

	public static String getFirstName() {
		return firstName;
	}

	public static void setFirstName(String firstName) {
		CustomerInfo.firstName = firstName;
	}

	public static String getLastName() {
		return lastName;
	}

	public static void setLastName(String lastName) {
		CustomerInfo.lastName = lastName;
	}

	public static String getMobileNum() {
		return mobileNum;
	}

	public static void setMobileNum(String mobileNum) {
		CustomerInfo.mobileNum = mobileNum;
	}

	public static String getEmail() {
		return email;
	}

	public static void setEmail(String email) {
		CustomerInfo.email = email;
	}

	public static String getPaymentChoice() {
		return paymentChoice;
	}
	
	public static String getCardStatus() {
		return cardStatus;
	}

	public static void setCardStatus(String cardStatus) {
		CustomerInfo.cardStatus = cardStatus;
	}

	public static void setPaymentChoice(String paymentChoice) {
		CustomerInfo.paymentChoice = paymentChoice;
	}

	
	

}
