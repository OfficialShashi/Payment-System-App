import java.util.Scanner;

interface Payment
{
	void pay();
}

class UpiPayment implements Payment
{
	double Amount = 6000;
	int Passward = 1234;
	int SystemPass = 123;
	Scanner sc = new Scanner(System.in);
	public void pay()
	{
		System.out.print("\n\tPlease Enter Pin  :\t"); int num0 = sc.nextInt();
		if(num0 == SystemPass)
		{
			System.out.println("\n\t============== Welcome In UPI Payment System ==================");
		}
		else{
			System.out.println("\n\t\t===== Incorrect Pin Thank You ======");			
			System.exit(0);
		}
		sc.nextLine();
		System.out.print("\n\tPlease Enter Upi Number  :\t"); String UpiN = sc.nextLine();
		//if (UpiN.contains("@")) is only contain @ after number but after @ any charater not read then we use match function  
		if (UpiN.matches("[0-9]+@[a-zA-Z]+"))
		{
			System.out.println("\n\t\t Valid UPI Number : " + UpiN);
			System.out.println("\n\t\t Current Amount is  : " + Amount);
			
			System.out.print("\n\tDo you want to Pay through Upi Y/N  :\t"); char ch = sc.next().charAt(0);
			if ( ch == 'Y' || ch == 'y')
			{
				System.out.print("\n\tEnter the Amount to Payment  :\t"); double A = sc.nextDouble();
				System.out.print("\n\t    Enter Passward           :\t"); int B = sc.nextInt();
				if ( B == Passward)
				{
					if ( A <= Amount)
					{
						System.out.println("\n\t\t\t\t Upi Payment Done Successfully \n");
						System.out.println("\n\t\t\t Current Updated Amount :\t" + (Amount-A));
					}
					else
					{
						System.out.println("\n\t\tInfaficient Funds.........\n");
						System.out.print("\n\t\t Do Yoy want to Deposite Amount Y/N :\t");char ch0 = sc.next().charAt(0);
						if ( ch0 == 'Y' || ch0 == 'y')
						{
							System.out.print("\n\tEnter the Amount to Deposite  :\t"); double S = sc.nextDouble();
							System.out.print("\n\t    Enter Passward           :\t"); int C = sc.nextInt();
							if( C == Passward)
							{
								System.out.println("\n\t\t\tAmount Deposite Successfully \n");
								System.out.println("\n\t\t\t Current Updated Amount is :\t" + (Amount + S));
							}
							else{
								System.out.println("\n\t\t Wrong Passward.......");
							}
						}
						else{
							System.out.println("\n\t\t Thank You Using Code.......");
						}
					}
				}
				else{
					System.out.println("\n\t\t Wrong Passward.......");
				}
			}
			else{
				System.out.println("\n\t\t Thank You Using Code.......");
			}
		}	
		else{
			System.out.println("\n\t\t\t Wrong UPI Number : " + UpiN );
			System.out.print("\n\t\tSelect Again Option and Enter Valid Upi Number \n");
		}
	}
}

class CreditCardPayment implements Payment
{
	double Amount = 10000;
	int Passward = 1234;
	int SystemPass = 123;
	Scanner sc = new Scanner(System.in);
	public void pay()
	{
		System.out.print("\n\tPlease Enter Pin  :\t"); int num0 = sc.nextInt();
		if(num0 == SystemPass)
		{
			System.out.println("\n\t============== Welcome In Credit Card Payment System ==================");
		}
		else{
			System.out.println("\n\t\t===== Incorrect Pin Thank You ======");			
			System.exit(0);
		}
		sc.nextLine();
		System.out.print("\n\tPlease Enter Credit Card Number  :\t"); String num = sc.nextLine();
		System.out.print("\n\tPlease Enter CVV Code  :\t"); String num1 = sc.nextLine();
		if (num1.matches("\\d{3}"))
		{
			if(num1.length() == 3)
			{
				
			}
			else
			{
				System.out.println("\n\t\t Invalid CVV Code :\t " + num1);				
			}
		}
		else{
			System.out.println("\n\t\t Invalid CVV Code :\t " + num1);
			System.out.println("\n\t\t Enter valid CVV Code Not less then 3 or not grater then 3 \n");
		}	
		if(num.matches("\\d{16}"))
		{			
			//if (String.valueOf(num).length() == 16) use numeric value then use this function but find string length then use variable.length 
			if(num.length() == 16)
			{
				System.out.println("\n\t\t Valid Credit Card Number :\t" + num);
			    System.out.println("\n\t\tYour Current Amount is  :\t" + Amount);
				System.out.print("\n\tDo you want to Pay through Credit Card Y/N  :\t"); char ch = sc.next().charAt(0);
				if ( ch == 'Y' || ch == 'y')
				{
					System.out.print("\n\tEnter the Amount to Payment  :\t"); double A = sc.nextDouble();
					System.out.print("\n\t    Enter Passward           :\t"); int B = sc.nextInt();
					if ( B == Passward)
					{
						if ( A <= Amount)
						{
							System.out.println("\n\t\t\t\t Credit Card Payment Done Successfully \n");
							System.out.println("\n\t\t\t Current Updated Amount :\t" + (Amount-A));
						}
						else
						{
							System.out.println("\n\t\tInfaficient Funds.........\n");
							System.out.print("\n\t\t Do Yoy want to Deposite Amount Y/N :\t");char ch0 = sc.next().charAt(0);
							if ( ch0 == 'Y' || ch0 == 'y')
							{
								System.out.print("\n\tEnter the Amount to Deposite  :\t"); double S = sc.nextDouble();
								System.out.print("\n\t    Enter Passward           :\t"); int C = sc.nextInt();
								if( C == Passward)
								{
									System.out.println("\n\t\t\tAmount Deposite Successfully \n");
									System.out.println("\n\t\t\t Current Updated Amount is :\t" + (Amount + S));
								}
								else{
									System.out.println("\n\t\t Wrong Passward.......");
								}
							}
							else{
								System.out.println("\n\t\t Thank You Using Code.......");
							}
						}
					}
					else{
						System.out.println("\n\t\t Wrong Passward.......");
					}
				}
				else{
					System.out.println("\n\t\t Thank You Using Code.......");
				}
			}
			else{
				System.out.println("\n\t\t Invalid Credit Card Number less than 16 :\t " + num);
				System.out.print("\n\t\tSelect Again Option and Enter Valid Credit card Number \n");
			}			
		}
		else{
			System.out.println("\n\t\t Invalid Credit Card Number :\t " + num);
		}	
	}
} 

