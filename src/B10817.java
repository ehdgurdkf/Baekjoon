import java.util.Scanner;

public class B10817 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a>b) {
			if(b>c) {
				System.out.println(b);
			}
			else {
				if(c>a) {
					System.out.println(a);
				}
				else {
					System.out.println(c);
				}
			}	
		}
		else {
			if(a>c) {
				System.out.println(a);
			}
			else {
				if(c>b) {
					System.out.println(b);
				}
				else {
					System.out.println(c);
				}
			}
		}
	}

}
