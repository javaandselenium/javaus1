package encapsulation;

public class Deatils {

	public static void main(String[] args) {

		Test0 t=new Test0();
		System.out.println(t.getName());
		
		//System.out.println(t.getSalary() +"old salary");
         t.setSalary(99.00);
         System.out.println(t.getSalary()+"current salary");
		
         
         System.out.println(t.getAccNumb());
         
         System.out.println(t.getEmailaddress() +"old email");
         t.setEmailaddress("selenium@gamil.com");
         System.out.println(t.getEmailaddress() +"new email");
	
	
	}

}
