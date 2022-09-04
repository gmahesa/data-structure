package modul2;

public class FirstLastList {
	private Link first; // ref to first item
	private Link last; // ref to last item
	public FirstLastList() {
		first = null; // no items on list yet
		last = null;
	}
	public boolean isEmpty() {
		return first==null; // true if no links
	}
	public void insertLast(long dd) { // insert at end of list
		Link newLink = new Link(dd); // make new link
		if( isEmpty() ) // if empty list
			first = newLink; // first -- > newLink
		else
			last.next = newLink; // old last -- > newLink
			last = newLink; // newLink < -- last
		}
	public long deleteFirst() {
		long temp = first.dData;
		if(first.next == null) // if only one item
			last = null; // null < -- last
			first = first.next; // first -- > old next
			return temp;
	}
	public void displayList() {
		Link current = first;
		while(current != null)
		{
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}

