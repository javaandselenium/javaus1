package abstarctions;

public class Demo extends Sample implements Tree{
	
	public void add() {
		System.out.println("adding");
	}

	@Override
	public void leaf() {

System.out.println("leaf from tree class");
		
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		d.add();
		d.sub();
		d.leaf();
	}

}
