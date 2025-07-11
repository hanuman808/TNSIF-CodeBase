package DayEleven.Throw;

public class greatervalueException extends Exception{
	
	private static final long serialVersionUID = 1L;
	public greatervalueException(String string) {
		super(string);
	}public greatervalueException(){
		super("Percentage should not be more than 100 ");
	}

}
