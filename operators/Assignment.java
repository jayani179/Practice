package operators;

public class Assignment {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c;


        System.out.println(c=a+b);
        System.out.println(c+= a);
        System.out.println(c-= a);
        System.out.println(c*= a);
        System.out.println(c/= a);
        System.out.println(c%= a);
        System.out.println(c +" "+a);
        c=6;
        System.out.println(c^=a);
        System.out.println(c+" "+a);
    }
    }
