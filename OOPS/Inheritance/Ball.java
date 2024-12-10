import java.util.*;
class Ball{
    private double radius;

    public Ball(){

    }
    public Ball(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
}

class BasketBall extends Ball{
    String game = "Basket Ball";
    public BasketBall(){
        super(5);
    }
}

class TennisBall extends Ball{
    String game = "Tennis Ball";
    public TennisBall(){
        super(15);
    }
}

class Bag{
    Ball b;
    public void addBall(Ball b){
        if(this.b == null){
            this.b = b;
            System.out.println("Ball added");
        }
        else{
            System.out.println("Bag is full");
        }
    }
    public void removeBall(){
        if(this.b != null){
            this.b = null;
        }
        else{
            System.out.println("Bag is already empty");
        }
    }
    public boolean isBagEmpty(){
        return b == null;
    }
    public String showGame(){
        if(b instanceof )
    }
}

Class UI{
    static Scanner sc = new Scanner(System.in);
    static Bag b = new Bag();
    Static TennisBall t = new TennisBall();
    static BasketBall bb = new BasketBall();
    public static void main(String[] args) {
        boolean flag = true;
        do {
            System.out.println("---Ball&Bag---");
            System.out.println("Select the input");
            System.out.println("1.Add ball\n2.Remove ball\n3.Check bag is empty or not\n4.Show game\n5.Exit");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    
                    break;
            
                default:
                    break;
            }
        } while (flag);
    }
    public void diplay(){
        System.out.println("Select the input : ");
        System.out.println("1.Basket Ball\n2.Tennis Ball");
        return sc.nextInt();
    }
}