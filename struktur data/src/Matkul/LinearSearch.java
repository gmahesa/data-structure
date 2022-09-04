package Matkul;

public class LinearSearch {
	static int search (int arr[],int n, int x) {
		int i;
		//code untuk mencari nilai x, jika ditemukan maka akan mengembalikan nilai i, 
		//jika tidak, mengembalikan nilai -1
		for(i=0 ; i<n ; i++) {
			if (arr[i]==x)
				return i;
		}
		return -1;
		}
	
}
