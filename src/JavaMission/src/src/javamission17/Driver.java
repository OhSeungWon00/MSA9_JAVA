package javamission17;

public class Driver {
//	RemoteControl 인터페이스를 선언하시오.-
//	RcCar 객체, Drone
//	객체를 생성하여, RemoteControl
//	인터페이스 변수에 대입하시오.-
//	RcCar 객체와
//	Drone 객체를
//	사용하는 프로그램을
//	자유롭게 완성하시오.

	public static void main(String[] args) {

		RemoteControl RcCar = new RcCar();
		RcCar.on();
		RcCar.off();
		RcCar.setSpeed(250);
		RcCar.setSpeed(50);
		RcCar.changeBattery(80);

		RemoteControl Drone = new RcCar();
		Drone.on();
		Drone.off();
		Drone.setSpeed(300);
		Drone.setSpeed(78);
		Drone.changeBattery(20);

	}

}
