import javax.print.attribute.standard.PrinterMoreInfoManufacturer;

class Name {
        public void aboutme() {
            System.out.println("What is ur name??");
        }
    }

    class anu extends Name {
        public void aboutme() {
            System.out.println("I'm Anunya");
        }
    }

    class surname extends Name {
        public void aboutme() {
            System.out.println("naladala");
        }
    }

    class polymorphism {
        public static void main(String[] args) {
            Name Qis = new Name();
            Name hp = new anu();
            Name dell = new surname();

            Qis.aboutme();
            hp.aboutme();
            dell.aboutme();
        }
    }

