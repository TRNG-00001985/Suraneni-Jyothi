package revday01;

public class PrimeorComposite {

	public static void main(String[] args) {
		int n=3;
		if(n==1) {
			System.out.println("Composite number");
		}
		else
		{
			int c=0;
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					c++;
				}
			}
			if(c==2) {
				System.out.println("Prime number");
			}
			else
			{
				System.out.println("Not a prime number");
			}
		}

	}

}
