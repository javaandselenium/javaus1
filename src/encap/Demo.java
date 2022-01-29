package encap;

import encapsulation.Test1;

public class Demo {

	public static void main(String[] args) {

		Test1 t=new Test1();
	       System.out.println(t.getBalance());
	       
	       System.out.println(t.getEmailAddress() +"old emailaddress");
	       t.setEmailAddress("xyz@gmail.com");
	       System.out.println(t.getEmailAddress() +"new emailaddress");
	       
	       System.out.println(t.getPassword() +"old password");
	       t.setPassword("qazsxedc");
	       System.out.println(t.getPassword()+"new password");

	}

}
