class AccountCreation
{
	private static AccountCreation instance;

	private AccountCreation()
	{}

	public synchronized static AccountCreation AccountCreation()
	{
		if(instance == null)
		{instance = new AccountCreation(); System.out.println("object created");}

		else
		{System.out.println("object not created, returned existing object");}

		return instance;
	}

	public void create(int n)
	{
		System.out.println("A/c created, number:" + n);
	}
}

public class Client
{
	public static void main(String[] args)
	{
		AccountCreation o1 = AccountCreation.AccountCreation();
		AccountCreation o2 = AccountCreation.AccountCreation();

		o1.create(123);
		o2.create(456);
	}
}