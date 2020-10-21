package day2;

public class pattern {

	public static void main(String[] args) {
		int row = 1;
		int nst = 5;
		int i = 0;
		while (row <= 5) {
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			System.out.println("");
			for (i = 0; i < row; i++)
				System.out.print("  ");
			row++;
			nst = nst - 1;
		}
		int row1 =1;
		int nsp = 10;
		while (row1 <= 6) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			System.out.println();
			row1++;
			nst++;
			nsp = nsp - 2;

		}

	}

}
