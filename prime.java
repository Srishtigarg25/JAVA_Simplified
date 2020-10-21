package Day1;
import java.util.*;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int p=n-1;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.println("composite");
				break;
			}
			else
			{
			if(n-1==i)	
				System.out.println("prime");
			    System.out.println(i);
			}
				
			}
			
		}

		
}