package javamission17;

public class RcCar implements RemoteControl {

	// - RemoteControl 인터페이스를 구현하시오.
	// - 멤버변수 “배터리, 속력＂을 선언하시오.

	int battery;
	int speed;

	@Override
	public void on() {
		System.out.println("RcCar의 전원을 켭니다.");
	}

	@Override
	public void off() {
		System.out.println("RcCar의 전원을 끕니다.");

	}

	@Override
	public void setSpeed(int speed) {
		if (speed > MAX_SPEED) {
			System.err.println("최대속력 입니다.");
			this.speed = MAX_SPEED;
		} else if (speed < MIN_SPEED) {
			System.err.println("최저속력 입니다.");
			this.speed = MIN_SPEED;

		} else {
			this.speed = speed;
		}

	}

	@Override
	public void changeBattery(int battery) {
		System.out.println("차의 베터리가 :" + battery + "남았습니다.");

	}

}
