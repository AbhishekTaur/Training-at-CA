package server;
import javax.xml.bind.annotation.*;

@XmlRootElement(name="Student")
public class Student {
	int studentID;
	String name;
	String city;
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", name=" + name + ", city="
				+ city + "]";
	}
	
	
}
