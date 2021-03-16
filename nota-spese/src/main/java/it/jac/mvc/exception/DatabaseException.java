package it.jac.mvc.exception;

public class DatabaseException extends RuntimeException {

	public DatabaseException(String message, Throwable th) {
		super(message, th);
	}
}
