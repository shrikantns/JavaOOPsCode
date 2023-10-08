package Sep23.inheritence.mutlilevel;

public class GrandParent {
    public static void main(String[] args) {
        Child c = new Child();
        c.print();
    }

public void print() {
        System.out.println("Grandparents Print()");
    }

    static class Parent extends GrandParent {
        public void print() {
            System.out.println("Parents Print()");
        }
    }

    static class Child extends Parent {

        public void print() {
            super.print();
            System.out.println("Child Print()");
        }
    }
}

