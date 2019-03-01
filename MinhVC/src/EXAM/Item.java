package EXAM;

public class Item {
	public int itemId;
	public String name;
	public String producer;
	public double price;
	
	public Item() {
		
	};
	
	public Item(int itemId, String name, String producer, double price) {
		this.itemId = itemId;
		this.name = name;
		this.producer = producer;
		this.price = price;
	}
	public String toString() {
		return itemId+ " " + name+" "+producer+" "+price;
	}
}
