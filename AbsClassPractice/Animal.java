package AbsClassPractice;

// Write a Java program to create an abstract class Animal with an abstract method called sound().
// Create subclasses Lion and Tiger that extend the Animal class and
// implement the sound() method to make a specific sound for each animal.
public abstract class Animal {
    public void sound(){
    }
    static class Lion extends Animal{
        @Override
        public void sound() {
            super.sound();
            System.out.println("lion Roars");
        }
        static class Tiger extends Animal{
            @Override
            public void sound() {
                System.out.println("Tiger Roars");
            }

            public static void main(String[] args) {
                Animal lion = new Lion();
                Animal tiger = new Tiger();
                lion.sound();
                tiger.sound();
            }
        }
    }

}
