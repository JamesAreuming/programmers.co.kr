package chapter08_인터페이스;

public class LedTV implements TV {

	@Override
	public void turnOn() {
		System.out.println("켜다");
	}

	@Override
	public void turnOff() {
		System.out.println("끄다");
	}

	@Override
	public void changeVolume(int volume) {
		System.out.println("볼륨("+volume+")을 조절하다");
	}

	@Override
	public void changeChannel(int channel) {
		System.out.println("채널("+channel+")을 지정하다");
	}

}
