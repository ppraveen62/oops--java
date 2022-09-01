package innerclass;


//static nested inner class

public class outer3 {
	    private static void outerMethod()
	    {
	        System.out.println("inside outerMethod");
	    }
	 

	    // Static inner class
	    static class Inner {
	 
	        public static void display()
	        {
	            System.out.println("inside inner class Method");
	 
	            // Calling method inside main() method
	            outerMethod();
	        }
	    }
	    
	    
    public static void main(String args[]){
    	
	        Inner.display();//calling method which is in static inner class.
	    }
	    
}
