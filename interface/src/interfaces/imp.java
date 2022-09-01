package interfaces;

interface its{
	void m1();  //by default public abstrat method
	void m2();
	void m3();
}
abstract class impclass implements its{
	public void m1() {
	System.out.println("hai");
	String path="x";
	}
}


public class imp extends impclass{
	public void m2() {
		System.out.println("hai2");
		}
	public void m3() {
		System.out.println("hai3");
		}

	public static void main(String[] args) {
	    imp obj = new imp();
	    obj.m1();
	    obj.m3();
		

	}

}
