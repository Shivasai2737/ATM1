import java.util.Scanner;
public class subcls extends supcls{
public static void main(String[]args) {
	int pin_number;
	int i;
	int count=0;
	Scanner s;
	s=new Scanner(System.in);
	System.out.println("please insert your card");
	System.out.println("Enter your pin number");
	pin_number=s.nextInt();
	while(pin_number!=0) {
		pin_number=pin_number/10;
		++count;
	}
	if(count==4) {
	System.out.println("SELECT 1 FOR WITHDRAW");
	System.out.println("SELECT 2 FOR DEPOSIT");
	System.out.println("SELECT 3 FOR CHECKBALANCE");
	System.out.println("SELECT 4 FOR PINGENERATION");
	i=s.nextInt();
	supcls s1;
	s1=new supcls();
	switch(i) {
	case 1:
		s1.withdraw();
		break;
	case 2:
		s1.deposit();
		break;
	case 3:
		s1.checkbalance();
		break;
	case 4:
		s1.pingeneration();
		break;
		}
	}
	else {
		System.out.println("PLEASE ENTER CORRECT PINNUMBER");
	}
}
}
