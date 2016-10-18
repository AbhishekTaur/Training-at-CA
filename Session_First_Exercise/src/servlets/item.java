package servlets;

public class item {
	int item_code;
	String item_name;
	int price;
	
	public item(int item_code, String item_name, int price) {
		super();
		this.item_code = item_code;
		this.item_name = item_name;
		this.price = price;
	}
	public int getItem_code() {
		return item_code;
	}
	public void setItem_code(int item_code) {
		this.item_code = item_code;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
