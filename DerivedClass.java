public class DerivedClass extends BaseClass {

    public static int flag = 200;

    @Override
    public void method() {
        System.out.println("DerivedClass");
    }


    public void calculate(int sum1, int sum2) {
        System.out.println("DerivedClass");
    }

    public static void show() {
        System.out.println(flag);
    }
}