class DebitcardPayment implements Payment
{
	double Amount = 10000;
	int Passward = 1234;
	int SystemPass = 123;
	Scanner sc = new Scanner(System.in);
	public void pay()
	{
		System.out.print("\n\tPlease Enter Pin  :\t"); int num0 = sc.nextInt();
		if(num0 == SystemPass)
		{
			System.out.println("\n\t============== Welcome In Debit Card Payment System ==================");
		}
		else{
			System.out.println("\n\t\t===== Incorrect Pin Thank You ======");			
			System.exit(0);
		}
		sc.nextLine();
		System.out.print("\n\tEnter Debit Card Holder Name  :\t"); String num2 = sc.nextLine();
		System.out.print("\n\tPlease Enter Debit Card Number  :\t"); String num = sc.nextLine();
		System.out.print("\n\tPlease Enter CVV Code  :\t"); String num1 = sc.nextLine();
		if (num1.matches("\\d{3}"))
		{
			if(num1.length() == 3)
			{
				
			}
			else
			{
				System.out.println("\n\t\t Invalid CVV Code :\t " + num1);				
			}
		}
		else{
			System.out.println("\n\t\t Invalid CVV Code :\t " + num1);
			System.out.println("\n\t\t Enter valid CVV Code Not less then 3 or not grater then 3 \n");
		}	
		if(num.matches("\\d{16}"))
		{
			if(num.length() == 16)
			{
				System.out.println("\n\t\t Valid Debit Card Number :\t" + num);
				System.out.println("\n\t\tYour Current Amount is  :\t" + Amount);
				System.out.print("\n\tDo you want to Pay through Debit Card Y/N  :\t"); char ch = sc.next().charAt(0);
				if ( ch == 'Y' || ch == 'y')
				{
					System.out.print("\n\tEnter the Amount to Payment  :\t"); double A = sc.nextDouble();
					System.out.print("\n\t    Enter Passward           :\t"); int B = sc.nextInt();
					if ( B == Passward)
					{
						if ( A <= Amount)
						{
							System.out.println("\n\t\t\t\t Credit Card Payment Done Successfully \n");
							System.out.println("\n\t\t\t Current Updated Amount :\t" + (Amount-A));
						}
						else{
							System.out.println("\n\t\tInfaficient Funds.........\n");
							System.out.print("\n\t\t Do Yoy want to Deposite Amount Y/N :\t");char ch0 = sc.next().charAt(0);
							if ( ch0 == 'Y' || ch0 == 'y')
							{
								System.out.print("\n\tEnter the Amount to Deposite  :\t"); double S = sc.nextDouble();
								System.out.print("\n\t    Enter Passward           :\t"); int C = sc.nextInt();
								if( C == Passward)
								{
									System.out.println("\n\t\t\tAmount Deposite Successfully \n");
									System.out.println("\n\t\t\t Current Updated Amount is :\t" + (Amount + S));
								}
								else{
									System.out.println("\n\t\t Wrong Passward.......");
								}
							}
							else{
								System.out.println("\n\t\t Thank You Using Code.......");
							}
						}
					}
					else{
						System.out.println("\n\t\t Wrong Passward.......");
					}
				}			
			}
			else{
				System.out.println("\n\t\t Invalid Debit Card Number less than 16 :\t " + num);
				System.out.print("\n\t\tSelect Again Option and Enter Valid Debit card Number \n");
			}
		}
		else{
			System.out.println("\n\t\t Invalid Debit Card Number :\t " + num);
		}
	}	
}

