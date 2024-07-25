package Revday03Exceptions;
class NamenotfoundException extends Exception{
	String mg;
	public NamenotfoundException(String mg) {
		this.mg=mg;
	}
}
class Login{
	
	public void login(int id) throws NamenotfoundException {
		
			if(id<=0) {
				throw new NamenotfoundException("Name not found");
			}
			else {
				System.out.println("Login successfully");
			}
		
			
	}
}
public class Program02 {

	public static void main(String[] args) throws NamenotfoundException {
		Login l=new Login();
		l.login(3);

	}

}
