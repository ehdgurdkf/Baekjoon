import java.util.Scanner;

public class B2920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = 8;
		int[] arr = new int[n];
		int a_count = 0;
		int b_count = 0;
		int a_num = 1;
		int b_num = 8;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == a_num) {
				a_count ++;
				a_num ++;
			}

			else if(arr[i] == b_num) {
				b_count ++;
				b_num --;
			}
		}

		if(a_count == 8) System.out.println("ascending");
		else if(b_count == 7) System.out.println("descending");
		else System.out.println("mixed");
	}
}
