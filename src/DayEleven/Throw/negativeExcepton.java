package DayEleven.Throw;

public class negativeExcepton extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public negativeExcepton (String string) {
		super(string);
	}
	public negativeExcepton() {
		super("Percentage should not be negative ");
	}

}
