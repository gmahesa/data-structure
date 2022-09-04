// package Modul5;
//
//import java.io.IOException;
//
//public class HashTable {
// private DataItem[] hashArray;
//
// private int arraySize;
//
// private DataItem bufItem; // for deleted items
//
// public HashTable(int size) {
//  arraySize = size;
//  hashArray = new DataItem[arraySize];
//  bufItem = new DataItem(-1); // deleted item key is -1
// }
//
// public void displayTable() {
//  System.out.print("Table: ");
//  for (int j = 0; j < arraySize; j++) {
//   if (hashArray[j] != null)
//    System.out.print(hashArray[j].getKey() + " ");
//   else
//    System.out.print("* ");
//  }
//  System.out.println(" ");
// }
//
// public int hashFunction(int key) {
//  return key % arraySize;
// }
//
// public void insert(DataItem item) {
//  int key = item.getKey();
//  int hashVal = hashFunction(key); // hash the key
//  // until empty cell or -1,
//  while (hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1) {
//   ++hashVal; // go to next cell
//   hashVal %= arraySize; // wraparound if necessary
//  }
//  hashArray[hashVal] = item; // insert item
// }
//
// public DataItem delete(int key) {
//  int hashVal = hashFunction(key);
//
//  while (hashArray[hashVal] != null) // until empty cell,
//  {
//   if (hashArray[hashVal].getKey() == key) {
//    DataItem temp = hashArray[hashVal]; // save item
//    hashArray[hashVal] = bufItem; // delete item
//    return temp;
//   }
//   ++hashVal; // go to next cell
//   hashVal %= arraySize; // wraparound if necessary
//  }
//  return null; // can't find item
// }
//
// public DataItem find(int key) // find item with key
// {
//  int hashVal = hashFunction(key); // hash the key
//
//  while (hashArray[hashVal] != null) // until empty cell,
//  {
//   if (hashArray[hashVal].getKey() == key)
//    return hashArray[hashVal]; // found, return item
//   ++hashVal; // go to next cell
//   hashVal %= arraySize; // wraparound if necessary
//  }
//  return null; // can't find item
// }
//
//}
//[28/11 12:53] .: package Modul5;
//
//import java.io.IOException;
//
//class Link {
// private int data;
// public Link next;
//
// public Link(int d) {
//  data = d;
// }
//
// public int getKey() {
//  return data;
// }
//
// public void displayLink() {
//  System.out.print(data + " ");
// }
//}
//
//class SortedList {
// private Link first;
//
// public SortedList() {
//  first = null;
// }
//
// public void insert(Link theLink) {
//  int key = theLink.getKey();
//  Link previous = null; // start at first
//  Link current = first;
//  // until end of list,
//  // or current bigger than key,
//  while (current != null && key > current.getKey()) {
//   previous = current;
//   current = current.next; // go to next item
//  }
//  if (previous == null) // if beginning of list,
//   first = theLink;
//  else
//   // not at beginning,
//   previous.next = theLink;
//  theLink.next = current;
// }
//
// public void delete(int key) {
//  Link previous = null;
//  Link current = first;
//
//  while (current != null && key != current.getKey()) {
//   previous = current;
//   current = current.next;
//  }
//  // disconnect link
//  if (previous == null) // if beginning of list delete first link
//   first = first.next;
//  else
//   // not at beginning
//   previous.next = current.next; // delete current link
// }
//
// public Link find(int key) {
//  Link current = first;
//  while (current != null && current.getKey() <= key) { // or key too small,
//   if (current.getKey() == key) // found, return link
//    return current;
//   current = current.next; // go to next item
//  }
//  return null; // cannot find it
// }
//
// public void displayList() {
//  System.out.print("List: ");
//  Link current = first;
//  while (current != null) {
//   current.displayLink();
//   current = current.next;
//  }
//  System.out.println("");
// }
//}
//
//public class HashChain {
// private SortedList[] hashArray;
//
// private int arraySize;
//
// public HashChain(int size) {
//  arraySize = size;
//  hashArray = new SortedList[arraySize];
//  for (int i = 0; i < arraySize; i++)
//   hashArray[i] = new SortedList();
// }
//
// public void displayTable() {
//  for (int j = 0; j < arraySize; j++) {
//   System.out.print(j + ". ");
//   hashArray[j].displayList();
//  }
// }
//
// public int hashFunc(int key) {
//  return key % arraySize;
// }
//
// public void insert(Link theLink) {
//  int key = theLink.getKey();
//  int hashVal = hashFunc(key);
//  hashArray[hashVal].insert(theLink);
// }
//
// public void delete(int key) {
//  int hashVal = hashFunc(key); // hash the key
//  hashArray[hashVal].delete(key);
// }
//
// public Link find(int key) {
//  int hashVal = hashFunc(key); // hash the key
//  Link theLink = hashArray[hashVal].find(key); // get link
//  return theLink;
// }
//
//}
//[28/11 12:53] .: package Modul5;
//
//public class DataItem {
// private int data;
//
// public DataItem(int d) {
//  data = d;
// }
//
// public int getKey() {
//  return data;
// }
//}
//[28/11 12:53] .: package Modul5;
//
//public class Driver {
// public static void main(String[] args) {
//  DataItem aDataItem;
//  Link dataItem;
//  int aKey, size, initSize, keysPerCell;
//
//  size = 10;
//  initSize = 5;
//  keysPerCell = 0;
//  HashTable theHashTable = new HashTable(size);
//  HashChain chain = new HashChain(size);
//
//  for (int j = 0; j < initSize; j++) {
//   aKey = (int) (java.lang.Math.random() * keysPerCell * size);
//   aDataItem = new DataItem(aKey);
//   theHashTable.insert(aDataItem);
//  }
//  for (int i = 0; i < initSize; i++){
//        aKey = (int) (java.lang.Math.random() * keysPerCell * size);
//        dataItem = new Link(aKey);
//       chain.insert(dataItem);
//      }
//
//  theHashTable.displayTable();
//  aDataItem = new DataItem(10);
//  theHashTable.insert(aDataItem);
//  theHashTable.delete(10);
//  aDataItem = theHashTable.find(10);
//  if (aDataItem != null) {
//   System.out.println("Found " + 10);
//  } else
//   System.out.println("Could not find " + 10);
//  System.out.println(" ");
//
//  
//  chain.displayTable();
//     aKey = 10;
//     dataItem = new Link(aKey);
//     chain.insert(dataItem);
//     aKey = 10;
//    chain.delete(aKey);
//
//  aKey = 5;
//     dataItem = chain.find(aKey);
//     if (dataItem != null)
//       System.out.println("Found " + aKey);
//     else
//       System.out.println("Could not find " + aKey);
// }
//}