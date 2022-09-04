package modul6;

public class BubbleSort
{
	void bubbleSort(int arr[], int proses)
	{
		int sort=0;
		
		for (int i = 0 ; i < arr.length-1 ; i++)
		{
			++sort;
			for (int j = 1 ; j < arr.length ; j++)
			{
				++sort;
				if (arr[i] > arr[j])
				{
					++sort;
					int temp = arr[i];						++sort;
					arr[i] = arr[j]; 						++sort;
					arr[j] = temp; 						++sort;
				}
			}
		}
		System.out.println();
		System.out.print("data terurut = ");
		for (int i = 0 ; i < arr.length ; i++)
		{	
			proses++;
			System.out.print(arr[i] + " ");
			proses++;
		}
		System.out.println();
		System.out.println("jumlah proses sort "+sort);
		System.out.println("jumlah total proses "+(proses+sort));
	}
}
