package it.jac.mvc.session;

public class LoggedUser {

	private static ThreadLocal<LoggedUser> current = new ThreadLocal<>();

	private long idUser;
	private String username;

	public static void set(LoggedUser user) {
		current.set(user);
	}
	
	public static LoggedUser get() {
		return current.get();
	}
	
	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
