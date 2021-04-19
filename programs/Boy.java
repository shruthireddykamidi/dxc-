package jp;

class Bank
{
	public int getbalance()
	{
		return 0;
	}
}

class BankA extends Bank
{
	public int getbalance()
	{
		return 1000;
	}
}
class BankB extends Bank
{
	public int getbalance()
	{
		return 1500;
	}
}
class BankC extends Bank
{
	public int getbalance()
	{
		return 2000;
	}
}
public class Boy {
	
	public static void main(String args[])
	{
		BankA a = new BankA();
		BankB b = new BankB();
		BankC c = new BankC();
		System.out.println("Balance in A bank: "+ a.getbalance());
		System.out.println("Balance in B bank: "+ b.getbalance());
		System.out.println("Balance in C bank: "+ c.getbalance());
	}

}