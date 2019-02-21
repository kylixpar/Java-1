package Assigment8;
import java.io.Serializable;
public class Student implements Serializable{
	private int ID;
	private String name;
	private int age;
	private String address;
	private float gpa;
	
	public Student(int ID, String name, int age, String address, float gpa) {
		this.ID = ID;
		this.name = name;
		this.age = age;
		this.address = address;
		this.gpa = gpa;
	}
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	
}
