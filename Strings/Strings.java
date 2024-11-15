import java.util.*;
/*Write a Java program to concatenate Two strings */
class s1{
    public static void main(String[] args){
        String s1 = "dinesh";
        String s2 = "lingam";
        System.out.println(s1.concat(s2));
    }
}
/*WAJP to convert uppercase into lowercase and lowercase into uppercase.*/
class s2{
    public static void main(String[] args) {
        String s1 = "DINESH";
        String res1 = s1.toLowerCase();
        String s2 = "lingam";
        String res2 = s2.toUpperCase();
        System.out.println(res1);
        System.out.println(res2);
    }
}
/*WAJP to find the given String is palindrome or not. */
class s3{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        if(isPalindrome(s))
            System.out.println("The given String is palindrome");
        else
            System.out.println("Not a palindrome");
    }
    public static boolean isPalindrome(String s){
        String rev = "";
        for(int i = s.length()-1;i>=0;i--){
            rev += s.charAt(i);
        }
        if(s.equalsIgnoreCase(rev))
            return true;
        else
            return false;
        
    }
}

/*WAJP to convert a string into char Array */
class s4{
    public static void main(String[] args) {
        String s = "dineshlingam";
        char c[] = new char[s.length()];
        for(int i = 0;i<s.length();i++){
            c[i] = s.charAt(i);
        }
        System.out.println(s);
        System.out.println(Arrays.toString(c));
    }
}
/*WAJP to convert a char Array into String. */
class s5{
    public static void main(String[] args) {
        char c[] = {'d','i','n','e','s','h'};
        String s = "";
        for(int i = 0;i<c.length;i++){
            s += c[i];
        }
        System.out.println(s);
    }
}
/*WAJP to given string is anagram or not.
 input s1 = "Race" ; s2 = "Care"
 output Anagram
 */
class s6{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the String s1 : ");
        String s1 = sc.nextLine();
        System.out.print("Enter the String s2 : ");
        String s2 = sc.nextLine();
        System.out.println((isAnagram(s1,s2)?"Anagram" : "Not Anagram"));
    }
    public static boolean isAnagram(String s1,String s2){
        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();

        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        s1 = new String(a);
        s2 = new String(b);

        if(s1.equalsIgnoreCase(s2))
            return true;
        else
            return false;
    }
}
/*WAJP to add the integers in the string. 
 input : a12bh34kn9
 output : 1+2+3+4+9 = 19
*/
class s7{
    public static void main(String[] args) {
        String s = "a12bh34kn9";
        int res = solve(s);
        System.out.println(s);
        System.out.println(res);
    }
    public static int solve(String s){
        char a[] = s.toCharArray();
        int sum = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i]>='0' && a[i] <= '9'){
                sum+=(a[i] - 48);
            }
        }
        return sum;
    }
}

/*
 input = aaabbaaac
 output = a:3 b:2 a:3 c:1
 */
class s8{
    public static void main(String[] args) {
        String s = "aaabbaaac";
        solve(s);
    }
    public static void solve(String s){
        String ans = "";
        int count = 1;
        char a[] = s.toCharArray();
        for(int i = 0;i<a.length-1;i++){
            if(a[i] == a[i+1]){
                count++;
            }
            else{
                ans += a[i]+":"+count+" ";
                count = 1;
            }
        }
        ans+=a[a.length-1]+":"+count;
        System.out.println(ans);
    }
}
/*WAJP to convert a string into String Array. */
class s9{
    public static void main(String[] args) {
        String s1 = "Hi this is dinesh";
        String ans[] = s1.split(" ");
        System.out.println(s1);
        System.out.println(Arrays.toString(ans));
    }
}
/*WAJP to convert String into Integer. */
class s10{
    public static void main(String[] args){
        String s1 = "10";
        String s2 = "12";
        String s3 = "13";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1+s2);
        System.out.println("***********************************");
        int res1 = Integer.parseInt(s1);
        int res2 = Integer.parseInt(s2);
        int res3 = Integer.parseInt(s3);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res1+res2);
    }
}
/* 
 input = "a12b3c15d4"
 output
 aaaaaaaaaaaa
 bbb
 ccccccccccccccc
 dddd
 */
/*class s11{
    public static void main(String[] args){
        String s = "a12b3c15d4";
        System.out.println(s);
        solve(s);
    }
    public static void solve(String s){
        String num = "";
        char a[] = s.toCharArray();
        for(int i = 1;i<a.length;i++){
            if(a[i]>='0' && a[i]<='9')
                num += a[i];
            else
                num+=" ";
        }
        String s1[] = num.split(" ");
        for(int i = 0;i<a.length;i++){
            if(a[i] >= 'a' && a[i] <= 'z'){
                for(int k = 1;k<=Integer.parseInt)
            }
        }
    }
}*/
/*input : "Hi how are you?" 
 output : you? are how Hi
*/
class s12{
    public static void main(String[] args){
        String s = "Hi how are you?";
        System.out.println(s);
        String res = solve(s);
        System.out.println(res);
    }
    public static String solve(String s){
        String ans = "";
        String[] s1 = s.split(" ");
        for(int i = s1.length-1;i>=0;i--){
            ans += s1[i]+" ";
        }
        return ans;
    }
}
/*
 input : "Hi this is Tabrez"
 output : zerbaT is siht Hi
 */
