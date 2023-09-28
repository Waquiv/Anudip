//2. Write a program to Menu driven program using switch statement 
//( Find addition, subtraction, multiplication and division of to integer numbers )
import java.util.*;

class Calc{
    private int num1;
    private int num2;

    //Constructors for calculator class

    Calc(int num1, int num2){
        setNum1(num1);
        setNum2(num2);
    }

    //getetr and setters
    public int getNum1() {
        return num1;
    }
    public int getNum2() {
        return num2;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    //methods for calculation

    int add(){
        return num1+num2;
    }

    int sub(){
        return num1-num2;
    }
    
    int mul(){
        return num1*num2;
    }

    int div(){
        return num1/num2;
    }

}

public class Menu {

    //method to display menu
    static void displayMenu(){
        System.out.println("");
        System.out.println("Choose an option");
        System.out.println("1. for Addition");
        System.out.println("2. for Substraction");
        System.out.println("3. for multiplication");
        System.out.println("4. for division");
        System.out.println("5. for exiting the program");
        System.out.println("");
    }

    public static void main(String[] args) {
        System.out.println("****JAVA CLI Cakculator****");

        //Scanner for scanning inputs
        Scanner sc=new Scanner(System.in);

        //choice for switch case
        int choice;

        //operands
        int num1,num2;

        boolean ok=true;

        //while loop runs until user exits
        while(ok){
            //menu and user input
            displayMenu();
            choice= sc.nextInt();
            if(choice==5){System.exit(0);}
            System.out.println("\033c");
            System.out.println("Enter the first number: ");
            num1=sc.nextInt();
            System.out.println("Enetr teh secoudn number: ");
            num2=sc.nextInt();


            Calc obj= new Calc(num1, num2);

            //using switch case to invoke methods
            switch (choice) {
                case 1:
                    System.out.println("\033c");
                    System.out.println("The result is: "+ obj.add());
                    break;

                case 2:
                    System.out.println("\033c");
                    System.out.println("The result is: "+ obj.sub());
                    break;
                
                case 3:
                    System.out.println("\033c");
                    System.out.println("The result is: "+ obj.mul());
                    break;

                case 4:
                    System.out.println("\033c");
                    System.out.println("The result is: "+ obj.div());
                    break;
                
                case 5:
                    ok=false;
                    System.exit(0);
                    break;
                default:
                    System.out.println("\033c");
                    System.out.println("Choose a Valid option!!");
                    break;
            }

        }

    }
}
