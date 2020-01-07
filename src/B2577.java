import java.util.Scanner;

public class B2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,d;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		d = a*b*c;
		int[] arr = new int[10];

		do {
			arr[d%10] ++;
			d /= 10;
		}while(d != 0);
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
