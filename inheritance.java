
    class Man{
        void method1(){
            System.out.println("Man is running");
        }
    }
    class Man2 extends Man{
        void method2(){
            System.out.println("He can run more...!");
        }
    }
    class Man3 extends Man2{
        void method3(){
            System.out.println("He's so active");
        }
    }
    public class inheritance {
        public static void main(String[] args) {
            Man3 Obj = new Man3();
            Obj.method1();
            Obj.method2();
            Obj.method3();
        }
    }

