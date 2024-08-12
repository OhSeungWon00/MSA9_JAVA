package Day06.Ex03_02AccessModify;

import Day06.Ex03_01AccessModify.Person;

public class Student extends Person {

	// 생성자
	public Student() {
		super();
	}

	public Student(String name, int age, int height, int weight) {
		super(name, age, height, weight);
	}

	
	// 메소드
	public void defualtSetting() {
	name = "이름없음";  //public 접근지정자로, 모든 곳에서 접근 가능
	age = 20;// Protected 접근지정자로, 다른 패키지라도 접근 가능
	//height = 170; //default 접근지정자로, 다른패키지 접근 불가
	//weight = 60;  // private 접근지정자로, 해당 클래스에서만 접근 가능
	setHeight(170);
	setWeight(age);
		
	}
}
