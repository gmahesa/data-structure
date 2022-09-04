package modul6;
import java.util.*;
public class mainBubble {
	public static void main(String args[])
	{
		BubbleSort BS;
		int data;
		int proses=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Jumlah data : "); data=input.nextInt();
		int arr [] = new int[data];
		
		for (int i = 0 ; i < data ; i++) {
			System.out.println("data "+i+" = "); 
			arr[i]=input.nextInt();
			proses++;
		}
		
		System.out.print("data awal = ");
		
		for(int j = 0 ; j < arr.length ; j++) {
			System.out.print(arr[j]+" ");
			proses++;
		}
		BS = new BubbleSort();
		BS.bubbleSort(arr, proses);
		
	}
}
