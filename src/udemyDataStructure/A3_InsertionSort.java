package udemyDataStructure;
//In-place

//O(n2)
//stable
//use gap of 1 to insert the element
//lot of shifting
//Imporvment avaiable - shell sort

public class A3_InsertionSort {
	public static void main(String[] args) {
		int[] intArray = { 9, 12, -98, 52, 98, 77, -100, 2, 1 };

		for (int firstIndex = 1; firstIndex < intArray.length; firstIndex++) {
			int newElement = intArray[firstIndex];
			int i;

			for (i = firstIndex; i > 0 && intArray[i - 1] > newElement; i--) {
				intArray[i] = intArray[i - 1];
			}
			intArray[i] = newElement;

			System.out.print("iteration " + firstIndex + " :");
			for (int j : intArray) {
				System.out.print(j + " ");
			}
			System.out.println();

		}

		for (int i : intArray) {
			System.out.print(i + " ");
		}
	}

}