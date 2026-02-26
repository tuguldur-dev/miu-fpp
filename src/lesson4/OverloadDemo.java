package lesson4;

public class OverloadDemo {
    //    public void add(String s1, String s2) {
//        System.out.println(s1 + " " + s2);
//    }
//
//    public String add(String s1, String s2, String s3) {
//        return s1 + " " + s2 + " " + s3;
//    }
//
//    public void add(int s5, String s2, String s3) {
//        String s45 = s5 + " " + s2 + " " + s3;
//    }
//
//    public static void main() {
//
//    }
    static int x = 0; //Instance variable

    public int getX() {
        return x;
    }

    public OverloadDemo() {
        x++;
    }

    public static void main() {
        OverloadDemo ob = null;
        for (int i = 0; i < 10; i++) {
            ob = new OverloadDemo();
        }
        System.out.println("Count=" + ob.getX());
    }

}
