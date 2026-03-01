package user;

import java.util.ArrayList;
import java.util.List;

/**
 * Ведет историю совершенных пользователем сделок.
 * Позволяет добавлять новые записи и получать полный список.
 */
public class TradeHistory {
	/** Список сделок в хронологическом порядке */
	private final List<String> trades = new ArrayList<>();

	/**
	 * Добавляет запись о новой сделке.
	 *
	 * @param trade описание сделки
	 */
	public void addTrade(String trade) {
		trades.add(trade);
	}
}