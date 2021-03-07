package homework;

public class Coffee {

	String cate;
	String temp;
	String size;
	int money;

	public Coffee() {
	}

	public Coffee(String cate, String temp, String size) {
		super();
		this.cate = cate;
		this.temp = temp;
		this.size = size;
	}

	public void calculate() {
		if(cate.contentEquals("Americano")) {
			money = 4100;
		}else if(cate.equals("CafeMoca")) {
			money = 5500;
		}else {
			money = 5000;
		}
	}

	public void order() {
		
		System.out.println(cate+"\t"+temp+"\t"+size+"\t"+money);
	}
}
