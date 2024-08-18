package JavaMission;

public class Mission_11_Account {

	private String moneynum;
	private String name;
	private int money;
	private int password;
	private final int magicpassword = 1111;

	final long maxnum = 1000000000000L;
	final int maxcus = 1000;

	public Mission_11_Account() {

		moneynum = "계좌없음";
		name = "이름없음";
		money = 0;

	}

	public Mission_11_Account(String moneynum, String name, int money, int password) {
		this.moneynum = moneynum;
		this.name = name;
		this.money = money;
		this.password = password;
	}

	public String getMoneynum() {
		return moneynum;
	}

	public String getName() {
		return name;
	}

	public int getMoney() {
		return money;
	}

	public int getPassword() {
		return password;
	}
	
	public int getMagicpassword() {
		return magicpassword;
	}
	

	public void setMoneynum(String moneynum) {
		this.moneynum = moneynum;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMoney(int money) {
		this.money = this.money + money;
	}
	public void setMoney2(int money) {
		this.money = this.money - money;
	}

	public void setPassword(int password) {
		this.password = password;
	}
}
