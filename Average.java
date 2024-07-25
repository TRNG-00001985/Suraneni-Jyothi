package revday01;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []a=new int [5];
		System.out.println("Enter the values:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Array elements are:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("Average:"+(sum/a.length));

	}

}
