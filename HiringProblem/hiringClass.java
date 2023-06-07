package HiringProblem;

public class hiringClass{
	//method to find the best candidate from the given candidate array i.e, implementing the logic of the hiring problem.
	public static void findBestCandidate(int[] candidates){
		int i, bestCandidateLoc = 0, size = candidates.length,hire, hireCount = 1, noHireCount = 0;
		System.out.println("The candidate "+candidates[bestCandidateLoc]+" with position "+bestCandidateLoc+" is hired.");
		
		for(i=1;i<size;i++){

			if (candidates[i]>candidates[bestCandidateLoc]){
				System.out.println("The candidate "+candidates[bestCandidateLoc]+" with position "+bestCandidateLoc+" is removed.");
				bestCandidateLoc = i;
				//hire = i;
				hireCount++;
				System.out.println("The candidate "+candidates[bestCandidateLoc]+" with position "+bestCandidateLoc+" is hired.");


			}else{
				noHireCount++;
				System.out.println("No candidate is hired. Retaning the older best candidate.");
				System.out.println("Best Candidate: position - " + bestCandidateLoc + " candidate - " + candidates[bestCandidateLoc]);

			}//if-else end

		}//for i end

		System.out.println("The number of times an attempt to hire the best candidate was done i.e number of times swapping was done to find the best candidate are : "+hireCount+" times. ");
		System.out.println("The number of times best candidate swapping was not done was : "+noHireCount+" times. ");

	}//findBestCandidate end
}