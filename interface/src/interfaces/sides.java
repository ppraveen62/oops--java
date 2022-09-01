package interfaces;

interface left{
	int x = 5;
}
interface right{
	int x = 8;
}
//when two interface having same variable

public class sides implements left,right{

	public static void main(String[] args) {
		System.out.println(left.x);
		System.out.println(right.x);
	

	}

}
