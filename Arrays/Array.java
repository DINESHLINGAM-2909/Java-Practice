import java.util.*;
/*  Write a program to Sort Numeric Array In Ascending Order
Sample Output
Array = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2}
Ascending Order = {2, 3, 3, 5, 20, 23, 30, 67, 70, 79} */
class a1{
    public static void main(String[] args){
        int a[] = {23,5,67,20,3,30,79,3,70,2};
        System.out.println("Array = "+Arrays.toString(a));
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a.length-1;j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("Ascending Order = "+Arrays.toString(a));
    }
}

/*  Write a program to Sort Numeric Array In descending Order
Sample Output
Array = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2}
Descending Order = {79, 70, 67, 30, 23, 20, 5, 3, 3, 2}*/
class a2{
    public static void main(String[] args) {
        int a[] = {23,5,67,20,3,30,79,3,70,2};
        System.out.println("Array = "+Arrays.toString(a));
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a.length-1;j++){
                if(a[j] < a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }        
    }System.out.println("Descending Order = "+Arrays.toString(a));
}
}
/*Write a program to print sum values of an array
Sample Output
Array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
Sum Values of Array = 55 */
class a3{
    public static void main(String[] args){
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(a));
        int sum = 0;
        for(int i = 0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println("Sum Values of Array = "+sum);
    }
}
/*Write a program to calculate the average value of array elements
Sample Output
Array = {1, 2, 3, 4, 5}
Sum of Array Value : 15
Average of Array Value : 3.0 */
class a4{
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        System.out.println("Array = "+Arrays.toString(a));
        int sum = 0;
        for(int i = 0;i<a.length;i++){
            sum += a[i];
        }
        System.out.println("Sum of Array Value : "+sum);
        double avg = sum/a.length;
        System.out.println("Average of Array Value : "+avg);
    }
}
/*Write a program to store elements in an array and print it. */
class a5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0;i<a.length;i++){
            System.out.print("Element of "+a[i]+" = ");
            a[i] = sc.nextInt();
        }
        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
/* Write a program to display the given Array it in reverse order 
 Array = {1,2,3,4,5}
 Reverse = {5,4,3,2,1}
*/
class a6{
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        System.out.println("Array = "+Arrays.toString(a));
        for(int i = a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }
}

/*Write a program to array elements to print cubic values
Sample Output
Array = {1, 2, 3, 4, 5}
Cubic Array Elements =1 8 27 64 125 */
class a7{
    public static void main(String[] args){
        int a[] = {1,2,3,4,5};
        System.out.println("Array = "+Arrays.toString(a));
        for(int i = 0;i<a.length;i++){
            System.out.print((a[i]*a[i]*a[i])+" ");
        }
    }
}
/*Write a program to find the maximum and minimum element in an array
Array = {23, 4, 32, 5, 75}
Maximum Element of Array = 75
Minimum Element of Array = 4
 */
