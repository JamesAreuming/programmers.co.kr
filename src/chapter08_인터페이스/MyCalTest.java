package chapter08_인터페이스;

public class MyCalTest {

	public static void main(String[] args) {
		Calculator cal = new MyCal();
		
		int a = cal.plus(3, 4);
		System.out.println(a);
		
		int  b = cal.exec(5, 6);
		System.out.println(b);
		
		int c = Calculator.exec2(3, 4);
		System.out.println(c);
	}

}
