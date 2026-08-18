package IOT1;

public class multiple_inheri_intrfce {

    interface Atm {
        void depo();
    }

    interface Atm1 {
        void min();
    }

    static class Demo1 implements Atm, Atm1 {

        public void depo() {
            System.out.println("dep");
        }

        public void min() {
            System.out.println("min");
        }

        public static void main(String[] args) {
            Demo1 v = new Demo1();

            v.min();
            v.depo();
        }
    }
}