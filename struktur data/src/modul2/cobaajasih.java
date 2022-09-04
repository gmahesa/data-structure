package modul2;
import java.util.Scanner;
public class cobaajasih {

	public static void main(String[] args) {
		
		TUGAS2 queue = new TUGAS2();
		Scanner input = new Scanner(System.in);
		System.out.println("Size stack? "); int size = input.nextInt();
		
		queue.size(size);
		
		System.out.print("Empty? "); queue.isEmpty();
		
		System.out.println("Masukan nilainya mas bro bro");
		
		for(int i = 0 ; i < size ; i++) {
			int x = input.nextInt();
			queue.insert(x);
		}
		
		System.out.println("nilai pertama ");
		queue.peekFront();
		
		queue.view();
		
		System.out.print("Full? "); queue.isFull();
		System.out.println("hapus yang pertama");
		
		queue.remove();
		
		queue.view();

	}

}
