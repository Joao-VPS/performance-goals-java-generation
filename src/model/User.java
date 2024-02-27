package model;

import util.Strings;

public abstract class User {
	private String username = null;
	private String password = null;
	
	public void createAccount(String username, String password) {
		if (username == null && password == null) {
			this.username = username;
			this.password = password;
			System.out.printf(Strings.USER_CREATED, username);
		} else {
			System.out.println(Strings.USER_ALREADY_CREATED);
		}
	}
	
	public void updateName(String password, String newUsername) {
		if (access(password)) {
			username = newUsername;
			System.out.println(Strings.USER_UPDATED_NAME);
		}
	}

	public void updatePassword(String oldPassword, String newPassword) {
		if (access(oldPassword)) {
			password = newPassword;
			System.out.println(Strings.USER_UPDATED_PASSWORD);
		}
	}

	public boolean access(String password) {
		if (password != this.password) System.out.println(Strings.USER_PASSWORD_ERROR);
		return password == this.password;
	}
}
