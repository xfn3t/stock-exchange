package trading;

import java.util.*;

/**
 * Хранит список активных заявок на покупку и продажу.
 * Обеспечивает добавление новых заявок и сопоставление встречных.
 */
public class OrderBook {
	/** Список заявок на покупку */
	private List<String> buyOrders = new ArrayList<>();
	/** Список заявок на продажу */
	private List<String> sellOrders = new ArrayList<>();

	/**
	 * Добавляет новую заявку в стакан.
	 * TODO: добавить логику распределения по спискам в зависимости от типа заявки.
	 *
	 * @param order строковое представление заявки
	 */
	public void addOrder(String order) {
		// TODO: add to appropriate list
		System.out.println("Order added: " + order);
	}
}