package Com.BikkadIT.curdOperation.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable  // to inject this class to another class or add this class to another entity class.
				//By using embeddable we can add field of this class to another class. and we have to clete injection field in that class
					// like private StudentAddress sta;
public class StudentAddress {

	
	
	@Column(name = "AddressId") 
	private int addressId;

	@Column(name = "City", length = 50)
	private String city;
	
	@Column(name = "State", length = 50)
	private String state;
	
	@Column(name = "PinCode", length = 6)
	private int pinCode;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
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

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	

	@Override
	public String toString() {
		return "StudentAddress [addressId=" + addressId + ", city=" + city + ", state=" + state + ", pinCode=" + pinCode
				+ "]";
	}
	
	
}
