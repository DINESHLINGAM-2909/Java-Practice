import java.util.*;
class ls{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a[] = {1,3,5,6,9,12};
        int key = sc.nextInt();
        boolean flag = false;
        int pos = 0;
        System.out.println("Original Array = "+Arrays.toString(a));
        for(int i = 0;i<a.length;i++){
            if(a[i] == key){
                flag = true;
                pos = i;
                break;    
            }

        }
        System.out.println(flag?"The element found at the position of "+pos:"The element not found");
    }
}

class bs{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = {1,3,5,7,8,9,10};
        System.out.println(Arrays.toString(a));
        int key = sc.nextInt();
        boolean flag = false;
        int pos = 0;
        int left = 0,right = a.length-1;
        while(left <= right){
            int m = (left + right)/2;
            if(key == a[m]){
                flag = true;
                pos = m;
                break;
            }
            else if(key < a[m]){
                right = m-1;
            }
            else {
                left = m+1;
            }

           }
           if(flag){
            System.out.println("The element found at the position of "+pos);
           }else{
            System.out.println("The element not found");
           }
        }
}

class bubsort{
    public static void main(String[] args){
        int a[] = {1,2,3,64,34,23,34,27,90};
        System.out.println(Arrays.toString(a));
        bubsort(a);
    }
    public static void bubsort(int a[]){
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a.length-1;j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}

/*class mersort{
    public static void main(String[] args){
        int a[] = {1,12,32,43,35,23,90};
        System.out.println(Arrays.toString(a));
        Divide(a,0,a.length-1);
    }
    public static void Divide(int a[],int l,int h){
        
        if(l == h)
            return false;
        int m = (l+h)/2;
        Divide(a,l,m);
        Divide(a,m+1,h);
        merge(a,l,m,h);
    }
    public static void merge(int a[],int l,int m,int h){
        int left = l,right = m+1,mid = m;
        int k[] = new int[a.length];
        int x = 0;
        while(left <= mid && right <= h){
            if(a[left] < a[right])
                k[x] = a[let]
        }
    }
}*/
class dinesh{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int a[] = {1,3,1,4,2,6,5,4,1,7,8};
        System.out.println("Original Array : "+Arrays.toString(a));
        System.out.println("Select the Featue : ");
        System.out.println("--------------------------");
        System.out.println("1.Nth Largest.\n2.Nth Smallest");
        int input = sc.nextInt();
        switch(input){
            case 1:{
                int res = NthLargest(a);
                System.out.println(res);
                break;}
            case 2:{
                int res2 = NthSmallest(a);
                System.out.println(res2);
                break;
            }
            default:{
                System.out.println("Enter the valid input.");
                break;
            }
        }
    }
    public static int[] removeDuplicate(int a[]){
        Arrays.sort(a);
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
        for(int i = 0;i<res.length;i++){
            res[i] = b[i];
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
    public static int NthLargest(int a[]){
        int x[] = removeDuplicate(a);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if(n <= x.length)
            return x[x.length-n];
        else
            System.out.println("Invalid input.");
            return 0;
    }
    public static int NthSmallest(int a[]){
        int x[] = removeDuplicate(a);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if(n <= x.length)
            return x[n - 1];
        else
            System.out.println("Invalid input");
            return 0;
    }
}