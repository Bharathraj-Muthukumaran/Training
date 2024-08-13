package Day2;

class Bank
{
	String accnumber;
	String accholdername;
	double balance;
	
	Bank (String accountnumber,String name,double balance)
	{
		this.accnumber=accountnumber;
		this.accholdername=name;
		this.balance=balance;
	}
	
	void deposit(double amount)
	{
		balance+=amount;
		System.out.println("After Deposit : "+balance);
	}
	
	void withdraw(double amount)
	{
		balance-=amount;
		System.out.println("After Withdraw : "+balance);
	}
	
	void display()
	{
		System.out.println("Account Number : "+accnumber);
		System.out.println("Account Holder Name : "+accholdername);
		System.out.println("Account Balance : "+balance);
	}
}


public class bank_program {

	public static void main(String[] args) {
		Bank obj =new Bank("86314792","Bharath",70000.0);
		obj.display();
		System.out.println();
		obj.deposit(10000);
		System.out.println();
		obj.withdraw(3000);
	}

}
