import java.util.*;
class f1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numer 1: ");
        int a = sc.nextInt();
        System.out.print("Enter the numer 2: ");
        int b = sc.nextInt();
        for(int i = a;i<=b;i++){
            if(i%2 == 0){
                System.out.print(i+" ");
            }
        }

    }
}

class f2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        for(int i = n; i >= 1;i--){
            if(i % 2 != 0){
                System.out.print(i);
            }
        }
    }
}

class f3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1;i<=n;i++){
            sum += i;
        }
        System.out.println("The sum of natural numbers is: "+sum);
    }
}

class f4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = (n*(n+1))/2;
        System.out.println("The sum of natural numbers is "+ sum);
    }
}

class f5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for(int i = 1;i<=10;i++){
            System.out.println(i + " x " + n + " = " + (n*i));
        }
    }
}

/* WAJP to convert the number into decimal to binary. */
class f6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Decimal number: ");
        int num = sc.nextInt();
        int sum = 0;
        int x = 1;
        for(int i = num;i>0;sum+=i%2*x,i/=2,x*=10){

        }System.out.println("Binary num is :"+sum);
    }
}

/*WAJP to convert the binary number into decimal. */
class f7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        int x = 1;
        for(int i = num;i>0;sum+=i%10 * x,i/=10,x*=2){

        }System.out.println(sum);
    }
}

/* WAJP to find the factorial of a given number. */
class f8{
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int fact = 1;
    for(int i = 1;i<=n;i++){
        fact = fact*i;
    }
    System.out.println(fact);
   }
}

/*WAJP to find the given number is spy number or not.g*/
class spyNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        int product = 1;
      while(num > 0){
            int rem = num%10;
            sum += rem;
            product *= rem;
            num/=10;
        }
        System.out.println("The sum of the number is: "+sum);
        System.out.println("The product of the number is: "+product);
        if(sum == product){
            System.out.println("Spy number");
        }else{
            System.out.println("Not a spy number");
        }

    }
}
/* WAJP to check whether the given number is neon number or not. */
class neon{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int num = sc.nextInt();
        int sqrt = num * num;
        int sum = 0;
        while(sqrt > 0){
            int rem = sqrt % 10;
            sum += rem;
            sqrt /= 10;

        }System.out.println("The sum of the number is "+ sum);
        if (sum == num){
            System.out.println("The given number is neon number.");
        }else{
            System.out.println("It is not a neon number.");
        }
    }
}

class armstrongNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int temp = num;
        int rem = 0;
        int arm = 0;

        while(num > 0){
            rem = num % 10;
            arm += rem*rem*rem;
            num /= 10;
        }
        if(temp == arm){
            System.out.println("The number is an armstrong number.");
        }
        else{
            System.out.println("The number is not an armstrong number.");
            
        }
    }
}

class fibonacciSeries{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int firstNum = 0,secondNum = 1;
        int nextNum;
        for(int i = 1;i < num;i++){
            System.out.print(firstNum+", ");
            nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}

class namePattern{
    public static void main(String[] args) {
        int n = 7;
        for(int i = 0;i<n;i++){
            for(int j = 0;j < n;j++){
                if(i == 0 || i == n-1 || j == 1 || j == n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }System.out.print("  ");
            for(int j = 0;j < n;j++){
                if(i == 0 || i == n-1 || j == n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }System.out.print("  ");
            for(int j = 0;j < n;j++){
                if(i == 0 || i == n-1 || j == n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }System.out.print("  ");
        
        }
    }
}

class alphabet{
    public static void main(String[] args) {
        char ch = 'A';
        int n = 5;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
              
                System.out.print(ch++ +" ");
                
            }
            ch = 'A';
            System.out.println();
        }
    }
}

class p2{
    public static void main(String[] args) {
        char ch = 'A';
        int n = 5;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i%2 == 0){
                    System.out.print(j + 1 + " ");
                }else{
                    System.out.print(ch++ +" ");

                }
                
                
            }
            
            ch = 'A';
            System.out.println();
        }
    }
}

