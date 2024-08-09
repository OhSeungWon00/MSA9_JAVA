package Day05.Ex01_Student;

import Day04.Ex04_Foreach;

public class Student {
	// 학생의 속성 : 이름, 나이, 학번, 전공
	// 학생의 행동 : 공부하기(), 성적 평균 구하기

	// 변수
	// 생성자
	// 메소드

	String name;
	int age;
	String stdNo;
	String major;

	// 생성자
	public Student() {
		this("이름없음", 1, "000000", "없음");

	}

	public Student(String name, int age, String stdNo, String major) {
		this.name = name;
		this.age = age;
		this.stdNo = stdNo;
		this.major = major;
	}

	// 메소드
	// * 접근 지정자 반환타입 메소드명 (매개변수) {}
	// - 공부하기
	// * void : 반환타입없음 (return 생략가능)
	// - void로 지정해도 return 을 메소드를 종료시키는 용도로 사용할 수 있다.
	public void study(String subject) {
		System.out.println(subject + "(을/를) 공부합니다");
	}

	// - 성적 평균 구하기
	// - 메소드 오버 로딩
	public double getAverage(int score1, int score2) {
		double average = 0.0;
		average = (double) (score1 + score2) / 2;
		return average;

	}

	public double getAverage(int score1, int score2, int score3) {
		double average = 0.0;
		average = (double) (score1 + score2 + score3) / 3;
		return average;

	}

	// 평균을 구해보세요
//	public double getAverage(int[] scores) {
//		double average = 0.0;
//		int sum = 0;

//		for (int i = 0; i < scores.length; i++) {
//			sum += scores[i];
//		}

//	     average = (double)sum / scores.length;

//		return average;
//	}
//}

	public double getAverage(int[] scores) {
		double average = 0.0;
		int sum = 0;

		for (int score : scores) {
			sum += score;
		}
		average = (double) sum / scores.length;
		return average;

	}

}
