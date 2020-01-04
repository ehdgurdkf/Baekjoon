import java.util.Scanner;

public class B2588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,temp;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		c = a*b;
		while (b>0) {
			temp = b%10;
			b = b/10;
			System.out.println(a*temp);
		}
		
		System.out.println(c);
	}

}
