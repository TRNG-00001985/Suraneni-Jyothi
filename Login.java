package revday01;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Select the options");
		System.out.println("1.Login"+"\n"+"2.Register"+"\n"+"3.Exit");
		int i=sc.nextInt();
		switch(i) {
		case 1:System.out.println("Login successfully");
		break;
		case 2:System.out.println("Registered successfully");
		break;
		case 3:System.out.println("Exit");
		break;
		default:
			System.out.println("Invalid");
		}

	}

}
