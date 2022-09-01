package inhertance;

//this is abstract method it should be extended.

public  abstract class costumer {
	String costumerid;
	String costumername;
	String costumertype;  //instance variable
	double amount;
	// constructor
	costumer(String id,String name, String type,double amt) 
	{
		this.costumerid=id;
		this.costumername=name;
		this.costumertype=type;
		this.amount=amt;
		
	}
	//method
	void displaydetails() 
	{
		System.out.println("id: " +this.costumerid);
		System.out.println("name: "+ this.costumername);
		System.out.println("amount "+ this.amount);
		
	}

}
