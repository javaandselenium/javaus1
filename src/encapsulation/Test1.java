package encapsulation;

public class Test1 {
	
	private String emailAddress="abc@gmail.com";
	private String password="qwerty";
	private double balance=1234.90;
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getBalance() {
		return balance;
	}

}
