package day2;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=1;
		int nst=1;
		int value=1;
		while(row<=5)
		{int cst=1;
		while(cst<=nst)
		{System.out.print(value);
		cst++;
		}
		System.out.println("");
	    value++;
		row++;
		nst++;
		if(row==cst) {System.out.print("*");
		} } 
	}

	


