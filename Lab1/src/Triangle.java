import java.util.Collections;
import java.util.Scanner;
public class Triangle {	
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Nhap vao n: ");
		int n = keyboard.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println(String.join("", Collections.nCopies(((2*n + 1) - (2*i + 1)) / 2, " ")) + String.join("", Collections.nCopies(2*i + 1, "*")) + String.join("", Collections.nCopies(((2*n + 1) - (2*i + 1)) / 2, " ")));
		}
	}
}
