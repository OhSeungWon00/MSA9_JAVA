package javamission17;

public class Drone implements RemoteControl {

	int speed;
	int battery;

	@Override
	public void on() {
		System.out.println("Drone의 전원을 켭니다");
	}

	@Override
	public void off() {
		System.out.println("Drone의 전원을 끕니다");

	}

	@Override
	public void setSpeed(int speed) {
		if (speed > MAX_SPEED) {
			System.err.println("최대비행속도 입니다.");
			this.speed = MAX_SPEED;
		} else if (speed < MIN_SPEED) {
			System.err.println("최저비행속도 입니다.");
			this.speed = MIN_SPEED;

		} else {
			this.speed = speed;
		}

	}

	@Override
	public void changeBattery(int battery) {
		System.out.println("드론의 베터리가 :" + battery + "남았습니다.");

	}

}
