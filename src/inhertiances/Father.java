package inhertiances;

public class Father  extends GrandFather{

	public void car() {
		System.out.println("carr from father");
	}
	
	public static void main(String[] args) {
		Father f=new Father();
		f.car();
		f.house();
	}
}
