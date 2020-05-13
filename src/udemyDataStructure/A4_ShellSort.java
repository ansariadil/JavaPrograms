package udemyDataStructure;

//variation of Insertion sort
//Unstable
//O(n2)
//Insertion sort use gap of 1 to insert the elements whereas shell sort use larger gap
//gap keep on reduce as it runs till it become 1 then have to use insertion sort
//Goal is to reduce amount of shifting reqired
//Bubble sort can be improvised this way
public class A4_ShellSort {
	public static void main(String[] args) {
		int[] intArray = { 9, 12, -98, 52, 98, 77, -100, 2, 1 };

		for (int gap = intArray.length / 2; gap > 0; gap /= 2) {

			for (int i = gap; i < intArray.length; i++) {
				int newElement = intArray[i];
				int j = i;

				while (j >= gap && intArray[j - gap] > newElement) {
					intArray[j] = intArray[j - gap];
					j -= gap;
				}
				intArray[j] = newElement;
			}
		}

		for (int i : intArray) {
			System.out.print(i + " ");
		}
	}

}