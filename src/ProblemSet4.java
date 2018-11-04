/**
 * INSTRUCTIONS.
 * 
 * Welcome to Problem Set 4, where we'll dive into writing our own methods with
 * parameters and return values. The focus, this time, will be on the built-in @String
 * and @Math classes.
 * 
 * You'll note that most of the methods have not been included. Instead, you'll see
 * specifications pertaining to their signatures (i.e., the method name, as well as
 * its return type and parameter list). You'll need to be sure to meet these
 * specifications exactly.
 * 
 * As always, please be mindful of your output (in this case, returned values rather
 * than printed text). Your solutions will be tested against a set of expected
 * values, and the grading script will expect an exact match.
 * 
 * This problem set contains 10 exercises worth 50 points. It is due no later than
 * 11:59pm on Sunday, November 4, 2018. Good luck! 
 */
import java.util.Scanner;
public class ProblemSet4 {
	
	public static void main(String[] args) {
		ProblemSet4 ps = new ProblemSet4();
		Scanner in1 = new Scanner(System.in);
		/*
		//ex 1
		System.out.println("Exercise 1");
		System.out.println("Enter value for 'out'.");
		String out = in1.nextLine();
		System.out.println("Enter value for 'in'.");
		String in = in1.nextLine();
		ps.surroundMe(out, in); 
		
		//ex 2
		System.out.println("Exercise 2");
		System.out.println("Enter string.");
		String str = in1.nextLine();
		System.out.println("Enter value for amount of letters.");
		int n = in1.nextInt();
		ps.endsMeet(str, n); 
		
		//ex 3
		System.out.println("Exercise 3");
		System.out.println("Enter string.");
		String str = in1.nextLine();
		ps.middleMan(str); 
		
		//ex 4
		System.out.println("Exercise 4");
		System.out.println("Enter string.");
		String str = in1.nextLine();
		ps.doubleVision(str); */
		
		//ex 5
		System.out.println("Exercise 5");
		System.out.println("Enter string.");
		String str = in1.nextLine();
		System.out.println("Enter target.");
		String target = in1.nextLine();
		ps.centered(str, target);		
		
		in1.close();
	}
	public String surroundMe(String out, String in) {
		String output;
		if (out == null || in == null) {
			System.out.println("Error! 'out' must have 4 characters and 'in' must have 3!");
			return null;
		}
		else {
			if (out.length() != 4 || in.length() != 3) {
				System.out.println("Error! 'out' must have 4 characters and 'in' must have 3!");
				return null;
			}
			else {
				String out1 = out.substring(0, 2);
				String out2 = out.substring(2, 4);
				output = out1 + in + out2;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
				System.out.println(output);
				return output;
			}
		}
	}
	public String endsMeet(String str, int n) {
		String output;
		if (str == null) {
			System.out.println("Error! Values cannot be null!");
			return null;
		}
		if (str.length() > 10) {
			System.out.println("Error! Must be less than 10 characters!");
			return null;
		}
		if ((n < 1) || (n > str.length())) {
			System.out.println("Error! Values must be between 1 and the length of the string.");
			return null;
		}
		else {
			String begin = str.substring(0, n);
			String end = str.substring((str.length() - n), str.length());
			output = begin + end;
			System.out.println(output);
			return output;
		}
	}
	public String middleMan(String str) {
		String output;
		if (str == null) {
			System.out.println("Error! Values cannot be null!");
			return null;
		}
		if (str.length() % 2 == 0) {
			System.out.println("String must have odd amount of characters.");
			return null;
		}
		else {
			int start = 0;
			int end = str.length();
			String temp = null;
			for (int i = 0; i < str.length(); i++) {
				temp = str.substring(start, end);
				if (temp.length() != 3) {
					start++;
					end--;
				}
			}
			output = temp;
			System.out.println(output);
			return output;
		}
	}
	public String doubleVision(String str) {
		String output = null;
		if (str == null) {
			System.out.println("Error! Values cannot be null!");
			return null;
		}
		else {
			int i = 0;
			while (i < str.length()) {
				if (output == null) {
					output = str.substring(i, (i + 1)) + str.substring(i, (i + 1));
				}
				else {
					output = output + str.substring(i, (i + 1)) + str.substring(i, (i + 1));
				}
				i++;
			}
			System.out.println(output);
			return output;
		}
	}
	public boolean centered(String str, String target) {
		int found = 0;
		boolean output;
		String before;
		String after;
		if (str == null || target == null) {
			System.out.println("Error! Values cannot be null!");
			return false;
		}
		if (target.length() != 3) {
			System.out.println("Target must be 3 characters.");
			return false;
		}
		else {
			int i = 0;
			while (i <= (str.length() - 3)) {
				if (target.equals(str.substring(i, (i + 3))) == true) {
					if (i < 2) {
						before = str.substring(0, 1);
					}
					else {
						before = str.substring(0, (i - 1));
					}
					after = str.substring((i + 4), str.length());
					if (((before.length() - after.length()) == 0) || ((before.length() - after.length()) == 1)) {
						found++;
					}
				}
				i++;
			}
			if (found != 0) {
				output = true;
				System.out.println(output);
				return true;
			}
			else {
				output = false;
				System.out.println(output);
				return false;
			}
		}
	}
}
