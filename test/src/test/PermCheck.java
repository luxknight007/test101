package test;

import java.util.Arrays;

public class PermCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println(solution(new int[] {4, 1, 3, 2}));
	}
	
	public static int solution (int[] A) {
		Arrays.sort(A);
		int size = A.length;
		int perm = 0;
		if (A[size -1] == size) {
			perm = 1;
		}
		return perm;
	}
}
