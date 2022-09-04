package modul2;

public class queue {

	public static void main(String[] args) {
		TUGAS2 queue = new TUGAS2();

		queue.size(5);
		
		System.out.println("Empty? "); queue.isEmpty();
		
		queue.insert(2);
		queue.insert(3);
		queue.insert(4);
		queue.insert(5);
		queue.insert(6);
		
		queue.peekFront();
		
		queue.view();
		
		System.out.println("Full? "); queue.isFull();
		System.out.println("hapus yang pertama");
		
		queue.remove(); //hapus FirstIn
		
		queue.view();
		

	}

}
