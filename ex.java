import java.util.*;

//2. Write a Java program to print the sum of two numbers.


class ex2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("The sum of two numbers is "+ (a + b));
    }
}

/*3. Write a Java program to divide two numbers and print them on the screen.
Test Data :
50/3*/
 
class ex3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a/b;
        System.out.println(c);
    }
   
}

/*
4. Write a Java program to print the results of the following operations.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3  */

class ex4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(-5+8*6);
        System.out.println((55+9) % 9);
        System.out.println(20 + -3*5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }
}

/*Write a Java program that takes two numbers as input and displays the product of two numbers.
 */

 class ex5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a*b;
        System.out.println(product);
    }
 }

 /*Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149 */

class ex6{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();;
        System.out.println(a +"+"+ b +"="+ (a+b));
    }
}

/* Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80 */

class ex7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=10;i++){
            System.out.println(n +"*"+ i +"="+ (n*i));
        }
    }
}

/* Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586

 */

 class ex8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float r = 7.5f;
        System.out.println("Area is ="+3.14*(r*r));
        System.out.println("Perimeter is ="+ 2*3.14*r);

    }
 }

 /*9.Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 */

 class ex9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        int avg = sum/2;
        System.out.println(avg);

    }
 }

 /*Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5


Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20 */

class ex10{
    public static void main(String[] ags){
        Scanner sc = new Scanner(System.in);
        double width = sc.nextDouble();
        double Height = sc.nextDouble();
        System.out.println("Area is "+ width + "*" + Height + "=" + width*Height);
        System.out.println("Perimeter is 2 * (" + width+ "+" +Height+") =" + (2*(width+Height)));

    }
}

class ex11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1:");
        int a = sc.nextInt();
        System.out.println("Enter the number 2:");
        int b = sc.nextInt();
        System.out.println("Enter the number 3:");
        int c = sc.nextInt();
        System.out.println("Enter the number 4:");
        int d = sc.nextInt();
       
        if(a>b && a>c && a>d){
           
            System.out.println(a+" :is Greater.");
        }else if(b>c && b>d){
            System.out.println(b+" :is Greater.");
            
        }else if(c>d){
            System.out.println(c+" :is Greater.");
           
        }else {
            System.out.println(d+" :is Greater.");
            
        }

    }
}

class ex12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch >= '0' && ch <= '9'){
            System.out.println(ch+" :The character is an integer.");
        }
        else if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'U' || ch == 'u'){
            System.out.println(" the characte is Vowel");
        }
        else if(ch != 'A' || ch != 'a' || ch != 'E' || ch != 'e' || ch != 'I' || ch != 'i' || ch != 'O' || ch != 'U' || ch != 'u'){
                System.out.println(" the character is consonant.");
        }else{
            System.out.println(" the character is special character.");
        }
    }    
}

class ex13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the a:");
        int a = sc.nextInt();
        System.out.print("Enter the b:");
        int b = sc.nextInt();
        System.out.print("Enter the c:");
        int c = sc.nextInt();

        if((a>b && a<c) || (a<b && a>c)){
            System.out.println(a+" is the second largest number.");
        }else if((b>c && b<a) || (b<c && b>a)){
            System.out.println(b+" is the second largest number.");
        }else{
            System.out.println(c+" is the second largest number.");
        }


    }
}

class ex14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the skil\n1.Java\n2.Testing");
        int skil = sc.nextInt();
        switch(skil){
            case 1:{
                System.out.println("Select the java faculty.\n1.Shambu\n2.Tabrez\n3.Nandhini\n4.Surya");
                int faculty = sc.nextInt();
                switch(faculty){
                    case 1 : System.out.println("Java : Shambu");
                    break;
                    case 2 :System.out.println("Java : Tabrez");
                    break;
                    case 3 : System.out.println("Java : Nandhini");
                    break;
                    case 4 : System.out.println("Java : Surya");
                    break;
                    default: System.out.println("Invalid faculty selection.");
                    break;

                            }
                        }break;
            case 2:{
                System.out.println("Select the testing faculty:\n1.Harsha\n2.Nagaraj\n3.Neeraj\n4.Bharath");
                int faculty = sc.nextInt();
                switch (faculty){
                    case 1 : System.out.println("Testing : Hasha");
                    break;
                    case 2 :System.out.println("Testing : Nagaraj");
                    break;
                    case 3 : System.out.println("Testing : Neeraj");
                    break;
                    case 4 : System.out.println("Testing : Bharath");
                    break;
                    default: System.out.println("Invalid faculty selection.");


                }
            }
        default: System.out.println("Invalid skil selection.");
        }
    }
}

/*sum of digits */
class ex15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        while(temp != 0){
            int rem = temp % 10;
            sum += rem;
            temp/=10;
        }System.out.println(sum);
    }
}

/*WAJP to print the even digit count,odd digit count and zero count in the given number. */
class ex16{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int odd_count = 0,even_count  = 0,zero_count = 0;
        while(num > 0){
            if(num%10 == 0){
                zero_count++;
            }else if(num%2 == 0){
                even_count++;
            }else{
                odd_count++;
            }
            num = num/10;
        }System.out.println("Zero count is: "+zero_count);
        System.out.println("even count is: "+even_count);
        System.out.println("odd count is: "+odd_count);
        
        }

    }
    class WorkAtTech
    {
        public static void main (String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0;i<a.length;i++){
                System.out.println(solve(a[i]));
            }
        }
        public static String solve(int x){
            if(x%6 == 0){
                return "True";
            }
            else{
                return "False";
            }
        }
    }