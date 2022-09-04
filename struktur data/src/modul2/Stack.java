package modul2;

public class Stack {
	   int maxSize;
	   char[] stackArray;
	   int top;
	   
	   public Stack(int s) {
	      maxSize = s;
	      stackArray = new char[maxSize];
	      top = -1; 
	   } 
	   public void push(char j) {
	      stackArray[++top] = j;
	   } 
	   public char pop() {
	      return stackArray[top--];
	   } 
	   public boolean isEmpty() { 
	      return (top == -1);
	   } 
	}

