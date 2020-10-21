package Day1;

import java.util.Scanner;

public class fibo {

	public static int main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		int first = 0;
		int second = 1;
		int nth = 1;
		for (int i = 2; i <= n; i++) {
			nth = first + second;
			first = second;
			second = nth;
		}
		return nth;
	}

}
