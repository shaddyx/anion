package ua.org.shaddy.anion.streamtools.bitinputstream;

public class BitStreamException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BitStreamException() {
	}

	public BitStreamException(String message) {
		super(message);
	}

	public BitStreamException(Throwable cause) {
		super(cause);
	}

	public BitStreamException(String message, Throwable cause) {
		super(message, cause);
	}

	public BitStreamException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
