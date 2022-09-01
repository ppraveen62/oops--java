package polymorphism;

public class checkpolymorphism {

	public static void main(String[] args) {
		
		housetype ha; // one interface manyforms.
		
		ha = new villas();
		System.out.println("house type: "+ha.getprice()+" price: ");
		System.out.println("banks providing loan: "+ha.getbanks());
		
		ha = new duplex();
		System.out.println("house type: "+ha.getprice() +" price: ");
		System.out.println("banks providing loan: "+ha.getbanks());
		
		ha = new apartments();
		System.out.println("house type: "+ha.getprice()+ " price: ");
		System.out.println("banks providing loan: "+ha.getbanks());
	}

}
