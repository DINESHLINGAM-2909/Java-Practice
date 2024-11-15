import java.util.*;
class aadhar{
    //states
    private static Scanner sc = new Scanner(System.in);
    private String name;
    private long contact;
    private String address;
    private long aadhar_number;

    public aadhar(String name,long contact,String address,long aadhar_number){
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.aadhar_number = aadhar_number;
    }

    public String getName(){
        return name;
    }
    public long getContact(){
        return contact;
    }
    public String getAddress(){
        return address;
    }public long getAadharNumber(){
        return aadhar_number;
    }

    public boolean doVerification()throws Exception{
        System.out.print("Enter the registered contact : ");
        long user_contact = sc.nextLong();
        if(contact == user_contact){
            System.out.println("Verification successful please enter the below otp");
            int sys_otp = (int)(Math.random()*9999+9999);
            Thread.sleep(2000);
            System.out.println(sys_otp);
            int user_otp = sc.nextInt();
            if(user_otp == sys_otp)
                return true;
        }
        return false;
    }
    public void setName(String nname)throws Exception{
        if(doVerification()){
            name = nname;
            Thread.sleep(2000);
            System.out.println("Name changed successfully...");
        }
        else{
            System.out.println("Verification failed can't modify name");
        }
    }
    public void setContact(long ncontact)throws Exception{
        if(doVerification()){
            contact = ncontact;
            Thread.sleep(2000);
            System.out.println("Contact changed successfully...");
        }
        else{
            System.out.println("Verification failed can't modify contact");
        }
    }
    public void setAddress(String naddress)throws Exception{
        if(doVerification()){
            address = naddress;
            Thread.sleep(2000);
            System.out.println("Address changed successfully...");
        }
        else{
            System.out.println("Verification failed can't modify address");
        }
    }
}//end of blueprint

class UI{
    static aadhar dinesh = new aadhar("Dinesh",123,"Sayalgudi",321);
    static aadhar deepan = new aadhar("Deepan",456,"Kadalur",654);
    static aadhar gokul = new aadhar("Gokul",789,"Sayalgudi",987);
    static aadhar manoj = new aadhar("Manoj",147,"Ramanathapuram",963);
    static aadhar a[] = {dinesh,deepan,gokul,manoj}; 
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)throws Exception {
        Home();
    }
    public static void Home()throws Exception{    
        boolean home_page = true;
        System.out.println("\t\t\tWelcome to Aadhar Application...");
        do{
            System.out.println("Select the user: ");
            System.out.println("1.Dinesh\n2.Deepan\n3.Gokul\n4.Manoj\n5.Exit");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    welcome(0);
                    break;
                case 2:
                    welcome(1);
                    break;
                case 3:
                    welcome(2);
                    break;
                case 4:
                    welcome(3);
                    break;
                case 5:
                    home_page = false;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }while(home_page);
        System.out.println("\t\t\tThanks for using application...");
    }//end of home
    public static void setInfo(int i)throws Exception{
        boolean set_page = true;
        do{
            System.out.println("Select the detail you want to Change:  ");
            System.out.println("------------------------------------------");
            System.out.println("1.Name\n2.Contact\n3.Address\n4.Exit");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.print("Enter the name : ");
                    String nname = sc.next();
                    a[i].setName(nname);
                    break;
                case 2:
                    System.out.print("Enter the contact : ");
                    long ncontact = sc.nextLong();
                    a[i].setContact(ncontact);
                    break;
                case 3:
                    System.out.print("Enter the Address : ");
                    String naddress = sc.next();
                    a[i].setName(naddress);
                    break;
                case 4:
                    set_page = false;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }

        }while(set_page);
        System.out.println("<<<Back to features page...");
    }//end of setInfo page
    public static void welcome(int i)throws Exception{
        boolean welcome_page = true;
        do{
            System.out.println("Select the Feature: ");
            System.out.println("------------------------------------------");
            System.out.println("1.Get Information\n2.Set Information\n3.Exit.");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    getInfo(i);
                    break;
                case 2:
                    setInfo(i);
                    break;
                case 3:
                    welcome_page = false;
                default:
                    break;
            }
        }while(welcome_page);
        System.out.println("<<<Back to Home page...");
    }//end of welcome page.
    public static void getInfo(int i){
        boolean get_page = true;
        do{
            System.out.println("Select the detail you want to know ");
            System.out.println("------------------------------------------");
            System.out.println("1.Name\n2.Contact\n3.Address\n4.Aadharnumber\n5.Exit");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("The User name is : "+a[i].getName());
                    break;
                case 2:
                    System.out.println("The User Contact is : "+a[i].getContact());
                    break;
                case 3:
                    System.out.println("The User Address is : "+a[i].getAddress());
                    break;
                case 4:
                    System.out.println("The User aadhar number is : "+a[i].getAadharNumber());
                    break;
                case 5:
                    get_page = false;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }

        }while(get_page);
        System.out.println("<<<Back to features page...");
    }
}