package Assigment8;
import java.util.Scanner;
public class Main {
	public static Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
	String choose = null;
	boolean exit = false;
	ManagerStudent managerStudent = new ManagerStudent();
	int ID;
	
	showMenu();
	while (true) {
		choose = scanner.nextLine();
		switch (choose) {
		case "1" :
			managerStudent.addStudent();
			break;
		case "2" :
			ID = managerStudent.inputID();
			managerStudent.editStudent(ID);
			break;
		case "3" :
			ID = managerStudent.inputID();
			managerStudent.deleteStudent(ID);
			break;
		case "4" :
			managerStudent.sortStudentByGPA();
		case "5" :
			managerStudent.sortStudentByName();
		case "6" :
			managerStudent.showStudent();
			break;
		case "7" :
			System.out.println("Exit!");
			exit = true;
			break;
			default:
				System.out.println("invalid! please choose:");
				break;
		}
		if (exit) {
			break;
		}
		showMenu();
	}
}

public static void showMenu() {
	System.out.println("1. Add student.");
	System.out.println("2. Edit student.");
	System.out.println("3. Delete student.");
	System.out.println("4. Sort student by gpa.");
	System.out.println("5. Sort student by name.");
	System.out.println("6. Show student.");
	System.out.println("0. Exit.");
	
}
}
