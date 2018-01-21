package test;

import java.math.BigDecimal;

public class FrogJmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println(solution(10, 85, 30));
	}
	
	public static int solution (int X, int Y, int D) {
		double sum = (Y - X);
		double jump = sum / D;
		System.err.println(jump % 1);
		if (jump % 1 > 0) {
			jump = jump + 1;
		}
		
		return (int) jump;
	}
}
