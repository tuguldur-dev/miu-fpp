package lesson8;

public class TestMyMemberClass {
    static void main() {
        MyMemberClass memberClass = new MyMemberClass();

        MyMemberClass.MyMemberInnerClass oh1 = memberClass.new MyMemberInnerClass();
        MyMemberClass.MyMemberInnerClass oh2 = new MyMemberClass().new MyMemberInnerClass();

        oh1.display();
        oh2.display();

        OuterClass outerClass = new OuterClass();
        outerClass.display();
        System.out.println(OuterClass.s);

        OuterClass.InnerClass.a2();
        System.out.println(OuterClass.InnerClass.l);

    }
}
