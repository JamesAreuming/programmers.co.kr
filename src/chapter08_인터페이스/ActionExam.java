package chapter08_인터페이스;

public class ActionExam {

	public static void main(String[] args) {
//		Action action = new MyAction();
//		action.exec();
		
		Action action = new Action() {
			
			@Override
			public void exec() {
				System.out.println("exec");
			}
		}; 
		action.exec();
	}

}
