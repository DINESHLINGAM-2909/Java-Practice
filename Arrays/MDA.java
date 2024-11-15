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

class m3{
    public static void main(String[] args){
        int a[][] = {
                    {8,2,1,4,3},
                    {5,4,7,11,5,2},
                    {2,8,1,11,14,0},
                    {0,1,8,3,4,8,8,4}
                    };
        System.out.println("Original Array");
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(int i = 0;i<a.length;i++){
                if(i == 0){
                    System.out.println("Sum of the even numbers = " +evenSum(a));   
                }
                if(i == 1){
                    int count = 0;
                    for(int j = 0;j<a[i].length;j++){
                        if(primeCount(a[i][j])){
                            count++;
                        }
                    } 
                    System.out.println("Count of Prime number is = "+count);       
                }
                if(i == 2){
                    int small = a[2][0];
                    for(int j = 0;j<a[i].length;j++){
                        if(a[i][j]<small){
                            small = a[i][j];
                        }
                    }
                    System.out.println("Smallest Element is = "+small);
                }
                if(i == 3){
                    String res = "";
                    for(int j = 0;j<a[i].length;j++){
                        int count = 0;
                        for(int k = j+1;k<a[i].length;k++){
                            if(a[i][j] == a[i][k] && a[i][j] != Integer.MAX_VALUE){
                                count++;
                                a[i][k] = Integer.MAX_VALUE;
                            }
                            }
                            if(count > 0){
                                res += a[i][j]+" ";
                            }    
                    }
                    System.out.println("Duplicate Elements = "+res);

                }
        }
      
    }
    public static int evenSum(int a[][]){
        int sum = 0;
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                if(i == 0){
                    if(a[i][j]%2 == 0){
                        sum += a[i][j];
                    }
                }
            }
        }
        return sum;
    }
    public static boolean primeCount(int a){
       
        if(a == 0 || a == 1){
            return false;
        }
        else{
            for(int i = 2;i<a;i++){
                if(a%i == 0){
                    return false;
                }
                }
            }
            return true;
        } 
}

/*Write a method that returns the sum of all the values in a 2D array.
input: [[1,2,3,4],[6,7,8]]
output: 31 */
class m4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[][] = {{1,2,3,4},{6,7,8}};
        int sum = 0;
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
               sum+=a[i][j];
            }
           
        }
         System.out.println(sum);
    }
}  

class m5{
    public static void main(String[]args){
        int a[][] = {{10,20,38,43,20},{23,43,67,90,87},{13,45,67,23,45},{12,23,43,76,34},{23,45,65,23,45}};
        System.out.println(Arrays.toString(a));
        int n = 5;
        int left = 0,right = n-1,top = 0,bottom = n-1;
        while(left<=right && top<=bottom){
            for(int i = left;i<=right;i++){
                System.out.print(a[top][i]+" ");
            }
            top++;
            System.out.println();
            for(int i = top;i<=bottom;i++){
                System.out.print(a[i][right]+" ");
            }
            right--;
            System.out.println();
            for(int i = right;i>=left;i--){
                System.out.print(a[bottom][i]+" ");
            }
            left++;
            System.out.println();
        }
    }
}

