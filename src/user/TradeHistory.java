package user;

import java.util.ArrayList;
import java.util.List;

public class TradeHistory {
	private final List<String> trades = new ArrayList<>();

	// TODO: add trade record
	public void addTrade(String trade) {
		trades.add(trade);
	}
}