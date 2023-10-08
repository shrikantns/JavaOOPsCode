package Sep23.inheritence.mutlilevel;

public class Base {
    public void show() {
        System.out.println("base::show() called");
    }

    static class Derived extends Base {
        public void show() {
            System.out.println("Derived::show() called");
        }
    }

    public static void main(String[] args) {
        Base b = new Derived();
        b.show();
    }
}
