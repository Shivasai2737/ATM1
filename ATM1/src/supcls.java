import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class supcls {
	int pin_number;
	int Avaliable_balance=5000;
	int Withdraw_amount;
	int Total_amount;
	int deposite_money;
	int account_number;
	int mobile_number;
	int otp;
	int i;
	DateTimeFormatter d=DateTimeFormatter.ofPattern("yyyy/MM/dd      HH:mm:ss");
	LocalDateTime now=LocalDateTime.now();
void receipt() {
	Scanner s;
	s=new Scanner(System.in);
	System.out.println("SELECT 1 FOR RECEIPT");
	i=s.nextInt();
	switch(i) {
	case 1:
	System.out.println("*************************");
	System.out.println(d.format(now));
	System.out.println("****SBI BANK****");
	System.out.println("AVALIABLE BALANCE:"+Avaliable_balance);
	System.out.println("TOTAL AMOUNT:"+Total_amount);
	System.out.println("ACCOUNT NUMBER:"+account_number);
	System.out.println("THANK YOU VISIT AGAIN");
	System.out.println("***********************");
	break;
	default:
		System.out.println("THANK YOU VISIT AGAIN");
	}
	
}
void withdraw() {
	Scanner s;
	s=new Scanner(System.in);
	System.out.println("please enter withdraw amount");
	Withdraw_amount=s.nextInt();
	if(Avaliable_balance>=Withdraw_amount) {
	Total_amount=Avaliable_balance-Withdraw_amount;
	System.out.println("THE AMOUNT IS removed SUCCESSFULLY");
	}
	receipt();
	}
void deposit() {
	Scanner s;
	s=new Scanner(System.in);
	System.out.println("Enter deposit money");
	deposite_money=s.nextInt();
	Total_amount=Avaliable_balance+deposite_money;
	System.out.println("THE AMOUNT IS ADDED SUCCESSFULLY");
	receipt();
	}

void checkbalance() {
	System.out.println("total balance"+Avaliable_balance);
	receipt();
	}
void pingeneration() {
	System.out.println("Enter your accountnumber");
	Scanner s;
	s=new Scanner(System.in);
	account_number=s.nextInt();
	System.out.println("Enter mobile number");
	mobile_number=s.nextInt();
	System.out.println("You will get an otp on your mobile number");
	System.out.println("Enter otp");
	otp=s.nextInt();
	System.out.println("create a new pin");
	pin_number=s.nextInt();
	System.out.println("your pin number is created successfully");
	}
	
	}

