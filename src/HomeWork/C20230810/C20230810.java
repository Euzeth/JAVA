package HomeWork.C20230810;

abstract class Employee	//직원
{
	String name;
	String age;
	String addr;
	public Employee(String name, String age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	abstract String Show();
}
class Parttimer extends Employee	//시간제
{
	int hourpay;
	Parttimer(String name,String age,String addr, int hourpay){
		super(name,age,addr);
		this.hourpay = hourpay;
	}
	
	@Override
	String Show() {
		return "Parttimer [hourpay=" + hourpay + ", name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
}
class Regular extends Employee	//정규직
{
	int salary;
	Regular(String name,String age,String addr,int salary){
		super(name,age,addr);
		this.salary=salary;
	}
	
	@Override
	String Show() {
		return "Regular [salary=" + salary + ", name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
	
}
public class C20230810 {
	
	public static  void ShowInfo(Employee emp)	//Upcasting으로 객체받기 
	{
		//각 하위클래스형에 맞게 Downcasting하기
		if (emp instanceof Parttimer ) {
			Parttimer pt = (Parttimer) emp;
			System.out.println(pt.Show());
		}else if (emp instanceof Regular) {
			Regular rg = (Regular) emp;
			System.out.println(rg.Show());
		}
	}
	
	public static void main(String[] args) {
		Parttimer emp1 = new Parttimer("홍길동","25","대구",20000);
		Regular emp2 = new Regular("서길동","45","울산",50000000);
		ShowInfo(emp1);
		System.out.println("------------------------");
		ShowInfo(emp2);
	}
}
