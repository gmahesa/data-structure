package modul3;
public class SortAlgorithm {
	
	int temp;
	int selected;
	
	public void bubbleSort(int[]arr)
	{
		for (int i = 0 ; i < arr.length-1 ; i++)
		{
			for (int j = 0 ; j < arr.length-i-1 ; j++)
			{
				if (arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		Printarr(arr,"Bubble Sort");
	}
	public void InsertionSort(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=1; i<n; ++i) 
		{ 
			int key = arr[i]; 
			int j = i-1; 
			while (j>=0 && arr[j] > key) 
			{ 
				arr[j+1] = arr[j]; 
				j = j-1; 
			} 
			arr[j+1] = key; 
		} 
		Printarr(arr,"Insertion Sort");
	} 
	public void selectionSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {            
			selected = arr[i];            
			for (int j = i + 1; j < arr.length; j++) {                
				if (selected > arr[j]) {                    
					temp = arr[j];                    
					arr[j] = selected;                    
					selected = temp;                
				}            
			}            
			arr[i] = selected;        
		}
		Printarr(arr,"Selection Sort");
	}
	void Printarr (int []arr,String string) {
		System.out.println(string);
		for (int i = 0 ; i < arr.length ; i++) 
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println();
	}
}
