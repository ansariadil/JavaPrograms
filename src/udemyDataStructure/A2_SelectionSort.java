package udemyDataStructure;
//In-place algo

//O(n2)
//better then bubble sort:- does not require much seapping
//unstable sort

//Procedure
//Select largest element place it to largestIndex
//largestIndex--

public class A2_SelectionSort {
	public static void main(String[] args) {
		int[] intArray = { 9, 12, -98, 52, 98, 77, -100, 2, 1 };

		for (int lastIndex = intArray.length - 1; lastIndex > 0; lastIndex--) {
			int largest = 0;

			for (int i = 1; i <= lastIndex; i++) {
				if (intArray[i] > intArray[largest])
					largest = i;
			}

			swap(intArray, largest, lastIndex);
		}

		for (int i : intArray) {
			System.out.print(i + " ");
		}
	}

	public static void swap(int[] array, int a, int b) {
		if (a == b) {
			return;
		}

		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;

//		a = a + b;
//		b = a - b;
//		a = a - b;
//		
//		a=a*b;//a=200 (10*20)    
//		b=a/b;//b=10 (200/20)    
//		a=a/b;//a=20 (200/10)    
	}

}
