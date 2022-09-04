package modul2;

public class StackX {
	private int maxSize; // size of stack array
	private long[] stackArray;
	private int top; // top of stack
	
	public StackX(int s) {
		maxSize = s; // set array size
		stackArray = new long[maxSize]; // create array
		top = -1; // no items yet
	}
	public void push(long j) {
		stackArray[++top] = j; // increment top, insert item
	}
	public long pop() {
		return stackArray[top -- ]; // access item, decrement top
	}
	public long peek() {
		return stackArray[top];	
	}
	public boolean isEmpty() {
		return (top == -1); // true if stack is empty
	}
	public boolean isFull() {
		return (top == maxSize -1); // true if stack is full
	}
}