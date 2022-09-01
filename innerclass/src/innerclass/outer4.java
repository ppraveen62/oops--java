package innerclass;

interface Anonym {
		  void print();
		}

public class outer4 implements Anonym {
		  //  An anonymous class with OuterClass as base class 
		  //start of the anonymous class.
		    public void print() {
		      System.out.println("I am an implementation of interface Anonym");
		    }

	public static void main(String[] args) {
		outer4 obj= new outer4();
		obj.print();
		   
		  }
	
 }

