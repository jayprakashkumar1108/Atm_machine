
import java.util.Scanner;

class atm{
    float Balance;
    int pin = 2727;

    public void checkpin(){
        System.out.println("Enter your Pin: ");
        Scanner sc = new Scanner(System.in);
        int entered_pin = sc.nextInt();
        if(entered_pin == pin){
            menu();
        }
        else{
            System.out.println("Enter a valid pin");
        }
    }
    public void menu(){
        System.out.println("Enter your choice: ");
        System.out.println("1.Check A/C Balance");
        System.out.println("2.Withdraw Money ");
        System.out.println("3.Deposit Money");
        System.out.println("4.Exit");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if( option == 1){
            checkBalance();
        } else if (option == 2) {
            withdrawMoney();

        } else if (option == 3) {
            depositMoney();

        } else if (option == 4) {
            return;
        }
        else{
            System.out.println("Enter a valid choice");
        }

    }
    public void checkBalance(){
        System.out.println("Balance: " + Balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter amount to Withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else{
            Balance = Balance - amount;
            System.out.println("Money Withdrawl successfully");
        }
        menu();
    }
    public void depositMoney(){
        System.out.println("Enter the amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited Successfully");
        menu();
    }
}

public class atm_machine {
    public static void main(String[] args) {

        atm obj = new atm();
        obj.checkpin();

    }
}
