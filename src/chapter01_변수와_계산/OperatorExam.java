package chapter01_변수와_계산;

public class OperatorExam {

	public static void main(String[] args) {
		int a = -5;
		int b = +a;
		int c = -5;
		int d = -a;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		
		int e = ++d;
		System.out.println(e);
		System.out.println(d);
		
		int f = d++;
		System.out.println(f);
		System.out.println(d);
		
		int i = 5;
		int j = 2;
		
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println((float)i/j);
		System.out.println(i/(double)j);
		System.out.println(i%j);
	}

}
