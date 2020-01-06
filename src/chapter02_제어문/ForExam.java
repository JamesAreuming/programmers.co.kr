package chapter02_제어문;

public class ForExam {

	public static void main(String[] args) {
		int sum1 = 0;
		for(int i = 1 ; i <= 100 ; i++) {
			sum1 = sum1 + i;
		}
		System.out.println("1~100까지 총합 : "+sum1);
		
		int sum2 = 0;
		for(int i = 1 ; i <= 100 ; i++) {
			if(i % 2 != 0) {
				continue;
			}
			sum2 = sum2 + i;
		}
		System.out.println("1~100까지 짝수총합 : "+sum2);
		
		int sum3 = 0;
		for(int i = 1 ; i<=100 ; i++) {
			if(i == 51) {
				break;
			}
			sum3 = sum3 + i;
		}
		System.out.println("50까지의 합"+sum3);
		
		int sum4 = 0;
		for(int i = 1 ; i<=50 ; i++) {

			sum4 = sum4 + i;
		}
		System.out.println("50까지의 합"+sum4);
	}

}
