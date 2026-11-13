
public class NegativeDiameterException extends Exception {

	private String invalidField;
	private double invalidValue;
	
	public NegativeDiameterException(String invalidField, double invalidValue) {
		super();
		this.invalidField = invalidField;
		this.invalidValue = invalidValue;
	}
	public String getInvalidField() {
		return invalidField;
	}
	public void setInvalidField(String invalidField) {
		this.invalidField = invalidField;
	}
	public double getInvalidValue() {
		return invalidValue;
	}
	public void setInvalidValue(double invalidValue) {
		this.invalidValue = invalidValue;
	}
	
	@Override
	public String getMessage()
	{
		return "Diamenter Should be Non - Negative..!!";
	}
	
}
