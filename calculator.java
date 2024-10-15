import java.util.*;
class calculator{
static Scanner sc = new Scanner(System.in);
public static void main(String[] args)throws Exception{
    System.out.println("\t\t\tWelcome to calculator application....:)");
    Thread.sleep(3000);
    boolean choice = true;
    do{   
    System.out.println("Select the operation>>>>>");
    System.out.println("-------------------------------");
    System.out.println("1.Addition\n2.Substraction\n3.multiplication\n4.Division\n5.Modulus\n6.isPrime\n7.isPalindrome\n8.Square\n9.Exit");
    int input = sc.nextInt();
    switch(input){
        case 1:{
            System.out.print("Enter a:");
            int a = sc.nextInt();
            System.out.print("Enter b: ");
            int b = sc.nextInt();
            System.out.println("\t\t\tThe addition of two numbers is "+add(a,b));
            Thread.sleep(2000);
            break;}
        case 2:{
            System.out.print("Enter a:");
            int a = sc.nextInt();
            System.out.print("Enter b: ");
            int b = sc.nextInt();
            System.out.println("\t\t\tThe subtraction of two numbers is "+sub(a,b));
            Thread.sleep(2000);
            break;}
        case 3:{
            System.out.print("Enter a:");
            int a = sc.nextInt();
            System.out.print("Enter b: ");
            int b = sc.nextInt();
            System.out.println("\t\t\tThe multiplication of two numbers is "+mul(a,b));
            Thread.sleep(2000);
            break;}
        case 4:{
            System.out.print("Enter a:");
            int a = sc.nextInt();
            System.out.print("Enter b: ");
            int b = sc.nextInt();
            System.out.println("\t\t\tThe division of two numbers is "+div(a,b));
            Thread.sleep(2000);
            break;}
        case 5:{
            System.out.print("Enter a:");
            int a = sc.nextInt();
            System.out.print("Enter b: ");
            int b = sc.nextInt();
            System.out.println("\t\t\tThe modulus of two numbers is "+mod(a,b));
            Thread.sleep(2000);
            break;}
        case 6:{
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            System.out.println("\t\t\tThe given number is "+(isPrime(num)?"Prime":"Not prime") );
            Thread.sleep(2000);
            break;}
        case 7:{
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            System.out.println("\t\t\tThe given number is "+(isPalindrome(num)?"Palindrome":"Not a palindrome") );
            Thread.sleep(2000);
            break;}
        case 8:{
            System.out.println("Enter the number: ");
            int num = sc.nextInt();
            System.out.println("\t\t\tThe square of the number is: "+square(num));
            Thread.sleep(2000);
            break;}
        case 9:{
            choice = false;
            break;}
        default:{
            System.out.println("\t\t\tInvalid input selection.Plz try again");
            break;}
    }

    }while(choice);
    Thread.sleep(2000);
    System.out.println("\t\t\tThanks for using application...:)");
    }//end of main method
    public static int add(int a,int b){
        return a+b;
    }//end of add.
    public static int sub(int a,int b){
        return a-b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static int div(int a,int b){
        return a/b;
    }
    public  static int mod(int a,int b){
        return a%b;
    }
    public static boolean isPrime(int num){
        if(num == 0 || num == 1){
            return false;
        }else{
            for(int i = 2;i<num;i++){
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        }
        
        }
        public static boolean isPalindrome(int num){
            int rem = 0,rev = 0,temp = num;
            while(num > 0){
                rem = num%10;
                rev = rev*10+rem;
                num /= 10;
            }
            if(rev == temp)
                return true;
            else
                return false;
        }
        public static int square(int num){
            return num * num;
        }
}