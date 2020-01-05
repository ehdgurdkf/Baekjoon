import java.util.Scanner;

public class B11021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();

		for(int i = 1; i<c+1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.print("Case #"+i+": ");
			System.out.println(a+b);
		}
	}
}
