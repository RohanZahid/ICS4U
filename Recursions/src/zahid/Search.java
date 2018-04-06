package zahid;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int []arr = {2, 5, 6, 8, 9, 12, 55};
		//double []arr = {2.1, 5.2, 6.3, 8.4, 9.1, 12.14, 55.12};
		String [] arr = {"Hello", "ZAA", "Cat", "ABC"};
		System.out.print(binarySearch(arr, "ABC"));
		//System.out.print(binarySearch(arr, 55.12));
	}
	/**
	 * Examines each element of the array in turn until the desired element is found.
	 * @param arr
	 * The integer array inputted by the user.
	 * @param key
	 * The integer value that needs to be located.
	 * @return i
	 * The position of the located value in the array.
	 **/
	public static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	/**
	 * Examines each element of the array in turn until the desired element is found.
	 * @param arr
	 * The double array inputted by the user.
	 * @param key
	 * The double value that needs to be located.
	 * @return i
	 * The position of the located value in the array.
	 **/
	public static int linearSearch(double[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	/**
	 * Examines each element of the array in turn until the desired element is found.
	 * @param arr
	 * The String array inputted by the user.
	 * @param key
	 * The String value that needs to be located.
	 * @return i
	 * The position of the located value in the array.
	 **/
	public static int linearSearch(String[] arr, String key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}
	/**
	 * Calls the binarySearch helper method to find the inputted value.
	 * @param arr
	 * The integer array inputted by the user.
	 * @param key
	 * The integer value that needs to be located.
	 * @return 
	 * The integer position of the located value in the array.
	 **/
	public static int binarySearch(int[] arr, int key) {
		return binarySearch(arr, key, 0, arr.length-1);
	}
	/**
	 * Calls the binarySearch helper method to find the inputted value.
	 * @param arr
	 * The double array inputted by the user.
	 * @param key
	 * The double value that needs to be located.
	 * @return 
	 * The integer position of the located value in the array.
	 **/
	public static int binarySearch(double[] arr, double key) {
		return binarySearch(arr, key, 0, arr.length-1);
	}
	/**
	 * Calls the binarySearch helper method to find the inputted value.
	 * @param arr
	 * The String array inputted by the user.
	 * @param key
	 * The String value that needs to be located.
	 * @return
	 * The integer position of the located value in the array.
	 **/
	public static int binarySearch(String[] arr, String key) {
		return binarySearch(arr, key, 0, arr.length-1);
	}

	/**
	 * Examines the middle element and moves left if the desired element is less than the middle, and right if the desired element is greater. Repeats until the desired element is found.
	 * @param arr
	 * The integer array inputted by the user.
	 * @param key
	 * The integer value that needs to be located.
	 * @param start
	 * The position of the first value in the search.
	 * @param end
	 * The position of the last value in the search.
	 * @return mid
	 * The position of the located value in the array.
	 * @return -1
	 * If the desired value does not exist in the array.
	 **/
	private static int binarySearch(int[] arr, int key, int start, int end) {
		int mid = (start+end)/2;
		if (arr[mid] == key) {
			return mid;
		}
		if (start>end) {
			return -1;
		}
		else if(key < arr[mid]) {
			return binarySearch(arr, key, start, mid-1);
		}
		else if((key > arr[mid])) {
			return binarySearch(arr, key, mid+1, end);
		}
		return -1;
	}
	/**
	 * Examines the middle element and moves left if the desired element is less than the middle, and right if the desired element is greater. Repeats until the desired element is found.
	 * @param arr
	 * The double array inputted by the user.
	 * @param key
	 * The double value that needs to be located.
	 * @param start
	 * The position of the first value in the search.
	 * @param end
	 * The position of the last value in the search.
	 * @return mid
	 * The position of the located value in the array.
	 * @return -1
	 * If the desired value does not exist in the array.
	 **/
	private static int binarySearch(double[] arr, double key, int start, int end) {
		int mid = (start+end)/2;
		if (arr[mid] == key) {
			return mid;
		}
		if (start>end) {
			return -1;
		}
		else if(key < arr[mid]) {	
			return binarySearch(arr, key, start, mid-1);
		}
		else if((key > arr[mid])) {
			return binarySearch(arr, key, mid+1, end);
		}
		return -1;
	}
	/**
	 * Examines the middle element and moves left if the desired element is less than the middle, and right if the desired element is greater. Repeats until the desired element is found.
	 * @param arr
	 * The String array inputted by the user.
	 * @param key
	 * The String value that needs to be located.
	 * @param start
	 * The position of the first value in the search.
	 * @param end
	 * The position of the last value in the search.
	 * @return mid
	 * The position of the located value in the array.
	 * @return -1
	 * If the desired value does not exist in the array.
	 **/
	private static int binarySearch(String[] arr, String key, int start, int end) {
		int mid = (start+end)/2;
		if (arr[mid].equals(key)) {
			return mid;
		}
		if (start>end) {
			return -1;
		}
		else if(arr[mid].compareTo(key)<0) {	
			return binarySearch(arr, key, start, mid-1);
		}
		else if(arr[mid].compareTo(key)>0) {
			return binarySearch(arr, key, mid+1, end);
		}
		return -1;
	}

}


