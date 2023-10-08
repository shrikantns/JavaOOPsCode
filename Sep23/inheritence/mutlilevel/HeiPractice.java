package Sep23.inheritence.mutlilevel;

public class HeiPractice {
    public void show() {
        System.out.println("i am a person");
    }

    static class shrikant extends HeiPractice {
        public void show1() {
            System.out.println("I am a Doctor");
        }

        static class shardul extends HeiPractice {

            static public void show2() {
                System.out.println("I am a man");
            }

            public static void main(String[] args) {
                shrikant shrikant = new shrikant();
                shardul shardul = new shardul();
                Rahul Rahul = new Rahul();
                shrikant.show();
                shrikant.show1();
                shardul.show();
                show2();
                Rahul.show3();
                Rahul.show();
            }

            static class Rahul extends HeiPractice {

                public void show3() {
                    System.out.println("i am a woman");
                }
            }
        }

    }
}
