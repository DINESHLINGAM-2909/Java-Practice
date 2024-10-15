import java.util.*;
class days{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        switch(number){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter the valid number.");
        }
    }
}

class alphabet{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet:");
        char alphabet = sc.next().charAt(0);
        switch(alphabet){
            case 'a':
            case 'A' :
           
            case 'e':
            case 'E':

            case 'i':
            case 'I':

            case 'o':
            case 'O':
                
            case 'u':
            case 'U':
                System.out.println(alphabet + " is a vowel.");
                break;
            default:
               System.out.println(alphabet  + " is an consonant.");

        }
    }
}