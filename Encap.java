class FaceBook{
    private String username;
    private String password;

    public FaceBook(){}

    public FaceBook(String username,String password){
        this.username = username;
        this.password = password;
    }

    public String getName(){
        return username;
    }
    public String getPassword(){
        return password;
    }
}
class FB{
    static FaceBook f1 = new FaceBook("Dinesh","123");
    static FaceBook f2 = new FaceBook("Deepan","345");
    public static void main(String[] args) { 
        System.out.println(f1.getName());
        System.out.println(f2.getPassword());
    }

}

class product{
    private String pname;
    private int qty;
    private double price;

    public product(){}

    public product(String pname,int qty,double price){
        this.pname = pname;
        this.qty = qty;
        this.price = price;
    }
    public String getName(){
        return pname;
    }
    public  int getQty(){
        return qty;
    }
    public  double getPrice(){
        return price;
    }
    
}
class objGen{
    public static void main(String[] args) {
        product p1 = new product("T-shirt",3,200);
        product p2 = new product("shirt",3,400);
        product p3 = new product("watch",2,500);
        product p4 = new product("shoe",1,1200);
        product p5 = new product("pen",12,20);

        product[] p = {p1,p2,p3,p4,p5};

        for(int i = 0;i<p.length;i++){
            if(p[i].getQty()*p[i].getPrice() >= 700)
                System.out.println(p[i].getName());
        }


    }
}

class Student{
    private String sname;
    private String dept;
    private int marks[];

    public Student(){}

    public Student(String sname,String dept,int marks[]){
        this.sname = sname;
        this.dept = dept;
        this.marks[] = marks;
    }
    public String getName(){
        return sname;
    }
    public String getDept(){
        return dept;
    }
    public int[] getMarks(){
        return marks;
    }
}
class stuObjGen{
    public static void main(String[] args) {
        Student s1 = new Student("Dinesh","AI",{86,81,80,87,94});
        Student s2 = new Student("Karthi","AI",{84,85,90,77,84});
        Student s3 = new Student("Lingam","CSE",{80,81,89,57,84});
        Student s4 = new Student("Hari","IT",{87,31,90,80,64});
        Student s5 = new Student("Dharshan","ECE",{86,30,50,67,47});

        Student s[] = {s1,s2,s3,s4,s5};
        for(int i = 0;i<s.length;i++){
            int a[] = s[i].getMarks();
            for(int i = 0;i<a.length;i++){
                if(a[i] <= 35){
                    System.out.println(s[i].getName());
                }
            }
        }

    }
}

class college{
    String cname;
    String loc;
    Department[] departments;
    Teacher[] teachers
    public college(){}
    public college(String cname,String loc,Department[] departments,Teacher[] teachers){
        this.cname = cname;
        this.loc = loc;
        this.departments = departments;
        this.teachers = teachers;
    }
    public void getCollegeDetails(){
        System.out.println("College name :"+cname);
        System.out.println("College location :"+loc);
    }
}
class Department{
    String dname;
    String hod;
    
}