package chapter02_제어문;

public class IfExam {

	public static void main(String[] args) {
		int x = 50;
		int y = 60;
		
		if(x < y) {
			System.out.println("x는 y보다 작습니다.");
		}
		
		if(x > y) {
			System.out.println("x는 y보다 큽니다.");
		}
		
		if(x == y) {
			System.out.println("x는 y와 같습니다.");
		}
		
		int a = 50;
		int b = 50;
		
		if(a != b) {
			System.out.println("a와 b는 다릅니다.");
			System.out.println("test");
		}
		
		if(a != b)
			System.out.println("a와 b는 다릅니다.");
			System.out.println("test");
			
		if(a != b) {
			System.out.println("a와 b는 다릅니다.");
		}else {
			System.out.println("a와 b는 같습니다.");
		}
		
		if(a != b) {
			System.out.println("a와 b는 다릅니다.");
		}else if(a == b){
			System.out.println("a와 b는 같습니다.");
		}else {
			System.out.println("a는 b보다 작습니다.");
		}
		
	}

}
