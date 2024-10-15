import java.util.*;
class hotel{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\tWelcome to Hotel Dinesh!!!");
        Thread.sleep(1000);
        System.out.println("Select the categories:\n1.VEG\n2.NON VEG");
        int choice = sc.nextInt();
        if(choice <= 0 && choice > 2){
            System.out.println("Invalid choice.");
        }
        else if(choice == 1){
            Thread.sleep(1000);
            System.out.println("\t\t\tWelcome to our veg party....");
            System.out.println("Select the food to you want:\n1.Idli\n2.Dosa\n3.Pongal\n4.Poori");
            int v = 1;
            double sum = 0;
            
            while(v == 1){
                Thread.sleep(2000);
                System.out.print("Enter 1 to continue and 2 to exit: ");
                v = sc.nextInt();
                if(v == 1){

                    System.out.print("Enter the foodnumber:");
                    int opt = sc.nextInt();
                    if(opt <= 0 && opt > 4){
                        System.out.println("Invalid Food selection.");
                    }
                    else if(opt == 1){
                        System.out.println("Idli - 5rs");
                        sum += 5;//sum = sum + 5
                    }else if(opt == 2){
                        System.out.println("Dosa - 10rs");
                        sum += 10;
                    }else if(opt == 3){
                        System.out.println("Pongal - 25rs");
                        sum += 25;
                    }else if(opt == 4){
                        System.out.println("Poori - 15");
                        sum += 15;
                    }
                }

            }Thread.sleep(1000);
            System.out.println("The total amount of the food is : "+ sum+"rs");
            Thread.sleep(1000);
            System.out.println("************Thank you****************");
        }else if(choice == 2){
            Thread.sleep(1000);
            System.out.println("\t\t\tWelcome to our Non veg party....");
            System.out.println("Select the food to you want:\n1.Chiken Briyani\n2.Mutton Briyani\n3.Chiken Rice\n4.Chiken Noodles");
            int nv = 1;
            double sum1 = 0;

            while(nv == 1){
                Thread.sleep(2000);
                System.out.print("Enter 1 to continue and 2 to exit: ");
                nv = sc.nextInt();
                if(nv == 1){

                    System.out.print("Enter the foodnumber:");
                    int opt1 = sc.nextInt();
                    if(opt1 <= 0 && opt1 > 4){
                        System.out.println("Invalid Food selection.");
                    }
                    else if(opt1 == 1){
                        System.out.println("Chiken Briyani - 100rs");
                        sum1 += 100;
                    }else if(opt1 == 2){
                        System.out.println("Mutton Briyani - 200rs");
                        sum1 += 200;
                    }else if(opt1 == 3){
                        System.out.println("chiken Rice - 90rs");
                        sum1 += 90;
                    }else if(opt1 == 4){
                        System.out.println("Chiken Noodles - 90rs");
                        sum1 += 90;
                    }
                }
            }Thread.sleep(1000);
            System.out.println("The total amount of the food is : "+ sum1+"rs");
            Thread.sleep(1000);
            System.out.println("************Thank you****************");
        }
    }
}