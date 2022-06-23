import java.util.Scanner;

public class ShiftySum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, k, sum = 0;
		n = sc.nextInt();
		k = sc.nextInt();
		for(int i = 0;i<=k;i++) {
			sum += n;
			n *= 10;
		}
		System.out.print(sum);
	}
}
