package aarti;

public class BasnkDemo {
	private static final int AccountNo = 0;

	public static void main(String[]args) {
		SavingAccount s1=new SavingAccount("aarti","pune",AccountNo,17500);
		s1.deposit(26000);
		System.out.println(s1);
		s1.withdraw(1000);
		System.out.println(s1);
		s1.withdraw(3000);
		System.out.println(s1);
		
		
	}

}
