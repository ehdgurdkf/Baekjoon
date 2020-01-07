import java.util.Scanner;

public class B8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[80];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextByte();
			System.out.println(arr[i]);
		}
		
	}

}