class a8{
    public static void main(String[] args){
        int a[] = {23,4,32,5,75};
        System.out.println("Array = "+Arrays.toString(a));
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a.length-1;j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("Maximum Element of Array = "+a[a.length-1]);
        System.out.println("Minimum Element of Array = "+a[0]);        
    }
}
/*Write a program to array elements print all Odd number
Sample Output
Array = {23, 45, 67, 34, 78}
Odd Array Elements = 23 45 67
Even Array Elements = 34 78 */
class a9{
    public static void main(String[] args) {
        int a[] = {23,45,67,34,78};
        for(int i = 0;i<a.length;i++){
            if(a[i]%2 == 0){
                System.out.println(a[i]+" ");
                break;
            }
            else{
                System.out.println(a[i]+" ");
            }
        }
    }
}
/*Write a program to array elements to print sum of Odd Numbers
Sample Output
Array = {12, 34, 59, 45, 22}
Sum of Odd Array Elements = 104 */
class a10{
    public static void main(String[] args) {
        int a[] = {12,34,59,45,22};
        System.out.println("Array = "+Arrays.toString(a));
        int sum = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i]%2 == 1)
                sum+=a[i];
        }
        System.out.println("Sum of Odd Array Elements = "+sum);
    }
}
/*Write a program to array elements to print sum of Cubic Values
Sample Output
Array = {1, 2, 3, 4, 5}
Sum of Cubic Array Elements = 225 */
class a11{
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        System.out.println("Array = "+Arrays.toString(a));
        int sum = 0;
        for(int i = 0;i<a.length;i++){
            sum+=(a[i]*a[i]*a[i]);
        }
        System.out.println("Sum of Cubic Array Elements = "+sum);
    }
}
/* Write a program in to copy the elements of one array into another array
Sample Output
Array = {1, 2, 3, 4, 5}
Copy Array Elements one to Another Array = {1, 2, 3, 4, 5} */
class a12{
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        System.out.println("Array = "+Arrays.toString(a));
        int b[] = new int[a.length];
        int x = 0;
        for(int i = 0;i<a.length;i++){
            b[x] = a[i];
            x++;
        }
        System.out.println("Copy Array Elements one to another Array = "+Arrays.toString(b));
    }
}
/*Write a program to merge two arrays elements to store third array
Sample Output
First Array = {1, 2, 3, 4, 5}
Second Array = {6, 7, 8, 9, 10}
Merge two Array Elements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}*/
class a13{
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = {6,7,8,9,10};
        System.out.println("First Array = "+Arrays.toString(a));
        System.out.println("Second Array = "+Arrays.toString(b));
        int c[] = new int[a.length+b.length];
        int x = 0;
        for(int i = 0;i<a.length;i++){
            c[x] = a[i];
            x++;
        }
        for(int i = 0;i<b.length;i++){
            c[x] = b[i];
            x++;
        }
        System.out.println("Third Array = "+Arrays.toString(c));
    }
}
/*Write a program to array elements print all Positive number
Sample Output
Array = {67, -4, 3, -5, 44}
Positive Array Elements = {67, 3, 44} */
class a14{
    public static void main(String[] args) {
        int a[] = {67,-4,3,-5,44};
        System.out.println("Array = "+Arrays.toString(a));
        for(int i = 0;i<a.length;i++){
            if(a[i] > 0)
                System.out.print(a[i]+" ");
        }
    }
}
/* Write a program to search an element in an array
Sample Output
Array = {10, 20, 30, 40, 50}
Search Array Elements = 30
Element is Found in the Position = 3
Element is Found in the Index = 2 */
class a15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {10,20,30,40,50};
        System.out.println("Array = "+Arrays.toString(a));
        System.out.print("Enter the key element to search = ");
        int key = sc.nextInt();
        for(int i = 0;i<a.length;i++){
            if(a[i] == key){
                System.out.println("Element found in the positon = "+(i+1));
                System.out.println("Element found in the index = "+i);
                break;
            }    
        }

    }
}
/*Write a program to Delete Duplicate Elements from an Array
Sample Output
Array = {10, 10, 20, 20, 30}
After Remove Duplicate Array Elements = {10, 20, 30 }*/
class a16{
    public static void main(String[] args) {
        int a[] = {10,10,20,20,30};
        System.out.println("Array = "+Arrays.toString(a));
        int b[] = new int[a.length];
        int x = 0;
        for(int i = 0;i<a.length-1;i++){
                if(a[i] != a[i+1]){
                    b[x] = a[i];
                    x++;
                }
        }
        b[x++] = a[a.length-1];
        int res[] = new int[x];
        for(int i = 0,y=0;i<res.length;i++,y++){
            res[y] = b[i];
        }
        System.out.println("After remove Duplicates = "+Arrays.toString(res));
    }
}
/*Write a program to find the second smallest element in an array
Sample Output
Array = {10, 20, 5, 2, 30}
Second Smallest Element = 5 */
class a17{
    public static void main(String[] args) {
        int a[] = {10,20,5,2,30};
        System.out.println("Array = "+Arrays.toString(a));
        for(int i = 0;i<a.length;i++){
            for(int j = i+1;j<a.length-1;j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Second Smallest Element = "+a[1]);

    }
}
/*Write a program that identifies the Even elements in two arrays and creates a third array with those elements
Sample Output
First Array = {1, 2, 3, 4, 5}
Second Array = {6, 7, 8, 9, 10}
Even Element Store in Third Array = {2, 4, 6, 8, 10} */
class a18{
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = {6,7,8,9,10};
        System.out.println("First Array = "+Arrays.toString(a));
        System.out.println("Second Array = "+Arrays.toString(b));
        int c[] = new int[a.length+b.length];
        int x = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i]%2 == 0){
                c[x++] = a[i];
            }
        }
        for(int j = 0;j<b.length;j++){
            if(b[j]%2 == 0){
                c[x++] = b[j];
            }
        }
        int res[] = new int[x];
        for(int i = 0,y = 0;i<res.length;i++,y++){
            res[y] = c[i];
        }
        System.out.println("Even elements store in the Array = "+Arrays.toString(res));
    }
}
/*Write a program to find the common elements between two arrays of integers
Sample Output
First Array = {10, 20, 30, 40, 50}
Second Array = {10, 30, 60, 50, 70}
Common Array Elements = {10, 30, 50} */
class a19{
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        int b[] = {10,30,60,50,70};
        System.out.println("First Array = "+Arrays.toString(a));
        System.out.println("Second Array = "+Arrays.toString(b));
        int c[] = new int[a.length+b.length];
        int x = 0;
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<b.length;j++){
                if(a[i] == b[j]){
                    c[x] = a[i];
                    x++;
                }
            }
        }
        int res[] = new int[x];
        for(int i = 0,y = 0;i<res.length;i++,y++){
            res[y] = c[i];
        }
        System.out.println("Common Array Elements are = "+Arrays.toString(res));
    }
}
/*Write a program to Find prime and non-prime numbers in the array
Sample Output
Array = {3, 12, 21, 11}
3 - Prime
12 - Not Prime
21 - Not Prime
11 - Prime */
class a20{
    public static void main(String[] args){
        int a[] = {3,12,21,11};
        for(int i = 0;i<a.length;i++){
            System.out.println((isPrime(a[i])?a[i]+" - "+"Prime":a[i]+" - "+"Not Prime"));
        }
    }
    public static boolean isPrime(int n){
        if(n == 0 || n == 1)
            return false;
        
        for(int i = 2;i<n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
/*Write a program to Move all zero at the end of the array
Sample Output
Array = {1,0,45,34,0,67,2,0,6,67,45,2,0,10}
Array after Moving Zeros to End = 1 45 34 67 2 6 67 45 2 10 0 0 0 0 */
class a21{
    public static void main(String[] args) {
        int a[] = {1,0,45,34,0,67,2,0,6,67,45,2,0,10};
        System.out.println("Array = "+Arrays.toString(a));
        int left = 0,right = a.length-1;
        while(left <= right){
            if(a[left]== 0 && a[right] != 0){
                int temp = a[left];
                a[left]= a[right];
                a[right] = temp;
                left++;
                right--;
            }
            if(a[left] != 0)
                left++;
            if(a[right] == 0)
                right--;
        }
        System.out.println("Array after moving 0 from the end = "+Arrays.toString(a));
    }
}
/*Write a program to Sort an array in descending order using bubble sort
Sample Output
Array = {2, 65, 23, 13, 18, 30, 46, 17, 52, 78}
Sorted Array in Descending Order = 78 65 52 46 30 23 18 17 13 2 */
class a22{
    public static void main(String[] args) {
        int a[] = {2, 65, 23, 13, 18, 30, 46, 17, 52, 78};
        System.out.println("Array = "+Arrays.toString(a));
        for(int i = 0;i<a.length-1;i++){
            for(int j = 0;j<a.length-1;j++){
                if(a[j] < a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            
        }
        System.out.println("Sorted Array in Descending Order = "+Arrays.toString(a));
    }
}
/* Write a program to Sort an array in ascending order using selection sort
Sample Output
Array = {2, 65, 23, 13, 18, 30, 46, 17, 52, 78}
Sorted Array in Ascending Order = 2 13 17 18 23 30 46 52 65 78 */
class a23{
    public static void main(String[] args) {
        int a[] = {2, 65, 23, 13, 18, 30, 46, 17, 52, 78};
        System.out.println("Array = "+Arrays.toString(a));
        for(int i = 0;i<a.length;i++){
            int si = i;
            for(int j = i+1;j<a.length;j++){
                if(a[j] < si)
                    si = j;
            }
            int temp = a[i];
            a[i] = a[si];
            a[si] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
//Fizz-Buzz
class a24{
    public static void main(String[] args){
        int a[] = {15,9,25,30,23};
        String s[] = new String[a.length];
        int x = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i]%3 == 0 && a[i]%5 == 0){
                s[x++] = "Fizz_Buzz";
            }else if(a[i]%3 == 0){
                s[x++]="Fizz";
            }else if(a[i]%5 == 0){
                s[x++] ="Buzz";
            }else{
                s[x++] = ""+a[i];
            }

        }
            System.out.print(Arrays.toString(s));
        
    }
}
class a25 {
	public static int[] getCumulativeSum (int[] arr) {
		int res[] = new int[arr.length];
		int sum = 0;
		for(int i = 0;i<arr.length;i++){
			sum+=arr[i];
            res[i] = sum;
		}
		return res;
	}
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int ans[] = getCumulativeSum(a);
        System.out.println(Arrays.toString(ans));
    }
}

class a26{
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
    for(int i = 0;i<2;i++){
        a[0] = a[a.length-1];
        for(int j = 1;j<a.length;j++){
            a[j] = a[j-1]; 
        }
        
    }
    System.out.println(Arrays.toString(a));
}
}
class p27
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        String s = sc.next();
        int start = s.charAt(0);
        int end = s.charAt(s.length()-1);
        while(start < end)
        {
            start = end;
            start++;
            end--;
        }
        System.out.println(s);
    }
}