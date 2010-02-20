import java.util.Scanner;

public class Input {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Anna kokonaisluku: ");
		int i = input.nextInt();
		System.out.println("i: "+i);
	}
}
