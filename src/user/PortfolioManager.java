package user;

import java.util.HashMap;
import java.util.Map;

/**
 * Отвечает за управление портфелем пользователя:
 * хранение балансов в различных валютах и криптовалютах.
 */
public class PortfolioManager {
	/** Карта балансов: ключ – код валюты, значение – количество */
	private final Map<String, Double> balances = new HashMap<>();

	/**
	 * Возвращает текущий баланс по указанной валюте.
	 *
	 * @param currency код валюты (например, "USD", "BTC")
	 * @return баланс, если валюта есть в портфеле, иначе 0.0
	 */
	public double getBalance(String currency) {
		return balances.getOrDefault(currency, 0.0);
	}
}