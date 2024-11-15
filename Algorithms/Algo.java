import java.util.*;
class LinearSearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = {23,43,54,23,12,23,32};
        System.out.println(Arrays.toString(a));
        System.out.print("Enter the element you want to find : ");
        int n = sc.nextInt();
        boolean flag = false;
        int i = 0;
        for(i = 0;i<a.length;i++){
            if(a[i] == n){
                flag = true;
                break;
            }
        }
        if(flag)
            System.out.println("The element found at the position of "+i);
        else
            System.out.println("The element not found...");
    }
}

class BinarySearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {12,13,31,32,43,64,90};
        System.out.println(Arrays.toString(a));
        System.out.print("Enter the element you want to find : ");
        int key = sc.nextInt();
        boolean flag = false;
        int temp = 0;
        int left = 0,right = a.length-1;
        while(left <= right){
            int m = (left+right)/2;
            if(key == a[m]){
                temp = m;
                flag = true;
                break;
            }
            else if(key < a[m]){
                right = m-1;
            }
            else{
                left = m+1;
            }
        }
        if(flag)
             System.out.println("The element found at the position of "+temp);
        else
            System.out.println("The element not found");
    }
}

class BubbleSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = {23,43,41,21,42,32,21,76,54};
        System.out.println("Before sorting = "+Arrays.toString(a));
        for(int i = 0;i<a.length-1;i++){
            for(int j = 0;j<a.length-1;j++){
                if(a[j] < a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("After Sorting = "+Arrays.toString(a));
    }
}

/*class selectionSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = {12,43,23,-90,89,32,15,12};
        System.out.println("Before Sorting = "+Arrays.toString(a));
        for(int i = 0;i<a.length-1;i++){
            int si = i;
            for(int j = i+1;j<a.length;j++){
                if(a[j] > a[si]){
                    si = j;
                }
            }
            int temp = a[i];
            a[i] = a[si];
            a[si] = temp;
        }
        System.out.println("After sorting = "+Arrays.toString(a));
    }
}
*/
class MergeSort{
    public static void main(String[] args){
        int a[] = {8,2,12,3,4,5,1,9,7};
        System.out.println(Arrays.toString(a));
        Divide(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    public static void Divide(int[] a,int l,int h){
        if(l == h)
            return;
        int m = (l+h)/2;
        Divide(a,l,m);//left
        Divide(a,m+1,h);//Right
        Merge(a,l,m,h);
    }
    public static void Merge(int[] a,int l,int m,int h){
        int k[] = new int[a.length];
        int left = l,right = m + 1,x = 0,mid = m;
        while(left <= mid && right <= h){
            if(a[left] <= a[right]){
                k[x] = a[left];
                x++;
                left++;
            }else{
                k[x] = a[right];
                x++;
                right++;
            }

        }
        while(left <= mid){
            k[x++] = a[left++];
        }
        while(right <= h){
            k[x++] = a[right++];
        }
        for(int i = l,y= 0;i<=h;i++,y++){
            a[i] = k[y];
        }
    }
}


/* display an obtain pairs of an array. */
class subArray{
    public static void main(String[] args){
        int a[] = {1,2,6,3,5,9};
        obtain(a);
    }
    public static void obtain(int a[]){
        for(int i = 0;i<a.length;i++){
            for(int j = i;j<a.length;j++){
                for(int k = i;k<=j;k++){
                    System.out.print(a[k] +" ");
                }
                System.out.print("\t");
            }System.out.println();
        }
    }
}

/* find the sum of obtain pairs of sub Array. */
class sumSubArray{
    public static void main(String[] args) {
        int a[] = {1,2,6,3,5,9};
        for(int i = 0;i<a.length;i++){
            for(int j = i;j<a.length;j++){
                int sum = 0;
                for(int k = i;k<=j;k++){
                    sum += a[k]; 
                }
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}

class maxsum{
    public static void main(String[] args) {
        int a[] = {1,2,6,3,5,9};
        solve(a);
    }
    public static void solve(int[] a){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<a.length;i++){
            for(int j = i;j<a.length;j++){
                int sum = 0;
                for(int k = i;k<=j;k++){
                    sum+=a[k];
                }
                if(sum > max)
                    max = sum;
            }
       

        }
        System.out.println(max);
    }
}

class prefixSum{
    public static void main(String[] args){
        int a[] = {1,2,6,3,5,9};
        solve(a);
    }
    public static void solve(int[] a){
        int pre[] = new int[a.length];
        pre[0] = a[0];
        int max = Integer.MIN_VALUE;
        for(int i = 1;i<pre.length;i++){
            pre[i] = pre[i-1]+a[i];
        }
        for(int i = 0;i<a.length;i++){
            for(int j = i;j<a.length;j++){
                int cs = (i == 0)?pre[j]:pre[j]-pre[j-1];
                if(i == 0)
                    cs = pre[j];
                else
                    cs = pre[j] - pre[j-1];
                if(cs > max)
                    max = cs;
            }

        }
        System.out.println(max);
    }

}

class kadanes{
    public static void main(String[] args) {
        int a[] = {1,2,6,3,5,9};
        int max = Integer.MIN_VALUE;
        int cs = 0;
        for(int i = 0;i<a.length;i++){
            cs = cs+a[i];
        }
        if(cs < 0){
            cs = 0;
        }
        if(cs > max){
            max = cs;
        }
        System.out.println(max);
    }
}