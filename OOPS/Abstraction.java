import java.util.*;
//Service specifier
abstract class Hotel{
    abstract public void foodMenu();
    abstract public void priceMenu();
}

//service provider
class Anandhabavan extends Hotel{
    public void foodMenu(){
        System.out.println("\t\t\tWelcome to A2B !!!");
        System.out.println("1.Idli\n2.Dosa\n3.Pongal");
    }
    public void priceMenu(){
        System.out.println("Idli - 10rs\nDosa - 25rs\nPongal - 30rs");
        System.out.println("**************************************************");
    }
}
class buhari extends Hotel{
    public void foodMenu(){
        System.out.println("\t\t\tWelcome to Buhari !!!");
        System.out.println("1.Briyani\n2.Meals\n3.Chickenrice");
    }
    public void priceMenu(){
        System.out.println("Briyani - 120rs\nMeals - 125rs\nChickenrice - 130rs");
        System.out.println("**************************************************");
    }
}

//End user
class Enduser{
    public static void main(String[] args) {
        Hotel ref1 = new Anandhabavan();
        Hotel ref2 = new buhari();
        ref1.foodMenu();
        ref1.priceMenu();
        ref2.foodMenu();
        ref2.priceMenu();
    }
}

abstract class keyboard{
    int n;
    keyboard(){}
    keyboard(int n){
        this.n = n;
    }
    abstract public void enter(); 
    public void pressQ(){
        System.out.println("Q pressed");
    }
    public void pressJ(){
        System.out.println("J pressed");
    }
}
class dingi extends keyboard{
    dingi(){}
    dingi(int n){
        super(8);
    }
    public void enter(){
        System.out.println("Enter selected");
    }
}
class dinga extends keyboard{
    dinga(){}
    dinga(int n){                                                                                                                                                                                                                                                                                                                                                                                                                               
        super(15);
    }
    public void enter(){
        System.out.println("Go to nextline");
    }
}
class enduser1{
    public static void main(String[] args) {
        keyboard k1 = new dingi();
        keyboard k2 = new dinga();
        k1.enter();
        k2.enter();
    }
}

abstract class program{
    
    abstract public String primeNum(int a);
    abstract public int factorial(int a);

}

class dinesh extends program{
    
    public String primeNum(int a){
        if(a == 0 || a == 1){
            return "Not a Prime";
        }
        else{
            for(int i = 2;i<a;i++){
                if(a%i == 0){
                    return "Not a Prime";
                }
            }
            return "Prime";
        }
    }
    public int factorial(int n){
        int fact = 1;
        for(int i = 2;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
}
class enduser2{
    public static void main(String[] args) {
        program ref = new dinesh();
        System.out.println(ref.primeNum(12));
        System.out.println(ref.factorial(5));
    }
}



