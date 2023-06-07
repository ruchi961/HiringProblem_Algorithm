//insertionsort
package sortingAlgorithms;

public class insertionSortClass{

	public static int[] insertionSort(int[] array){
		System.out.println("\n-----------------------------------------------------------------------------------------------------");
		System.out.println("Executing Insertion sort algorithm");
		int j , k , i, tempNo;
		for(j = 1 ; j < array.length ; j++){ //executes n times
			tempNo = array[j];
			if (array[j-1] < tempNo){
				continue;

			}//for best case scenario , end if
			else{
				for(k = (j-1) ; k >=0; k--){ //executes n (n +(n-j)) times (n^2) bigger factor
					if(array[k] < tempNo){
						array[k+1] = tempNo;
						break;		
					} //if end
					else{
						array[k+1] = array[k];
						array[k] =tempNo;
					} //else end
				} //for k end

			}//end else

			System.out.print("\nPass " + j +" : ");
			for(i= 0 ; i< array.length ; i++){
				System.out.print(array[i]+" ");
			}//print end
			System.out.println("");
		}//for j end
		//System.out.println("The Best case Time Complexity is : n" );
		//System.out.println("The Worst case Time Complexity is : n^2");
		//System.out.println("The Average case Time Complexity is : n^2");
		return array;

	} //insertionSort end

	public static int[] insertionSortProbability(int[] array, int[] returnArray){
		System.out.println("\n-----------------------------------------------------------------------------------------------------");
		System.out.println("Executing Insertion sort algorithm");
		int j , k , i, tempNo, tempNo2;
		boolean flag=true;
		for(j = 1 ; j < array.length ; j++){ //executes n times
			tempNo = array[j];
			tempNo2=returnArray[j];
			if (array[j-1] < tempNo){
				

			}//for best case scenario , end if
			else{
				flag=false;//not best case
				for(k = (j-1) ; k >=0; k--){ //executes n (n +(n-j)) times (n^2) bigger factor
					if(array[k] < tempNo){
						array[k+1] = tempNo;
						returnArray[k+1] = tempNo2;
						break;		
					} //if end
					else{
						array[k+1] = array[k];
						array[k] =tempNo;
						returnArray[k+1] = returnArray[k];
						returnArray[k] =tempNo2;

						
					} //else end
				} //for k end

			}//end else

			System.out.print("\nPass " + j +" : ");
			for(i= 0 ; i< array.length ; i++){
				System.out.print(array[i]+" ");
			}//print end
			System.out.println("");
		}//for j end
		//System.out.println("The Best case Time Complexity is : n" );
		//System.out.println("The Worst case Time Complexity is : n^2");
		//System.out.println("The Average case Time Complexity is : n^2");
		if (flag){
			System.out.print("\nBest Case found ");
			for(i= 0 ; i< array.length ; i++){
				System.out.print(array[i]+" ");
			}//print end
			System.out.println("");
		}//if flag end
		return returnArray;

	} //insertionSort end


}