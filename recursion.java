import java.util.*;
class r1{
    static Scanner sc = new Scanner(System.in);
    static int start = 100,end = 1;
    public static void r1(){
        if(start >= end){
            if(start%2 == 1)
            System.out.print(start + " ");
            start--;
            r1();
        }
    }
    public static void main(String[] args){
        r1();
    }
}

class r2{
    static int start = 1,end = 100;
    public  static void r2(){
        if(start <= end){
            if(start % 2 == 0)
             System.out.print(start+" ");
             start++;
            r2();
        }
        
    }
    public static void main(String[] args){
        r2();
    }
}

class r3{
    static char start = 'Z',end = 'A';
    public static void r3(){
        if(start >= end){
            System.out.print(start+" ");
            start--;
            r3();
        }
    }
    public static void main(String[] args) {
        r3();
    }

}

class r4{
    static Scanner sc = new Scanner(System.in);
    static int start = 1,end= 10;
    public static void r4(int n){
      if(start <= end){
        System.out.println(start+" x "+n+" = "+(start*n));
        start++;
        r4(n);
      }  
    }
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        r4(n);
    }
}

//WAJP to find the given number is spy number or not without using loop.
class r5{
    static Scanner sc = new Scanner(System.in);
    static int sum = 0,prod = 1,rem;
    public static boolean r5(int n){
        if(n > 0){
            rem = n%10;
            sum+=rem;
            prod*=rem;
            n/=10;
            r5(n);
        }
        if(sum == prod)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        boolean res = r5(n);
        System.out.println(res? "Spy":"not a spy");
    }
}

//WAJP to find the given number is neon number or not.
class r6{
    static Scanner sc = new Scanner(System.in);
    static int sum,rem;
    public static boolean r6(int n,int sqrt){
        if(sqrt > 0){
            rem = sqrt % 10;
            sum += rem;
            sqrt /= 10;
            r6(n,sqrt); 
        }
       
        if(sum == n)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int sqrt = n*n;
        System.out.println((r6(n,sqrt)?"Neon":"Normal"));
    }
}

//WAJP to find the given number is armstrong or not.
class r7{
    static Scanner sc = new Scanner(System.in);
    static int sum,rem;
    public static boolean r7(int n,int temp){
        if(n > 0){
            rem = n%10;
            sum += rem * rem * rem;
            n /= 10;
            r7(n,temp);
        }
        if(sum == temp)
            return true;
        else
            return false;

    }
    public static void main(String[] args){
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int temp = n;
        boolean res = r7(n,temp);
        System.out.println(res?"Armstrong":"Not an Armstrong");
    }
}

/* Find the factorial of the number without using loop. */

class r8{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        facto(n);
    }
    public static void facto(int n){
        int fact = 1,i = 1;
        if(i<=n){
            fact = fact*i;
            i++;
            facto(n);
        }
        System.out.println(fact);
    }
}