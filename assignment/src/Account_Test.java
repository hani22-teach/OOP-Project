
import java.util.Scanner;


public class Account_Test {

public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter account Id: ");
int id=sc.nextInt();
System.out.println("Enter Balance: ");
double balance=sc.nextDouble();
Accountt acc=new Accountt();

System.out.println(" choose/  1.Dposit  2.Debit:  ");
int choice=sc.nextInt();
switch(choice){
    case 1:
        System.out.println("Enter the deposit: ");
        Double Deposit=sc.nextDouble();
        acc.setDeposit(Deposit);
        System.out.println("Balance: " + acc.getBalance());
           break;
    case 2:
        System.out.println("Enter the Debit");
        Double debit=sc.nextDouble();
        acc.setDebit(debit);
        System.out.println("Balance: " + acc.getBalance());
          break;
}
 
    
    
    
}
}
