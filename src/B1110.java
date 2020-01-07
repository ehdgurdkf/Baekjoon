import java.util.Scanner;

public class B1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int Num = a;
		int sum;
		int cycle = 0;
		int N10;
		int N1;

		while (true) {
			cycle += 1;
			N10 = a / 10;
			N1 = a % 10;
			sum = N10 + N1;

			a = (N1 * 10) + (sum % 10);

			if (Num == a)
				break;
		}
		System.out.println(cycle);

	}

}
