import java.util.Scanner;

public class B2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int h,m;
		
		h = sc.nextInt();
		m = sc.nextInt();
		
		if(m<45) {
			if(h==0) {
				h = 23;
			}
			else {
				h = h-1;
			}
			m = 60-(45-m);
		}
		else {
			m -= 45;
		}
		
		System.out.println(h+" "+m);
	}
}
