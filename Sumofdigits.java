package revday01;

public class Sumofdigits {

	public static void main(String[] args) {
		int n=1234;
		int sum=0,r;
		for(int i=n;i!=0;i=i/10) {
			r=i%10;
			sum=sum+r;
		}
		System.out.println(sum);

	}

}
