import java.util.Scanner;
  class AgeException extends Exception{
	String message;
	public AgeException(String message) {
		super();
		this.message=message;
	}
	
	public static void doAge(int...a) throws AgeException {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter Age");
		int age=scan.nextInt();
	//System.out.println("Enter age");
	if(age<18) {
		throw new AgeException("Invalid age Exception");
	}
	System.out.println("Valid");
	
}
 }
  
public class VotingPoll {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		try {
			AgeException.doAge();
		}
		catch(AgeException ex) {
			System.out.println(ex.message);
		}

	}

}
