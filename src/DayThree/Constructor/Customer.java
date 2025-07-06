package DayThree.Constructor;

public class Customer {
	private String customerName;
	private int customerId;
	private String customerCity;
	
	
	
	public Customer() {
		System.out.println("Default constructor");
	}



	public Customer(String customerName, int customerId, String customerCity) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerCity = customerCity;
	}

	public Customer(String customerName, int customerId) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	public String getCustomeCity() {
		return customerCity;
	}



	public void setCustomeCity(String customeCity) {
		this.customerCity = customeCity;
	}



	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customeCity=" + customerCity
				+ "]";
	}



	
	
	

}
