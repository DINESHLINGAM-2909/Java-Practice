import java.util.*;
class m1{
    static int a[][] = new int[3][3];
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)throws Exception{
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                System.out.print("Enter the element : ");
                a[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("\t\t\tTop to Bottom and left to Right");
        topToBottomLefttoRight();
        System.out.println("*******************************************");
        Thread.sleep(1000);
        System.out.println("\t\t\tTop to Bottom and Right to left");
        topToBottomRigthtoLeft();
        System.out.println("*******************************************");
        Thread.sleep(1000);
        System.out.println("\t\t\tBottom to top and Right to left");
        BottomtoTopRigthtoLeft();
        System.out.println("*******************************************");
        Thread.sleep(1000);
        System.out.println("\t\t\tBottom to top and left to Right");
        BottomtoTopLefttoRight();
        System.out.println("*******************************************");

    }
    public static void topToBottomLefttoRight()throws Exception{
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
                Thread.sleep(100);
            }
            System.out.println();
        }
    }
    public static void topToBottomRigthtoLeft()throws Exception{
        for(int i = 0;i<a.length;i++){
            for(int j = a[i].length-1;j >= 0;j--){
                System.out.print(a[i][j]+" ");
                Thread.sleep(100);
            }
            System.out.println();
        }
    }
    public static void BottomtoTopRigthtoLeft()throws Exception{
        for(int i = a.length-1;i>=0;i--){
            for(int j = a[i].length-1;j >= 0;j--){
                System.out.print(a[i][j]+" ");
                Thread.sleep(100);
            }
            System.out.println();
        }
    }
    public static void BottomtoTopLefttoRight()throws Exception{
        for(int i = a.length-1;i>=0;i--){
            for(int j = 0;j < a[i].length;j++){
                System.out.print(a[i][j]+" ");
                Thread.sleep(100);
            }
            System.out.println();
        }
    }
    
}
class m2{
    static Scanner sc = new Scanner(System.in);
    static int a[][] = new int[3][3];
    static int b[][] = new int[3][3];
    static int c[][] = new int[3][3];
    public static void main(String[] args){
        System.out.println("\t\t\tfirst Array elements");
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                System.out.print("Enter the element : ");
                a[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("\t\t\tsecond Array elements");
        for(int i = 0;i<b.length;i++){
            for(int j = 0;j<b[i].length;j++){
                System.out.print("Enter the element : ");
                b[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for(int i = 0;i<c.length;i++){
            for(int j = 0;j<c[i].length;j++){
                c[i][j] = a[i][j]+b[i][j];
            }
            System.out.println();
        }
        System.out.println("First Array");
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Second Array");
        for(int i = 0;i<b.length;i++){
            for(int j = 0;j<b[i].length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Third Array");
        for(int i = 0;i<c.length;i++){
            for(int j = 0;j<c[i].length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}