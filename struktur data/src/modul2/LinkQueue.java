package modul2;

public class LinkQueue {
	private FirstLastList theList;
	public LinkQueue() {
		theList = new FirstLastList(); // make a 2 -ended list
	}
	public boolean isEmpty() {
		return theList.isEmpty(); // true if queue is empty
	}
	public void insert(long j) {
		theList.insertLast(j); // insert, rear of queue
	}
	public long remove() {
		return theList.deleteFirst(); // remove, front of queue
	}
	public void displayQueue() {
		System.out.print("Queue (front -- >rear): ");
		theList.displayList();
	}
}
