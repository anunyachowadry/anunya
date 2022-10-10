
    abstract class A{
        abstract void method1();
    }
    class B extends A{
        void method1(){
            int X = 700;
            int Y =77;
            int Z;
            Z = X +Y;
            System.out.println(Z);

        }
    }
    public class object{
        public static void main(String[]args){
            B obj = new B();
            obj.method1();
        }
    }

