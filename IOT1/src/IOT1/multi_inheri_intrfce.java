package IOT1;

public class multi_inheri_intrfce {

    interface Atm {
        void depo();
        void with();
    }

    static abstract class Abc implements Atm {

        public void depo() {
            System.out.println("Depos");
        }
    }

    static class Dem extends Abc {

        public void with() {
            System.out.println("With");
        }

        public static void main(String[] args) {

            Dem x = new Dem();

            x.depo();
            x.with();
        }
    }
}