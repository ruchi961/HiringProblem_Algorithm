import HiringProblem.*;
class mainClassHiringProblem{
	static int[] candidates;
	public static void main(String args[]){

		//java.util.random random candidate
		candidates = initiliazeCandidate.initiliazeCandidateRandom();
		hiringClass.findBestCandidate(candidates);

		System.out.println("------------------------------------------------------------------------------------------------------------------------------- ");

		//permute-sort random candidate
		candidates = initiliazeCandidate.initiliazeCandidatePermuteSort();
		hiringClass.findBestCandidate(candidates);

	}//main end
}
