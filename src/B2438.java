import java.util.Scanner;

public class B2438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		for(int i = 0; i<a; i++) {
			for(int q = 0; q<=i; q++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
