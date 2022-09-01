package innerclass;

//Method Local inner classes

public class outer2 {

	private String msg="Inner Classes";
	
	//method inside class
	void display() {
		class Inner{
			void msg() {
				System.out.println(msg);
			}
		}
		Inner I=new Inner();
		I.msg();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer2 obj=new outer2();
		obj.display();
	}

}