class NetBankingPayment implements Payment
{
	double Amount = 10000;
	int Passward = 1234;
	int SystemPass = 123;
	Scanner sc = new Scanner(System.in);
	public void pay()
	{
		System.out.print("\n\tPlease Enter Pin  :\t"); int num0 = sc.nextInt();
		if(num0 == SystemPass)
		{
			System.out.println("\n\t============== Welcome In Net Banking Payment System ==================");
		}
		else{
			System.out.println("\n\t\t===== Incorrect Pin Thank You ======");			
			System.exit(0);
		}
		sc.nextLine();
		System.out.print("\n\tEnter Account Holder Name  :\t"); String num2 = sc.nextLine();
		System.out.print("\n\tPlease Enter Account Number  :\t"); String num = sc.nextLine();
		System.out.print("\n\tPlease Enter Pin  :\t"); String num1 = sc.nextLine();
		if (num1.matches("\\d{4}"))
		{
			if(num1.length() == 4)
			{
				
			}
			else
			{
				System.out.println("\n\t\t Invalid Pin :\t " + num1);				
			}
		}
		else{
			System.out.println("\n\t\t Invalid Pin :\t " + num1);
			System.out.println("\n\t\t Enter valid Pin Not less then 4 or not grater then 4 \n");
		}	
		if(num.matches("\\d{10}"))
		{
			if(num.length() == 16)
			{
				System.out.println("\n\t\t Valid Account Number :\t" + num);
				System.out.println("\n\t\tYour Current Amount is  :\t" + Amount);
				System.out.print("\n\tDo you want to Pay through Net Banking Y/N  :\t"); char ch = sc.next().charAt(0);
				if ( ch == 'Y' || ch == 'y')
				{
					System.out.print("\n\tEnter the Amount to Payment  :\t"); double A = sc.nextDouble();
					System.out.print("\n\t    Enter Passward           :\t"); int B = sc.nextInt();
					if ( B == Passward)
					{
						if ( A <= Amount)
						{
							System.out.println("\n\t\t\t\t Net Banking Payment Done Successfully \n");
							System.out.println("\n\t\t\t Current Updated Amount :\t" + (Amount-A));
						}
						else{
							System.out.println("\n\t\tInfaficient Funds.........\n");
							System.out.print("\n\t\t Do Yoy want to Deposite Amount Y/N :\t");char ch0 = sc.next().charAt(0);
							if ( ch0 == 'Y' || ch0 == 'y')
							{
								System.out.print("\n\tEnter the Amount to Deposite  :\t"); double S = sc.nextDouble();
								System.out.print("\n\t    Enter Passward           :\t"); int C = sc.nextInt();
								if( C == Passward)
								{
									System.out.println("\n\t\t\tAmount Deposite Successfully \n");
									System.out.println("\n\t\t\t Current Updated Amount is :\t" + (Amount + S));
								}
								else{
									System.out.println("\n\t\t Wrong Passward.......");
								}
							}
							else{
								System.out.println("\n\t\t Thank You Using Code.......");
							}
						}
					}
					else{
						System.out.println("\n\t\t Wrong Passward.......");
					}
				}
			}
			else{
				System.out.println("\n\t\t Invalid Account Number not less than 10 not Grater than 10 :\t " + num);
				System.out.print("\n\t\tSelect Again Option and Enter Valid Account Number \n");
			}
		}
		else{
			System.out.println("\n\t\t Invalid Account Number :\t " + num);
		}
	}
}

public class PaymentControll
{
	public static void main(String[] args)
	{
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("\n\tPress 1 Upi Payment         \t Press 2 Credi Card Payment ");
			System.out.println("\n\tPress 3 Debit Card Payment  \t Press 4 Net Banking Payment ");
			System.out.println("\n\tPress 0 Exit From App  \n");
			System.out.print("\n\tSelect the Option from Menu :\t"); int x = sc.nextInt();
			if( x == 0)
			{
				System.out.println("\n\t\t\t Exit ");
				System.out.println("\n\t\t Thank You for Payment App \n");
				break;
			}
			
			if (x == 1 )
			{
				UpiPayment Upi = new UpiPayment();
				Upi.pay();
			}
			else if(x == 2)
			{
				CreditCardPayment cred = new CreditCardPayment();
				cred.pay();
			}
			else if( x == 3 )
			{
				DebitcardPayment deb = new DebitcardPayment();
				deb.pay();
			}
			else if(x == 4)
			{
				NetBankingPayment net = new NetBankingPayment();
				net.pay();
			}
			else
			{
				System.out.println("\n\t\t Invalid Option Please select Correct Option \n");
			}
		}			
	}
}