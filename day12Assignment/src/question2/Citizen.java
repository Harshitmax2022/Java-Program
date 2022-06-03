package question2;

public class Citizen {

	private String name;
	private String adharNumber;
	private String mobileNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdharNumber() {
		return adharNumber;
	}
	public void setAdharNumber(String adharNumber) {
		this.adharNumber = adharNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Citizen(String name, String adharNumber, String mobileNumber) {
		super();
		this.name = name;
		this.adharNumber = adharNumber;
		this.mobileNumber = mobileNumber;
	}
	
	
	
}
