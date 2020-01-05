import java.util.Scanner;

public class B2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
			}
			for (int o=n-i; o<n; o++) {
                System.out.print("*");
			}
            System.out.println();
		}
	}
}
