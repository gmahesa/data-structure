package modul42;

import java.util.Scanner;

public class DriverBin1 {
	public static void main(String args[]) {
		Scanner input;
		BinnaryTree1 tree = new BinnaryTree1();
		
		tree.tambah(53);
		tree.tambah(13);
		tree.tambah(77);
		tree.tambah(1);
		tree.tambah(90);
		tree.tambah(23);
		tree.tambah(61);

		System.out.println("");
		System.out.println("Level dari tiap  node adalah");
		tree.level();
		
		int tot = tree.totalNode(tree.root);
		System.out.println("\nJumlah node : " + tot);
		
		int jd = tree.jumlahLeaf();
		System.out.println("\nJumlah leaf : " + jd);
		
		int t = tree.tinggi(tree.root);
		System.out.println("\nTinggi dari tree adalah : " + t);
		
		int sum = tree.total(tree.root);
		System.out.println("\nNilai total dari node adalah : " + sum);

	}
}
