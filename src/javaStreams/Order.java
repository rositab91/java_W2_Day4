package javaStreams;

import java.time.LocalDate;
import java.util.List;

public class Order {

	long id;
	String status;
	LocalDate orderDate;
	LocalDate deliveryDate;
	List<Product> product;
	Customer customer;

	public Order(long id, String status, List<Product> product, Customer customer) {
		super();
		this.id = id;
		this.status = status;

		this.product = product;
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", status=" + status + ", ordered=" + orderDate + ", delivery date=" + deliveryDate
				+ ", products=" + product + ", customer=" + customer + "]";
	}
}
