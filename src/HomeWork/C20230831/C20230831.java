package HomeWork.C20230831;

class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + "원 입금되었습니다. 현재 잔액: " + balance + "원");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원 출금되었습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }

    public void displayBalance() {
        System.out.println("현재 잔액: " + balance + "원");
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        deposit(interest);
        System.out.println("이자 " + interest + "원이 추가되었습니다.");
    }
}

public class C20230831 {

	public static void main(String[] args) {
		
		// Account 클래스는 계좌의 기본 동작을 정의하고, SavingsAccount 클래스는 이에 추가적인 이자 계산 기능을 더하여 Account 클래스를 상속받습니다.
		// 상속을 통해 SavingsAccount 클래스는 Account 클래스의 모든 멤버 변수와 메서드를 물려받아 사용할 수 있습니다. 
		// 이를 활용하여 SavingsAccount 클래스는 이자 계산 및 추가 관련 기능을 간단하게 구현
		
		Account account1 = new Account("123-456", 1000);
        account1.deposit(500);
        account1.withdraw(200);
        account1.displayBalance();

        SavingsAccount savingsAccount = new SavingsAccount("789-012", 5000, 2.5);
        savingsAccount.deposit(1000);
        savingsAccount.addInterest();
        savingsAccount.displayBalance();
	}
}
