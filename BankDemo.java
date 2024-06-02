/*Class definition, creating objects and constructors:
Write a java program to create a class named 'Bank ' with the following data
members:
• Name of depositor
• Address of depositor
• Account Number
• Balance in account
Class 'Bank' has a method for each of the following:
1. Generate a unique account number for each depositor.
2. For first depositor, account number will be 1001, for second depositor
it will be 1002 and so on
3. Display information and balance of depositor
4. Deposit more amount in balance of any depositor
5. Withdraw some amount from balance deposited.
6. Change address of depositor
2
After creating the class, do the following operations.
1. Enter the information (name, address, account number, balance) of the
depositors. Number of depositors is to be entered by the user.
2. Print the information of any depositor.
3. Add some amount to the account of any depositor and then display
final information of that depositor.
4. Remove some amount from the account of any.
depositor and then display final information of that depositor.
5. Change the address of any depositor and then display the final
information of that depositor.
6. Randomly repeat these processes for some other
bank accounts.
*/


class Bank{
    private String name,add;
    private static int acc;
    private float bal;
    static{
        acc=1001;
    }
    Bank(String s ,String ad,float b){
        name=s;add=ad;bal=b;
    }
    public static void unique(){
        acc++;
    }
    public void display(){
        System.out.println(name+" "+add+" "+acc+" "+bal);
    }
    public void deposit(float d){
        bal=bal+d;
        System.out.println("Deposited successfully");
        display();
    }
    public void withdraw(float w){
        if(bal==0){
            System.out.println("zero amount");
        }
        else if(w>bal){
            System.out.println("not enough amount");
        }
        else{
            bal=bal-w;
            System.out.println("withdrew successfully ");
        }
        display();
    }
    public void changeAddress(String s){
        add=s;
        System.out.println("address changed successfully");
        display();
    }
}
public class BankDemo
{
	public static void main(String[] args) {
		Bank b=new Bank("Neha","Nagloi Chowk,Delhi",2000.50f);
		b.display();
		b.deposit(300.90f);
		b.withdraw(400.00f);
		b.changeAddress("Rohini,Delhi");
		Bank.unique();
		Bank b1=new Bank("Manish","Lodhi Colony,Dehli",4000.50f);
                b1.display();
		b1.deposit(200.90f);
		b1.withdraw(700.00f);
		b1.changeAddress("Patel Chowk,Dehli");

	}
}
