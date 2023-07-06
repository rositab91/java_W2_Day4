package javaStreams;

public class Customer {

	long id;
	String name;
	int tier;

	public Customer(long id, String name, int tier) {
		super();
		this.id = id;
		this.name = name;
		this.tier = tier;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", tier=" + tier + "]";
	}

}