//Java Program to demonstrate the use of If else-if ladder.
//It is a program of grading system for fail, D grade, C grade, B grade, A grade and A+.
    public class ifelseladder{
        public static void main(String[] args) {
            int marks=65;

            if(marks<35){
                System.out.println("fail");
            }
            else if(marks>=35 && marks<45){
                System.out.println("D grade");
            }
            else if(marks>=55 && marks<50){
                System.out.println("C grade");
            }
            else if(marks>=70 && marks<65){
                System.out.println("B grade");
            }
            else if(marks>=80 && marks<90){
                System.out.println("A grade");
            }else if(marks>=90 && marks<100){
                System.out.println("A+ grade");
            }else
            {
                System.out.println("Invalid!");
            }
        }
    }

