package revday01;

import java.util.Arrays;
import java.util.Collections;

public class Issorted {

	public static void main(String[] args) {
		int a[]= {1,2,8,4,5};
		//Arrays.sort(a);
		int c=0;
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					flag=true;
					continue;
				}
				
			}
		}
		if(!flag) {
			System.out.println("Not Sorted");
		}
		else {
			System.out.println("Sorted");
		}

	}

}
