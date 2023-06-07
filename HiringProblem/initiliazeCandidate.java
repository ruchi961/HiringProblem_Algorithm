package HiringProblem;

//importing the libraries
import java.util.Random;
import java.util.Scanner;

import sortingAlgorithms.bubbleSortClass;
import sortingAlgorithms.insertionSortClass;
	
public class initiliazeCandidate{
	//method to initiate Candidate array
	public static int[] initiliazeCandidateRandom(){
		int i,valRandom,j,size;
		boolean flag=true;
		System.out.println("Randomized Hire Candidate : ");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------- ");
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the total number of candidates : ");
		size = in.nextInt();
		int[] candidates = new int[size];
		
		Random random = new Random();
		for(i = 0 ; i < size ; i++){

			//while true to not repeat the random number of the candidate, i.e. candidates are distinct and random
			while(true){
				valRandom = random.nextInt(size+1);
				for(j=0;j<i;j++){
					if (valRandom == candidates[j]){
							flag = false;
					}//if end
				}//for j end
				//System.out.println(flag);
				if (flag){
					candidates[i]=valRandom;
					break;
				}//if flag end
				flag=true;
			}//while end

		}//for i end

		System.out.println("Candidates are: ");
		for(i = 0 ; i < size ; i++){
			System.out.print(candidates[i] + " ");
 
		}//for i end

		System.out.println("\nCandidates are arranged in random order.");		

		return candidates;
	}//initializeCandidateRandom end



	//method to initiate Candidate array
	public static int[] initiliazeCandidatePermuteSort(){
		int i,valRandom,j,size;
		boolean flag=true;

		System.out.println("Permute-Sort Hire Candidate : ");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------- ");

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the total number of candidates: ");
		size = in.nextInt();
		int[] candidates = new int[size];
		int[] candidatesProbabilities = new int[size];
		System.out.println("The Candidates are: ");
		Random random = new Random();
		for(i = 0 ; i < size ; i++){
			//findind non-repeating candidate probabilities
			while(true){
				valRandom = random.nextInt((int)Math.pow(size,3));
				for(j=0;j<i;j++){
					//System.out.println("ramn"+valRandom);
					if (valRandom == candidatesProbabilities[j]){
							flag = false;
					}//if end
				}//for j end
				//System.out.println(flag);
				if (flag){
					candidatesProbabilities[i]=valRandom;
					break;
				}//if flag end
				flag=true;
			}//while end

		}//for i end

		//initializing candidates in order 0,1,2,3 and using permutesort to arrange them in randomized order
		for(i = 0 ; i < size ; i++){
			candidates[i] = i;		


		}//for i end

		System.out.println("Probability list before permute-sort: ");
		for(i = 0 ; i < size ; i++){
			System.out.print(candidatesProbabilities[i] + " ");
 
		}//for i end

		System.out.println("");

		System.out.println("Candidates before permute-sort: ");
		for(i = 0 ; i < size ; i++){
			System.out.print(candidates[i] + " ");
 
		}//for i end

		
		
		//candidates = bubbleSortClass.bubbleSortProb(candidatesProbabilities,candidates);
		candidates = insertionSortClass.insertionSortProbability(candidatesProbabilities,candidates);
		
		System.out.println("Probability list after permute-sort: ");
		for(i = 0 ; i < size ; i++){
			System.out.print(candidatesProbabilities[i] + " ");
 
		}//for i end
		
		System.out.println("");
		
		System.out.println("Candidates after permute-sort: ");
		for(i = 0 ; i < size ; i++){
			System.out.print(candidates[i] + " ");
 
		}//for i end


		System.out.println("\nCandidates are arranged in random order.");		

		return candidates;
	}//initiliazeCandidatePermuteSort end
}