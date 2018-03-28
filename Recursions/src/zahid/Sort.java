package zahid;
import java.util.Scanner;
/**
 * Sort.java
 * Methods that use Selection Sort, Insertion Sort, Bubble Sort, Quick Sort, and Merge Sort.
 * March 22, 2018
 * @author RohanZahid
 */
public class Sort {

	/**
	 * The main method passes values to the methods in order to test them.
	 * @param args
	 * unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String[] arr = {"Hello", "ZAA", "Cat", "ABC"};;
		int []arr = {7, 24, 1, 8, 6, 3, 5, 4};
		//double []arr = {72.2, 21.9, 85.9, 46.8, 62.7, 62.6};
		//selectionSort(arr);
		//insertionSort(arr);
		//bubbleSort(arr);
		quickSort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	/**
	 * Selects the smallest value, switches it with the value in the first position. Finds the next smallest and switches it with the value in the second position. Repeats until all values are in their proper places.
	 * @param arr
	 * The integer array inputted by the user.
	 * @return
	 * void
	 **/
	public static void selectionSort(int[] arr) {
		int min = 0;
		for(int i = 0; i < arr.length; i++) {
			min = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[min])
					min = j;
			}
			swap(arr, i, min);
		}
	}
	/**
	 * Selects the smallest value, switches it with the value in the first position. Finds the next smallest and switches it with the value in the second position. Repeats until all values are in their proper places.
	 * @param arr
	 * The double array inputted by the user.
	 * @return
	 * void
	 **/
	public static void selectionSort(double[] arr) {
		int min = 0;
		for(int i = 0; i < arr.length; i++) {
			min = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[min])
					min = j;
			}
			swap(arr, i, min);
		}

	}
	/**
	 * Selects the smallest value, switches it with the value in the first position. Finds the next smallest and switches it with the value in the second position. Repeats until all values are in their proper places.
	 * @param arr
	 * The integer array inputted by the user.
	 * @return
	 * void
	 **/
	public static void selectionSort(String[] arr) {
		int min = 0;
		for(int i = 0; i < arr.length; i++) {
			min = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j].compareTo(arr[min])<0)
					min = j;
			}
			swap(arr, i, min);
		}
	}
	/**
	 * Considers the first value to be in a sorted sublist. Inserts the second item into the sorted sublist, shifting the first item as needed to make room to insert the new addition. Repeats until all values are in their proper places.
	 * @param arr
	 * The integer array inputted by the user.
	 * @return
	 * void
	 **/
	public static void insertionSort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			for(int j = i; j <arr.length; j++) {
				while(arr[j] < arr[j-1]) {
					swap(arr, j, j-1);
					if (j>1)
						j--;
				}
			}

		}
	}
	/**
	 * Considers the first value to be in a sorted sublist. Inserts the second item into the sorted sublist, shifting the first item as needed to make room to insert the new addition. Repeats until all values are in their proper places.
	 * @param arr
	 * The double array inputted by the user.
	 * @return
	 * void
	 **/
	public static void insertionSort(double[] arr) {
		for(int i = 1; i < arr.length; i++) {
			for(int j = i; j <arr.length; j++) {
				while(arr[j] < arr[j-1]) {
					swap(arr, j, j-1);
					if (j>1)
						j--;
				}
			}

		}
	}
	/**
	 * Considers the first value to be in a sorted sublist. Inserts the second item into the sorted sublist, shifting the first item as needed to make room to insert the new addition. Repeats until all values are in their proper places.
	 * @param arr
	 * The String array inputted by the user.
	 * @return
	 * void
	 **/
	public static void insertionSort(String[] arr) {
		for(int i = 1; i < arr.length; i++) {
			for(int j = i; j <arr.length; j++) {
				while(arr[j].compareTo(arr[j-1])<0) {
					swap(arr, j, j-1);
					if (j>1)
						j--;
				}
			}

		}
	}
	/**
	 * Compares the first two items and swaps the greater number to the higher position in the array. Compares the second item and the third item and swaps the greater number to the higher position in the array. Repeats until all values are in their proper places.
	 * @param arr
	 * The int array inputted by the user.
	 * @return
	 * void
	 **/
	public static void bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] < arr[j-1])
					swap(arr, j, j-1);
			}
		}
	}
	/**
	 * Compares the first two items and swaps the greater number to the higher position in the array. Compares the second item and the third item and swaps the greater number to the higher position in the array. Repeats until all values are in their proper places.
	 * @param arr
	 * The double array inputted by the user.
	 * @return
	 * void
	 **/
	public static void bubbleSort(double[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] < arr[j-1])
					swap(arr, j, j-1);
			}
		}
	}
	/**
	 * Compares the first two items and swaps the greater number to the higher position in the array. Compares the second item and the third item and swaps the greater number to the higher position in the array. Repeats until all values are in their proper places.
	 * @param arr
	 * The String array inputted by the user.
	 * @return
	 * void
	 **/
	public static void bubbleSort(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j].compareTo(arr[j-1]) < 0)
					swap(arr, j, j-1);
			}
		}
	}
	/**
	 * Calls the quickSort helper method to sort the values.
	 * @param arr
	 * The integer array inputted by the user.
	 * @return
	 * void
	 **/
	public static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length-1);

	}
	/**
	 * Calls the quickSort helper method to sort the values.
	 * @param arr
	 * The double array inputted by the user.
	 * @return
	 * void
	 **/
	public static void quickSort(double[] arr) {
		quickSort(arr, 0, arr.length-1);

	}
	/**
	 * Calls the quickSort helper method to sort the values.
	 * @param arr
	 * The String array inputted by the user.
	 * @return
	 * void
	 **/
	public static void quickSort(String[] arr) {
		quickSort(arr, 0, arr.length-1);

	}
	/**
	 * Obtains pivot value from partition method. Recursively calls quickSort to sort the left side. Recursively calls quickSort to sort the right side.
	 * @param arr
	 * The integer array inputted by the user.
	 * @param start
	 * From where the quickSort method should start sorting.
	 * @param end
	 * The last position included in the sort.
	 * @return
	 * void
	 **/
	private static void quickSort(int[] arr, int start, int end) {
		if (end-start+1 == 0) {
			return;
		}
		else {
			int pivot = partition(arr, start, end);
			quickSort(arr, start, pivot-1);
			quickSort(arr, pivot+1, end);
		}
	}
	/**
	 * Obtains pivot value from partition method. Recursively calls quickSort to sort the left side. Recursively calls quickSort to sort the right side.
	 * @param arr
	 * The double array inputted by the user.
	 * @param start
	 * From where the quickSort method should start sorting.
	 * @param end
	 * The last position included in the sort.
	 * @return
	 * void
	 **/
	private static void quickSort(double[] arr, int start, int end) {
		if (end-start+1 == 0) {
			return;
		}
		else {
			int pivot = partition(arr, start, end);
			quickSort(arr, start, pivot-1);
			quickSort(arr, pivot+1, end);
		}
	}
	/**
	 * Obtains pivot value from partition method. Recursively calls quickSort to sort the left side. Recursively calls quickSort to sort the right side.
	 * @param arr
	 * The String array inputted by the user.
	 * @param start
	 * From where the quickSort method should start sorting.
	 * @param end
	 * The last position included in the sort.
	 * @return
	 * void
	 **/
	private static void quickSort(String[] arr, int start, int end) {
		if (end-start+1 == 0) {
			return;
		}
		else {
			int pivot = partition(arr, start, end);
			quickSort(arr, start, pivot-1);
			quickSort(arr, pivot+1, end);
		}
	}
	/**
	 * Chooses a pivot point. Rearranges the array by placing values larger than the pivot on the right and the values smaller on the left.
	 * @param arr
	 * The integer array inputted by the user.
	 * @param start
	 * From where the partition method should start rearranging.
	 * @param end
	 * The last position included in the rearranging.
	 * @return i+1
	 * The pivot value.
	 **/
		private static int partition(int[] arr, int start, int end) {
			int i = start-1;
			for (int j = start; j < end; j++) {
				if (arr[j] < arr[end]) {
					i++;
					swap(arr, i, j);
				}
			}
			swap(arr, i+1, end);
			return i+1;

		}
		/**
		 * Chooses a pivot point. Rearranges the array by placing values larger than the pivot on the right and the values smaller on the left.
		 * @param arr
		 * The double array inputted by the user.
		 * @param start
		 * From where the partition method should start rearranging.
		 * @param end
		 * The last position included in the rearranging.
		 * @return i+1
		 * The pivot value.
		 **/
		private static int partition(double[] arr, int start, int end) {
			int i = start-1;
			for (int j = start; j < end; j++) {
				if (arr[j] < arr[end]) {
					i++;
					swap(arr, i, j);
				}
			}
			swap(arr, i+1, end);
			return i+1;

		}
		/**
		 * Chooses a pivot point. Rearranges the array by placing values larger than the pivot on the right and the values smaller on the left.
		 * @param arr
		 * The String array inputted by the user.
		 * @param start
		 * From where the partition method should start rearranging.
		 * @param end
		 * The last position included in the rearranging.
		 * @return i+1
		 * The pivot value.
		 **/
		private static int partition(String[] arr, int start, int end) {
			int i = start-1;
			for (int j = start; j < end; j++) {
				if (arr[j].compareTo(arr[end]) < 0) {
					i++;
					swap(arr, i, j);
				}
			}
			swap(arr, i + 1, end);
			return i+1;

		}
		/**
		 * Exchanges the values of two positions in an array.
		 * @param arr
		 * The integer array inputted by the user.
		 * @param index1
		 * The first position of the array.
		 * @param index2
		 * The second position of the array.
		 * @return
		 * void
		 **/
		public void mergeSort(int[]arr) {
			int mid = arr.length/2;
			merge(arr, 0, mid, arr.length-1);
		}
		private void merge(int[] arr, int start, int mid, int end) {
			for (int i = 1; i < mid; i++) {
				for (int j = 0; j < mid; j++) {
					if (arr[j] < arr[end]) {
						i++;
						swap(arr, i, j);
					}
					//merge(arr,)
				}
			}
		}
		private static void swap(int[] arr, int index1, int index2) {
			int temp = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = temp;
		}
		/**
		 * Exchanges the values of two positions in an array.
		 * @param arr
		 * The integer array inputted by the user.
		 * @param index1
		 * The first position of the array.
		 * @param index2
		 * The second position of the array.
		 * @return
		 * void
		 **/
		private static void swap(double[] arr, int index1, int index2) {
			double temp = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = temp;
		}
		/**
		 * Exchanges the values of two positions in an array.
		 * @param arr
		 * The integer array inputted by the user.
		 * @param index1
		 * The first position of the array.
		 * @param index2
		 * The second position of the array.
		 * @return
		 * void
		 **/
		private static void swap(String[] arr, int index1, int index2) {
			String temp = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = temp;
		}
	}