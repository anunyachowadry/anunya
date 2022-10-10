//Java Program to demonstrate the use of Nested If Statement.
public class nestedif
{
    public static void main(String[] args)
    {
        //Creating two variables for age and phonenumber
        int age=25;
        int phonenumber=10;
        //applying condition on age and phonenumber
        if(age>=18)
        {
            if(phonenumber<=10)
            {
                System.out.println("You are eligible to use social media");
            } else{
                System.out.println("You are not eligible to use social media");
            }
        } else{
            System.out.println("Age must be greater than 18");
        }
    }  }
