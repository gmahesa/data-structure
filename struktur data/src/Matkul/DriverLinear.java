package Matkul;

import java.util.Scanner;

public class DriverLinear {
	public static void main(String[]args) {
		int[]arr=new int[6]; //membuat array untuk diisi
		int cari;
		int high=arr.length;
		int simpan;
		Scanner input = new Scanner(System.in); //membuat objek scanner
		//looping untuk inputan sebanyak array
		for(int i = 0 ; i<6 ; i++) {
			System.out.println("elemen "+i+": "); arr[i]=input.nextInt();
		}
		//membuat objek linear search
		LinearSearch Search = new LinearSearch();
		//inputan nilai yang ingin dicari
		System.out.println("nilai yang ingin dicari : ");cari=input.nextInt();
		//"simpan", sebagai wadah dari hasil linear search
		simpan = Search.search(arr, high, cari);
		//mengecek hasil linear search
		if(simpan==-1)
			System.out.println("nilai tidak ditemukan, coba lagi suatu saat");
		else
			System.out.println("terdapat dalam index ke : " +simpan);
	}
}