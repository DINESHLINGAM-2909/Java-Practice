// 1.Composition
class Department{
    String dname,hod;
    int deptno;
    College c = new College();
    public Department(){

    }
    public Department(String dname,String hod,int deptno){
        this.dname = dname;
        this.hod = hod;
        this.deptno = deptno;
    }
    public  void detailsOfDepartment(){
        System.out.println("Department name :"+dname);
        System.out.println("Department HOD :"+hod);
        System.out.println("Department no :"+deptno);
        System.out.println("***********************************");
    }
}
class Teacher{
    String name,sub;
    public Teacher(){

    }
    public Teacher(String name,String sub){
        this.name = name;
        this.sub = sub;
    }
    public void detailsOfTeacher(){
        System.out.println("Teacher name :"+name);
        System.out.println("Subject name :"+sub);
        System.out.println("******************************");
    }
}
class wbt1{
    public static void main(String[] args) {
        
        Department d1 = new Department("CSE","Mayil",7210);
        Department d2 = new Department("AI","Nallakumar",7212);
        Department d3 = new Department("IT","Dinesh",7213);
        Department d[] = {d1,d2,d3};
    
        Teacher t1 = new Teacher("Arul","CS");
        Teacher t2 = new Teacher("Vignesh","WebTech");
        d1.detailsOfDepartment();
        d1.c.detailsOfCollege();
        d2.detailsOfDepartment();
        d2.c.detailsOfCollege();
    }

}
class College{
    static String cname = "KIT";
    static String loc = "Coimbatore";
    static String contact = "karpagamtech.ac.in";

    public static void detailsOfCollege(){
        System.out.println("College name:"+cname);
        System.out.println("College location:"+loc);
        System.out.println("Contact :"+contact);
        System.out.println("***********************");
    }
}

// Aggregation

class Sim{
    String sname,bandwidth;
    double price;
    public Sim{

    }
    public Sim(String sname,String bandwidth,double price){
        this.sname = sname;
        this.bandwidth = bandwidth;
        this.price = price;
    }
    public static void detailsOfSim{
        System.out.println("Sim name :"+sname);
        System.out.println("Sim bandwidth:"+bandwidth);
        System.out.println("Sim price :"+price);
        System.out.println("*******************************");
    }
}
class 