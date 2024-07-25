package revday01;

public class octtohexa {

	public static void main(String[] args) {
		String oc="012";
		int dec=Integer.parseInt(oc, 8);
		String hex=Integer.toHexString(dec);
		System.out.println(hex);
		

	}

}
