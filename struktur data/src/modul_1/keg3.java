package modul_1;

class SortedList {

	int nilai;
	SortedList next;

	public SortedList(int a) {
		nilai = a;
	}
}

class LinkList {
	SortedList first;

	public LinkList() {
		this.first = null;
	}

	public void insert(int a) {
		SortedList newSort = new SortedList(a);
		newSort.next = first;
		first = newSort;
	}

	public void display() {
		SortedList current = first;
		while (current != null) {
			System.out.println(current.nilai);
			current = current.next;
		}
	}
}

public class keg3 {

	public static void main(String[] args) {

		LinkList list = new LinkList();
		list.insert(10);
		list.insert(20);
		
		list.display();
	}
}