package Com.BikkadIT.curdOperation.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity //to tell hibernate to map this class to database
@Table(name = "Student_Address")  //To change table details
public class StudentAddress {

	@Id //To use this column as Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Auto Primary key Generation Type
	@Column(name = "AddressId") // TO Manage Column details
	private int addressId;

	@Column(name = "City", length = 50)
	private String city;
	
	@Column(name = "State", length = 50)
	private String state;
	
	@Column(name = "PinCode", length = 6)
	private int pinCode;
	
	@Temporal(TemporalType.DATE) //To use format Teporal date type
	private Date admissionDate;
	
	@Transient // To avoid Column Creation in Table
	private boolean youhere;

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

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public boolean isYouhere() {
		return youhere;
	}

	public void setYouhere(boolean youhere) {
		this.youhere = youhere;
	}

	@Override
	public String toString() {
		return "StudentAddress [addressId=" + addressId + ", city=" + city + ", state=" + state + ", pinCode=" + pinCode
				+ ", admissionDate=" + admissionDate + ", youhere=" + youhere + "]";
	}
	
	
}
