package revday01;

public class ContainsDuplicates {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int c=0;
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					c++;
				}
			}
		}
		if(c>0) {
			System.out.println("ContainsDuplicates:true");
		}
		else {
			System.out.println("ContainsDuplicates:false");
		}

	}

}
