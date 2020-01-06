package chapter06_클래스_다듬기;

public class CarExam {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("소방차");
		Car c3 = new Car("구급차");
		
		System.out.println(c2.name);
		System.out.println(c3.name);
		
		Car c4 = new Car("경찰차",112);
		
		System.out.println(c4.name+c4.number);
		System.out.println(c1.name+c1.number);
		
	}

}