class p3{
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';
        int num = 4;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(j <= n/2){
                    System.out.print(ch++ +" ");
                }else{
                    System.out.print(num++ + " ");
                }
            }
            num = 4;
            
            System.out.println();
        }
    }
}

class p4{
    public static void main(String[] args) {
        int n = 7;
        char ch = 'A';
        for(int i = 0;i<n;i++){
            for(int j = 0;j < n;j++){
                if(i == 0 || i == n-1 || j == 0 || j  == n-1)
                    System.out.print(ch++ + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

class p5{
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                if(true)
                    System.out.print(ch++ + " ");
                if(ch == '4')
                    ch = 'A';
                if(ch == 'E')
                    ch = '1';
            }System.out.println();
        }
    }
}

class p6{
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';
        for(int i = 0;i < n;i++){
            for(int j = 0,m = 5;j<n;j++,m--){
                if(i == j)
                    System.out.print(ch++ + " ");
                else
                    System.out.print(m+" ");
            }System.out.println();
        }
    }
}

class p7{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0;i < n;i++){
            for(int j = 0,m = 5;j<n;j++,m--){
                if(i == j)
                    System.out.print("  ");
                else
                    System.out.print(m+" ");
            }System.out.println();
        }
    }
}

class p8{
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';
        for(int i = 0;i<n;i++){
            for(int j = 0,m=5;j<n;j++,m--){
                if(i+j == n-1)
                    System.out.print(m+" ");
                else
                    System.out.print(ch++ + " ");
            }ch = 'A';
            System.out.println();
        }
    }
}

class p9{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0;i < n;i++){
            for(int j = 0;j<n;j++){
                if(j == 0 || i == n-1 || i == j || (j == 1 && i != 0) || (i <= n/2 && j == n/2))
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }System.out.println();
        }
    }
}

class p10{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i >= j){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
    }
}

class p11{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0;i<n;i++){
            for(int j = 0;j < n;j++){
                if(i >= j)
                    System.out.print(j+1+" ");
                else
                    System.out.println(" ");
            }System.out.println();
        }
    }
}

class p12{
    public static void main(String[] args) {
        int n = 5,k=1;
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                if(i+j >= n-1)
                    System.out.print(k++ +" ");
                else
                    System.out.print("  ");

            }System.out.println();
            k = 1;
        }
    }
}

class p13{
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i+j <= n-1)
                    System.out.print(ch++ + " ");
                else
                    System.out.print("  ");
            }System.out.println();
            ch = 'A';
        }
    }
}

class p14{
    public static void main(String[] args) {
        int n = 5;
        int k = 1;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i >= j)
                    System.out.print(k++ +" ");
                else
                    System.out.print("  ");

            }System.out.println();
            k = 2;
        }
    }
}

class p15{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0;i<5;i++){
            for(int j = 0;j < n;j++){
                if(i <= j &&i+j <= n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }System.out.println();
        }
    }
}

class p16{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if((i <= j && i+j <= n-1) || (i+j >= n-1 && i >= j))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }System.out.println();
        }
    }
}

class p17{
    public static void main(String[] args) {
        int n = 5,k=1;
        for(int i = 0;i<n;i++){
            for(int j = 0;j < n;j++){
                if(i >= j && i+j >= n-1)
                    System.out.print(k++ +" ");
                else
                    System.out.print("  ");
            }System.out.println();
            k = 1;
        }
    }
}

class p18{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if((i >= j && i+j >= n-1) || (i<=j && i+j <= n-1))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }System.out.println();
        }
    }
}
class p19{
    public static void main(String[] args) {
        int n = 5;
        char ch= 'T',ch1 = '$';
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i==j)
                    System.out.print(ch+" ");
                else
                    System.out.print(ch1+" ");
            }System.out.println();
        }
    }
}

class p20{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i+j == n-1)
                    System.out.print("$ ");
                else
                    System.out.print("A ");
            }System.out.println();
        }

    }
}

class p21{
    public static void main(String[] args) {
        int n = 5,k = 1,l = 5;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i%2 == 0)
                    System.out.print(k++ + " ");
                else
                    System.out.print(l-- + " ");
            }System.out.println();
            k = 1;
            l = 5;
        }
    }
}





























