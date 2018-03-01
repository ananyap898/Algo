package com.ds.ch4;

/*Pick a pivot element V in random and use it to partition the elements into three sets (L;E;G) of
elements less than V , equal to V , and greater than V , respectively. Let the number of elements
in these sets be n1; n2; n3. Use the sizes of these sets to determine where the kth smallest element
falls, and make a recursive call accordingly. That is:
If k <= n1 
	then SELECT2 (L, n1, k);
else if k <= n1 + n2 
	then return (V );
else SELECT2 (G, n3, k - n1-n2).*/

public class KthSmallestRandomizedSelection2 {
	
	
	
	
	public static void main(String args[]) {
		KthSmallestRandomizedSelection2 ob = new KthSmallestRandomizedSelection2();
		int arr[] = { 12, 3, 5, 7, 4, 19, 26 };
		int n = arr.length;
		int k = 3;
		System.out.println("K'th smallest element is " + ob.kthSmallest(arr, 0, n-1 , k));
	}

	int kthSmallest(int arr[], int left, int right, int k) {
		// If k is smaller than number of elements in array
		if (k > 0 && k <= right - left + 1) {
			// Partition the array around a random element and
			// get position of pivot element in sorted array
			int partitionIndex = randomPartition(arr, left, right);

			// If position is same as k
			if (partitionIndex - left == k - 1)
				return arr[partitionIndex];
			else if (partitionIndex - left > k - 1)
				return kthSmallest(arr, left, partitionIndex - 1, k);

			// Else recur for right subarray
			else
				return kthSmallest(arr, partitionIndex + 1, right, k - partitionIndex + left - 1);
		}

		// If k is more than number of elements in array
		return -1;
	}

	// Utility method to swap arr[i] and arr[j]
	void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// Standard partition process of QuickSort(). It considers
	// the last element as pivot and moves all smaller element
	// to left of it and greater elements to right. This function
	// is used by randomPartition()
	int partition(int arr[], int l, int r) {
		int x = arr[r], i = l;
		for (int j = l; j <= r - 1; j++) {
			if (arr[j] <= x) {
				swap(arr, i, j);
				i++;
			}
		}
		swap(arr, i, r);
		return i;
	}

	// Picks a random pivot element between l and r and
	// partitions arr[l..r] arount the randomly picked
	// element using partition()
	int randomPartition(int arr[], int l, int r) {
		int n = r - l + 1;
		int pivot = (int) (Math.random()) % n;
		swap(arr, l + pivot, r);
		return partition(arr, l, r);
	}

}
