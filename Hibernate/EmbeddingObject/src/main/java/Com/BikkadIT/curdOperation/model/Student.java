package Com.BikkadIT.curdOperation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="Student_data")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int rollNo;
	@Column(name="StudentName")
	private String name;
	@Column(name="Stream")
	private String stream;
	
	private StudentAddress stuadd; //StudentAddress class object

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public StudentAddress getStuadd() {
		return stuadd;
	}

	public void setStuadd(StudentAddress stuadd) {
		this.stuadd = stuadd;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", stream=" + stream + ", stuadd=" + stuadd + "]";
	}
	
}
