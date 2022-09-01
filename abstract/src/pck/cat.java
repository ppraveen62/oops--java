package pck;

public class cat extends Animal{
	
	public void makeNoise() {
		Animal.age=5;
		System.out.println("meoow");
	}

	@Override
	public void colour() {
		System.out.println("red");
		
	}

}
