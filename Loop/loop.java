import java.util.*;
/* Write a program to print all alphabets from a to z */
class l1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(char ch = 'z';ch>='a';ch--){
            System.out.print(ch+" ");
        }

    }
    
}

/* Write a program to print all natural numbers in reverse. */
class l2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);;
        int num = 10;
        for(int i = num;i >= 1;i--){
            System.out.print(i + " ");
        }
    }
}
 
/* Write a program to print tables. */
class l3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        for(int i = 1;i <= 10;i++){
            System.out.println(i +" x "+ num +" = "+ num * i);
        }
    }
}

/* Write a program to print reverse tables. */ 
class l4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        for(int i = 10;i >= 1;i--){
            System.out.println(i +" x "+num+" = "+num*i);
        }
    }
}

/* Write a program to print all alphabets from a to z. */
class l5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch = 'a';
        for(ch = 'a';ch<='z';ch++){
            System.out.print(ch+" ");
        }
    }
}

/* Write a program to print reverse alphabets from Z to A. */
class l6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch = 'Z';
        for(ch = 'Z';ch >= 'A';ch--){
            System.out.print(ch+" ");
        }
    }
}

/* Write a program to print all even numbers between 1 to 100 */

class l7{
    public static void main(String[] args){
        int num = 100;
        for(int i = num;i>=1;i--){
            if(i % 2 == 0){
                System.out.print(num+" ");
            }

        }
        
    }
}

/*Write a program to print all odd number between 1 to 100 */
class l8{
    public static void main(String[] args) {
        int num = 100;
        for(int i = num; i > 0;i--){
            if(i % 2 != 0)
                System.out.print(i + ", ");
        }
    }
}

/*Write a program to find sum of all natural numbers between 1 to n. */
class l9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1;i<=num;i++){
          sum += i;
          
        }System.out.println(sum);
    }
}

/*Write a program to find sum of all even numbers between 1 to n */
class l10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1;i<=n;i++){
            if(i%2 == 0)
                sum+=i;
        }System.out.println(sum);
    }
}

/* Write a program to find sum of all odd numbers between 1 to n */
class l11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1;i<=n;i++){
            if(i%2 != 0)
                sum += i;
        }
        System.out.println(sum);
    }
}

 /* Write a program to print the ASCII values. */
 class l12{
    public static void main(String[] args) {
        for(int s = 1;s<=255;s++){
            System.out.print((char)s +", ");
        }
        
    }
 }

/* Write a program to find the factorial value of any number */
class l13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i = 1;i<=n;i++){
            fact = fact*i;
        }System.out.println(fact);
    }
}

/*  write a program to reverse the given Digits */
class l14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int rem = 0;
        int rev = 0;
        while(num > 0){
            rem = num%10;
            rev = rev * 10 + rem;
            num /= 10;

        }System.out.println(rev);
    }
}

/* write a program to sum of its Digits  */ 
class l15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        int sum = 0;
        int rem = 0;
        while(num > 0){
            rem = num % 10;
            sum+=rem;
            num /= 10;
        }System.out.println(sum);
    }
}

/*write a program to Check Whether a Given Number is Prime or Not */
class l16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int count = 0;
        if(n == 0 || n == 1){
            System.out.println("Not a prime.");
        }else{
            for(int i = 2;i<n;i++){
                if(n % i == 0){
                    count++;
                }
            }
        }
        if(count == 0){
            System.out.println("Prime number");
        }else{
            System.out.println("Not a prime number.");
        }
    }
}

/* Write a program to calculate HCF of Two given number. */
class l17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number 2: ");
        int num2 = sc.nextInt();
        int rem,hcf = 0;
        do{
            rem = num1 % num2;
            if(rem == 0){
                hcf = num2;
            }else{
                num1 = num2;
                num2 = rem;
            }
        }while(rem != 0);
        System.out.println("The HCF of given two numbers: "+hcf);
    }
}



/*. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered */
class l18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int p_count = 0;
        int n_count = 0;
        int z_count = 0;
        do{
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            if(num > 0)
                p_count++;
            else if(num < 0)
                n_count++;
            else
                z_count++;
            System.out.print("enter 1 to continue.");
            n = sc.nextInt();

        }while(n == 1);
        System.out.println(p_count);
        System.out.println(n_count);
        System.out.println(z_count);
    }
}

/* Write a program to find number and sum of all integer between 100 and 200 which are divisible by 9 */
class l19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 100;i<200;i++){
            if(i % 9 == 0){
                sum += i;
            }
        }System.out.println(sum);
    }
}

/* Write a program to check whether a number is a Strong Number or not. */
class l20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int rem = 0,sum = 0,fact = 1;
        int n1 = num;
        while(num > 0){
            rem = num % 10;
            for(int i = rem;i > 1;i--){
                fact *= i;
            }
            sum += fact;
            num /= 10;
            fact = 1;

        }
        System.out.println("The sum is "+ sum);
        if(n1 == sum)
            System.out.println("Strong number");
        else
            System.out.println("Not a strong number");        
    }
}

/* Write a program to print fibonacci series upto n terms */

class l21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int f_num = 0,s_num = 1,n_num = 0;
        for(int i = 0;i <= num;i++){
            n_num = f_num + s_num;
            System.out.print(f_num +", ");
            f_num = s_num;
            s_num = n_num;
            
        }
    }
}

/* Write a Program to check perfect numbers or Not. */
class l22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1;i < num;i++){
            if(num%i == 0){
                sum += i;
            }
        }
        System.out.println(sum);
        if(num == sum){
            System.out.println("Perfect number.");
        }else{
            System.out.println("Not a perfect number.");
        }
    }
}

/* Write a Program to check Armstrong numbers or Not.  */
class l23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        int rem = 0;
        int temp = num;
        while(num > 0){
            rem = num % 10;
            sum += (rem*rem*rem);
            num /= 10;
        }
        if(temp == sum){
            System.out.println("Armstrong number.");
        }else{
            System.out.println("Not an armstrong number.");
        }
    }
}

class l24{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        boolean res = perfect(n);
        if(res){
            System.out.println("Pefect number.");
            int res1 = factorial(n);
            System.out.println("Factorial of the number is = "+res1);
        }else{
            System.out.println("Not a perfect number.");
            boolean res2 = strongNum(n);
            System.out.println(res2?"Strong number.":"Not a Strong number.");
        }

    }
    public static boolean perfect(int n){
        int num = n/2;
        int i = 1;
        int sum = 0;
        while(i <= num){
            if(n%i == 0){
                sum += i;
            }
            i++;
        }
        if(sum == n)
            return true;
        else
            return false;
    }
    public static int factorial(int n){
        int fact = 1;
        int i = 1;
        while(i<=n){
            fact = fact*i;
            i++;
        }
        return fact;
    }
    public static boolean strongNum(int n){
        int temp = n;
        int rem = 0,sum = 0,i = 1,fact = 1;
        while(n > 0){
            rem = n%10;
            while(i<=rem){
                fact = fact*i;
                i++;
            }
            sum+=fact;
            i = 1;
            fact = 1;
            n/=10;
        }
        if(sum == temp)
            return true;
        else
            return false;
    }
}




































