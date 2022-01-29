package encapsulation;

public class Test0 {


private String name="John";
private double salary=89.00;
private String emailaddress="java@gmail.com";
private int accNumb=12345;

private int id=900;

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}
public String getEmailaddress() {
	return emailaddress;
}
public void setEmailaddress(String emailaddress) {
	this.emailaddress = emailaddress;
}
public String getName() {
	return name;
}
public int getAccNumb() {
	return accNumb;
}



}
