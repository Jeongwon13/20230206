import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[] arr = new int[a];
		int c = 0;
		
		for(int i=0; i<a; i++) {
			arr[i] = sc.nextInt();
		}
		
		int b = sc.nextInt();
		
		for(int i=0; i<a; i++) {
			if(b==arr[i]) {
				c++;
			}
		}
		System.out.println(c);
	
	}
	

}
