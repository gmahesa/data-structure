package modul5;

public class Driver {
	public static void main(String[] args) {
		DataItem aDataItem;
		Link dataItem;
		int aKey, size, initSize, keysPerCell;

		size = 10;
		initSize = 5;
		keysPerCell = 0;
		HashTable theHashTable = new HashTable(size);
		HashChain chain = new HashChain(size);

		for (int j = 0; j < initSize; j++) {
			aKey = (int) (java.lang.Math.random() * keysPerCell * size);
			aDataItem = new DataItem(aKey);
			theHashTable.insert(aDataItem);
		}
		for (int i = 0; i < initSize; i++){
			aKey = (int) (java.lang.Math.random() * keysPerCell * size);
			dataItem = new Link(aKey);
			chain.insert(dataItem);
		}

		theHashTable.displayTable();
		aDataItem = new DataItem(10);
		theHashTable.insert(aDataItem);
		theHashTable.delete(10);
		aDataItem = theHashTable.find(10);
		if (aDataItem != null) {
			System.out.println("Found " + 10);
		} else
			System.out.println("Could not find " + 10);
		System.out.println(" ");

  
		chain.displayTable();
		aKey = 10;
		dataItem = new Link(aKey);
		chain.insert(dataItem);
		aKey = 10;
		chain.delete(aKey);

		aKey = 5;
		dataItem = chain.find(aKey);
		if (dataItem != null)
			System.out.println("Found " + aKey);
		else
			System.out.println("Could not find " + aKey);
	}
}