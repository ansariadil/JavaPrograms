package udemyDataStructure;
//Bubble Sort - 

//Stable - order is maintained
//O(n2)
//Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
//Example:
//First Pass:
//( 5 1 4 2 8 ) �> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.
//( 1 5 4 2 8 ) �>  ( 1 4 5 2 8 ), Swap since 5 > 4
//( 1 4 5 2 8 ) �>  ( 1 4 2 5 8 ), Swap since 5 > 2
//( 1 4 2 5 8 ) �> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.
//
//Second Pass:
//( 1 4 2 5 8 ) �> ( 1 4 2 5 8 )
//( 1 4 2 5 8 ) �> ( 1 2 4 5 8 ), Swap since 4 > 2
//( 1 2 4 5 8 ) �> ( 1 2 4 5 8 )
//( 1 2 4 5 8 ) �>  ( 1 2 4 5 8 )
//Now, the array is already sorted, but our algorithm does not know if it is completed. The algorithm needs one whole pass without any swap to know it is sorted.
//
//Third Pass:
//( 1 2 4 5 8 ) �> ( 1 2 4 5 8 )
//( 1 2 4 5 8 ) �> ( 1 2 4 5 8 )
//( 1 2 4 5 8 ) �> ( 1 2 4 5 8 )
//( 1 2 4 5 8 ) �> ( 1 2 4 5 8 )

public class A1_BubbleSort {
	public static void main(String[] args) {
		int[] intArray = { 9, 12, -98, 52, 98, 77, -100, 2, 1 };

		for (int lastIndex = intArray.length - 1; lastIndex > 0; lastIndex--) {
			for (int i = 0; i < lastIndex; i++) {
				if (intArray[i] > intArray[i + 1])
					swap(intArray, i, i + 1);
			}
		}

		for (int i : intArray) {
			System.out.println(i + " ");
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

//Slightly Imporved
//for(int i = 0 ; i < a.length ; i++){
//	boolean swap = false;
//	for(int j = 0 ; j< a.length - i-1 ; j++){ if(a[j] > a[j+1]){
//			temp = a[j];
//			a[j] = a[j+1];
//			a[j+1]=temp;
//			swap=true;
//		}
//	}
//	if(!swap)
//		break;
//}
