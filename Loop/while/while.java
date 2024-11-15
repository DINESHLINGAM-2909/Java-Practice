import java.util.*;
/*WAJP to print first 10 odd numbers,first 10 even numbers,first 10 natural numbers and first 10 whole numbers. */
class w1{
    public static void main(String[] args)throws Exception {
        int odd = 1;
        System.out.print("The odd numbers are : ");

        while(odd <= 20){
            System.out.print(odd + " ");
            odd+=2;
        }
        System.out.println();
        Thread.sleep(2000);
        int even = 2;
        System.out.print("The even numbers are : ");
        while(even <= 20){
            System.out.print(even + " ");
            even += 2;
        }
        System.out.println();
        Thread.sleep(2000);
        int nat = 1;
        System.out.print("The natual numbers are : ");
        while(nat <= 10){
            System.out.print(nat+" ");
            nat += 1;

        }
        System.out.println();
        Thread.sleep(2000);
        int whole = 0;
        System.out.print("The whole numbers are: ");
        while(whole <= 10){
            System.out.print(whole+" ");
            whole += 1;
        }
    }

}

/*WAJP to print first 10 integers and their squares. */
class w2{
    public static void main(String[] args){
        int num = 1;
        while(num <= 10){
            System.out.println(num+" "+(num * num));
           
            num += 1;
        }
    }
}

/*WAJP to print the following series.1,2,3...........300 */
class w3{
    public static void main(String[] args) {
        int n = 1;
        while(n < 300){
            System.out.print(n++ + ", ");
            
        }
    }
}

/*WAJP to print the following series. 105,98,91,84......7 */
class w4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n >= 7){
            System.out.print(n+" ");
            n-=7;
        }
    }
}

/*WAJP to print the first 10 natural numbers in reverse order. */
class w5{
    public static void main(String[] args) {
        int n = 10;
        while (n >= 1){
            System.out.print(n-- + " ");
        }
    }
}

/* WAJP to print sum of fist 10 natural numbers. */
class w6{
    public static void main(String[] args){
        int n = 1;
        int sum = 0;
        while(n <= 10){
            sum = sum + n;
            n++;
        }
        System.out.println(sum);
    }
}

/*WAJP to print sum of first 10 even numbers. */
class w7{
    public static void main(String[] args){
        int n = 2;
        int sum = 0;
        while(n <= 20){
            sum += n;
            n = n + 2;
        }System.out.println(sum);

    }
}

/* WAJP to print the table from get the input from an user. */
class w8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int n = 1;
        while (n <= 10){
            System.out.println(n+" x "+num+" = "+ n * num);
            n += 1;

        }

    }
}

/*WAJP to print all even numbers falls between the two numbers of user input. */
class w9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(a <= b){
            if(a % 2 == 0){
                System.out.print(a+" ");
            }
            a++;
            
        }

    }
}

/*WAJP to find the given number is prime number or not. */

class w10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int i = 2;
        boolean flag = false;
        if(num == 0 || num == 1){
            System.out.println("The number is not a prime number");
        }else{
            while(i < num){
                if(num%i == 0){
                   flag = true;
                }
                i++;
            }if(flag){
                System.out.println("The number is not a prime number.");
            }else{
                System.out.println("The number is a prime number.");
            }
        }
        
    }
}

/*WAJP to print the sum of digits of the given number. */
class w11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        int rem = 0;
        while(num > 0){
            rem = num % 10;
            sum += rem;
            num /= 10;
        }System.out.println(sum);
    }
}

/*WAJP to find the product of the digits of a number. */

class w12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int rem = 0;
        int product = 1;
        while (n > 0){
            rem = n % 10;
            product *= rem;
            n/=10;
        }System.out.println("The product of the given number is = "+ product);
    }
}

/*WAJP to accept the number and reverse the number. */
class w13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt(); 
        int rem = 0;
        int rnum = 0;
        while(n > 0){
            rem = n % 10;
            rnum = rnum * 10 + rem;
            n/=10;
        }  System.out.println(rnum);
    }
}

/*WAJP to find the factorial of a given number. */
class w14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int i = 1;
        int fact = 1;
        while(i <= n){
            fact = i * fact;
            i+=1;
        }System.out.println(fact);
       
   }
}

/*WAJP to find the given number is armstrong number or not. */
class w15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int num = n;
        int sum = 0;
        int rem = 1;
        while (n > 0){
            rem = n % 10;
            sum = sum + (rem*rem*rem);
            n = n/10;

        }System.out.println(sum);
        System.out.println(num);
        if(sum == num){
            System.out.println("The given number is an armstrong number.");
        }else{
            System.out.println("The given number is not an armstrong number.");
        }
    }
}

