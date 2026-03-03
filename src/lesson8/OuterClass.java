package lesson8;

public class OuterClass {
    private int num = 50;

    static String s = "Inner Class";

    public void display() {
        // From outer class to access static field & methods call classname.field/method
        InnerClass.a2();
        System.out.println(InnerClass.l);
        // Non-static or Instance need object reference

        InnerClass ob = new InnerClass();
        System.out.println(ob.num1);
    }

    // Inner static class

    static class InnerClass {
        //Inside static class you include
        // Static fields/methods, instance fields
        // Static method can access only static references
        private int num1 = 40;
        static long l = 60l;

        public void a1(){
            System.out.println(s);
            System.out.println(num1);
            // Non-static outer not allowed inside static class
            System.out.println(l);
        }
        public static void a2() {
            // Not static not allowed inside static method
            System.out.println(s);
            System.out.println(l);
        }

    }
}
