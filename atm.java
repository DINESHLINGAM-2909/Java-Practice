import java.util.*;
/*class atm{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String u_name = "Dinesh";
        String p_word = "1234";
        int num = 1;
        while(num == 1){
            System.out.print("Enter the username: ");
            String e_name = sc.nextLine();
            System.out.print("Enter the password: ");
            String e_word = sc.nextLine();
            System.out.println("Processing...");
            Thread.sleep(2000);
            if(u_name.equals(e_name) && p_word.equals(e_word)){
                int num1 = 1;
                while(num1 == 1){
                System.out.println("\t\t\tWelcome!!!");
                System.out.println("\t\t\tSelect the operation:");
                System.out.println("-----------------------------");
                System.out.println("1.Deposit\n2.Withdraw\n3.Check balance");
                int choice = sc.nextInt();
                double balance = 10000;
                double c_balance = balance;
                switch(choice){
                    case 1:{
                        System.out.print("Enter your amount to deposit:");
                        double deposit = sc.nextDouble();
                        balance += deposit;
                        c_balance = balance;
                        System.out.println(deposit+".rs was successfully credited to your account.");
                        break;
                    }
                    case 2:{
                        System.out.print("Enter the amount to withdraw:");
                        double withdraw = sc.nextDouble();
                        if(withdraw > balance){
                            System.out.println("Insufficient balance.");
                        }else{
                            balance -= withdraw;
                            c_balance = balance;
                            System.out.println(withdraw +".rs was debited your account");
                        }
                        break;
                    }
                    case 3:{
                        System.out.println("Your current balance is "+c_balance);
                        break;
                    }
                    default:{
                        System.out.println("Invalid option.");
                    }
                }
                System.out.println("Enter 1 to continue and 0 to exit.");
                num1 = sc.nextInt();
                }
            }else{
                System.out.println("\t\t\tInvalid Credentials...");
            }
            System.out.println("Enter 1 to continue and 0 to exit.");
            num = sc.nextInt();
            sc.nextLine();

        }
    }
}*/
class atm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
    }
}