import java.util.Scanner;

public class B2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = 9;
		int[] arr = new int[n];
		int count = 0;
		
		int max = 0;
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			if(arr[i]>max) {
				max = arr[i];
				count = i+1;
			}
		}
		System.out.println(max);
		System.out.println(count);
	}

}
