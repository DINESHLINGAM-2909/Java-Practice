import java.util.*;
class RightPyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        int i,j;
        for(i = 1;i<=n;i++){
            for(j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


class LeftPyramid{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            for(int j = 2*(n-i);j>=0;j--){
                System.out.print(" ");
            }for(int j = 0;j<=i;j++){
                System.out.print("* ");
            }System.out.println();
        }
    }
}

class ReversePyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n = sc.nextInt();
        int i,j;
        for(i = 1;i<=n;i++){
            for(j = n;j>=i;j--){
                System.out.print("* ");
            }System.out.println();
        }
    }
}

class ReverseLeft{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int i,j;
        for(i = 1;i<=n;i++){
            for(j = 0;j<=i;j++){
            for(j = n;j>=i;j--){
                System.out.print("* ");
            }
        }System.out.println();
        }
        
    }
}

class Hollowgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        for(i = 0;i<n;i++){
            for(j = 0;j<n;j++){
                if(i == 0||j == 0||i == n-1|| j == n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }

    }
}

class NumberRigthPyramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        int i,j;
        for(i = 1;i<=n;i++){
            for(j = 1;j<=i;j++){
                System.out.print(i+" ");
            }System.out.println();
        }    }
}
