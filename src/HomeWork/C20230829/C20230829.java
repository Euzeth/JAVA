package HomeWork.C20230829;


class 현대자동차 {
	
	String carName;
	String carSize;
	String enginType;
	int price;
	
	현대자동차(){}
	
	현대자동차(String carName, String carSize, String enginType, int price) {
		super();
		this.carName = carName;
		this.carSize = carSize;
		this.enginType = enginType;
		this.price = price;
	}
	
	void print() {
		System.out.println("차량이름: " + carName);
	    System.out.println("차량크기: " + carSize);
	    System.out.println("엔진종류: " + enginType);
	    System.out.println("가격: " + price + "원");
	}
	
}

class 아반떼 extends 현대자동차{
	아반떼(){
		super("아반떼", "준중형 세단", "L4", 19750000);
		}
}
class 소나타 extends 현대자동차{
	소나타(){
		super("소나타", "중형 세단", "L4", 28080000);
	}
}
class 그랜저 extends 현대자동차{
	그랜저(){
		super("그랜저", "준대형 세단", "V6", 37430000);
	}
}

public class C20230829 {

	public static void main(String[] args) {
		
		//현대자동차 클래스를 만들고 현대자동차를 상속받는 아반떼, 소나타, 그랜저 클래스를 만든다.
		//각 차량의 업캐스팅을 통한 출력
		
		현대자동차[] cars = new 현대자동차[3];
		cars[0] = new 아반떼();
		cars[1] = new 소나타();
		cars[2] = new 그랜저();
		
		for (현대자동차 car : cars) {
		      car.print();
		      System.out.println();
		    }
		
	}

}
