package javaStreams;

public class Product {

	long id;
	String name;
	String category;
	public double price;

	public Product(long id, String name, String category, double price) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}

	public double getPrice() {
		return price;
	}

	public double setPrice(double d) {
		return price;
	}
}