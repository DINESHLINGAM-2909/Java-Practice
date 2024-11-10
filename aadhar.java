import java.util.*;
class aadhar{
    //states
    private static Scanner sc = new Scanner(System.in);
    private static String name;
    private static long contact;
    private static String address;
    private static long aadhar_number;

    public aadhar(){
       
    }

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

    public static boolean doVerification()throws Exception{
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
        }
        else{
            System.out.println("Verification failed can't modify name");
        }
    }
    public void setContact(long ncontact)throws Exception{
        if(doVerification()){
            contact = ncontact;
        }
        else{
            System.out.println("Verification failed can't modify contact");
        }
    }
    public void setAddress(String naddress)throws Exception{
        if(doVerification()){
            address = naddress;
        }
        else{
            System.out.println("Verification failed can't modify address");
        }
    }
}//end of blueprint

class UI{
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        aadhar dinesh = new aadhar("Dinesh",123,"Sayalgudi",321);
        aadhar deepan = new aadhar("Deepan",456,"Kadalur",654);
        aadhar gokul = new aadhar("Gokul",789,"Sayalgudi",987);
        aadhar manoj = new aadhar("Manoj",147,"Ramanathapuram",963);
        aadhar[] a = {dinesh,deepan,gokul,manoj};
        System.out.println(dinesh.getContact());
    }
   /*  public static void Home(){
        System.out.println("Select the user: ");
        System.out.println()
    }*/

}