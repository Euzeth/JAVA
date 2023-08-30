package HomeWork.C20230830;

abstract class 현대자동차 {
	
	String carName;
	String carSize;
	String enginType;
	int price;
	
	현대자동차(){}
	
	public 현대자동차(String carName, String carSize, String enginType, int price) {
		super();
		this.carName = carName;
		this.carSize = carSize;
		this.enginType = enginType;
		this.price = price;
	}
	abstract String Show();
}

class 아반떼 extends 현대자동차{
	아반떼(String carName, String carSize, String enginType, int price){
		super();
		this.carName = carName;
		this.carSize = carSize;
		this.enginType = enginType;
		this.price = price;
		}

	@Override
	String Show() {
		return "아반떼 [CarName] = " + carName + " [carSize] = " + carSize + " [enginType] = " + enginType + " [price] = " + price;
	}
	
}
class 소나타 extends 현대자동차{
	소나타(String carName, String carSize, String enginType, int price){
		super();
		this.carName = carName;
		this.carSize = carSize;
		this.enginType = enginType;
		this.price = price;
	}

	@Override
	String Show() {
		return "소나타 [CarName] = " + carName + " [carSize] = " + carSize + " [enginType] = " + enginType + " [price] = " + price;
	}
	
}
class 그랜저 extends 현대자동차{
	그랜저(String carName, String carSize, String enginType, int price){
		super();
		this.carName = carName;
		this.carSize = carSize;
		this.enginType = enginType;
		this.price = price;
	}

	@Override
	String Show() {
		return "그랜저 [CarName] = " + carName + " [carSize] = " + carSize + " [enginType] = " + enginType + " [price] = " + price;
	}
	
}

public class C20230830 {
	
	public static void ShowInfo(현대자동차 Hcar)
	{
		if(Hcar instanceof 아반떼) {
			아반떼 A = (아반떼)Hcar;
			System.out.println(A.Show());
		}else if(Hcar instanceof 소나타) {
			소나타 S = (소나타)Hcar;
			System.out.println(S.Show());
		}else if(Hcar instanceof 그랜저) {
			그랜저 G = (그랜저)Hcar;
			System.out.println(G.Show());
		}
	}
	public static void main(String[] args) {
		
		//현대자동차 클래스를 만들고 현대자동차를 상속받는 아반떼, 소나타, 그랜저 클래스를 만든다.
		//각 차량의 다운캐스팅을 통한 출력
		
		아반떼 A = new 아반떼("아반떼", "준중형 세단", "L4", 19450000);
		소나타 S = new 소나타("소나타", "중형 세단", "L4", 28080000);
		그랜저 G = new 그랜저("그랜저", "준대형 세단", "V6", 37430000);
		ShowInfo(A);
		System.out.println("--------------------------------------------");
		ShowInfo(S);
		System.out.println("--------------------------------------------");
		ShowInfo(G);
		
	}
}
