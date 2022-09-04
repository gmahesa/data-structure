package modul5;

import java.io.IOException;

public class drivermain {

	public static void main(String[] args) throws IOException {
	    DataItem aDataItem;
	    int aKey, size, initSize;

	    size = 15;
	    initSize = 14;
	 
	    HashTable Hash = new HashTable(size);

	    for (int j = 0; j < initSize; j++){
	      aKey = (int) (java.lang.Math.random() *  size);
	      aDataItem = new DataItem(aKey);
	      Hash.insert(aDataItem);
	    }

	    aDataItem = new DataItem(666);
	    Hash.insert(aDataItem);
	    Hash.displayTable();
	    //Hash.delete(100);
	    aDataItem = Hash.find(666);
	    if (aDataItem != null) {
	      System.out.println("Found " + 666);
	    } else
	      System.out.println("Could not find " + 666);
	 }
}


