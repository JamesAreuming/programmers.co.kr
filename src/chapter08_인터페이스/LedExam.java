package chapter08_인터페이스;

public class LedExam {

	public static void main(String[] args) {
		TV tv = new LedTV();
		tv.turnOn();
		tv.turnOff();
		tv.changeVolume(39);
		tv.changeChannel(8);
	}

}
