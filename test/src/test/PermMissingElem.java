package test;

import java.util.stream.IntStream;

public class PermMissingElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println(solution(new int[] {5, 2, 3, 4}));
	}
	
	public static int solution(int[] A) {
		
		int arrSize = A.length + 1;
		int sum = IntStream.of(A).sum();
		int sum2 = 0;
		int halfValue = (arrSize/2);
		int multiplier = halfValue + 1;
		
		if (((double)arrSize/2) % 2 > 0) {
			sum2 = arrSize * multiplier;
		} else {
			sum2 = (arrSize * multiplier) - halfValue;
		}
		
		System.err.println("sum" + sum);
		System.err.println("sum2" + sum2);
		int missing = sum2 - sum;
		
		return missing;
	}

}
