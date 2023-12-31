package HomeWork.C20230718;

import java.util.ArrayList;

public class C20230718 {
	
	public static void main(String[] args) {
		
		// Person(){}
		// Getter and Setter
		// ToString 재정의
		// 모든인자생성자
		// Person에서 지정. 현재의 클래스에서는 Person 클래스에서 지정된 요소들을 사용을 한다.
		// 코드를 계속 반복적으로 보고 사용해보고 익숙해져야 할것같다.
		
		
//		Person person = new Person();
//		System.out.println(person);
//		Person person2 = new Person("홍길동", 20);
//		System.out.println(person2);
		
		ArrayList<Person> list = new ArrayList<>();
		
		list.add(new Person("홍길동", 20));				// add(value) : ArrayList에 value를 맨 뒤에 추가한다.
		list.add(new Person("임꺽정", 40));
		list.add(new Person("장길산", 31));
		list.add(new Person("일지매", 16));
		list.add(new Person("임꺽정", 40));				// 중복되는 데이터도 입력된다.
		System.out.println(list.size() + " : " + list);	// size() : ArrayList에 저장된 데이터의 개수를 얻어온다.
		
		list.add(1, new Person("포청천", 48));			// add(index, value) : ArrayList의 index번쨰 위치에 value를 삽입한다.
		System.out.println(list.size() + " : " + list);	
		
		System.out.println(list.get(1));				// get(index) : ArrayList의 index번쨰 위치에 value를 얻어온다.
		
		list.set(2,new Person("성춘향", 16));				// set(index, value) : ArrayList의 index번째 위치에 value를 수정한다.
		System.out.println(list.size() + " : " + list);	
		
		list.remove(2);									// remove(index) : ArrayList의 index번쨰 위치에 value를 제거한다.
		System.out.println(list.size() + " : " + list);
		
		list.clear();									// clear() : ArrayList의 모든 데이터를 제거한다.
		System.out.println(list.size() + " : " + list);
	}
}
