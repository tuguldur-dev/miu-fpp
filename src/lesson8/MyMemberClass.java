package lesson8;

// MyClass - Byte code
// Outer class - public or default
public class MyMemberClass {
    private String s = "outer";
    private int x = 20;
    private MyMemberInnerClass inner;

    // Constructor for outer class
    public MyMemberClass() {
        // to access inner class from the outer class, need object
        inner = new MyMemberInnerClass();
        inner.display();
    }

    //Member Inner class - public, private, default, protected
    public class MyMemberInnerClass {
        private int num = 100;
        private String s = "inner";

        public void display() {
            System.out.println("Inner :" + this.s); // Even private field of outer class can access it
            System.out.println("Outer :" + MyMemberClass.this.s); // Even private field of outer class can access it
            System.out.println(num); //
        }
    }

}
