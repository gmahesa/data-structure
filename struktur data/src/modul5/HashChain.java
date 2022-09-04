package modul5;
import java.util.LinkedList;

public class HashChain {
	private DataItem[] hashArray; // array holds hash table
	private int arraySize;
	private DataItem nonItem; // for deleted items
	public HashChain(int size) {
		arraySize = size;
		hashArray = new DataItem[arraySize];
		nonItem = new DataItem( -1); // deleted item key is -1
	}
	public void displayTable() {
		System.out.print("Table: ");
		for(int j=0; j<arraySize; j++)
		{
			if(hashArray[j] != null)
				System.out.print(hashArray[j].getKey() + " ");
			else
				System.out .print("** ");
		}
		System.out.println("");
	}
	public int hashFunc(int key) {
		return key % arraySize; // hash function
	}
	public void insert(DataItem item) {
		int key = item.getKey(); // extract key
		int hashVal = hashFunc(key); // hash the ke y
		while(hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1) {
			++hashVal; // go to next cell
			hashVal %= arraySize; // wraparound if necessary
		}
		hashArray[hashVal] = item; // insert item
	}
	public DataItem delete(int key) {
		int hashVal = hashFunc(key); // hash the key
		while(hashArray[hashVal] != null) {
			if(hashArray[hashVal].getKey() == key) {
				DataItem temp = hashArray[hashVal]; // save
				hashArray[hashVal] = nonItem; // delete
				return temp; // return
			}
			++hashVal; // go to next cell
			hashVal %= arraySize; // wraparound if necessary
		}
		return null; // can't find item
	} // end delete()
	public DataItem find(int key) {
		int hashVal = hashFunc(key); // hash the key
		while(hashArray[hashVal] != null) {
			if(hashArray[hashVal].getKey() == key)
				return hashArray[hashVal]; // return item
			++hashVal; // go to next cell
			hashVal %= arraySize; // wrapa round if necessary
		}
		return null; // can't find item
	}
}
