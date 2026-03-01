package trading;

/**
 * Ядро торговой логики. Обрабатывает поступающие заявки,
 * сопоставляет их и исполняет сделки.
 */
public class TradingEngine {
	/**
	 * Обрабатывает заявку по её идентификатору.
	 * TODO: реализовать поиск заявки в стакане и исполнение.
	 *
	 * @param orderId уникальный идентификатор заявки
	 */
	public void processOrder(String orderId) {
		System.out.println("Processing order: " + orderId);
	}
}