package StreamAPI;

import java.util.ArrayList;
import java.util.List;

class Product{
	private int id;
	private String name;
	private float price;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}


	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	
}
public class ProductMain {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product(0, null, 0));
}

}
