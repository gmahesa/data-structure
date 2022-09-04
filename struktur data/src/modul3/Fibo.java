package modul3;
import java.util.Scanner;
public class Fibo {

	public void fibo (int[]A) {

		Scanner input = new Scanner(System.in);
		
		int i, j, F0, F1, Fibo, n, m, N, Flag;
		int FK, FK1, FK2, FK3,  s,  p, q, t;
		
		int[]FIBO = new int[8];
		
		//clear clr = new clear(); clr.clearConsole();
		
		n = 15;
		F0 = 1;
		F1 = 1;
		Fibo = 1;
		j = 1;
		
		while(Fibo <= n+1) {
			FIBO[j] = Fibo;
			Fibo = F0+F1;
			F0 = F1;
			F1 = Fibo;
			j++;
		}
		
		s = j-1;
		
		FK = FIBO[s];	
		FK1 = FIBO[s-1];	i =FK1;
		FK2 = FIBO[s-2];  	p = FK2;
		FK3 = FIBO[s-3];  	q = FK3;

		m = (n+1) - FK;

		System.out.println("Inputkan sebuah nilai : " );
		N=input.nextInt();
		
		if(N > A[i]) {
			i = i + m;
		}
			   
		Flag = 0;
		while( i != 0  &&  Flag == 0) {
			if(N == A[i]) {
				Flag = 1;
			}
			else if(N < A[i]) {
				if(q == 0) {
					i = 0;
				}
				else {
					i = i - q;
					t = p;
					p = q;
					q = t - q; 
				}
			}
			else
			{
				if(p == 1) {
					i = 0; }
				else {
					i = i + q;
					p = p - q;
					q = q - p;
				}
		    }
		}
		if(Flag == 1) {
		   	System.out.println("FOUND");
		}
		else {
		   	System.out.println("NOT FOUND" );	
		}
	}
}
