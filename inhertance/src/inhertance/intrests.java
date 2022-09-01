package inhertance;

public class intrests extends costumer {
	
	String costumerid;
	String costumername;
	String costumertype;  //instance variable
	double amount;
	// constructor
	intrests (String id,String name, String type,double amt)
	{
		
	super(id,name,type,amt);
	
		this.costumerid=id;
		this.costumername=name;
		this.costumertype=type;
		this.amount=amt;
		
	}
	
	double finalamount(double intrest, int year) 
	{
		double simpleintrest= intrest*year*this.amount;
		double amount=this.amount+simpleintrest;
		return amount;
	
	}


}
