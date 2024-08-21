package javamission17;

public interface RemoteControl {

//	 인터페이스는 변수 선언 시 자동으로 상수로 지정된다.
//	- 최저속력과 최고속력 상수를 선언하시오.
//	- 아래의 기능이 구현될 추상 메소드를 정의하시오.
//	* 전원 ON : on( )
//	* 전원 OFF : off( )
//	* 속도설정 : setSpeed( int speed )
//	* 배터리 교체 : changeBattery( )
	
	//상수 선언

	int MAX_SPEED = 200;
	int MIN_SPEED = 0;

	// 추상 메소드 기능 정의

	void on();

	void off();

	void setSpeed(int speed);

	void changeBattery(int battery);

}
