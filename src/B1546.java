import java.util.Scanner;

public class B1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n;
		n = sc.nextInt();
		int[] arr = new int[n];
		double max = 0;
		double sum = 0;
		
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(sum/n*100/max);
		
		
	}

}
