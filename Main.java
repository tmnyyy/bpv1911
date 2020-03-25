public class Main {
    public static void main(String[] args) {
        BaseClass baseClass = new DerivedClass();
        baseClass.method();
        BaseClass.show();
        DerivedClass.show();
    }
}
