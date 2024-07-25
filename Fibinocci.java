package revday01;

public class Fibinocci {

	public static void main(String[] args) {
		int n=10,a=0,b=1,c;
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<n;i++) {
			c=a+b;
			System.out.println(c);
			
			a=b;b=c;
			
		}
		

	}

}
