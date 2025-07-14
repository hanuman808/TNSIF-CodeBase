package DatThirteen;

public interface	 Bank {

	static final int MIN_BAL = 5000;
	static final int DAILY_LIMIT = 25000;
	
	void deposit (int amt) throws DepositLimitException;
	void Withdraw (int amt) throws InsufficientBalanceException;
}
