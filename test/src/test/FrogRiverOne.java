package test;

public class FrogRiverOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(4, new int[] {1, 3, 1, 4, 2, 3, 5, 4}));
	}

	public static int solution (int X, int[] A) {
		int position = -1;
		for(int i = 0; i < A.length; i++) {
			if (X == A[i]) {
				position = i;
			}
		}
		return position;
	}
}
