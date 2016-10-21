import java.util.Scanner;


public class Tester {

	public static void main(String[] args) {
		
		Scanner stringTaker=new Scanner(System.in);
		String sp[];
		boolean asking=true;
		while (asking)
		{
			System.out.println("Please enter sentence and press enter.");
			String input1=(stringTaker.nextLine().toUpperCase()+"time");
			if (input1.equals("EXITtime"))
					{
					break;
					}
			else{
			sp=input1.split("\\s*S\\s*A\\s*");
			System.out.println("Number of occurrences is "+(sp.length-1)+".");
			}
		}
	}
}
