package chapter03_배열;

public class forEachExam {

	public static void main(String[] args) {
		int [] iarr = {10,20,30,40,50};
		
		for(int i=0;i<iarr.length;i++) {
			int value1 = iarr[i];
			System.out.println(value1);
		}
		
		for(int value2:iarr) {
			System.out.println(value2);
		}
	}

}
