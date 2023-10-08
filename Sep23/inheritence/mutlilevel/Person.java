package Sep23.inheritence.mutlilevel;

public class Person {
    public void show() {
        System.out.println("i am a Person");
    }

    static class Student extends Person {
        public void show1() {
            System.out.println("I am a Student who is Person");
        }

        static class Teacher extends Person {
            public void show2() {
                System.out.println("I am a Teacher who is Person");
            }

            static class Doctor extends Person {
                public static void main(String[] args) {
                    Teacher Teacher = new Teacher();
                    Student Student = new Student();
                    Doctor Doctor = new Doctor();
                    Teacher.show2();
                    Doctor.show3();
                    Doctor.show();
                    Student.show1();
                    Student.show();
                    Teacher.show();
                }

                public void show3() {
                    System.out.println("I am a doctor who is Person");
                }

            }

        }
    }
}
