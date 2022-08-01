package co.edu.iudigital.exception;

public class BadRequestException extends RestException{


	/**
	 * 
	 */
	private static final long serialVersionUID = -8688170634485993658L;

	public BadRequestException() {
	        super();
	    }

	    public BadRequestException(ErrorDto errorDto) {
	        super(errorDto);
	    }

	    public BadRequestException(String msg) {
	        super(msg);
	    }


}
