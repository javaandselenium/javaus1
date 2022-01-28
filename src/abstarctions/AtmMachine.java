package abstarctions;

public class AtmMachine  implements Test0{

	@Override
	public void atmCard() {
		System.out.println("insert the card");
		
	}

	@Override
	public void pinNumb() {

System.out.println("eneter the pin numb");
		
	}

	@Override
	public void amount() {
	System.out.println("collect the amount");
		
	}
	
	public static void main(String[] args) {
		AtmMachine a=new AtmMachine();
		a.atmCard();
		a.pinNumb();
		a.amount();
	}

}
