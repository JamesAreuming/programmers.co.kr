package chapter02_제어문;

public class SwitchExam {

	public static void main(String[] args) {
		//switch, case, default, break
		
		int value1 = 1;
		
		switch(value1) {
			case 1:
				System.out.println("value1의 값은 1입니다.");
			case 2:
				System.out.println("value1의 값은 2입니다.");
			case 3:
				System.out.println("value1의 값은 3입니다.");
			default:
				System.out.println("그 외 다른 숫자");
		}
		
		
		int value2 = 2;
		
		switch(value2) {
			case 1:
				System.out.println("value2의 값은 1입니다.");
			case 2:
				System.out.println("value2의 값은 2입니다.");
			case 3:
				System.out.println("value2의 값은 3입니다.");
			default:
				System.out.println("그 외 다른 숫자");
		}
		
		
		int value3 = 3;
		
		switch(value3) {
			case 1:
				System.out.println("value3의 값은 1입니다.");
				break;
			case 2:
				System.out.println("value3의 값은 2입니다.");
				break;
			case 3:
				System.out.println("value3의 값은 3입니다.");
				break;
			default:
				System.out.println("그 외 다른 숫자");
				break;
		}
		
		String str = "A";
		
		switch (str) {
			case "A":
				System.out.println("str의 값는 A입니다.");
				break;
			case "B":
				System.out.println("str의 값은 B입니다.");
			default:
				System.out.println("그 외 다른 문자");
				break;
		}
	}

}
