package abstarctions;

public class Paper implements Pen,Book{

	@Override
	public void book() {

System.out.println("book");
		
	}

	@Override
	public void pens() {

System.out.println("pens");
	}
	
	public static void main(String[] args) {
		Paper p=new Paper();
		p.book();
		p.pens();
	}

}
