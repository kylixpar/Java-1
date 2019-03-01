package EXAM;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Item item = new Item();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter ID: ");
		item.itemId = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter name: ");
		item.name = scanner.nextLine();
		System.out.println("Enter producer: ");
		item.producer = scanner.nextLine();
		System.out.println("Enter price: ");
		item.price = scanner.nextDouble();
		System.out.println(item.toString());
	}
}
