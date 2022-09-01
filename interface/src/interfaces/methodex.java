package interfaces;

interface it1{
	void m1();
	}
interface it2{
	void m1(); 
}

public class methodex implements it1,it2{
	public void m1() {
		System.out.println("hai");
	}
	public static void main(String[] args) {
		methodex obj=new methodex();
		obj.m1();
		
	}

}
