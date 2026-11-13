
public class ExceptionLineTooLong extends Exception {
	private String invalidField;
	private String invalidString;
	public ExceptionLineTooLong(String invalidField, String invalidString) {
		super();
		this.invalidField = invalidField;
		this.invalidString = invalidString;
	}
	public String getInvalidField() {
		return invalidField;
	}
	public void setInvalidField(String invalidField) {
		this.invalidField = invalidField;
	}
	public String getInvalidString() {
		return invalidString;
	}
	public void setInvalidString(String invalidString) {
		this.invalidString = invalidString;
	}
	
	@Override
	public String getMessage()
	{
		//return String.format("%s = %s String is Too long",invalidField, invalidString);
		return "String is Too long";
	}

}
