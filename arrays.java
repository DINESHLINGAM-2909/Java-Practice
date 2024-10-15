/*WAJP to print the array element from the users. */
import java.util.*;
class a1{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
       
        for(int i = 0;i<a.length;i++){
            System.out.println("Enter the number "+i);
            a[i] = sc.nextInt();
        }System.out.println("The array elements are:");
        Thread.sleep(1000);
        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}

/*WAJP to find the sum of the array elements */

class a2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n  = sc.nextInt();
        int a[] = new int[n];
        int sum = 0;
        for(int i = 0;i<a.length;i++){
            a[i] = sc.nextInt();
            sum += a[i];

        }
        System.out.println(sum);
    }
}

/*WAJP to find the sum of odd numbers in the array. */
class a3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int oddsum = 0;
        for (int i = 0;i<a.length;i++){
            a[i] = sc.nextInt();
            if (a[i]%2 == 1){

                oddsum+=a[i];
            }
        }System.out.println("The sum of odd numbers in the array is "+ oddsum);
        
       
        for(int i = 0;i<a.length;i++){
            if (a[i]%2 == 1){
              
            System.out.println("The odd numbers present in the array "+a[i]);
        }
    }
    }
}

/* Find the maximum number of an array */
class a4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = sc.nextInt();
        int a[] = new int[n];
        int max = a[0];
        System.out.println("Enter the elements: ");

        for(int i = 0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }System.out.println("The maximum number of the given array is "+ max);

    }
}

/*Find the minimum number of the array. */
class a5{
    public static void main(String[] ags){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements: ");
        int a[] = new int[n];
        
        for(int i = 0;i<a.length;i++){
            a[i] = sc.nextInt();
        
        } 
        int min = a[0];
        for(int i = 0;i<a.length;i++){
            if (a[i]<min){
                min = a[i];
            }
        }System.out.println("The minimum element in the array is "+ min);
    }
}

/*Find the position of the given array. */
class a6{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int a[] = {1,2,3,4,5,6,7,8,9,2};
        System.out.print("Enter the element to find its position: ");
        int target = sc.nextInt();
        int index = -1;
        for(int i = 0;i<a.length;i++){
            if(target == a[i]){
                index = i;
                break;
            }
        }
        if(index != -1){
            System.out.println("Element found at the position of: "+index);
        }else {
            System.out.println("Element not found");
        }
    }
}

/*Find the sum of minimum element in the array and maximum element in the array. */

class a7{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int a[] = {1,2,3,4,5,6,7,8,9,23,34,43};
        int max = a[0];
        int min = a[0];
        for(int i = 0;i<a.length;i++){
            if(a[i] > max){
                max = a[i];
            }else if(a[i] < min){
                min = a[i];
            }
        }
        Thread.sleep(1000);
        System.out.println("The maximum element in the given array is : "+ max);
        Thread.sleep(1000);
        System.out.println("The minimum element in the given array is : "+ min);
        Thread.sleep(1000);
        System.out.println("The sum of maximum and minimum element is : "+ (max + min));
    }
}

/*find the sum of two arrays. */
class a8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a1[] = {1,2,3};
        int a2[] = {4,5,6};
        int sum = 0;
        for(int i = 0;i<a1.length;i++){
            for(int j = 0;j<a2.length;j++){
                sum = a1[i]+a2[j];
            }
        }System.out.println(sum);
    }
}
