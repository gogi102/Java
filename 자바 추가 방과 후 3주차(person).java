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
	public void setName(String newName) {
		
	}
	public void setCashamount(int newCashamount) {
		
	}
	public void setAccount(Bankaccount newAccount) {
		
	}
	public String getName() {
		return name;
	}
	public int getCashamount() {
		return cashamount;
	}
	public Bankaccount getAccount() {
		return account;
	}
	public int getAge() {
		return age;
	}

	boolean transfer(Person to, int amount) {
		
		if(amount < 0 || account.balance < amount) {
			System.out.println(name+"님이 "+to.name+"님께 이체 실패");
			 return false;
		}
		
		account.balance -= amount;
		to.account.balance += amount;
		System.out.println(name+"님이 "+to.name+"님께 이체 성공 | transfercash : "+amount);
		return true;
	}
}
