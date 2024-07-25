package revday01;

public class hexatooct {

	public static void main(String[] args) {
		
		String h="11";
		int dec=Integer.parseInt(h,16);
		String oct=Integer.toOctalString(dec);
		System.out.println(oct);

	}

}
