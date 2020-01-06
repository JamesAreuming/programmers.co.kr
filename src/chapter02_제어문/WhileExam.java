package chapter02_제어문;

public class WhileExam {

	public static void main(String[] args) {
		int i = 0;
		
		while(i<=10) {
			System.out.print(i+" ");
			i++;
		}
		
		
		int a = 1;
		int sum = 0;
		while(a<=100) {
			sum = sum + a;
			a++;
		}
		System.out.println(sum);
				
		int b = 1;
		while(true) {
			System.out.println("hello : "+b+"번출력");
			
			if(b == 5) {
				break;
			}
			b++;
		}
		
//		while(true) {
//			System.out.println("무한루프 : hello");
//		}
	}

}
