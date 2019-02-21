package Assigment8;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ManagerStudent {
	public static Scanner scanner = new Scanner(System.in);
	private List<Student> studentList;
	private RWStudent rwStudent;
	
	public ManagerStudent() {
		rwStudent = new RWStudent();
		studentList = rwStudent.read();
	}
	
	public void addStudent() {
		int ID = (studentList.size() >0)? (studentList.size() + 1) : 1;
		System.out.println("IdStudent =" + ID);
		String name = inputName();
		int age = inputAge();
		String address = inputAddress();
		float gpa = inputGpa();
		Student student = new Student(ID, name, age, address, gpa);
		studentList.add(student);
		rwStudent.write(studentList);
	}
	
	public void editStudent(int ID) {
		boolean isExisted = false;
		int size = studentList.size();
		for (int i = 0; i< size; i++) {
			if (studentList.get(i).getID() == ID) {
				isExisted = true;
				studentList.get(i).setName(inputName());
				studentList.get(i).setAge(inputAge());
				studentList.get(i).setAddress(inputAddress());
				studentList.get(i).setGpa(inputGpa());
				break;
			}
				
		}
		if (!isExisted) {
			System.out.printf("ID = %d not existed. \n", ID);
		}
		else {
			rwStudent.write(studentList);
		}
	}
	
	public void deleteStudent(int ID) {
		Student student = null;
		int size = studentList.size();
		for (int i = 0; i < size; i++) {
			if (studentList.get(i).getID() == ID) {
				student = studentList.get(i);
				break;
			}
		}
		if (student != null) {
			studentList.remove(student);
			rwStudent.write(studentList);
		}
		else {
			System.out.printf("ID = %d not existed.\n", ID);
		}
	}
	
	public void sortStudentByName() {
		Collections.sort(studentList, new SortStudentByName());
	}
	
	public void sortStudentByGPA() {
		Collections.sort(studentList, new SortStudentByGPA());
	}
	
	public void showStudent() {
		for (Student student : studentList) {
			System.out.format("%7d |", student.getID());
			System.out.format("$30s |", student.getName());
			System.out.format("4d |", student.getAge());
			System.out.format("%50s |", student.getAddress());
			System.out.format("%10.1f%n", student.getGpa());
		}
	}
	
	public int inputID() {
		System.out.println("Enter ID: ");
		while(true) {
			try {
				int ID = Integer.parseInt((scanner.nextLine()));
				return ID;
			} catch (NumberFormatException ex) {
			System.out.print("invalid! Enter ID again: ");
			}
		}
	}
	
	private String inputName() {
		System.out.print("Enter name: ");
		return scanner.nextLine();
	}
	private int inputAge() {
		System.out.print("Enter age: ");
		while (true) {
			try {
				int age = Integer.parseInt((scanner.nextLine()));
				if (age < 0 && age >100) {
					throw new NumberFormatException();
				}
				return age;
			} catch (NumberFormatException ex) {
				System.out.print("invalid! Enter age again: ");
			}
		}
	}
	
	private String inputAddress() {
		System.out.print("Enter Address: ");
		return scanner.nextLine();
	}
	
	private float inputGpa() {
		System.out.print("Enter Gpa: ");
		while (true) {
			try {
				float gpa = Float.parseFloat((scanner.nextLine()));
				if (gpa < 0.0 && gpa >10.0) {
					throw new NumberFormatException();
				}
				return gpa;
			} catch (NumberFormatException ex) {
				System.out.print("invalid! Enter gpa agian: ");
			}
		}
	}
	
	public List<Student> getStudentList(){
		return studentList;
	}
	
	public void setStudentList(List<Student> studenList) {
		this.studentList = studenList;
	}
}
