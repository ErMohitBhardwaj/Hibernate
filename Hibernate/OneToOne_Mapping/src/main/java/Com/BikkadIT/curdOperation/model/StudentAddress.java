package Com.BikkadIT.curdOperation.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentAddress {

	
	@Id
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
