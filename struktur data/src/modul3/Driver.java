package modul3;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = { 9,9,6,3,2,5,4,5,5,4,2,2,2,2,0,5 };
		
		SortAlgorithm sort = new SortAlgorithm();
		
		sort.bubbleSort(A);
		sort.InsertionSort(A);
		sort.selectionSort(A);
		
		OptimizedBubbleSort OpBub = new OptimizedBubbleSort();
		OpBub.bubbleSort(A);
		
		//clear clr = new clear(); clr.clearConsole();
		
		Fibo fib = new Fibo();
		fib.fibo(A);
	}
}
