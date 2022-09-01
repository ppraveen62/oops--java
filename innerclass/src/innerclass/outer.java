package innerclass;
//nested inner class

public class outer {

	String msg="Hey Folks.... Welcome to JAVA..!!!";
	
	class Inner{   //inner class
		
		void hello() {   //method
			System.out.println(msg+",Let's start leaning Inner Classes");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calling inner class obj
		outer.Inner in=new outer().new Inner();
		in.hello();
	}
}