class s13{
    public static void main(String[] args) {
        String s = "Hi this is Tabrez";
        String ans = solve(s);
        System.out.println(s);
        System.out.println(ans);
    }
    public static String solve(String s){
        String ans = "";
        String[] a = s.split(" ");
        for(int i = a.length-1;i>=0;i--){
            if(i%2 == 1){
                ans += reverse(a[i])+" ";
            }
            else{
                ans += a[i]+" ";
            }
        }
        return ans;
    }
    public static String reverse(String s){
        String ans = "";
        for(int i = s.length()-1;i>=0;i--){
            ans += s.charAt(i);
        }
        return ans;
    }
}
/*input : "I don't want to live in mansion"
 output : I  don'a wana ao live in mansion
 Replave 't' to 'a'
*/
class s14{
    public static void main(String[] args) {
        String s = "I don't want to live in mansion";
        String ans = solve(s);
        System.out.println(s);
        System.out.println(ans);
    }
    
    public static String solve(String s){
        char []a = s.toCharArray();
        for(int i= 0;i<a.length;i++){
            if(a[i] == 't'){
                a[i] = 'a';
            }
        }
        return new String(a);
            
        }
}
/*WAJP to find the given String is Cyclic Prime or not. */
class s15{
    public static boolean isPrime(int n){

        if(n==0 || n == 1){
            return false;
        }
        
        for(int i = 2;i<n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
        
    }
    public static boolean isCyclicPrime(char a[]){
        for(int i = 1;i<=a.length;i++){
            char first = a[0];
            for(int k = 0;k<a.length-1;k++){
                a[k] = a[k+1];
            }
            a[a.length-1] = first;
            String s = new String(a);
            int num = Integer.parseInt(s);
            if(!isPrime(num))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "1930";
        char a[] = s.toCharArray();
        System.out.println((isCyclicPrime(a)?"Cyclic Prime":"Not a cyclic prime"));

    }
}
/*input = "{([])}"
 output = Balanced
 input = "{()])"
 output = Unbalanced
 */
class s16{
    public static void main(String[] args) {
        String s = "{([])}";
        char a[] = s.toCharArray();
        System.out.println((solve(a))?"Balanced":"Un balanced");
    }
    public static boolean solve(char a[]){
        int mid = a.length/2;
        int start = 0,end = a.length-1;
        String s1 = "",s2 = "";
        for(int i = start;i<mid;i++){
            s1+=a[i];
        }
        for(int i = end;i>=mid;i--){
            s2+=a[i];
        }
        System.out.println(s1);
        System.out.println(s2);
        if(s1.equals(s2))
            return true;
        else
            return false;
    }
}


class s17{
    public static void main(String[] args) {
        String s = "Hi my nam Dinesh";
        String res = solve(s);
        System.out.println(res);
    }
    public static String solve(String s){
        String ans = "";
        String a[] = s.split(" ");
        for(int i = 0;i<a.length;i++){
            int len = a[i].length();
            if(len%2 == 0)
                ans += a[i]+" ";
        }
        return ans;
    }
}

/* WAJP to insert the String into another String
 input = "Hello  sir"
 index = 5;String = "Dinesh"
 output = Hello Dinesh sir
 */
class s18{
    public static void main(String[] args) {
        String s = "Hello  sir";
        String s1 = "Dinesh";
        int index = 5;
        String res = solve(s,s1,index);
        System.out.println(s);
        System.out.println(res);
    }
    public static String solve(String s,String s1,int index){
        char a[] = s.toCharArray();
        String ans = "";
        for(int i = 0;i<a.length;i++){
            ans += s.charAt(i);
            if(i == index){
                ans += s1;
            }
        }
        return ans;
    }
}

class s19{
    public static void main(String[] args){
        String s = "acbAHfBGzF";
        System.out.println(s);
        System.out.println(solve(s));
    }
    public static String solve(String s){
        String ans = "";
        String upc = "";
        String lpc = "";
        char a[] = s.toCharArray();
        Arrays.sort(a);
        for(int i = 0;i<a.length;i++){
            if(a[i] >='A' && a[i] <= 'Z'){
                upc += a[i];
            }
            else if(a[i] >= 'a' && a[i] <= 'z'){
                lpc += a[i];
            }
        }
        char x[] = upc.toCharArray();
        char y[] = lpc.toCharArray();
        for(int i = 0,m=0,n=0;i<s.length();i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                ans += x[m++];
            else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                ans += y[n++];
        }
        return ans;
       
        
    }
}

class s20{
    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        for(int i = a;i<=b;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int a){
        if(a == 0 || a == 1){
            return false;
        }

        for(int i = 2;i<a;i++){
            if(a%i == 0)
                return false;
        }
        return true;
    }
}

class s21
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String a[] = new String[n];
		for(int i = 0;i<a.length;i++){
			a[i] = sc.nextLine();
		}
		for(int i = 0;i<a.length;i++){
			System.out.println((isPalindrome(a[i])?"True":"False"));
		}
	}
	public static boolean isPalindrome(String s){
		String s1 = "";
		char c[] = s.toCharArray();
		for(int i = c.length-1;i>=0;i--){
			s1+=c[i];
		}
		
		if(s.equalsIgnoreCase(s1))
			return true;
		else
			return false;
	}
}