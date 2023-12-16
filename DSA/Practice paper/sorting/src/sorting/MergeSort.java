package sorting;

import java.util.Arrays;

public class MergeSort {
	public static void conquer(int[] arr, int si, int mid, int ei) {
		
		int[] arr2 = new int[ei-si+1];
		int indx1 =  si;
		int indx2 = mid+1;
		int i=0;
		
		while(indx1<mid+1 && indx2<=ei) {
			if(arr[indx1]<arr[indx2]) {
				arr2[i++]=arr[indx1++];
			}else {
				arr2[i++] = arr[indx2++];
			}
		}
		
		while(indx1<mid+1) {
			arr2[i++]=arr[indx1++];
		}
		
		while(indx2<=ei) {
			arr2[i++] = arr[indx2++];
		}
		
		for(int j=0,k=si; j<arr2.length ; j++,k++) {
			arr[k]=arr2[j];
		}
	}
	public static void divide(int[] arr, int si, int ei) {
		
		if(si>=ei) return;
		int mid= si + (ei-si)/2;
		divide(arr, si, mid);
		divide(arr, mid+1, ei);
		
		conquer(arr, si, mid, ei);
		
	}
	public static void main(String[] args) {
		int[] arr = {2,5,3,7,4,6,8,9,1};
		int n= arr.length;
		
		divide(arr, 0, n-1     );
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
