package revday01;

public class FizzBuzz {

	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<=n;i++) {
			if(i%3==0) {
				if(i%5==0) {
				System.out.println("FizzBuzz");
				break;
				}
				System.out.println("Fizz");
			}
			else if(i%5==0) {
				System.out.println("Buzz");
			}
			else
			{
				System.out.println(i);
			}
		}

	}

}
