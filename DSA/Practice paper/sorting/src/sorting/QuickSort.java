package sorting;

public class QuickSort {
	
	public static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i=low-1;
		
		for(int j=low; j<high; j++) {
			if(arr[j]<pivot) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		i++;
		int temp=arr[i];
		arr[i]=arr[high];
		arr[high]=temp;
		
		return i;
	}
	
	public static void quickSort(int arr[], int low, int high) {
		if(low<high) {
			int pivind = partition(arr, low, high);
			
			quickSort(arr, low, pivind-1);
			quickSort(arr, pivind+1, high);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,3,7,4,6,8,9,1};
		int n= arr.length;
		
		quickSort(arr, 0, n-1     );
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}

	}

}
