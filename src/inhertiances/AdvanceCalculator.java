package inhertiances;

public class AdvanceCalculator extends BasicCalculator{
	public void costeta() {
		System.out.println("costeta");
	}
	
	public void sinteta() {
		System.out.println("sinteta");
	}
	
	public void tanteta() {
		System.out.println("tanteta");
	}
public static void main(String[] args) {
	AdvanceCalculator ad=new AdvanceCalculator();
	ad.costeta();
	ad.sinteta();
	ad.tanteta();
	ad.add(10,30);
	ad.sub(50,20);
	ad.mul(10,30);
	
}
}
