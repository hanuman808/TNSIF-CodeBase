package DayFive.association.hasa;

public class Address {

	private String Street;
	private String city;
	private String state;
	private String PostalCode;
	public Address(String street, String city, String state, String postalCode) {
		
		Street = street;
		this.city = city;
		this.state = state;
		PostalCode = postalCode;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostalCode() {
		return PostalCode;
	}
	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}
	@Override
	public String toString() {
		return "Address [Street=" + Street + ", city=" + city + ", state=" + state + ", PostalCode=" + PostalCode + "]";
	}
	
	

}
