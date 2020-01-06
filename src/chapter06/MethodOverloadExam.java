package chapter06;

public class MethodOverloadExam {

	public static void main(String[] args) {
		MyClass2 m = new MyClass2();
		
		System.out.println(m.plus(4,5));
		System.out.println(m.plus(4,6,7));
		System.out.println(m.plus("Hello", "World"));
		
		MyClass2 myclass = new MyClass2();
		
		myclass.method3();
		
		String str = "hello world";
		System.out.println(str.length());
		System.out.println(str.concat(" JAVA"));
		System.out.println(str);
		
		str = str.concat(str);
		System.out.println(str);
		
		System.out.println(str.substring(11));
		System.out.println(str.substring(3,7));
	}

}
