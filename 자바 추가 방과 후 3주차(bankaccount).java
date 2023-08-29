package bank;

public class Bankaccount {
	int balance; //잔고
	Person owner; //소유인

	// 입금 - deposit
	// 파라미터 : 입금할 금액(int)
	// 리턴 : 성공 여부(boolean)
	
	boolean deposit(int amount) {
		if(amount < 0 || owner.cashamount < amount) {
			System.out.println("입금 실패 | 잔고: "+balance+"원, 현금: "+owner.cashamount+"원");
			 return false;
		}
		
		balance += amount;
		owner.cashamount -= amount;
		System.out.println(amount +"원 입금 성공 | 잔고: "+balance+"원, 현금: "+owner.cashamount+"원");
		return true;
	}
	
	
	// 출금 - withdraw
	// 파라미터 : 출금할 금액(int)
	// 리턴 : 성공 여부(boolean)
	
	boolean withdraw(int amount) {
		if(amount > balance || amount < 0) {
			System.out.println("출금 실패 | 잔고: "+balance+"원");
			return false;
		}
		
		balance -= amount;
		owner.cashamount += amount;
		System.out.println("출금 성공 | 잔고: "+balance+"원");
		return true;
	}
	
	
	// 이체 - transfer
	// 첫번째 파라미터 : 받는 사람(person)
	// 두번째 파라미터 : 이체 금액(int)
	// 리턴 : 성공 여부(boolean)
	
	boolean transfer(Person to, int amount) {
		
		if(amount < 0 || owner.cashamount < amount) {
			System.out.println(owner.name+"님이 "+to.name+"님께 이체 실패");
			 return false;
		}
		
		balance -= amount;
		to.account.balance += amount;
		System.out.println(owner.name+"님이 "+to.name+"님께 이체 성공 | transfercash : "+amount);
		return true;
	}
	
	boolean transfer(Bankaccount to, int amount) {
		return transfer(to.owner, amount);
	}
}
