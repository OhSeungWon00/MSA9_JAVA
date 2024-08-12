package Day05.Ex03_Car;

public class CarTest extends Car {

	public static void main(String[] args) {

		// 객체 생성
		// - 클래스타입 객채명 = new 클래스명();

		Car car = new Car();
		car.model = "투싼";

// car.speed = 200;
// private으로 지정하여 speed 에러, 외부에서 접근 불가
		car.setSpeed(200);
		System.out.println("model :" + car.getModel()); 
		System.out.println("speed :" + car.getSpeed());

		car.setSpeed(-50);
		System.out.println("model :" + car.getSpeed());

		car.setSpeed(400);
		System.out.println("model :" + car.getSpeed());

		car.setSpeed(200);
		System.out.println("model :" + car.getSpeed());
		
		System.out.println();
		
		
		Car car2 = new Car("테슬라", 5000);
		
		System.out.println("Model : " + car2.model);
		System.out.println("Model : " + car2.getSpeed());
		

	}

}
