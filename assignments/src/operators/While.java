package operators;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		int yourAge;
		System.out.println("Age must be greater than 20 so Enter your age :");
		Scanner scanner=new Scanner(System.in);
		yourAge=scanner.nextInt();
		while(yourAge<=26) {
			System.out.println("Yours age is "+yourAge+ " .so you are eligible for anudeep foundation JFD course");
			yourAge++;
		}

	}

}
