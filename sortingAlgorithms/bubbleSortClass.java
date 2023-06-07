//bubblesort
package sortingAlgorithms;

public class bubbleSortClass{

	public static int[] bubbleSort(int[] array){
		System.out.println("\n---------------------------------------------------------------------------");
		System.out.println("Executing Bubble sort algorithm");
		int j, k , i, flag=0;
		for(j = 0 ; j < (array.length-1) ; j++){
			for(k = 0 ; k < (array.length-1) ; k++){
				if(array[k+1] < array[k]){
					array[k]   = array[k] + array[k+1];
					array[k+1] = array[k] - array[k+1];
					array[k]   = array[k] - array[k+1];
					flag = 1;
		
				} //if end

			} //for k end
			System.out.print("\nPass " + j +" : ");
			for(i= 0 ; i< array.length ; i++){
				System.out.print(array[i]+" ");
			}//print end
			System.out.println("");

			if (flag == 0){ //break list is storted
				break;
			}//if flag end
		}//for j end

		//System.out.println("The Best case Time Complexity is : n" );
		//System.out.println("The Worst case Time Complexity is : n^2");
		//System.out.println("The Average case Time Complexity is : n^2");

		return array;


		} //bubbleSort end

		public static int[] bubbleSortProb(int[] array, int[] returnArray){
			System.out.println("\n---------------------------------------------------------------------------");
			System.out.println("Executing Bubble sort algorithm");
			int j, k , i, flag=0;
			for(j = 0 ; j < (array.length-1) ; j++){
				for(k = 0 ; k < (array.length-1) ; k++){
					if(array[k+1] < array[k]){
						array[k]   = array[k] + array[k+1];
						array[k+1] = array[k] - array[k+1];
						array[k]   = array[k] - array[k+1];

						returnArray[k]   = returnArray[k] + returnArray[k+1];
						returnArray[k+1] = returnArray[k] - returnArray[k+1];
						returnArray[k]   = returnArray[k] - returnArray[k+1];

						flag = 1;
		
					} //if end

				} //for k end
				System.out.print("\nPass " + j +" : ");
				for(i= 0 ; i< array.length ; i++){
					System.out.print(array[i]+" ");
				}//print end
				System.out.println("");

				if (flag == 0){ //break list is storted
					break;
				}
			}//for j end

			//System.out.println("The Best case Time Complexity is : n" );
			//System.out.println("The Worst case Time Complexity is : n^2");
			//System.out.println("The Average case Time Complexity is : n^2");

			return returnArray;


		} //bubbleSort end


}
