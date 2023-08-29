package bank;
public class Person {
	
	private String name;
	private int age;
	private int cashamount;
	private Bankaccount account;
	
	public void setAge(int newAge) {
		if(newAge>0) {
			age = newAge;
		}
		else {
			System.out.println("올바른 나이를 입력하세요");
		}
	}
	public int getAge() {
		return age;
	}
	public void setName(String newName) {
		
	}
	public String getName() {
		return name;
	}
	public void setCashamount(int newCashamount) {
		if(newCashamount>0) {
			cashamount = newCashamount;
		}
		else {
			System.out.println("올바른 수량을 입력하세요");
		}
		
	}
	public int getCashamount() {
		return cashamount;
	}
	public void setAccount(Bankaccount newAccount) {
		account = newAccount;
	}
		
	public Bankaccount getAccount() {
		return account;
	}
	
	boolean transfer(Person to, int amount) {
		
		if(amount < 0 || account.getBalance() < amount) {
			System.out.println(name+"님이 "+to.name+"님께 이체 실패");
			 return false;
		}
		
		account.setBalance(account.getBalance()-amount);
		to.account.setBalance(to.account.getBalance()+amount);
		System.out.println(name+"님이 "+to.name+"님께 이체 성공 | transfercash : "+amount);
		return true;
	}
}



