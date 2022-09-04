package Modul4;

import java.util.Scanner;

public class DriverBin1 {
	public static void main(String args[]) {
		Scanner input;
		BinnaryTree1 tree = new BinnaryTree1();

		int x, y;
		input = new Scanner(System.in);
		System.out.println("Masukkan jumlah data : ");
		x = input.nextInt();

		for (int i = 1; i <= x; i++) {
			ystem.out.print("Nilai data ke " + (i) + " : ");
			y = input.nextInt();
			tree.tambah(y);
		}
		System.out.println("");
		System.out.println("Pre Order :");
		tree.printPre();
		System.out.println("");
		System.out.println("In Order :");
		tree.printIn();
		System.out.println("");
		System.out.println("Post Order :");
		tree.printPost();
		System.out.println("");
		System.out.println("");
		System.out.println("Level dari pohon biner adalah");
		tree.level();
		int tot = tree.totalNode(tree.root);
		System.out.println("\nJumlah nodenya adalah : " + tot);
		int jd = tree.jumlahLeaf();
		System.out.println("\nJumlah Daun : " + jd);
		int t = tree.tinggi(tree.root);
		System.out.println("\nTinggi dari tree adalah : " + t);
		int sum = tree.total(tree.root);
		System.out.println("\nNilai total dari tree adalah : " + sum);

	}
}
