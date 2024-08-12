package Day04.Class;

public class Pikachu {

	public int energy;
	public String type;

	// 생성자
	// * 기본 생성자는 정의하지 않으면 컴파일러가 자동으로 정의해준다.
	// 생성자 자동 완성 : alt + shift + s : o
	// 메소드 오버로딩
	public Pikachu() {
//		energy = 100;
//		type = "전기";
		this(100, "전기");
		System.out.println("기본생성");

	}

	public Pikachu(int energy) {
//		this.energy = energy;
		this(energy, "전기");
	}

	// 매개변수가 있는 생성자
	public Pikachu(int energy, String type) {
		this.energy = energy;
		this.type = type;
	}

	// 메소드
	public String aAttack() {

		return "십만볼트";
	}

	public String bAttack() {

		return "전광석화";

	}
	// toString()
	// 반환하는 문자열을 객체의 출력으로 대체해주는 메소드
	
	@Override
	public String toString() {
		return "Pikachu [energy=" + energy + ", type=" + type + "]";
	}
	
	
}