package trading;

import java.util.*;

public class OrderBook {
	// TODO: store buy/sell orders
	private List<String> buyOrders = new ArrayList<>();
	private List<String> sellOrders = new ArrayList<>();

	public void addOrder(String order) {
		// TODO: add to appropriate list
		System.out.println("Order added: " + order);
	}
}