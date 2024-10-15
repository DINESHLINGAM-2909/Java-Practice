 import java.util.*;
 class marks {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        if (mark >= 35){
            System.out.println("Pass");

        }else{
            System.out.println("Fail");
        }
    }
    
}

//Get the age as a user input and check the age the user is eligible for vote.

class vote{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        if (age >= 18){
            System.out.println("The user is eligible to vote");
        }else {
            System.out.println("The person is not eligible to vote.");
        }
    }
}

//