package TestCases;

public class _Info {

	private String email;
	private Integer phone;
	private String address;
	
	public _Info() {
		super();
	}

	public _Info(String email, Integer phone, String address) {
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer string) {
		this.phone = string;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
