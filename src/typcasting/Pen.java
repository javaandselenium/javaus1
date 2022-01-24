package typcasting;

public class Pen extends Paper{
	
	public void redPen() {
		System.out.println("redpen");
	}
	
	public void blackPen() {
		System.out.println("blackpen");
	}

	public static void main(String[] args) {
       Paper p=new Pen();
        Pen p1=(Pen)p;
        p1.blackPaper();
        p1.whitePaper();
        p1.redPen();
        p1.blackPaper();



	}

}
