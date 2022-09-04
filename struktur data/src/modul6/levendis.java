package modul6;

public class levendis {
	private int Minimum (int a, int b, int c) {
		int mi;

		mi = a;
		if (b < mi) {
			mi = b;
		}
		if (c < mi) {
			mi = c;
		}
		return mi;

	}
	public int LD (String s, String t) {
		int d[][]; // matrix
		int n; // length of source
		int m; // length of target
		int i; // iterates through source
		int j; // iterates through target
		char s_i; // ith character of source
		char t_j; // jth character of target
		int cost; // cost

		// Step 1

		n = s.length ();
		m = t.length ();

		d = new int[n+1][m+1];

		// Step 2

		for (i = 0; i <= n; i++) {
			d[i][0] = i;
		}

		for (j = 0; j <= m; j++) {
			d[0][j] = j;
		}

		// Step 3

		for (i = 1; i <= n; i++) {

			s_i = s.charAt (i - 1);

			// Step 4

			for (j = 1; j <= m; j++) {

				t_j = t.charAt (j - 1);

				// Step 5

				if (s_i == t_j) {
					cost = 0;
				}
				else {
					cost = 1;
				}

				// Step 6

				d[i][j] = Minimum (d[i-1][j]+1, d[i][j-1]+1, d[i-1][j-1] + cost);
      
			}

		}

		// Step 7
		System.out.println("perubahan "+d[n][m]);
		return d[n][m];

	}

	public static void main(String[] args) {
		
		String target = "GALANG";
		String source = "GULIN";
		levendis ldis;
		ldis = new levendis();
		ldis.LD(source, target);

	}

}
