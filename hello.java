import java.util.*;
class PrimeNumber{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = sc.nextInt();
    int i,m = 0,flag = 0;
    m = n/2;
    if (n == 0 || n == 1){
      System.out.println("Not a prime number.");
    }else{
      for(i = 2;i<=m;i++){
        if(n%i == 0){
        System.out.println("Not a prime number");
        flag = 1;
        break;
        }
      }
    }if (n == 0){
      System.out.println("Prime number.");
    }
  }
}


class solution{
  
  public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Employee ID: ");
    int eid = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter the name: ");
    String ename = sc.nextLine();
    System.out.print("Enter the Salary: ");
    double sal = sc.nextDouble();
    System.out.print("Enter the phone number: ");
    long ph = sc.nextLong();
    System.out.print("Enter the gender: ");
    char gen = sc.next().charAt(0);
    System.out.println("Processing.....");
    Thread.sleep(3000);
   

    System.out.println("**********Employee Details**************");
    System.out.println("Employee id:"+eid);
    System.out.println("Employee name:"+ename);
    System.out.println("Employee salary:"+sal);
    System.out.println("Employee contact:"+ph);
    System.out.println("Employee gender:"+gen);






  }
}

class test1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = sc.nextInt();
    
    String res = (n == 0) ? "Hero" : (n > 0) ? "positive" : "negative";
    System.out.println(res);
  }
}