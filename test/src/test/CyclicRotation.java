package test;

public class CyclicRotation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.err.println(solution(new int[] {3,8,9,7,6}, 3));
	}
	
	public static int[] cycle(int[] A) {
		
		return null;
	}
	public static int[] solution(int[] A, int K) {
		System.err.println(A);
		int size = A.length;
		int [] nArr = new int[size];
		
		int left = size - K;
		
		for(int i = 1; i < size; i++) {
			nArr[i] = (i<K) ? A[size+i-K] : A[i-K];
		}
		
		System.err.println(nArr.toString());
		
		return nArr;
	}
	
	public static int[] solution1(int[] A, int K) {
		
		int size = A.length;
		int [] nArr = new int[size];
			
		for(int i = 1; i < size; i++) {
			if (i <K ) {
				nArr[i] = A[size+i-K];
			} else {
				nArr[i] = A[i-K];
			}
		}
				
		return nArr;
	}

}
