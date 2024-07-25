package revday01;

import java.util.Scanner;

public class SubArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {1,2,3,4,5};
		System.out.println("Enter the starting index:");
		int start=sc.nextInt();
		System.out.println("Enter the Ending index:");
		int end=sc.nextInt();
		for(int i=start;i<=end;i++) {
			System.out.println(a[i]);
		}
		

	}

}
