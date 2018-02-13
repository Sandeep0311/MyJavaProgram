
public class Demo2 {
    int i;
    char c;
    String s;
    boolean b;

    Demo2(){
        System.out.println(i);
        System.out.println(c);
        System.out.println(s);
        System.out.println(b);
    }
    public static void main(String[] args) {
        System.out.println("Hello this is demo2");
        String s= "abc";
        switch (s){
            case "abc":
                System.out.println("I am String abc");
                break;
            case "nmn":
                System.out.println("I am nmn");
                break;
                default:
                    System.out.println("this is Default");
        }
        Demo2 d=new Demo2();

    }
}
