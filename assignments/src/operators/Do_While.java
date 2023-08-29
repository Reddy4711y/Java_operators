package operators;

import java.util.Scanner;

public class Do_While {

	public static void main(String[] args) {
		int integer;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter integer to start :");
		integer=scanner.nextInt();
		do {
			System.out.println(integer);
			integer++;
		}while(integer<100);

	}

}
