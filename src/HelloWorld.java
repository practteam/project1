
public class HelloWorld {
	public static void main(String args[]) {
		HelloWorld a = new HelloWorld();
		boolean num = a.divisibleByThree(9);
		//boolean num = divisibleByThree(9);
		System.out.println("helo world");
		System.out.println("hiiiiiii ");
		System.out.println(num);
	}
	Boolean divisibleByThree(int num) {
		if(num % 3 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
}
