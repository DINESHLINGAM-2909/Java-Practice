import java.util.*;
class myName {
    public static void main(String[] args)throws Exception{
        int n = 5;
        for(int i = 0;i<n;i++){
            for(int j = 0;j < n;j++){ //D
                if(i == 0 || i == n-1 || j == 1 || j == n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
                Thread.sleep(50);
            }System.out.print("  ");
            for(int j = 0;j < n;j++){ //I
                if(i == 0 || i == n-1 || j == n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
                Thread.sleep(50);    
            }System.out.print("  ");
            for(int j = 0;j < n;j++){ //N
                if(j == 0 || j == n-1 || i == j)
                    System.out.print("* ");
                else
                    System.out.print("  ");
                Thread.sleep(50);
                
            }System.out.print("  ");
            for(int j = 0;j < n;j++){ //E
                if(i == 0 || i == n-1 || j == 0 || i == n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
                Thread.sleep(50);
                
            }System.out.print("  ");
            for(int j = 0;j < n;j++){ //S
                if(i == 0 || (j == 0 && i < n/2) || i == n/2 || (j == n-1 && i > n /2) || i == n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
                Thread.sleep(50);
                
            }System.out.print("  ");
            for(int j = 0;j < n;j++){ //H
                if(j == 0 || j == n-1 || i == n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
                Thread.sleep(50);
            }
                
            }System.out.println();
        }
    }    


class myName2{
    public static void main(String[] args)throws Exception {
        int n = 5;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i == 0 || i == n-1 || j == n-1 || j == 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
                Thread.sleep(10);
            }System.out.print("  ");
            for(int j = 0;j<n;j++){
                if(j == 0 || i == 0 || i == n-1 || i == n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
                    Thread.sleep(10);
            }System.out.print("  ");
            for(int j = 0;j<n;j++){
                if(j == 0 || i == 0 || i == n-1 || i == n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
                    Thread.sleep(10);
            }System.out.print("  ");
            for(int j = 0;j<n;j++){
                if(j == 0 || i == 0 || i == n/2 || (j == n-1 && i < n/2))
                    System.out.print("* ");
                else
                    System.out.print("  ");
                    Thread.sleep(10);
            }System.out.print("  ");
            for(int j = 0;j<n;j++){
                if(j == 0 || j == n - 1 ||i == 0 || i == n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
                Thread.sleep(10);
            }System.out.print("  ");
            for(int j = 0;j<n;j++){
                if(j == 0 || j == n-1 || i == j)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }System.out.println();


        }
    }
}

class myName3{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i == 0 || j == 0 || i == n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }System.out.println();
        }
    }
}
