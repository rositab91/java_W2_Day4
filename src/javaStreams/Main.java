package javaStreams;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	static List<Product> mixedListA = new ArrayList<Product>();
	static List<Product> mixedListB = new ArrayList<Product>();
	static List<Product> boysList = new ArrayList<Product>();
	static List<Order> orderListA = new ArrayList<Order>();
	static List<Order> orderListB = new ArrayList<Order>();

	static List<Customer> customersList = new ArrayList<Customer>();
	
	
	public static void main(String[] args) {

		Product p1 = new Product(012345, "Diapers", "Baby", 7.50);
		Product p2 = new Product(012345, "Harry Potter and the Philosopher's Stone", "Books", 10.75);
		Product p3 = new Product(012345, "Cradle", "Baby", 100.50);
		Product p4 = new Product(012345, "Harry Potter and the Goblet of Fire", "Books", 12.30);
		Product p5 = new Product(012345, "Harry Potter and the Chamber of Secrets", "Books", 9.45);


		mixedListA.add(p1);
		mixedListA.add(p2);
		mixedListA.add(p3);
		mixedListA.add(p4);
		mixedListA.add(p5);
		
		mixedListB.add(p1);
		mixedListB.add(p2);
		mixedListB.add(p3);
		mixedListB.add(p4);
		mixedListB.add(p5);

		boysList.add(p3);
		boysList.add(p5);

		
		Customer c1 = new Customer(321, "Rosita", 4);
		Customer c2 = new Customer(320, "Sofia", 2);
		Customer c3 = new Customer(324, "Greta", 1);

		customersList.add(c1);
		customersList.add(c2);
		customersList.add(c3);
		
		orderListA.add(new Order(323, "Ongoing", mixedListA, c1));
		orderListB.add(new Order(325, "Completed", mixedListB, c2));

		System.out.println(orderListA);
		
		filterCategory("Books");
	}
	
	// Exercise1
	public static void filterCategory(String category) {
		Stream<Object> streamFiltered = mixedListA.stream().filter(e -> e.category == category)
				.filter(e -> e.price > 100).map(e -> e);
		List<Object> productsList = streamFiltered.collect(Collectors.toList());
		System.out.println(productsList);
	};
	

}