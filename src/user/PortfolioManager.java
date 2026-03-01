package user;

import java.util.HashMap;
import java.util.Map;

public class PortfolioManager {
	private final Map<String, Double> balances = new HashMap<>();

	// TODO: add methods to get/set balances
	public double getBalance(String currency) {
		return balances.getOrDefault(currency, 0.0);
	}
}