/*WAJP to print the sum of all numbers to user entered. */
class w16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = 'Y';
        int sum = 0;
        while (ch == 'Y') {
            System.out.println("Enter number: ");
            int n = sc.nextInt();
            sum = sum + n;
            System.out.println("Do you want to cotinue press 'Y' else press 'N'?");
            ch = sc.next().charAt(0);

            
        }System.out.println("The sum of the user entered number is "+ sum);

    }
}

/*WAJP to print the count of positive and negative number the user entered until the zero. */

class w17{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pos_count = 0;
        int neg_count = 0;
        int n = 1;
        while(n != 0){
            System.out.println("Enter the number: ");
            n = sc.nextInt();
            if (n > 0){
                pos_count++;
            }else if (n < 0){
                neg_count++;
            }
        }System.out.println("The positive number count is "+ pos_count);
System.out.println("The negative number count is "+ neg_count);

    }
}

/*WAJP to get 10 numbers from the user and print the average of 10 numbers. */
class w18{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i = 1;
        while (i <= 10){
            System.out.println("Enter the number: ");
            int num = sc.nextInt();
            sum += num;
            i++;
        }double avg = sum/10;
        System.out.println("The average of 10 numbers is "+ avg);
    }
}

class w19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int n = sc.nextInt();
        switch(n){
            case 1:{
                char ch = 'A';
                while(ch <= 'Z'){
                    System.out.print(ch + " ");
                    ch++;
                }
                break;
            } 
            case 2:{
                char ch = 'a';
                while(ch <= 'z'){
                    System.out.print(ch +" ");
                    ch++;
                }
                break;
            }
            case 3:{
                int num = 100;
                while(num >= 1){
                    System.out.print(num +" ");
                    num--;
                }
                break;

            }
            default:{
                System.out.println("You enter the wrong choice.");
            }
        }
    }
}

/*WAJP to print the sum of first and last digit in the given number. */
class w20{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int num1 = num;
        if (num>=0 && num <= 9){
            System.out.println("Invalid");
        }else{
            int lastDigit = num % 10;
            while(num > 9){
                num /= 10;
            }
            int sum = num + lastDigit;
            System.out.println("The sum of first and last digit is " +sum);
        }
    }
}

class w21{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int sum1 = 0,sum2 = 0;
        int n = num;
        while(n != 0){
            if(n == num || n < 10){
                sum1 += n%10;
            }else{
                sum2 += n%10;
            }
            n /= 10;
        }System.out.println("The first and last digit sum is : "+ sum1);
        System.out.println("The middle digits sum is : "+ sum2);
        if(sum1 == sum2)
            System.out.println("The number is Xylem");
        else
            System.out.println("The number is Phloem.");


    }
}


/*WAJP to find the number is palindrome or not */
class w22{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int temp = num;
        int rnum = 0;
        while(num > 0){
            rnum = rnum*10 + num%10;
            num /= 10;
        }if(temp == rnum){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}

class w23{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while(num > 0){
            
            
            sum += num%10;
            num/=10;
        }
        System.out.println("The sum of given numbers is "+ sum);
    }
}

class w24{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int e_sum = 0;
        int rem = 0;
        while(num > 0){
            rem = num%10;
            if(rem%2 == 0){
                e_sum += rem;
            }
            num /= 10;

        }System.out.println(e_sum);
    }
}

/*WAJP to display all the numbers which are divisible by 13 and not by 3 between 100 to 300. */
class w25{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = 100;
        int end = 300;
        while(start <= end){
            if(start % 13 == 0 && start % 3 != 0){
                System.out.print(start+" ");
            }start++;
        }
    }
}

/*WAJP to print the following series 2,22,222,2222,22222 */
class w26{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char c = '2';
        int i = 0;
        while(i < num) {
           System.out.print(c + ", ");
           
           i++;
        }
    }
}

/* WAJP to print following series 1,4,9,16,25,36.......n */
class w27{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        while(i <= num){
            System.out.print(i*i + " ");
            i++;
        }
    }
}

/* WAJP to find the sum of the following series 1 + 8 + 27 +..........n. */
class w28{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        int temp = 0;
        while(i <= n){
            temp = i*i*i;
            System.out.print(temp+" ");
            sum += temp;
            i++;

        }System.out.println();
        System.out.println("The sum of the given series is "+ sum);
    }
}

/*WAJP to print the sum of the following series 1+2+6+24......n. */
class w29{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch = 'A';
        char ch1 = 'Z';
        while(ch <= ch1){
            System.out.print(ch+ " ");
            ch++;
        }
    }
}
