import java.util.Scanner;

public class B10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] b = new int[n];
		int min = 1000001;
		int max = -1000001;

		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		for(int j = 0; j<n; j++) {
			if(b[j]<min) {
				min = b[j];
			}
		}
		System.out.print(min+ " ");

		for(int j = 0; j<n; j++) {
			if(b[j]>max) {
				max = b[j];
			}
		}
		System.out.print(max);

	}
}
