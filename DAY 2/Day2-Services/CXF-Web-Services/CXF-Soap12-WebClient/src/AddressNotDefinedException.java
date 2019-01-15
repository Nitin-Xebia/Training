



public class AddressNotDefinedException extends RuntimeException {
	
	 String error;
	 
	 public AddressNotDefinedException()
	 {
		 
	 }

	public AddressNotDefinedException(String message) {
		error = message;
	}
	
	@Override
	public String getMessage() {
		 
		return error;
	}

}
