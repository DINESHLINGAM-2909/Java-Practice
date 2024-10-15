import java.util.*;
class dw1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do{
            System.out.println("\t\t\tSelect the input:");
            System.out.println("--------------------------------------------------------");
            System.out.println("1.Java\n2.SQL\n3.Exit");
            int input = sc.nextInt();
            switch(input){
                case 1:{
                    System.out.println("\t\tTabrez");
                    break;}
                case 2:{
                    System.out.println("\t\tNagaraj");
                    break;}
                case 3:{
                    flag = false;
                    break;
                }
                default:{
                    System.out.println("Invalid selection.");
                    break;}
            }
        }while(flag);
    }
}

class atm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        do{
            System.out.println("Welcome to ")
        }
    }
}