import java.util.*;
class m1{
    static Scanner sc = new Scanner(System.in);
    public static int add(int num1,int num2){
        return num1+num2;
    }
    public static void main(String[] args){
        System.out.print("Enter the number1: ");
        int a = sc.nextInt();
        System.out.print("Enter the number2: ");
        int b = sc.nextInt();
        int res = add(a,b);
        System.out.println("The additio of two numbers is "+res);

    }
}
class calculator{
    static Scanner sc = new Scanner(System.in);
    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a - b;
    }
    public static int mul(int a,int b){
        return a * b;
    }
    public static int div(int a,int b){
        return a/b;
    }
    public static int mod(int a,int b){
        return a % b;
    }
    public static void main(String[] args) {
        boolean flag = true;
        do{
            System.out.println("\t\t\tSelect the feature");
            System.out.println("---------------------------------------------");
            System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus\n6.Exit");

            int input = sc.nextInt();
            switch(input){
                case 1:{
                    System.out.print("Enter the number1 = ");
                    int a = sc.nextInt();
                    System.out.println();
                    System.out.print("Enter the number2 = ");
                    int b = sc.nextInt();
                   System.out.println("The addition of two numbers is "+add(a,b));
                    break;}
                case 2:{
                    System.out.print("Enter the number1 = ");
                    int a = sc.nextInt();
                    System.out.println();
                    System.out.print("Enter the number2 = ");
                    int b = sc.nextInt();
                   System.out.println("The subtraction of two numbers is "+sub(a,b));
                    break;}
                case 3:{
                    System.out.print("Enter the number1 = ");
                    int a = sc.nextInt();
                    System.out.println();
                    System.out.print("Enter the number2 = ");
                    int b = sc.nextInt();
                    System.out.println("The multiplication of two numbers is "+mul(a,b));
                    break;}
                case 4:{
                    System.out.print("Enter the number1 = ");
                    int a = sc.nextInt();
                    System.out.println();
                    System.out.print("Enter the number2 = ");
                    int b = sc.nextInt();
                    System.out.println("The division of two numbers is "+div(a,b));
                    break;}
                case 5:{
                    System.out.print("Enter the number1 = ");
                    int a = sc.nextInt();
                    System.out.println();
                    System.out.print("Enter the number2 = ");
                    int b = sc.nextInt();
                   System.out.println("The modulus of two numbers is "+mod(a,b)); 
                    break;}
                case 6:{
                    flag = false;
                    System.out.println("Thanks for using......");
                    break;}
            



            }


        }while(flag);
    }
}

class tables{
    public static void table(int num){
        for(int i = 1;i<=10;i++){
            System.out.println(i +" x "+num+" = "+num*i);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number table: ");
        int num = sc.nextInt();
        table(num);
    }
    
}

class m3{
    public static boolean isPrime(int num){
        if(num == 0 || num == 1){
            return false;
        }
        for(int i = 2;i<num;i++){
            if(num % i == 0){
                return false;
            }
            
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");;
        int num = sc.nextInt();
        boolean res = isPrime(num);
        if(res == true){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime.");
        }
    }

}

class m4{
    static Scanner sc = new Scanner(System.in);
    public static boolean isPalindrome(int num){
        int rev = 0,temp = num;
        while(num > 0){
            rev = rev*10 + num % 10;
            num /= 10;
        }
        if(rev == temp)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        boolean res = isPalindrome(n);
        if(res)
            System.out.println("The given number is palindrome.");
        else
            System.out.println("The given number is not a palindrome.");
    }
}

class m5{
    static Scanner sc = new Scanner(System.in);
    public static boolean isArmstrong(int num){
        int rem = 0,sum = 0,temp = num;
        while(num > 0){
            rem = num % 10;
            sum += rem*rem*rem;
            num /= 10;
        }
        if(temp == sum)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        boolean res = isArmstrong(n);
        if(res)
            System.out.println("Armstrong number.");
        else
            System.out.println("Not a Armstrong.");
    }
}

class m6{
    public static boolean isXylem(int num){
        int sum = num % 10;
        int m_sum = 0;
        num /= 10;
        while(num > 9){
            m_sum += num%10;
            num /= 10;
        }
        if((num + sum) == m_sum)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        boolean res = isXylem(n);
        if(res)
            System.out.println("The given number is Xylem");
        else
            System.out.println("The given number is phloem");

    }
}

class m7{
    public static int factorial(int num){
        int fact = 1;
        for(int i = 1;i<=num;i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("The factorial of the given number is "+factorial(num));
    }
}

class m8{
    public static boolean strongNumber(int num){
        int rem = 1;
        int sum = 0,fact = 1,temp = num;
        while(num > 0){
            rem = num % 10;
            for(int i = 1;i<=rem;i++){
                fact = fact * i;
            }
            sum+=fact;
            num /= 10;
            fact = 1;
        }
        if(sum == temp)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        boolean res = strongNumber(num);
        if(res)
            System.out.println("The given number is a strong number.");
        else
            System.out.println("The given number is not a strong number.");
    }
}

class m9{
    public static boolean perfectSquare(int num){
        for(int i = 1;i * i<=num;i++){
            if(i*i == num){
                return true;
            }
            
        }return false;
         
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        
        String res = (perfectSquare(sc.nextInt())) ? "Perfect Square" : "Not a perfect square";
        System.out.println(res);
    
    }
}

class m10{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter num1: ");
        int a = sc.nextInt();
        System.out.print("Enter num2: ");
        int b = sc.nextInt();
        System.out.print("Enter num3: ");
        int c = sc.nextInt();
        String res1 = largestOfThree(a,b,c);
        System.out.println(res1);
        String res2 = secondLargest(a,b,c);
        System.out.println(res2);
    }
    public static String largestOfThree(int num1,int num2,int num3){
        if(num1 > num2 && num1 > num3){
            return "A is greater.";
        }else if(num2 > num3){
            return "B is greater.";
        }else{
            return "C is greater.";
        }

    }
    public static String secondLargest(int a,int b,int c){
        if(a > b && b < c){
            return "B is the second largest number.";
        }
        else if (b > a && b < c){
            return "A is the second largest number.";
        }
        return "C is the second largest number.";
    }
}
