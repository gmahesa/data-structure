package modul3;
class OptimizedBubbleSort
{
	void bubbleSort(int arr[])
	{
		Boolean swap;
		for (int i = 0 ; i < arr.length-1 ; i++)
		{
			swap=false;
			for (int j = 0 ; j < arr.length-i-1 ; j++)
			{
				if (arr[j] > arr[j+1])
				{
					swap=true;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
			if(swap==false) {
				break;
			}
		}
		System.out.println("Optimized Bubble Sort : ");
		for (int i = 0 ; i < arr.length ; i++)
		{	
			System.out.print(" " + arr[i]);
		}
		System.out.println();
	}
}
