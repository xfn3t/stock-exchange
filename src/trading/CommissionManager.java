package trading;

/**
 * Управляет расчетом комиссий за совершенные сделки.
 * Комиссия может быть фиксированной или зависеть от объема.
 */
public class CommissionManager {
	/** Базовая ставка комиссии (по умолчанию 0.1%) */
	private double defaultRate = 0.001;

	/**
	 * Рассчитывает комиссию для указанной суммы.
	 *
	 * @param amount сумма сделки
	 * @return размер комиссии (произведение суммы на базовую ставку)
	 */
	public double calculateCommission(double amount) {
		return amount * defaultRate;
	}
}