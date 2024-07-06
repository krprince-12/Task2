import java.util.Scanner;

class Account{
    float balance;
    float reaminingamount;
    Account(String cname,String cid){
        customerName=cname;
        customerId=cid;
    }
    String customerName;
    String customerId;
    
    void deposit(float amount){
        if(amount!=0){
            balance=balance+amount;
            reaminingamount=amount;
        }
    }
    void withdraw(float amount){
        if(amount!=0){
            balance=balance-amount;
            reaminingamount=amount;
        }
    }
    void checkbalance(){
        if(reaminingamount>0){
            System.out.println("Deposited :+reaminingamount");
        }
        else if(reaminingamount<0){
            System.out.println("withdrawn:"+Math.abs(reaminingamount));
        }
        else{
            System.out.println("Still no transaction happend!!");
        }
    }
    void menu(){
        char option='\0';
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome"+" "+customerName);
        System.out.println("Your ID is :"+customerId);
        System.out.println();
        System.out.println("A : Check Balance");
        System.out.println("B : Deposit");
        System.out.println("C : Withdraw");
        System.out.println("D : Exit");
        do{
            System.out.println("********************");
            System.out.println("Enter the Option:");
            System.out.println("=====================");
            option = sc.next().charAt(0);
            Character.toUpperCase(option);
            switch(option){
                case 'A':
                System.out.println("********************");
                System.out.println("Balance is :"+balance);
                System.out.println("********************");
                System.out.println();
                break;
                case 'B':
                System.out.println("********************");
                System.out.println("Enter the Amount to deposit :");
                System.out.println("********************");
                int amount=sc.nextInt();
                deposit(amount);
                System.out.println();
                break;
                case 'C':
                System.out.println("********************");
                System.out.println("Enter amount to withdraw:");
                int amount2=sc.nextInt();
                withdraw(amount2);
                System.out.println();
                break;
                case 'D':
                System.out.println("********************");
                System.out.println("Thankyou!");
                break;
                default:
                System.out.println("Invalid option! please try again");
                break;
            }
        }while(option!='D');
       
    }
}
public class Task2 {
    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
Account a=new Account("Prince","10");
a.menu();
    }
}
