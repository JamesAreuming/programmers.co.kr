package chapter02_제어문;

public class OperatorExam5 {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		
		System.out.println(b1 && b2);
		System.out.println(b1 && b3);
		
		System.out.println(b1 || b2);
		System.out.println(b1 || b3);
		System.out.println(b2 || b2);
		
		int score1 = 88;
		if(score1 <= 100 && score1 >= 70) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
		int score2 = 68;
		if(score2 <= 100 && score2 >= 70) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
		System.out.println(b1 ^ b3);
		System.out.println(b1 ^ b2);
		
		System.out.println(!b1);
	}

}
