import java.util.*;
class sample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        if (n == 0){
            System.out.println("neither even nor odd");
        }else{
            if(n % 2== 0){
                System.out.println("even");
            }else{
                System.out.println("Odd");
            }
        }
    }
}
