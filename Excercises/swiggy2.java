import java.util.*;
class swiggy2{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        boolean hotel = true;
        do{
            System.out.println("Select the hotel:");
            System.out.println("------------------------");
            System.out.println("1.Buhari\n2.A2B\n3.Exit");
            int input = sc.nextInt();
            switch(input){
                case 1:{
                    boolean menu = true;
                    do{
                    Thread.sleep(2000);
                    System.out.println("\t\t\tGreetings from Buhari hotel....");
                    System.out.println("Select the food:");
                    System.out.println("-----------------------");
                    System.out.println("1.Briyani\n2.Ghee Rice\n3.Exit");
                    int food = sc.nextInt();
                    switch(food){
                        case 1:{
                            Thread.sleep(2000);
                            System.out.println("The price of Briyani is 180.0");
                            break;
                        }
                        case 2:{
                            Thread.sleep(2000);
                            System.out.println("The price of Ghee Rice is 80.0");
                            break;
                        }
                        case 3:{
                            menu = false;
                            System.out.println("Redirecting to Hotel page......");  
                            Thread.sleep(2000);
                            break;
                        }
                        default:{
                            System.out.println("Invalid option");
                            break;
                        }
                    }
                    }while(menu);
                    break;
                }
                case 2:{
                    boolean menu = true;
                    do{
                    Thread.sleep(2000);
                    System.out.println("\t\t\tGreetings from A2B hotel....");
                    System.out.println("Select the food:");
                    System.out.println("-----------------------");
                    System.out.println("1.Dosa\n2.Parotta\n3.Exit");
                    int food = sc.nextInt();
                    switch(food){
                        case 1:{
                            Thread.sleep(2000);
                            System.out.println("The price of Dosa is 35.0");
                            break;
                        }
                        case 2:{
                            Thread.sleep(2000);
                            System.out.println("The price of Parotta is 20.0");
                            break;
                        }
                        case 3:{
                            menu = false;
                            System.out.println("Redirecting to Hotel page......");  
                            Thread.sleep(2000);
                            break;
                        }
                        default:{
                            System.out.println("Invalid option");
                            break;
                        }
                    }
                    }while(menu);
                    break;
                }
                case 3:{
                    hotel = false;
                    Thread.sleep(2000);
                    break;
                }
                default:{
                    Thread.sleep(2000);;
                    System.out.println("Invalid option.");
                    break;
                }
            }

        }while(hotel);
        System.out.println("\t\t\tThank you!");
    }
}