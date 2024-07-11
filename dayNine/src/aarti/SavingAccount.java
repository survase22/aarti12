package aarti;

public class SavingAccount  extends Customer implements Bank{
	private static final float MINBAL = 0;
	private int accNo;
	private float balance;

//constructor
	public SavingAccount(String name, String city, int accNo, float balance) {
		super();
		this.accNo = accNo;
		this.balance = balance;
	}
public SavingAccount(String name, String city, int accNo2, int balance2) {
	// TODO Auto-generated constructor stub
}
	//getter setter
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public void deposit(float amount) {
		if(amount<0||amount>Deposit_Limit)
		{
			System.out.println("please deposit valid amounnt");
		}
		else
	{
			balance=amount;
			System.out.println("Rs:"+amount+" is deposited successfully");
		}
		
	}

	@Override
	public void withdraw(float amount)
	{
	if(amount<=balance){
		balance=amount;
		System.out.println("Rs:"+"amount+withdrawl is successfully");
	}
		else {
			System.out.println("Insufficient balance");
		}
	}
	public void withdraw1(float amount) {
		// TODO Auto-generated method stub
		
	}
	}


