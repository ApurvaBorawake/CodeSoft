

public class BankAccount 
{
private double bal;
public BankAccount(double initialbal)
{
	bal=initialbal;
}
public double getbalance()
{
	return bal;
	
}
public void deposit(double amount)
{
	if(amount>0)
	{
		bal+=amount;
		System.out.println("deposited:"+amount);
		
	}
	else
	{
		System.out.println("Invalid deposite amount");
	}
}
public void withdraw(double amount)
{
	if(amount>0 &&amount<=bal)
	{
		bal-=amount;
		System.out.println("withdraw:"+amount);
	}
	else
	{
		System.out.println("Invalid withdraw amount or insufficient funds");
	}
}
	
	}


