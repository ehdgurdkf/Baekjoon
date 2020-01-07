import java.util.Scanner;

public class B3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = 42;
		int[] arr = new int[10];
		int[] arr2 = new int[a];
		int count = 0;

		for(int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
			arr2[arr[i]%a]++;
		}

		for(int i = 0; i <arr2.length; i++) {
			if(arr2[i] != 0) count++;
		}
		System.out.println(count);
	}

}
