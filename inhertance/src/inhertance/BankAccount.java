package inhertance;

public class BankAccount {
	public static void main(String[] args) {
		intrests onec= new intrests("101","ravi","saving",5000); //creating obj calling sub class
		onec.displaydetails();
		System.out.println(onec.finalamount(10,3));
		
	}

}
