import java.util.Scanner;

interface Payment
{
	void pay();
}

class UpiPayment implements Payment
{
	public void pay()
	{
		System.out.println("\n\t\t Upi Payment Done \n");
	}
}

class CreditCardPayment implements Payment
{
	public void pay()
	{
		System.out.println("\n\t\t Credit Card Payment Done \n");
	}
} 

class DebitcardPayment implements Payment
{
	public void pay()
	{
		System.out.println("\n\t\t Debit Card Payment Done \n");
	}
}

class NetBankingPayment implements Payment
{
	public void pay()
	{
		System.out.println("\n\t\t Net Banking Payment Done \n");
	}
}

/*class checkOut
{
	void ProcessPayment( Payment obj)
	{
		obj.pay();
	}
}*/


class PaymentControll
{
	public static void main(String[] args)
	{
		UpiPayment Upi = new UpiPayment();
		Upi.pay();
		CreditCardPayment cred = new CreditCardPayment();
		DebitcardPayment deb = new DebitcardPayment();
		
		NetBankingPayment net = new NetBankingPayment();
	}
}