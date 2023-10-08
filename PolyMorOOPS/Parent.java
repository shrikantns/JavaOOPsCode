package PolyMorOOPS;
//Example of Overriding
public class Parent {
    public void print() {
        System.out.println("parent class");
    }

    static class subclass1 extends Parent {
        @Override
        public void print() {
            System.out.println("Subclass1");
        }
    }
    static class subclass2 extends Parent {
        @Override
        public void print() {
            System.out.println("subclass2");
        }
    }
    static class child {
        public static void main(String[] args) {
            Parent a;
            a = new subclass1();
            a.print();
            a = new subclass2();
            a.print();
        }
    }
}

