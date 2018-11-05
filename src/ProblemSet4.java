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
import java.util.Objects;
import java.util.Scanner;
public class ProblemSet4 {
	
	public static void main(String[] args) {
		ProblemSet4 ps = new ProblemSet4();
		Scanner in1 = new Scanner(System.in);
		
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
		
		in1.nextLine();
		
		//ex 3
		System.out.println("Exercise 3");
		System.out.println("Enter string.");
		String string = in1.nextLine();
		ps.middleMan(string); 
		
		//ex 4
		System.out.println("Exercise 4");
		System.out.println("Enter string.");
		String stringToDouble = in1.nextLine();
		ps.doubleVision(stringToDouble); 
		
		//ex 5
		System.out.println("Exercise 5");
		System.out.println("Enter string.");
		String fullStr = in1.nextLine();
		System.out.println("Enter target.");
		String target = in1.nextLine();
		ps.centered(fullStr, target); 
		
		//ex 6
		System.out.println("Exercise 6");
		System.out.println("Enter double.");
		double number = in1.nextDouble();
		System.out.println("Enter either 'r', 'f', or 'c'.");
		String temp = in1.next();
		char operation = temp.charAt(0);
		ps.upOrDown(number, operation);
		
		//ex 7
		System.out.println("Exercise 7");
		System.out.println("Enter text.");
		in1.nextLine();
		String text = in1.nextLine();
		System.out.println("Enter letter to find.");
		String temp1 = in1.next();
		char ending = temp1.charAt(0);
		ps.countMe(text, ending);	
		
		in1.nextLine();
		
		//ex 8
		System.out.println("Exercise 8");
		System.out.println("Enter text.");
		String strOfNotsNIns = in1.nextLine();
		ps.isNotEqual(strOfNotsNIns);	
		
		//ex 9
		System.out.println("Exercise 9");
		System.out.println("Enter text.");
		String setOfTrips = in1.nextLine();
		ps.triplets(setOfTrips);
		
		//ex 10
		System.out.println("Exercise 10");
		System.out.println("Enter string.");
		String setOfStuff = in1.nextLine();
		System.out.println("Enter boolean.");
		boolean digits = in1.nextBoolean();
		ps.addMe(setOfStuff, digits);

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
			System.out.println(false);
			return false;
		}
		if (target.length() != 3) {
			System.out.println(false);
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
	public int upOrDown(double number, char operation) {
		int output = 0;
		switch (operation) {
		case 'f':
			output = (int)Math.floor(number);
			System.out.println(output);
			return output;
		case 'r':
			output = (int)Math.round(number);
			System.out.println(output);
			return output;
		case 'c':
			output = (int)Math.ceil(number);
			System.out.println(output);
			return output;
		default:
			output = -1;
			System.out.println(output);
			return output;
		}
	}
	public int countMe(String text, char end) {
		int count = 0;
		if (text == null) {
			System.out.println(-1);
			return -1;
		}
		for (int i = 0; i <= (text.length() - 1); i++) {
			//			if space			or end of string
			if (text.charAt(i) == ' ' || i == (text.length() - 1)) {
				if (Character.isLetter(text.charAt(i - 1)) || Character.isLetter(text.charAt(i))) {
					if (text.charAt(i - 1) == end || text.charAt(i) == end) {
						count++;
					}
				}
				else {
					System.out.println(-1);
					return -1;
				}
			}
		}
		System.out.println(count);
		return count;
	}
	public boolean isNotEqual(String str) {
		boolean isEqual = false;
		int countNot = 0;
		int countIs = 0;
		if (str == null) {
			System.out.println(false);
			return false;
		}
		for (int i = 0; i <= (str.length() - 2); i++) {
			if (i != (str.length() - 2)) {
				if (Objects.equals(str.substring(i, (i + 3)), "not")) {
					countNot++;
				}
			}
			if (Objects.equals(str.substring(i, (i + 2)), "is")) {
				countIs++;
			}
		}
		if (countNot == countIs) {
			isEqual = true;
		}
		System.out.println(isEqual);
		return isEqual;
	}
	public int triplets(String str) {
		String temp;
		int count = 0;
		if (str == null) {
			System.out.println(-1);
			return -1;
		}
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i)) == false || str.charAt(i) == ' ') {
				System.out.println(-1);
				return -1;
			}
		}
		for (int i = 0; i <= (str.length() - 3); i++) {
			temp = Character.toString(str.charAt(i)) + Character.toString(str.charAt(i)) + Character.toString(str.charAt(i));
			if (Objects.equals(temp, str.substring(i, (i + 3)))) {
				count++;
			}
		}
		System.out.println(count);
		return count;
	}
	public int addMe(String str, boolean digits) {
		boolean temp = false;
		int temp2;
		int sum = 0;
		if (str == null) {
			System.out.println(-1);
			return -1;
		}
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				System.out.println(-1);
				return -1;
			}
		}
		if (digits == true) {
			for (int i = 0; i < str.length(); i++) {
				if (Character.isDigit(str.charAt(i)) == true) {
					sum = sum + Character.getNumericValue(str.charAt(i));
				}
			}
		}
		else {
			for (int i = 0; i < str.length(); i++) {
				if (Character.isDigit(str.charAt(i)) == true) {
					temp = true;
					temp2 = i;
					i++;
					while (temp == true && (i < str.length())) {
						if (Character.isDigit(str.charAt(i)) == true) {
							temp = true;
							i++;
						}
						else {
							temp = false;
						}
					}
					sum = sum + Integer.valueOf(str.substring(temp2, i));
				}
			}
		}
		System.out.println(sum);
		return sum;
	}
}
