package bank;

public class Bankdriver {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("홍길동");
		p1.setAge(25);
		p1.setCashamount(30000);
		


	
		// p2 객체 생성
		Person p2 = new Person();
		p2.setName("장발장");
		p2.setAge(30);
		p2.setCashamount(10000);
				
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getCashamount());
		System.out.println(p2.getAge());

		// 계좌 생성
		Bankaccount a1 = new Bankaccount();
		a1.setBalance(100000);
//		System.out.println(a1.balance);
		
		// a2 계좌 생성
		Bankaccount a2 = new Bankaccount();
		a2.setBalance(500000);
		
		// 두 객체의 관계 생성
		p1.setAccount(a1); 
		a1.setOwner(p1);
		p2.setAccount(a2);
		a2.setOwner(p2);
		

		
		// 테스트 [000님의 계좌 잔액은 000원 입니다]
//		System.out.println(p1.name+"님의 계좌 잔액은 "+p1.account.balance+"원 입니다.");
//
//		// 입금 테스트
//		a1.deposit(100000);
//		p1.account.deposit(20000);
//		p1.account.deposit(-20000);

		// 출금 테스트
//		System.out.println("p1의 통장 잔액: "+p1.account.balance);
//		a1.withdraw(50000);
//		System.out.println("p1의 통장 잔액: "+p1.account.balance);
//		
//		
//		// 이체 테스트
//		System.out.println(p1.name+"의 통장 잔액: "+p1.account.balance);
//		System.out.println(p2.name+"의 통장 잔액: "+p2.account.balance);
//		
//		a1.transfer(p2, 20000);
//		
//		System.out.println(p1.name+"의 통장 잔액: "+p1.account.balance);
//		System.out.println(p2.name+"의 통장 잔액: "+p2.account.balance);
//
//		a2.transfer(a1, 100000);
//		System.out.println(p1.name+"의 통장 잔액: "+p1.account.balance);
//		System.out.println(p2.name+"의 통장 잔액: "+p2.account.balance);
//
//		a2.transfer(a2, 50000);
//		System.out.println(p1.name+"의 통장 잔액: "+p1.account.balance);
//		System.out.println(p2.name+"의 통장 잔액: "+p2.account.balance);
	}
}
