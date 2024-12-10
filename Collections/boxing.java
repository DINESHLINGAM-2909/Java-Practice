import java.util.*;
class test{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        byte a = 10;
        short b = 20;
        int c = 30;
        long d = 40l;
        double e = 13.42;
        float f = 12.23f;
        char g = 'd';
        boolean h = true;

        //Boxing
        Byte ans1 = Byte.valueOf(a);
        System.out.println(ans1);
        Short ans2 = Short.valueOf(b);
        System.out.println(ans2);
        Integer ans3 = Integer.valueOf(c);
        System.out.println(ans3);
        Long ans4 = Long.valueOf(d);
        System.out.println(ans4);
        Double ans5 = Double.valueOf(e);
        System.out.println(ans5);
        Float ans6 = Float.valueOf(f);
        System.out.println(ans6);
        Character ans7 = Character.valueOf(g);
        System.out.println(ans7);
        Boolean ans8 = Boolean.valueOf(h);
        System.out.println(ans8);
        System.out.println("-----------------------------------------");

        //unboxing
        byte res1 = ans1.byteValue();
        short res2 = ans2.shortValue();
        int res3 = ans3.intValue();
        long res4 = ans4.longValue();
        double res5 = ans5.doubleValue();
        float res6 = ans6.floatValue();
        char res7 = ans7.charValue();
        boolean res8 = ans8.booleanValue();
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
        System.out.println(res5);
        System.out.println(res6);
        System.out.println(res7);
        System.out.println(res8);

    }
}

class test1
{
    public static void main(String[] args) {
        //autoboxing
        int a = 10; //primitive datatype
        Integer b = a;//non-primitive datatype
        System.out.println(a);
        System.out.println(b);

        Character c = 'd';
        char ch = c;
        System.out.println(c);
        System.out.println(ch);
    }
}

class test2
{
    public static void main(String[] args) {
        //parsing
        String str = "10";
        byte b = Byte.parseByte(str);
        short s = Short.parseShort(str);
        int i = Integer.parseInt(str);
        long l = Long.parseLong(str);
        float f = Float.parseFloat(str);
        double d = Double.parseDouble(str);
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
    }
}