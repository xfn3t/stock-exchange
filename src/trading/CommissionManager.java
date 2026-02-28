package trading;

public class CommissionManager {
	private double defaultRate = 0.001; // 0.1%

	// TODO: implement commission calculation
	public double calculateCommission(double amount) {
		return amount * defaultRate;
	}
}