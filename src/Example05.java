import java.util.Scanner;

public class Example05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Type your name : ");
		String name = s.nextLine();
		System.out.println("Welome, " + name + "!");
		
		System.out.println("Type your age : ");
		int age = s.nextInt();
		System.out.println("Your age : " + age);
	}
}