package chapter07;

public class BirdExam {

	public static void main(String[] args) {
		Car c = new Bus();
		c.run();
//		c.pangpang();
		
		Bus bus = (Bus)c;
		bus.run();
		bus.pangpang();
	}

}
