package chapter02_제어문;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		
		int value = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			//반복할 문장들
			System.out.print("값을 입력하세요 >>> ");
			value = sc.nextInt();
			System.out.println("입력받은 값 : "+value);
		}while(value != 10);
		
		System.out.println("반복문 종료!");
	}

}
